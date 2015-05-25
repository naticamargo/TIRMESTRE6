/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.dao.jpa.test.implementacion;

import edu.co.sena.entity.jpa.Pago;
import edu.co.sena.entity.jpa.Factura;
import edu.co.sena.tennisshop.modelo.dao.jpa.test.implementacion.PagoDAOImplTest;
import edu.co.sena.tennisshop.modelo.jpa.dao.implementacion.PagoDAOImpl;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author ColsutecR
 */
public class PagoDAOImplTest {

    public PagoDAOImplTest() {
        Pago entity = new Pago();
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
        Pago entity = new Pago();
        entity.setFactura(null);
        entity.setNumeroCuenta("4720978");
        entity.setTipoPago("Targeta");
        entity.setFacturaIdFactura(Integer.MIN_VALUE);
        PagoDAOImpl instance = new PagoDAOImpl();
        instance.insert(entity);

    }

    @Test
    public void testUpdate() {
        System.out.println("update");
        Pago entity = new Pago();
        entity.setFactura(new Factura());
        entity.setNumeroCuenta("470297821");
        entity.setTargeta("Debito");

        PagoDAOImpl instance = new PagoDAOImpl();
        instance.update(entity);

//        fail("The test case is a prototype.");
    }

    @Test
    public void testDelete() {
        System.out.println("delete");
        Pago entity = new Pago();
        entity.setNumeroCuenta("470297821");
        PagoDAOImpl instance = new PagoDAOImpl();
        instance.delete(entity);
//// TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    @Test
    public void testfindByAll() {
        System.out.println("findByAll");
        PagoDAOImpl instance = new PagoDAOImpl();
        List<Pago> result = instance.findByAll();
        for (Pago result1 : result) {
            System.out.println(result1.toString());
        }
    }

    @Test

    public void testfindByINumeroCuenta() {
        System.out.println("findByNumeroCuenta");

        String numeroCuenta = "012458802";
        PagoDAOImpl instance = new PagoDAOImpl();
        List<Pago> result = instance.findByNumeroCuenta(numeroCuenta);
        for (Pago result1 : result) {
            System.out.println(result1.toString());
        }

    }

    @Test

    public void testfindByTargeta() {
        System.out.println("findByTargeta");

        String Targeta = "BBVA";
        PagoDAOImpl instance = new PagoDAOImpl();
        List<Pago> result = instance.findByTargeta(Targeta);
        for (Pago result1 : result) {
            System.out.println(result1.toString());
        }

    }

    @Test

    public void testfindByTipoPago() {
        System.out.println("findByTipoPago");

        String tipoPago = "Credito";
        PagoDAOImpl instance = new PagoDAOImpl();
        List<Pago> result = instance.findByTipoPago(tipoPago);
        for (Pago result1 : result) {
            System.out.println(result1.toString());

        }
    }

    @Test

    public void testfindByFactutaIdFactura() {
        System.out.println("findByFacturaIdFactura");
        Pago pag;
        Integer FactIdFact = 12458802;
        PagoDAOImpl pago = new PagoDAOImpl();
        pag=pago.findByFacturaIdFactura(FactIdFact);

        }
    }
