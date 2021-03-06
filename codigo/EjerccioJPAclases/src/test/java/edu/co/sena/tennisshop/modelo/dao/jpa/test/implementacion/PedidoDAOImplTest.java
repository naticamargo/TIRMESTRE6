/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.dao.jpa.test.implementacion;

import edu.co.sena.entity.jpa.Factura;
import edu.co.sena.entity.jpa.Pedido;
import edu.co.sena.tennisshop.modelo.dao.jpa.test.implementacion.PedidoDAOImplTest;
import edu.co.sena.tennisshop.modelo.jpa.dao.implementacion.PedidoDAOImpl;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author ColsutecR
 */
public class PedidoDAOImplTest {

    public PedidoDAOImplTest() {
        Pedido entity = new Pedido();
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
        Pedido entity = new Pedido();
        entity.setFactura(new Factura());
        entity.setImpuestos(0);
        entity.setSubtotal(0);
        entity.setTotal(0);
        PedidoDAOImpl instance = new PedidoDAOImpl();
        instance.insert(entity);

    }

    @Test
    public void testUpdate() {
        System.out.println("update");
        Pedido entity = new Pedido();
        entity.setFactura(new Factura());
        entity.setItemCollection(null);
        entity.setImpuestos(1);
        entity.setTotal(1000);
        PedidoDAOImpl instance = new PedidoDAOImpl();
        instance.update(entity);

//        fail("The test case is a prototype.");
    }

    @Test
    public void testDelete() {
        System.out.println("delete");
        Pedido entity = new Pedido();
        entity.setImpuestos(1);
        PedidoDAOImpl instance = new PedidoDAOImpl();
        instance.delete(entity);
//// TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    @Test
    public void testfindByAll() {
        System.out.println("findByAll");
        PedidoDAOImpl instance = new PedidoDAOImpl();
        List<Pedido> result = instance.findByAll();
        for (Pedido result1 : result) {
            System.out.println(result1.toString());
        }
    }

    @Test

    public void testfindByFacturaIdFactura() {
        System.out.println("findByFacturaIdFactura");
        Pedido ped;
        Integer FactIdFact = 12458802;
        PedidoDAOImpl pedido = new PedidoDAOImpl();
        ped = pedido.findByFacturaIdFactura(FactIdFact);
        System.out.println(ped.toString());

    }

    @Test

    public void testfindByTotal() {
        System.out.println("findByTotal");
        double total=14870;
        PedidoDAOImpl instance = new PedidoDAOImpl();
        List<Pedido> result = instance.findByTotal(total);
        for (Pedido result1 : result) {
            System.out.println(result1.toString());
        }
    }

    @Test

    public void testfindBySubtotal() {
        System.out.println("findBySubtotal");
        double subtotal=148790;
        PedidoDAOImpl instance = new PedidoDAOImpl();
        List<Pedido> result = instance.findBySubtotal(subtotal);
        for (Pedido result1 : result) {
            System.out.println(result1.toString());
        }

    }

    @Test

    public void testfindByImpuestos() {
        System.out.println("findByImpuestos");

        double impuestos = 12477;
        PedidoDAOImpl instance = new PedidoDAOImpl();
        List<Pedido> result = instance.findByImpuestos(impuestos);
        for (Pedido result1 : result) {
            System.out.println(result1.toString());
        }

    }
}
