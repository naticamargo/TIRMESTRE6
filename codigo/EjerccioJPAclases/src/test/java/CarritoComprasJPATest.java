/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import edu.co.sena.jpa.util.EntityManagerHelper;
import edu.co.sena.tennisshop.integracion.jpa.entitis.CarritoCompras;
import edu.co.sena.tennisshop.integracion.jpa.entitis.Cuenta;
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
public class CarritoComprasJPATest {
     CarritoCompras carritocompras;
    EntityManagerFactory emf;
    EntityManager em;
    public CarritoComprasJPATest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        carritocompras= new CarritoCompras();
        carritocompras.setIdCARRITO("101");
        carritocompras.setImpuestos(0);
        carritocompras.setTotal(0);
        carritocompras.setSubtotal(0);
        
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
    public void insertarCarritsoCompras(){
        
        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        em.persist(carritocompras);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        
    
    }
    @Test
    public void actualizarCarritoCompras() {

        String idCarrito = JOptionPane.showInputDialog("insertar El Id Del Carrito");
        String caritotal = JOptionPane.showInputDialog("Digite El Total");

        carritocompras.setIdCARRITO(idCarrito);
        carritocompras.setTotal(Double.parseDouble(caritotal));

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        em.merge(carritocompras);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();
    }
    @Test
    public void buscarUnCarrito() {

        String idCarrito = JOptionPane.showInputDialog("Inserte El Id Del Carrito");

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        CarritoCompras carr = em.find(CarritoCompras.class, idCarrito);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

        System.out.println(carr.toString());
    }
     @Test
    public void borrarUnCarrito() {
        String idCarrito = JOptionPane.showInputDialog("Escriba el id del carrito a eliminar");
        try {
            em = EntityManagerHelper.getEntityManager();
            EntityManagerHelper.beginTransaction();

            em.remove(em.find(CarritoCompras.class, idCarrito));
            EntityManagerHelper.commit();
            EntityManagerHelper.closeEntityManager();
            EntityManagerHelper.closeEntityManagerFactory();
        } catch (Exception e) {
            System.out.println("No se puedo eliminar el carrito" + e.getMessage());
        }

}
     @Test
    public void buscarCarritosDeCompras() {
        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        Query q = em.createNamedQuery("CarritoCompras.findAll");
        List<CarritoCompras> lis = q.getResultList();
        for (CarritoCompras carritoT : lis) {
            System.out.println("IdCarrito: " + carritoT.getIdCARRITO() + " / Total: " + +carritoT.getTotal() + " / Subtotal: " + carritoT.getSubtotal()+ "/impuestos:"+ carritoT.getImpuestos());
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
    @Test
    public void buscarPorTotal() {
        
        String total = JOptionPane.showInputDialog("Insertar el total del carrito de compras");

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Query query = em.createNamedQuery("CarritoCompras.findByTotal");
        query.setParameter("total", Double.parseDouble(total));
        
        CarritoCompras carrito = (CarritoCompras)query.getSingleResult();
        
        List<CarritoCompras> lista = query.getResultList();
        for (CarritoCompras lista1 : lista) {
            System.out.println(carrito.toString());
            

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();
        

    }
}
     @Test
    public void buscarPorSubTotal() {
         String subTotal = JOptionPane.showInputDialog("Insertar el subtotal del carrito de compras");

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Query query = em.createNamedQuery("CarritoCompras.findBySubtotal");
        query.setParameter("subtotal", Double.parseDouble(subTotal));
        
        CarritoCompras carrito = (CarritoCompras)query.getSingleResult();
        
        List<CarritoCompras> lista = query.getResultList();
        for (CarritoCompras lista1 : lista) {
            System.out.println(carrito.toString());
            
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
    @Test
    public void buscarPorImpuestos() {
         String Impuestos = JOptionPane.showInputDialog("Insertar el subtotal del carrito de compras");

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Query query = em.createNamedQuery("CarritoCompras.findByImpuestos");
        query.setParameter("impuestos", Double.parseDouble(Impuestos));
        
        CarritoCompras carrito = (CarritoCompras)query.getSingleResult();
        
        List<CarritoCompras> lista = query.getResultList();
        for (CarritoCompras lista1 : lista) {
            System.out.println(carrito.toString());
            
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
    
}
