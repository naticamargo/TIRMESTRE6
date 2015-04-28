/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.dao.jpa.test.implementacion;
import edu.co.sena.tennisshop.integracion.jpa.entitis.CarritoCompras;
import edu.co.sena.tennisshop.integracion.jpa.entitis.Producto;
import edu.co.sena.tennisshop.modelo.jpa.dao.implementacion.CarritoComprasDAOImpl;
import edu.co.sena.tennisshop.modelo.jpa.dao.implementacion.ProductoDAOImpl;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ColsutecR
 */
public class ProductoDAOImplTest {
    public ProductoDAOImplTest() {
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
        Producto entity = new Producto();
        entity.setIdProducto("021852");
        entity.setNombreProdcuto("Tennis dama");
        entity.setPrecio(0);
        entity.setCantidad(0);
        ProductoDAOImpl instance = new ProductoDAOImpl();
        instance.insert(entity);

    }

    @Test
    public void testUpdate() {
        System.out.println("update");
        Producto entity = new Producto();
        entity.setNombreProdcuto("Tennis");
        entity.setPrecio(1000);
        ProductoDAOImpl instance = new ProductoDAOImpl();
        instance.update(entity);

//        fail("The test case is a prototype.");
    }

    @Test
    public void testDelete() {
        System.out.println("delete");
        Producto entity = new Producto();
        entity.setIdProducto("asdfasdfasdf");
       ProductoDAOImpl instance = new ProductoDAOImpl();
        instance.delete(entity);
//// TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

}


