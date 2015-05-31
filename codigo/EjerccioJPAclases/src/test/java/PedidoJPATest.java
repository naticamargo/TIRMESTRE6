/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import edu.co.sena.jpa.util.EntityManagerHelper;
import edu.co.sena.entity.jpa.Factura;
import edu.co.sena.entity.jpa.Pedido;
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
public class PedidoJPATest {
   Pedido  pedido;
    EntityManagerFactory emf;
    EntityManager em;
    public PedidoJPATest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        pedido = new Pedido();
        pedido.setFacturaIdFactura(1);
        pedido.setImpuestos(6);
        pedido.setSubtotal(50000);
        pedido.setTotal(100000);
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
    public void insertarpedido(){
        
        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        em.merge(pedido);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        
    
    }
     @Test
    public void actualizarPedido() {

        String FacIdFac = JOptionPane.showInputDialog("Escriba el id de la factura");
        String actTotal = JOptionPane.showInputDialog("Escriba el Total");

        pedido.setFacturaIdFactura(Integer.parseInt(FacIdFac));
        pedido.setTotal(Double.parseDouble(actTotal));

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        em.merge(pedido);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
     @Test
    public void buscarUnPedido() {

        String idFac = JOptionPane.showInputDialog("Inserte El id de la Factura");

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Pedido ped = em.find(Pedido.class, Integer.parseInt(idFac));

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

        System.out.println(ped.toString());
    }
     @Test
    public void borrarUnPedido() {
        String idFactura = JOptionPane.showInputDialog("Escriba el id de la factura");

        try {
            em = EntityManagerHelper.getEntityManager();
            EntityManagerHelper.beginTransaction();

            em.remove(em.find(Pedido.class, Integer.parseInt(idFactura)));
            EntityManagerHelper.commit();
            EntityManagerHelper.closeEntityManager();
            EntityManagerHelper.closeEntityManagerFactory();
        } catch (Exception e) {
            System.out.println("No se puedo eliminar el pedido" + e.getMessage());
        }

    }
    @Test
    public void buscarPedidos() {
        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        Query q = em.createNamedQuery("Pedido.findAll");
        List<Pedido> lis = q.getResultList();
        for (Pedido pedidoT : lis) {

            System.out.println(pedidoT.toString());
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
     @Test
    public void buscarPorTotal() {
        String total = JOptionPane.showInputDialog("Insertar el total del pedido");

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Query query = em.createNamedQuery("Pedido.findByTotal");
        query.setParameter("total", Double.parseDouble(total));

       Pedido ped = (Pedido) query.getSingleResult();

        List<Pedido> lista = query.getResultList();
        for (Pedido pedidoT : lista) {
            System.out.println(ped.toString());
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
    @Test
    public void buscarPorSubTotal() {
        String subtotal = JOptionPane.showInputDialog("Insertar el subtotal del pedido");

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Query query = em.createNamedQuery("Pedido.findBySubtotal");
        query.setParameter("subtotal", Double.parseDouble(subtotal));

       Pedido ped = (Pedido) query.getSingleResult();

        List<Pedido> lista = query.getResultList();
        for (Pedido pedidoT : lista) {
            System.out.println(ped.toString());
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
    @Test
    public void buscarPorImpuestos() {
        String impuestos = JOptionPane.showInputDialog("Insertar los impuestos del pedido");

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Query query = em.createNamedQuery("Pedido.findByImpuestos");
        query.setParameter("impuestos", Double.parseDouble(impuestos));

       Pedido ped = (Pedido) query.getSingleResult();

        List<Pedido> lista = query.getResultList();
        for (Pedido pedidoT : lista) {
            System.out.println(ped.toString());
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
}
