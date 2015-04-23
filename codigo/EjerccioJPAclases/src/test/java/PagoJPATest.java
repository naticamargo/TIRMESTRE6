/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import edu.co.sena.jpa.util.EntityManagerHelper;
import edu.co.sena.tennisshop.integracion.jpa.entitis.Factura;
import edu.co.sena.tennisshop.integracion.jpa.entitis.Municipio;
import edu.co.sena.tennisshop.integracion.jpa.entitis.Pago;
import edu.co.sena.tennisshop.integracion.jpa.entitis.Pedido;
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
public class PagoJPATest {
    Pago  pago;
    EntityManagerFactory emf;
    EntityManager em;
    public PagoJPATest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        pago= new Pago();
        pago.setNumeroCuenta("1003467");
        pago.setTargeta("codensa");
        pago.setTipoPago("debito");
        pago.setFacturaIdFactura(1);
        
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
    public void insertarpago(){
        
        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        em.merge(pago);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        
    
    }
    @ Test
    public void actualizarPago() {
        String catLeida = JOptionPane.showInputDialog("Digite el pago a Actualizar");
        String catLeidaValor = JOptionPane.showInputDialog("Digite el valor");
        pago.setFacturaIdFactura(Integer.parseInt(catLeida));
        pago.setTipoPago(catLeidaValor);
        
        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        em.merge(pago);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();
     }
@Test
    public void buscarPago() {

        String idFac = JOptionPane.showInputDialog("Inserte El id de la Factura");
        
        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Pago pago = em.find(Pago.class, Integer.parseInt(idFac));

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

        System.out.println(pago.toString());
    }
    @Test
    public void borrarUnPago() {
        String idFactura = JOptionPane.showInputDialog("Escriba el id de la factura");
        
        try {
            em = EntityManagerHelper.getEntityManager();
            EntityManagerHelper.beginTransaction();

            em.remove(em.find(Pago.class, Integer.parseInt(idFactura)));
            EntityManagerHelper.commit();
            EntityManagerHelper.closeEntityManager();
            EntityManagerHelper.closeEntityManagerFactory();
        } catch (Exception e) {
            System.out.println("No se puedo eliminar el pago" + e.getMessage());
        }
    }
    @Test
    public void buscarTodosLosPAgos() {
        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        Query q = em.createNamedQuery("Pago.findAll");
        List<Pago> lis = q.getResultList();
        for (Pago pagoT : lis) {

            System.out.println(pagoT.toString());
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
    @Test
    public void buscarPorTipoPago() {
        String tipoPago = JOptionPane.showInputDialog("Insertar el tipo de pago del pago");

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Query query = em.createNamedQuery("Pago.findByTipoPago");
        query.setParameter("tipoPago", tipoPago);

        Pago pago = (Pago) query.getSingleResult();

        List<Pago> lista = query.getResultList();
        for (Pago pagoT : lista) {
            System.out.println(pago.toString());
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
    @Test
    public void buscarPorNumeroCuenta() {
        String numeroCuenta = JOptionPane.showInputDialog("Insertar el numero de la tarjeta pago");

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Query query = em.createNamedQuery("Pago.findByNumeroCuenta");
        query.setParameter("numeroCuenta", numeroCuenta);

        Pago pago = (Pago) query.getSingleResult();

        List<Pago> lista = query.getResultList();
        for (Pago pagoT : lista) {
            System.out.println(pago.toString());
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
    @Test
    public void buscarPorTargeta() {
        String targeta = JOptionPane.showInputDialog("Insertar la targeta del  pago");

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Query query = em.createNamedQuery("Pago.findByTargeta");
        query.setParameter("targeta", targeta);

        Pago pago = (Pago) query.getSingleResult();

        List<Pago> lista = query.getResultList();
        for (Pago pagoT : lista) {
            System.out.println(pago.toString());
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
    
    
    
        
}


