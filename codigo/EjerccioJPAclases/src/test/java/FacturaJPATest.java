/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import edu.co.sena.jpa.util.EntityManagerHelper;
import java.util.Calendar;
import edu.co.sena.entity.jpa.Cuenta;
import edu.co.sena.entity.jpa.Domicilio;
import edu.co.sena.entity.jpa.Factura;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
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
import javax.persistence.Query;

/**
 *
 * @author ADMIN
 */
public class FacturaJPATest {
    Calendar hoy = Calendar.getInstance(TimeZone.getTimeZone("GMT-5"));
    Date fechaactual = hoy.getTime();
    Factura  factura;
    EntityManagerFactory emf;
    EntityManager em;
    public FacturaJPATest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        factura= new Factura();
        factura.setIdFactura(1);
        factura.setCuenta(new Cuenta("cc",  "10678957"));
        factura.setFechaFactura(fechaactual);
        factura.setFormaPago("targeta");
        
        
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
    public void insertarfactura(){
        
        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        em.persist(factura);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        
    
    }
    @Test
    public void actualizarFactura() {

        String idTD = JOptionPane.showInputDialog("Escriba el tipo de documento");
        String idND = JOptionPane.showInputDialog("Escriba el numero de documento");

                
        factura.setCuenta(new Cuenta(idND, idND));
        factura.setFechaFactura(fechaactual);

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        em.merge(factura);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
     @Test
    public void buscarUnaFactura() {

        String idFac = JOptionPane.showInputDialog("Inserte El id de la factura");
        

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        
        Factura fac = em.find(Factura.class, Integer.parseInt(idFac));
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

        System.out.println(fac.toString());
    }
    @Test
    public void borrarUnaFactura() {
        String idfactura = JOptionPane.showInputDialog("Escriba el id de la factura");
        
        try {
            em = EntityManagerHelper.getEntityManager();
            EntityManagerHelper.beginTransaction();

            em.remove(em.find(Factura.class, Integer.parseInt(idfactura)));
            EntityManagerHelper.commit();
            EntityManagerHelper.closeEntityManager();
            EntityManagerHelper.closeEntityManagerFactory();
        } catch (Exception e) {
            System.out.println("No se puedo eliminar la factura" + e.getMessage());
        }

        
}
     @Test
    public void buscarFacturas() {
        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        Query q = em.createNamedQuery("Factura.findAll");
        List<Factura> lis = q.getResultList();
        for (Factura facturaT : lis) {

            System.out.println(facturaT.toString());
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
    @Test
    public void buscarPorFecha() {
        
        Calendar hoy = Calendar.getInstance(TimeZone.getTimeZone("GMT-5"));
         hoy.set(20, 4, 2015);
       Date fechaTemporal = hoy.getTime();

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Query query = em.createNamedQuery("Factura.findByFechaFactura");
        System.out.println("fecha en el objeto:"+fechaTemporal);
        query.setParameter("fechaFactura",fechaTemporal);
        

        List<Factura> lista = query.getResultList();
        for (Factura facturaT : lista) {
            System.out.println(facturaT.toString());
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
}


