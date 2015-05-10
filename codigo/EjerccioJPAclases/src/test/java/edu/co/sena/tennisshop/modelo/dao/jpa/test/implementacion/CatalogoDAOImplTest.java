/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.dao.jpa.test.implementacion;

import edu.co.sena.entity.jpa.CarritoCompras;
import edu.co.sena.entity.jpa.Catalogo;
import edu.co.sena.tennisshop.modelo.jpa.dao.implementacion.CarritoComprasDAOImpl;
import edu.co.sena.tennisshop.modelo.jpa.dao.implementacion.CatalogoDAOImpl;
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
public class CatalogoDAOImplTest {
    Catalogo Entity = new Catalogo();
    public CatalogoDAOImplTest() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        Entity.setIdCatologo(1);
        Entity.setNombre("NUEVA COLLECION 2015");
        Entity.setDescripcion("ROPA CASUAL");
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
        CatalogoDAOImpl instance = new CatalogoDAOImpl();
        instance.insert(Entity);

    }
    @Test
    public void testUpdate() {
        System.out.println("update");
        Entity.setDescripcion("ropa elegante");
        CatalogoDAOImpl instance = new CatalogoDAOImpl();
        instance.update(Entity);


    }
     @Test
    public void testDelete() {
         System.out.println("delete");
        CatalogoDAOImpl instance = new CatalogoDAOImpl();
        Catalogo ct = instance.findByIdCatologo(1);
        instance.delete(ct);
    }
     @Test
    public void testFindByIdCatalogo() {
        System.out.println("findByIdCatologo");
        Catalogo ct;
        Integer idcatalogo= 1;
        CatalogoDAOImpl catalogo= new CatalogoDAOImpl();
        ct = catalogo.findByIdCatologo(idcatalogo);
        System.out.println(ct.toString());

    }
     @Test
    public void testFindByAll() {
        System.out.println("findByAll");
        CatalogoDAOImpl instance = new CatalogoDAOImpl();
        List<Catalogo> result = instance.findByAll();
        for (Catalogo result1 : result) {
            System.out.println(result1.toString());
        }
}
     @Test
    public void testFindByNombre() {
        System.out.println("findByNombre");
        String nombre = "NUEVA COLLECCION 2015";
        CatalogoDAOImpl instance = new CatalogoDAOImpl();
        List<Catalogo> result = instance.findByNombre(nombre);
        for (Catalogo result1 : result) {
            System.out.println(result1.toString());
        }
}
    @Test
    public void testFindByDescripcion() {
        System.out.println("findByDescripcion");
        String descripcion = "ROPA CASUAL";
        CatalogoDAOImpl instance = new CatalogoDAOImpl();
        List<Catalogo> result = instance.findByDescripcion(descripcion);
        for (Catalogo result1 : result) {
            System.out.println(result1.toString());
        }
}
    
}
