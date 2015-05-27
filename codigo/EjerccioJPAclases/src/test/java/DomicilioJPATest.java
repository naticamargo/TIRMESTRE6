/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import edu.co.sena.jpa.util.EntityManagerHelper;
import edu.co.sena.entity.jpa.Categoria;
import edu.co.sena.entity.jpa.Cuenta;
import edu.co.sena.entity.jpa.Domicilio;
import edu.co.sena.entity.jpa.DomicilioPK;
import edu.co.sena.entity.jpa.Municipio;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ADMIN
 */
public class DomicilioJPATest {
    Domicilio domicilio;
    EntityManagerFactory emf;
    EntityManager em;
    public DomicilioJPATest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        domicilio= new Domicilio();
        domicilio.setDomicilioPK(new DomicilioPK(1, "CC", "10678957"));
        domicilio.setDirrecion("callle3 sur # 34-87 ");
        domicilio.setBarrio("venecia");
        domicilio.setTelefono("67900");
        domicilio.setCuenta(new Cuenta("CC","10678957"));
        domicilio.setLocalidad("TUNJUELITO");
        domicilio.setMUNICIPIOidMUNICIPIO(new Municipio(1));
        
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void insertarDomiclio(){
    em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        em.merge(domicilio);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();
} 
    @Test
    public void actualizarDomicilio() {

        String idDomicilio = JOptionPane.showInputDialog("Escriba el id del domicilio");
        String TipoDocu= JOptionPane.showInputDialog(" escriba el tipo de documento");
        String NumeroDoc=JOptionPane.showInputDialog(" escriba el numero de documento");
        String actTele = JOptionPane.showInputDialog("Escriba El Telefono");

        domicilio.setDomicilioPK(new DomicilioPK(Integer.parseInt(idDomicilio), TipoDocu, NumeroDoc));
        domicilio.setTelefono(actTele);

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        em.merge(domicilio);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
     @Test
    public void buscarUnDomicilio() {
        String idDomicilio = JOptionPane.showInputDialog("Escriba el id del domicilio");
        

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Domicilio domi = em.find(Domicilio.class, Integer.parseInt(idDomicilio));

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

        System.out.println(domi.toString());
    }
     @Test
    public void borrarUnDomicilio() {
        String idDomicilio = JOptionPane.showInputDialog("Escriba el tipo de documento");
        

        try {
            em = EntityManagerHelper.getEntityManager();
            EntityManagerHelper.beginTransaction();

            em.remove(em.find(Domicilio.class, Integer.parseInt(idDomicilio)));
            EntityManagerHelper.commit();
            EntityManagerHelper.closeEntityManager();
            EntityManagerHelper.closeEntityManagerFactory();
        } catch (Exception e) {
            System.out.println("No se puedo eliminar el domicilio" + e.getMessage());
        }
     

        
}
   @Test
    public void buscarDomicilios() {
        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        Query q = em.createNamedQuery("Domicilio.findAll");
        List<Domicilio> lis = q.getResultList();
        for (Domicilio domicilioT : lis) {

            System.out.println(domicilioT.toString());
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    } 
    @Test
    public void buscarPorDirrecion() {
        String dirrecion = JOptionPane.showInputDialog("Insertar la direcion del domicilio");

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Query query = em.createNamedQuery("Domicilio.findByDirrecion");
        query.setParameter("dirrecion", dirrecion);

        Domicilio domi = (Domicilio) query.getSingleResult();

        List<Domicilio> lista = query.getResultList();
        for (Domicilio domicilioT : lista) {
            System.out.println(domi.toString());
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
     @Test
    public void buscarPorTelefono() {
        String telefono = JOptionPane.showInputDialog("Insertar la direcion del domicilio");

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Query query = em.createNamedQuery("Domicilio.findByTelefono");
        query.setParameter("telefono", telefono);

        Domicilio domi = (Domicilio) query.getSingleResult();

        List<Domicilio> lista = query.getResultList();
        for (Domicilio domicilioT : lista) {
            System.out.println(domi.toString());
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
    @Test
    public void buscarPorLocalidad() {
        String localidad = JOptionPane.showInputDialog("Insertar la localidad del domicilio");

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Query query = em.createNamedQuery("Domicilio.findByLocalidad");
        query.setParameter("localidad", localidad);

        Domicilio domi = (Domicilio) query.getSingleResult();

        List<Domicilio> lista = query.getResultList();
        for (Domicilio domicilioT : lista) {
            System.out.println(domi.toString());
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
     @Test
    public void buscarPorBarrio() {
        String barrio = JOptionPane.showInputDialog("Insertar el barrio del domicilio");

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Query query = em.createNamedQuery("Domicilio.findByBarrio");
        query.setParameter("barrio", barrio);

        Domicilio domi = (Domicilio) query.getSingleResult();

        List<Domicilio> lista = query.getResultList();
        for (Domicilio domicilioT : lista) {
            System.out.println(domi.toString());
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
    
}

   




