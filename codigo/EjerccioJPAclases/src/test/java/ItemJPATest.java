/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import edu.co.sena.jpa.util.EntityManagerHelper;
import edu.co.sena.tennisshop.integracion.jpa.entitis.Inventario;
import edu.co.sena.tennisshop.integracion.jpa.entitis.Item;
import edu.co.sena.tennisshop.integracion.jpa.entitis.ItemPK;
import edu.co.sena.tennisshop.integracion.jpa.entitis.Pago;
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
public class ItemJPATest {
    Item  item;
    EntityManagerFactory emf;
    EntityManager em;
    public ItemJPATest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        item= new Item();
        item.setItemPK(new ItemPK("00002", 1));
        item.setCantidad(7);
        item.setValorTotal(0);
        item.setValorUnitario(0);
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
    public void insertaritem(){
        
        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        em.merge(item);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        
    
    }
    @Test
    public void actualizarItems() {

        String idPro = JOptionPane.showInputDialog("Escriba el id de la producto");
        String idPeFacIdFac = JOptionPane.showInputDialog("Escriba el id de la factura");
        String actCan = JOptionPane.showInputDialog("Escriba La Cantidad");
        String actCosTo = JOptionPane.showInputDialog("Escriba El Costo Total");
        String actCosUni = JOptionPane.showInputDialog("Escriba El Costo Unitario");

        item.setItemPK(new ItemPK(idPro, Integer.parseInt(idPeFacIdFac)));
        item.setCantidad(Integer.parseInt(actCan));
        item.setValorTotal(Float.valueOf(actCan));
        item.setValorUnitario(Float.valueOf(actCosUni));

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        em.merge(item);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
    @Test
    public void buscarItem() {

        String idPro = JOptionPane.showInputDialog("Inserte El id del producto");
        String idpedfact = JOptionPane.showInputDialog("Inserte El id del pedido");

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Item item = em.find(Item.class, new ItemPK(idPro, Integer.parseInt(idpedfact)));

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

        System.out.println(item.toString());
    }
@Test
    public void borrarUnItem() {
        String idPro = JOptionPane.showInputDialog("Inserte El id del producto");
        String idPed = JOptionPane.showInputDialog("Inserte El id del pedido");
        try {
            em = EntityManagerHelper.getEntityManager();
            EntityManagerHelper.beginTransaction();

            em.remove(em.find(Item.class, new ItemPK(idPro, Integer.parseInt(idPed))));
            EntityManagerHelper.commit();
            EntityManagerHelper.closeEntityManager();
            EntityManagerHelper.closeEntityManagerFactory();
        } catch (Exception e) {
            System.out.println("No se pudo eliminar el departamento" + e.getMessage());
        }
        
    }
     @Test
    public void buscarTodosLosItems() {
        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        Query q = em.createNamedQuery("Item.findAll");
        List<Item> lis = q.getResultList();
        for (Item itemT : lis) {

            System.out.println(itemT.toString());
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
     @Test
    public void buscarPorCanttidad() {
        String cantidad = JOptionPane.showInputDialog("Insertar la cantidad Del item");

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Query query = em.createNamedQuery("ItemCarrito.findByCantidad");
        query.setParameter("cantidad", Integer.parseInt(cantidad));

        Item it = (Item) query.getSingleResult();

        List<Item> lista = query.getResultList();
        for (Item itemT : lista) {
            System.out.println(it.toString());
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
    @Test
    public void buscarPorValorUnitario() {
        String valorUnitario= JOptionPane.showInputDialog("Insertar la cantidad Del item");

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Query query = em.createNamedQuery("ItemCarrito.findByValorUnitario");
        query.setParameter("valorUnitario", Double.parseDouble(valorUnitario));

        Item it = (Item) query.getSingleResult();

        List<Item> lista = query.getResultList();
        for (Item itemT : lista) {
            System.out.println(it.toString());
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
    @Test
    public void buscarPorValorTotal() {
        String valorTotal= JOptionPane.showInputDialog("Insertar el valor total  Del item");

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Query query = em.createNamedQuery("ItemCarrito.findByValorTotal");
        query.setParameter("valorTotal", Double.parseDouble(valorTotal));

        Item it = (Item) query.getSingleResult();

        List<Item> lista = query.getResultList();
        for (Item itemT : lista) {
            System.out.println(it.toString());
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
    
}
