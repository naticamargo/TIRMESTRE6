/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.dao.jpa.test.implementacion;

import edu.co.sena.entity.jpa.CarritoCompras;
import edu.co.sena.tennisshop.modelo.jpa.dao.implementacion.CarritoComprasDAOImpl;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ADMIN
 */
public class CarritoComprasDAOImplTest {
    CarritoCompras Entity = new CarritoCompras ();
    public CarritoComprasDAOImplTest() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        Entity.setIdCARRITO("101");
        Entity.setImpuestos(16);
        Entity.setSubtotal(60000);
        Entity.setTotal(61000);
        

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
        CarritoComprasDAOImpl instance = new CarritoComprasDAOImpl();
        instance.insert(Entity);

    }

    @Test
    public void testUpdate() {
        System.out.println("update");
        Entity.setImpuestos(1);
        CarritoComprasDAOImpl instance = new CarritoComprasDAOImpl();
        instance.update(Entity);


    }

    @Test
    public void testDelete() {
         System.out.println("delete");
        CarritoComprasDAOImpl instance = new CarritoComprasDAOImpl();
        CarritoCompras ct = instance.findByIdCARRITO("101");
        instance.delete(ct);
    }
     @Test
    public void testFindByIdCarrito() {
        System.out.println("findByIdCARRITO");
        CarritoCompras ct;
        String idcarrito = "101";
        CarritoComprasDAOImpl carrito = new CarritoComprasDAOImpl();
        ct = carrito.findByIdCARRITO(idcarrito);
        System.out.println(ct.toString());

    }
    @Test
    public void testFindByAll() {
        System.out.println("findByAll");
        CarritoComprasDAOImpl instance = new CarritoComprasDAOImpl();
        List<CarritoCompras> result = instance.findByAll();
        for (CarritoCompras result1 : result) {
            System.out.println(result1.toString());
        }

}
     @Test
    public void testFindByTotal() {
        System.out.println("findByTotal");
        double total = 61000;
        CarritoComprasDAOImpl instance = new CarritoComprasDAOImpl();
        List<CarritoCompras> result = instance.findByTotal(total);
        for (CarritoCompras result1 : result) {
            System.out.println(result1.toString());
        }
}
     @Test
    public void testFindBySubtotal() {
        System.out.println("findBySubtotal");
        double subtotal =60000 ;
        CarritoComprasDAOImpl instance = new CarritoComprasDAOImpl();
        List<CarritoCompras> result = instance.findBySubtotal(subtotal);
         for (CarritoCompras result1 : result) {
            System.out.println(result1.toString());
        }
    }
     @Test
    public void testFindByImpuestos() {
        System.out.println("findByImpuestos");
        double impuestos =16 ;
        CarritoComprasDAOImpl instance = new CarritoComprasDAOImpl();
        List<CarritoCompras> result = instance.findByImpuestos(impuestos);
         for (CarritoCompras result1 : result) {
            System.out.println(result1.toString());
        }
    }
    
}
