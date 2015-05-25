/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.dao.jpa.test.implementacion;

import edu.co.sena.entity.jpa.Item;
import edu.co.sena.entity.jpa.Pedido;
import edu.co.sena.entity.jpa.Producto;
import edu.co.sena.tennisshop.modelo.jpa.dao.implementacion.CarritoComprasDAOImpl;
import edu.co.sena.tennisshop.modelo.jpa.dao.implementacion.ItemDAOImpl;
import edu.co.sena.tennisshop.modelo.jpa.dao.implementacion.PedidoDAOImpl;
import edu.co.sena.tennisshop.modelo.jpa.dao.implementacion.ProductoDAOImpl;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

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
        entity.setNombreProdcuto("Sportleagues");
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

    @Test
    public void testfindByAll() {
        System.out.println("findByAll");
        ProductoDAOImpl instance = new ProductoDAOImpl();
        List<Producto> result = instance.findByAll();
        for (Producto result1 : result) {
            System.out.println(result1.toString());

        }
    }

    @Test

    public void testfindByIdProducto() {
        System.out.println("findByIdProducto");
        Producto prod;

        ProductoDAOImpl producto = new ProductoDAOImpl();
        prod = producto.findByIdProducto("101");
        System.out.println(prod.toString());

    }

    @Test
    public void testfindByNombreProdcuto() {
        System.out.println("findByNombreProdcuto");
        String nombreProdcuto = "Sportleagues";
        ProductoDAOImpl instance = new ProductoDAOImpl();
        List<Producto> result = instance.findByNombreProdcuto(nombreProdcuto);
        for (Producto result1 : result) {
            System.out.println(result1.toString());
        }

    }

    @Test
    public void testfindByPrecio() {
        System.out.println("findByPrecio");
        double precio = 84000;
        ProductoDAOImpl instance = new ProductoDAOImpl();
        List<Producto> result = instance.findByPrecio(precio);
        for (Producto result1 : result) {
            System.out.println(result1.toString());
        }
    }

    @Test
    public void testfindByCantidad() {
        System.out.println("findByCantidad");
        Integer cantidad = 14;
        ItemDAOImpl instance = new ItemDAOImpl();
        List<Item> result = instance.findByCantidad(cantidad);
        for (Item result1 : result) {
            System.out.println(result1.toString());
        }
    }

    @Test
    public void testfindByDescripcion() {
        System.out.println("findByDescripcion");
        String descripcion = "Tendencias verano";
        ProductoDAOImpl instance = new ProductoDAOImpl();
        List<Producto> result = instance.findByDescripcion(descripcion);
        for (Producto result1 : result) {
            System.out.println(result1.toString());
        }
    }
}
