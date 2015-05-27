/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.dao.jpa.test.implementacion;

import edu.co.sena.entity.jpa.CarritoCompras;
import edu.co.sena.entity.jpa.ItemCarrito;
import edu.co.sena.entity.jpa.ItemCarritoPK;
import edu.co.sena.tennisshop.modelo.jpa.dao.implementacion.IItemCarritoDAOImpl;
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
public class ItemCarritoDAOImplTest {
    ItemCarrito Entity = new ItemCarrito ();
    public ItemCarritoDAOImplTest() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        Entity.setCantidad(3);
        Entity.setItemCarritoPK(new ItemCarritoPK("021852", "101"));
        Entity.setValorTotal(78000);
        Entity.setValorUnitario(20000);
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
        IItemCarritoDAOImpl instance = new IItemCarritoDAOImpl();
        instance.insert(Entity);

    }
     @Test
    public void testUpdate() {
        System.out.println("update");
        Entity.setCantidad(5);
        IItemCarritoDAOImpl instance = new IItemCarritoDAOImpl();
        instance.update(Entity);


    }
     @Test
    public void testDelete() {
         System.out.println("delete");
        IItemCarritoDAOImpl instance = new IItemCarritoDAOImpl();
        ItemCarrito ct = instance.findByIDItemDeCarrito(new ItemCarritoPK(null, "101"));
        instance.delete(ct);
    }
     @Test
    public void testFindByAll() {
        System.out.println("findByAll");
       IItemCarritoDAOImpl instance = new IItemCarritoDAOImpl();
        List<ItemCarrito> result = instance.findByAll();
        for (ItemCarrito result1 : result) {
            System.out.println(result1.toString());
        }
}
    @Test
    public void testFindByIdItemCarrito() {
        ItemCarrito it;
        String idProducto="021852";
        String idCarrito="101";
        IItemCarritoDAOImpl instance = new IItemCarritoDAOImpl();
        it=instance.findByIDItemDeCarrito(new ItemCarritoPK(idProducto, idCarrito));
        System.out.println(it.toString());     
        
    }
     @Test
    public void testFindByValorTotal() {
        System.out.println("findByValorTotal");
        double valorTotal = 78000;
        IItemCarritoDAOImpl instance = new IItemCarritoDAOImpl();
        List<ItemCarrito> result = instance.findByValorTotal(valorTotal);
        for (ItemCarrito result1 : result) {
            System.out.println(result1.toString());
        }
    }
     @Test
    public void testFindByValorUnitario() {
        System.out.println("findByValorUnitario");
        double costoUnitario = 170000;
        IItemCarritoDAOImpl instance = new IItemCarritoDAOImpl();
        List<ItemCarrito> result = instance.findByValorUnitario(costoUnitario);
        for (ItemCarrito result1 : result) {
            System.out.println(result1.toString());
        }
    }
}
