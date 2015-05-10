/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.dao.jpa.test.implementacion;

import edu.co.sena.entity.jpa.CarritoCompras;
import edu.co.sena.entity.jpa.Categoria;
import edu.co.sena.tennisshop.modelo.jpa.dao.implementacion.CategoriaDAOImpl;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ADMIN
 */
public class CategoriaDAOImplTest {
     
     Categoria Entity = new Categoria ();

    public CategoriaDAOImplTest() {
    }
     
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        Entity.setIdCategoria(2);
        Entity.setNombre("nueva categoria");
        Entity.setMarca("adidas");
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
        CategoriaDAOImpl instance = new CategoriaDAOImpl();
        instance.insert(Entity);

    }
     @Test
    public void testUpdate() {
        System.out.println("update");
        Entity.setMarca("nike");
        CategoriaDAOImpl instance = new CategoriaDAOImpl();
        instance.update(Entity);


    }
    @Test
    public void testDelete() {
         System.out.println("delete");
        CategoriaDAOImpl instance = new CategoriaDAOImpl();
        Categoria ct = instance.findByIdCategoria(1);
        instance.delete(ct);
    }
    @Test
    public void testFindByIdCategoria() {
        System.out.println("findByIdCategoria");
        Categoria ct;
        Integer idcategoria = 1;
        CategoriaDAOImpl categoria = new CategoriaDAOImpl();
        ct = categoria.findByIdCategoria(1);
        System.out.println(ct.toString());

    }
}
