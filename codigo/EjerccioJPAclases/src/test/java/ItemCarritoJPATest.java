/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import edu.co.sena.jpa.util.EntityManagerHelper;
import edu.co.sena.tennisshop.integracion.jpa.entitis.CarritoCompras;
import edu.co.sena.tennisshop.integracion.jpa.entitis.ItemCarrito;
import edu.co.sena.tennisshop.integracion.jpa.entitis.ItemCarritoPK;
import edu.co.sena.tennisshop.integracion.jpa.entitis.Producto;
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
public class ItemCarritoJPATest {
    ItemCarrito itemcarrito;
    EntityManagerFactory emf;
    EntityManager em;
    public ItemCarritoJPATest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        itemcarrito= new ItemCarrito();
        itemcarrito.setCantidad(2);
        itemcarrito.setValorUnitario(0);
        itemcarrito.setValorTotal(0);
        itemcarrito.setItemCarritoPK(new ItemCarritoPK("00002","101"));
        
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
        em.persist(itemcarrito);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        
    
    }
     @Test
    public void actualizarItemsCarrito() {

        String idPro = JOptionPane.showInputDialog("Escriba el id de la producto");
        String idCarrito = JOptionPane.showInputDialog("Escriba el id del Carrito");
        String actCan = JOptionPane.showInputDialog("Escriba La Cantidad");
        
        itemcarrito.setItemCarritoPK(new ItemCarritoPK(idPro,idCarrito));
        itemcarrito.setCantidad(Integer.parseInt(actCan));
        

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        em.merge(itemcarrito);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }

    
    
@Test
    public void buscarItemCarrito() {

        String idPro = JOptionPane.showInputDialog("Inserte El id del Producto");
        String idCar = JOptionPane.showInputDialog("Inserte El id del Carrito");

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        ItemCarrito itemCar = em.find(ItemCarrito.class, new ItemCarritoPK(idPro, idCar));

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

        System.out.println(itemCar.toString());
    }
     @Test
    public void borrarUnItemDeCarrito() {
        String idPro = JOptionPane.showInputDialog("Inserte El id del Producto");
        String idCar = JOptionPane.showInputDialog("Inserte El id del Carrito");
        
        try {
            em = EntityManagerHelper.getEntityManager();
            EntityManagerHelper.beginTransaction();

            em.remove(em.find(ItemCarrito.class, new ItemCarritoPK(idPro, idCar)));
            EntityManagerHelper.commit();
            EntityManagerHelper.closeEntityManager();
            EntityManagerHelper.closeEntityManagerFactory();
        } catch (Exception e) {
            System.out.println("No se pudo eliminar el item del carrito" + e.getMessage());
        }

        
}
      @Test
    public void buscarTodosLosItemDelCarrito() {
        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        Query q = em.createNamedQuery("ItemCarrito.findAll");
        List<ItemCarrito> lis = q.getResultList();
        for (ItemCarrito itemsT : lis) {

            System.out.println(itemsT.toString());
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
     @Test
    public void buscarPorCantidad() {
        String cantidad = JOptionPane.showInputDialog("Insertar la cantidad Del itemcarrito");

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Query query = em.createNamedQuery("ItemCarrito.findByCantidad");
        query.setParameter("cantidad", Integer.parseInt(cantidad));

        ItemCarrito item = (ItemCarrito) query.getSingleResult();

        List<ItemCarrito> lista = query.getResultList();
        for (ItemCarrito itemcarritoT : lista) {
            System.out.println(item.toString());
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
    @Test
    public void buscarPorvalorUnitario() {
        String valorUnitario = JOptionPane.showInputDialog("Insertar el valor unitario Del itemcarrito");

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Query query = em.createNamedQuery("ItemCarrito.findByValorUnitario");
        query.setParameter("valorUnitario", Double.parseDouble(valorUnitario));

        ItemCarrito item = (ItemCarrito) query.getSingleResult();

        List<ItemCarrito> lista = query.getResultList();
        for (ItemCarrito itemcarritoT : lista) {
            System.out.println(item.toString());
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
    @Test
    public void buscarPorvalorTotal() {
        String valorTotal = JOptionPane.showInputDialog("Insertar el valor total Del itemcarrito");

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Query query = em.createNamedQuery("ItemCarrito.findByValorTotal");
        query.setParameter("valorTotal", Double.parseDouble(valorTotal));

        ItemCarrito item = (ItemCarrito) query.getSingleResult();

        List<ItemCarrito> lista = query.getResultList();
        for (ItemCarrito itemcarritoT : lista) {
            System.out.println(item.toString());
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
    
    
}
    
    



