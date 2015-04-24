/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.dao.jpa.test.implementacion;

import edu.co.sena.tennisshop.integracion.jpa.entitis.CarritoCompras;
import edu.co.sena.tennisshop.modelo.jpa.dao.implementacion.CarritoComprasDAOImpl;
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

    public CarritoComprasDAOImplTest() {
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
        CarritoCompras entity = new CarritoCompras();
        entity.setIdCARRITO("asdfasdfasdf");
        entity.setImpuestos(0);
        entity.setSubtotal(0);
        entity.setTotal(0);
        CarritoComprasDAOImpl instance = new CarritoComprasDAOImpl();
        instance.insert(entity);

    }

    @Test
    public void testUpdate() {
        System.out.println("update");
        CarritoCompras entity = new CarritoCompras();
        entity.setIdCARRITO("asdfasdfasdf");
        entity.setImpuestos(1);
        entity.setTotal(1000);
        CarritoComprasDAOImpl instance = new CarritoComprasDAOImpl();
        instance.update(entity);

//        fail("The test case is a prototype.");
    }

}
