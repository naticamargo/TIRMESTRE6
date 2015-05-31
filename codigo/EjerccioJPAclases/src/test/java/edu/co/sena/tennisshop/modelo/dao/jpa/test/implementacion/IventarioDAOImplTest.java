/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.dao.jpa.test.implementacion;

import edu.co.sena.entity.jpa.Inventario;
import edu.co.sena.entity.jpa.InventarioPK;
import edu.co.sena.tennisshop.modelo.jpa.dao.implementacion.CarritoComprasDAOImpl;
import edu.co.sena.tennisshop.modelo.jpa.dao.implementacion.IItemCarritoDAOImpl;
import edu.co.sena.tennisshop.modelo.jpa.dao.implementacion.IIventarioDAOImpl;
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
public class IventarioDAOImplTest {
     Inventario Entity = new Inventario ();
    public IventarioDAOImplTest() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        Entity.setInventarioPK(new InventarioPK(1, "C.C", "1023010294", "021852"));
        Entity.setCantidad(2);
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
        IIventarioDAOImpl instance = new IIventarioDAOImpl();
        instance.insert(Entity);

    }
     @Test
    public void testUpdate() {
        System.out.println("update");
        Entity.setCantidad(3);
        IIventarioDAOImpl instance = new IIventarioDAOImpl();
        instance.update(Entity);


    }
    @Test
    public void testDelete() {
         System.out.println("delete");
        IIventarioDAOImpl instance = new IIventarioDAOImpl();
        Inventario ct = instance.findByIDInventario(new InventarioPK(1, "C.C", "1023010294", "021852"));
        instance.delete(ct);
    }
 @Test
    public void testFindByIdInventario() {
       Inventario it;
       Integer idInventario=1;
        String tipoDocu="C.C";
        String numeroDocu="1023010294";
        String idProducto="021852";
        
        IIventarioDAOImpl instance = new IIventarioDAOImpl();
        it=instance.findByIDInventario(new InventarioPK(idInventario, numeroDocu, numeroDocu, idProducto));
        System.out.println(it.toString());

    }
    @Test
    public void testFindByAll() {
        System.out.println("findByAll");
       IIventarioDAOImpl instance = new IIventarioDAOImpl();
        List<Inventario> result = instance.findByAll();
        for (Inventario result1 : result) {
            System.out.println(result1.toString());
        }
    
}
    @Test
    public void testFindByCantidad() {
        System.out.println("findByCantidad");
        Integer cantidad = 2;
        IIventarioDAOImpl instance = new IIventarioDAOImpl();
        List<Inventario> result = instance.findByCantidad(cantidad);
        for (Inventario result1 : result) {
            System.out.println(result1.toString());
        }
    }
}
    
