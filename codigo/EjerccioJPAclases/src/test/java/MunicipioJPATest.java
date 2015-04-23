/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import edu.co.sena.jpa.util.EntityManagerHelper;
import edu.co.sena.tennisshop.integracion.jpa.entitis.Departamento;
import edu.co.sena.tennisshop.integracion.jpa.entitis.Domicilio;
import edu.co.sena.tennisshop.integracion.jpa.entitis.Municipio;
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
public class MunicipioJPATest {
     Municipio municipio;
    EntityManagerFactory emf;
    EntityManager em;
    public MunicipioJPATest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        municipio= new Municipio();
        municipio.setIdMUNICIPIO(1);
        municipio.setNombreMunicipio("santa rosa del cabal");
        municipio.setDEPARTAMENTOidDEPARTAMENTO(new Departamento(1));
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
    public void insertarMunicipio(){
    em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        em.persist(municipio);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();
}
    @ Test
    public void actualizarMunicipio() {
        String catLeida = JOptionPane.showInputDialog("Digite el municipio a Actualizar");
        String catLeidaValor = JOptionPane.showInputDialog("Digite el valor");
        municipio.setIdMUNICIPIO(Integer.parseInt(catLeida));
        municipio.setNombreMunicipio(catLeidaValor);
        
        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        em.merge(municipio);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();
     }
    @Test
    public void buscarUnMunicipio() {

        String idMunicipio = JOptionPane.showInputDialog("Inserte El Id A Buscar");
        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Municipio mun = em.find(Municipio.class, idMunicipio);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

        System.out.println(mun.toString());
    }
     @Test
    public void borrarUnMunicipio() {
        String idMunicipio = JOptionPane.showInputDialog("Escriba el id del municipio a eliminar");
        try {
            em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        em.remove(em.find(Municipio.class, idMunicipio));
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();
        } catch (Exception e) {
            System.out.println("No se pudo eliminar el municipio" + e.getMessage());
        }

    }
    @Test
    public void buscarMunicipios() {
        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        Query q = em.createNamedQuery("Municipio.findAll");
        List<Municipio> lis = q.getResultList();
        for (Municipio municipioT : lis) {

            System.out.println(municipioT.toString());
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
     @Test
    public void buscarPorNombre() {
        String nombre = JOptionPane.showInputDialog("Insertar el nombre del municipio");

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Query query = em.createNamedQuery("Municipio.findByNombreMunicipio");
        query.setParameter("nombre", nombre);

        Municipio mun = (Municipio) query.getSingleResult();

        List<Municipio> lista = query.getResultList();
        for (Municipio municipioT : lista) {
            System.out.println(mun.toString());
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
}


