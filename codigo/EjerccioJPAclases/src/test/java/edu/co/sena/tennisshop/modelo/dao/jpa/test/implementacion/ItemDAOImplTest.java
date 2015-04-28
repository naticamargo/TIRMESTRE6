/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.dao.jpa.test.implementacion;

import edu.co.sena.tennisshop.integracion.jpa.entitis.Item;
import edu.co.sena.tennisshop.integracion.jpa.entitis.ItemPK;
import edu.co.sena.tennisshop.modelo.jpa.dao.implementacion.ItemDAOImpl;
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
        Item entity= new Item();
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

}


