/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import edu.co.sena.jpa.util.EntityManagerHelper;
import edu.co.sena.tennisshop.integracion.jpa.entitis.Cuenta;
import edu.co.sena.tennisshop.integracion.jpa.entitis.CuentaPK;
import edu.co.sena.tennisshop.integracion.jpa.entitis.ItemCarrito;
import edu.co.sena.tennisshop.integracion.jpa.entitis.Proveedor;
import edu.co.sena.tennisshop.integracion.jpa.entitis.ProveedorPK;
import edu.co.sena.tennisshop.integracion.jpa.entitis.Usuario;
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
public class ProvedorJPATest {
    Proveedor proveedor;
    EntityManagerFactory emf;
    EntityManager em;
    public ProvedorJPATest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        proveedor= new Proveedor();
        proveedor.setProveedorPK(new ProveedorPK("cc", "103456"));
        proveedor.setNombreProvvedor("maria jose");
        proveedor.setCorreo("maria_34@hotmail.com");
        proveedor.setTelefono("567890");
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
    public void insertarItemCarrito(){
        
        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        em.persist(proveedor);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        
    
    }
     @Test
    public void actualizarProveedor() {

        String idTD = JOptionPane.showInputDialog("Escriba el tipo de documento");
        String idND = JOptionPane.showInputDialog("Escriba el numero de documento");
        String nombrepro= JOptionPane.showInputDialog("Escriba El Nombre");
        

        proveedor.setProveedorPK(new ProveedorPK(idTD, idND));
        proveedor.setNombreProvvedor(nombrepro);
        

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        em.merge(proveedor);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
    @Test
    public void buscarUnProveedor() {

        String idTd = JOptionPane.showInputDialog("Inserte El Tipo Documento");
        String idNd = JOptionPane.showInputDialog("Inserte El Numero Documento");
        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Proveedor pro = em.find(Proveedor.class, new ProveedorPK(idNd, idNd));
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

        System.out.println(pro.toString());
    }
    @Test
    public void borrarUnProveedor() {
        String idTd = JOptionPane.showInputDialog("Inserte El Tipo Documento");
        String idNd = JOptionPane.showInputDialog("Inserte El Numero Documento");
        try {
            em = EntityManagerHelper.getEntityManager();
            EntityManagerHelper.beginTransaction();

            em.remove(em.find(Proveedor.class, new ProveedorPK(idTd, idNd)));
            EntityManagerHelper.commit();
            EntityManagerHelper.closeEntityManager();
            EntityManagerHelper.closeEntityManagerFactory();

        } catch (Exception e) {
            System.out.println("No se pudo eliminar la cuenta" + e.getMessage());
        }

    }
    @Test
    public void buscarProveedor() {
        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        Query q = em.createNamedQuery("Proveedor.findAll");
        List<Proveedor> lis = q.getResultList();
        for (Proveedor proveedorT : lis) {
            System.out.println(proveedorT.toString());
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
    @Test
    public void buscarProveedores() {

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        Query q = em.createNamedQuery("Producto.findAll");
        List<Proveedor> lis = q.getResultList();
        for (Proveedor proveedorT : lis) {
            System.out.println(proveedorT.toString() );
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
    @Test
    public void buscarPorNombreProveedor() {
        String nombreProvvedor = JOptionPane.showInputDialog("Insertar el nombre del proveedor");

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Query query = em.createNamedQuery("Proveedor.findByNombreProvvedor");
        query.setParameter("nombreProvvedor", nombreProvvedor);

       Proveedor prov = (Proveedor) query.getSingleResult();

        List<Proveedor> lista = query.getResultList();
        for (Proveedor proveedorT : lista) {
            System.out.println(prov.toString());
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
    @Test
    public void buscarPorTelefono() {
        String telefono  = JOptionPane.showInputDialog("Insertar el  telefono del proveedor");

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Query query = em.createNamedQuery("Proveedor.findByTelefono");
        query.setParameter("telefono", telefono);

       Proveedor prov = (Proveedor) query.getSingleResult();

        List<Proveedor> lista = query.getResultList();
        for (Proveedor proveedorT : lista) {
            System.out.println(prov.toString());
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
    @Test
    public void buscarPorCorreo() {
        String correo  = JOptionPane.showInputDialog("Insertar el correo  del proveedor");

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Query query = em.createNamedQuery("Proveedor.findByCorreo");
        query.setParameter("correo",correo );

       Proveedor prov = (Proveedor) query.getSingleResult();

        List<Proveedor> lista = query.getResultList();
        for (Proveedor proveedorT : lista) {
            System.out.println(prov.toString());
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
}
