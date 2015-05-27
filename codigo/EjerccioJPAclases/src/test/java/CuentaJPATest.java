/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import edu.co.sena.jpa.util.EntityManagerHelper;
import edu.co.sena.entity.jpa.Cuenta;
import edu.co.sena.entity.jpa.CuentaPK;
import edu.co.sena.entity.jpa.Inventario;
import edu.co.sena.entity.jpa.Usuario;
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
public class CuentaJPATest {
    Cuenta cuenta;
    EntityManagerFactory emf;
    EntityManager em;
    public CuentaJPATest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        cuenta= new Cuenta();
        cuenta.setPrimerNombre("luisa");
        cuenta.setSegundoNombre("maria");
        cuenta.setPrimerApellido("rodriguez");
        cuenta.setSegundoApellido("rodriguez");
        cuenta.setCuentaPK(new CuentaPK("cc","10678957"));
        cuenta.setUsuario("Luisa");
        cuenta.setUsuarioIdUsuario(new Usuario("5678"));
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
    public void insertarCuenta(){
        
        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        em.persist(cuenta);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        
    
    }
     @Test
    public void actualizarCuenta() {

        String idTD = JOptionPane.showInputDialog("Escriba el tipo de documento");
        String idND = JOptionPane.showInputDialog("Escriba el numero de documento");
        String actSegNom = JOptionPane.showInputDialog("Escriba El Nombre");
        

        cuenta.setCuentaPK(new CuentaPK(idTD, idND));
        cuenta.setSegundoNombre(actSegNom);
        

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        em.merge(cuenta);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
    @Test
    public void buscarUnaCuenta() {

        String idTd = JOptionPane.showInputDialog("Inserte El Tipo Documento");
        String idNd = JOptionPane.showInputDialog("Inserte El Numero Documento");
        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Cuenta cue = em.find(Cuenta.class, new CuentaPK(idTd, idNd));
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

        System.out.println(cue.toString());
    }
      @Test
    public void borrarUnaCuenta() {
        String idTd = JOptionPane.showInputDialog("Inserte El Tipo Documento");
        String idNd = JOptionPane.showInputDialog("Inserte El Numero Documento");
        try {
            em = EntityManagerHelper.getEntityManager();
            EntityManagerHelper.beginTransaction();

            em.remove(em.find(Cuenta.class, new CuentaPK(idTd, idNd)));
            EntityManagerHelper.commit();
            EntityManagerHelper.closeEntityManager();
            EntityManagerHelper.closeEntityManagerFactory();

        } catch (Exception e) {
            System.out.println("No se pudo eliminar la cuenta" + e.getMessage());
        }

    }
      @Test
    public void buscarCuentas() {
        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        Query q = em.createNamedQuery("Cuenta.findAll");
        List<Cuenta> lis = q.getResultList();
        for (Cuenta cuentaT : lis) {
            System.out.println(cuentaT.toString());
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
     @Test
    public void buscarPrimerNombre() {
        String primerNombre = JOptionPane.showInputDialog("Insertar el primer nombre");

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Query query = em.createNamedQuery("Cuenta.findByPrimerNombre");
        query.setParameter("primerNombre", primerNombre);

        Cuenta cu = (Cuenta) query.getSingleResult();

        List<Cuenta> lista = query.getResultList();
        for (Cuenta cuentaT : lista) {
            System.out.println(cu.toString());
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
     @Test
    public void buscarSegundoNombre() {
        String segundoNombre = JOptionPane.showInputDialog("Insertar el segundo nombre");

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Query query = em.createNamedQuery("Cuenta.findBySegundoNombre");
        query.setParameter("segundoNombre",segundoNombre );

        Cuenta cu = (Cuenta) query.getSingleResult();

        List<Cuenta> lista = query.getResultList();
        for (Cuenta cuentaT : lista) {
            System.out.println(cu.toString());
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
    @Test
    public void buscarPrimerApellido() {
        String primerApellido = JOptionPane.showInputDialog("Insertar el primer apellido");

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Query query = em.createNamedQuery("Cuenta.findByPrimerApellido");
        query.setParameter("primerApellido",primerApellido );

        Cuenta cu = (Cuenta) query.getSingleResult();

        List<Cuenta> lista = query.getResultList();
        for (Cuenta cuentaT : lista) {
            System.out.println(cu.toString());
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
     @Test
    public void buscarSegundoApellido() {
        String segundoApellido = JOptionPane.showInputDialog("Insertar el segundo apellido");

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Query query = em.createNamedQuery("Cuenta.findBySegundoApellido");
        query.setParameter("segundoApellido",segundoApellido);

        Cuenta cu = (Cuenta) query.getSingleResult();

        List<Cuenta> lista = query.getResultList();
        for (Cuenta cuentaT : lista) {
            System.out.println(cu.toString());
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
    @Test
    public void buscarUsuario() {
        String usuario = JOptionPane.showInputDialog("Insertar el usuario");

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Query query = em.createNamedQuery("Cuenta.findByUsuario");
        query.setParameter("usuario",usuario);

        Cuenta cu = (Cuenta) query.getSingleResult();

        List<Cuenta> lista = query.getResultList();
        for (Cuenta cuentaT : lista) {
            System.out.println(cu.toString());
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }

}
