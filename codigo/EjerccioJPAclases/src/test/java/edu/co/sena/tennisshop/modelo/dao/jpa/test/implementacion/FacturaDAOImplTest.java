/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.dao.jpa.test.implementacion;

import edu.co.sena.entity.jpa.Factura;
import edu.co.sena.entity.jpa.Factura;
import edu.co.sena.entity.jpa.Pago;
import edu.co.sena.tennisshop.modelo.dao.jpa.test.implementacion.FacturaDAOImplTest;
import edu.co.sena.tennisshop.modelo.jpa.dao.implementacion.FacturaDAOImpl;
import edu.co.sena.tennisshop.modelo.jpa.dao.implementacion.PagoDAOImpl;
import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
/**
 *
 * @author pc
 */
public class FacturaDAOImplTest {
    public FacturaDAOImplTest() {
    Factura entity = new Factura();
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

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
    public void testInsert() {
        System.out.println("insert");
        Factura entity = new Factura();
        entity.setIdFactura(Integer.MIN_VALUE);
        entity.setFechaFactura(new Date());
        entity.setFormaPago("Credito");
        FacturaDAOImpl instance = new FacturaDAOImpl();
        instance.insert(entity);

    }

    @Test
    public void testUpdate() {
        System.out.println("update");
        Factura entity = new Factura();
        entity.setFechaFactura(new Date());
        entity.setFormaPago("Credito");

       FacturaDAOImpl instance = new FacturaDAOImpl();
        instance.update(entity);

//        fail("The test case is a prototype.");
    }

    @Test
    public void testDelete() {
        System.out.println("delete");
        Factura entity = new Factura();
        entity.setFormaPago("Debito");
        FacturaDAOImpl instance = new FacturaDAOImpl();
        instance.delete(entity);
//// TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    @Test
    public void testfindByAll() {
        System.out.println("findByAll");
        FacturaDAOImpl instance = new FacturaDAOImpl();
        List<Factura> result = instance.findByAll();
        for (Factura result1 : result) {
            System.out.println(result1.toString());
        }
    }

    @Test

    public void testfindByIdFactura() {
        System.out.println("findByIdFactura");
        Factura fact;
        Integer IdFact=01110;
        FacturaDAOImpl factura= new FacturaDAOImpl();
        fact=factura.findByIdFactura(IdFact);
        System.out.println(fact.toString());
        
        

    }

    @Test

    public void testfindByFechaFactura() {
         System.out.println("findByFechaFactura");
        Date fechFact =new Date();
        FacturaDAOImpl instance = new FacturaDAOImpl();
        List<Factura> result = instance.findByFechaFactura(fechFact);
        for (Factura result1 : result) {
            System.out.println(result1.toString());
        }

     
        }

    

    @Test

    public void testfindByFormaPago() {
        System.out.println("findByFormaPago");
        String formPag = "Credito";
       FacturaDAOImpl instance = new FacturaDAOImpl();
        List<Factura> result = instance.findByFormaPago(formPag);
        for (Factura result1 : result) {
            System.out.println(result1.toString());

        }
    }

    
    }


    

