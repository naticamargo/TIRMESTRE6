/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.dao.jpa.test.implementacion;

import edu.co.sena.entity.jpa.Item;
import edu.co.sena.tennisshop.modelo.jpa.dao.implementacion.ItemDAOImpl;
import edu.co.sena.entity.jpa.ItemPK;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author ColsutecR
 */
public class ItemDAOImplTest {

    public ItemDAOImplTest() {
        Item entity = new Item();
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
        Item entity = new Item();
        entity.setItemPK(new ItemPK());
        entity.setCantidad(15);
        entity.setValorUnitario(124850);
        entity.setValorTotal(0);

        ItemDAOImpl instance = new ItemDAOImpl();
        instance.insert(entity);

    }

    @Test
    public void testUpdate() {
        System.out.println("update");
        Item entity = new Item();
        entity.setItemPK(new ItemPK());
        entity.setCantidad(15);
        entity.setValorUnitario(1);
        entity.setValorTotal(158100);
        ItemDAOImpl instance = new ItemDAOImpl();
        instance.update(entity);

//        fail("The test case is a prototype.");
    }

    @Test
    public void testDelete() {
        System.out.println("delete");
        Item entity = new Item();
        entity.setCantidad(10);
        ItemDAOImpl instance = new ItemDAOImpl();
        instance.delete(entity);
//// TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    @Test
    public void testfindByAll() {
        System.out.println("findByAll");
        ItemDAOImpl instance = new ItemDAOImpl();
        List<Item> result = instance.findByAll();
        for (Item result1 : result) {
            System.out.println(result1.toString());
        }
    }

    @Test
    public void testfindByIDItem() {
        System.out.println("findByIDItem");
        Item itm;
        ItemPK IdItem = new ItemPK("101", 0111);
        ItemDAOImpl item1 = new ItemDAOImpl();
        itm = item1.findByIDItem(null);
        System.out.println(itm.toString());
    }

    @Test
    public void testfindByCantidad() {
        System.out.println("findByCantidad");
        Integer cantidad = 7;
        ItemDAOImpl instance = new ItemDAOImpl();
        List<Item> result = instance.findByCantidad(cantidad);
        for (Item result1 : result) {
            System.out.println(result1.toString());
        }

    }

    @Test

    public void testfindByValorUnitario() {
        System.out.println("findByValorUnitario");
        float valorUnitario = 154780;
        ItemDAOImpl instance = new ItemDAOImpl();
        List<Item> result = instance.findByValorUnitario(valorUnitario);
        for (Item result1 : result) {
            System.out.println(result1.toString());
        }
    }

    @Test
    public void testFindByValorTotal() {
        System.out.println("findByValorTotal");
        float valorTotal = 150444;
        ItemDAOImpl instance = new ItemDAOImpl();
        List<Item> result2 = instance.findByValorTotal(valorTotal);
        for (Item result1 : result2) {
            System.out.println(result1.toString());
        }
    }
}
