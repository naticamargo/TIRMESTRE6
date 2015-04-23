/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import edu.co.sena.jpa.util.EntityManagerHelper;
import edu.co.sena.tennisshop.integracion.jpa.entitis.Inventario;
import edu.co.sena.tennisshop.integracion.jpa.entitis.InventarioPK;
import edu.co.sena.tennisshop.integracion.jpa.entitis.Producto;
import edu.co.sena.tennisshop.integracion.jpa.entitis.Proveedor;
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
public class InventarioJPATest {
    Inventario inventario;
    EntityManagerFactory emf;
    EntityManager em;
    public InventarioJPATest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
       inventario = new Inventario();
       inventario.setCantidad(1);
       inventario.setInventarioPK(new InventarioPK(1, "cc", "103456", "00002"));
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
        em.persist(inventario);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        
    


        
}
    @Test
    public void actualizarInventario() {

        String idInv = JOptionPane.showInputDialog("Escriba el id del inventario");
        String idPro = JOptionPane.showInputDialog("Escriba el id del inventario");
        String idProvetipo=JOptionPane.showInputDialog("Escriba el tipo de documento proveedor");
        String idProvenume=JOptionPane.showInputDialog("Escriba el numero de documento proveedor");
        String cantidad = JOptionPane.showInputDialog("Escriba el cantidad");

        inventario.setInventarioPK(new InventarioPK(Integer.parseInt(idInv), idPro, idProvenume, idProvetipo));
        inventario.setCantidad(Integer.parseInt(cantidad));

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        em.merge(inventario);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
    @Test
    public void borrarUnaInventario() {
        String idInv = JOptionPane.showInputDialog("Inserte El id del inventario");
        String idPro = JOptionPane.showInputDialog("Inserte El id del producto");
        String idProvetipo=JOptionPane.showInputDialog("Escriba el tipo de documento proveedor");
        String idProvenume=JOptionPane.showInputDialog("Escriba el numero de documento proveedor");
        String cantidad = JOptionPane.showInputDialog("Escriba el cantidad");
        try {
            em = EntityManagerHelper.getEntityManager();
            EntityManagerHelper.beginTransaction();

            em.remove(em.find(Inventario.class, new InventarioPK( Integer.parseInt(idInv), idPro, idProvenume, idProvetipo)));
            EntityManagerHelper.commit();
            EntityManagerHelper.closeEntityManager();
            EntityManagerHelper.closeEntityManagerFactory();
        } catch (Exception e) {
            System.out.println("No se pudo eliminar el inventario" + e.getMessage());
        }
        

}
     @Test
    public void buscarInventarios() {
        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        Query q = em.createNamedQuery("Inventario.findAll");
        List<Inventario> lis = q.getResultList();
        for (Inventario inventatioT : lis) {

            System.out.println(inventatioT.toString());
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
    
    @Test
    public void buscarPorCantidad() {
        String cantidad = JOptionPane.showInputDialog("Insertar la cantidad Del inventario");

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Query query = em.createNamedQuery("Inventario.findByCantidad");
        query.setParameter("cantidad", Integer.parseInt(cantidad));

        Inventario inv = (Inventario) query.getSingleResult();

        List<Inventario> lista = query.getResultList();
        for (Inventario inventarioT : lista) {
            System.out.println(inv.toString());
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }

    
}

