/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.dao.jpa.test.implementacion;

import edu.co.sena.entity.jpa.Usuario;
import edu.co.sena.tennisshop.modelo.jpa.dao.implementacion.UsuarioDAOImpl;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author ColsutecR
 */
public class UsuarioDAOImplTest {
    Usuario Entity = new Usuario();
    public UsuarioDAOImplTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        Entity.setIdUsuario("1");
        Entity.setCorreoElectronico("cristiancho.96@hotmail.com");
        Entity.setContrasena("123456789");
        Entity.setActivo(Boolean.TRUE);
        Entity.setRol("cliente");    }
    
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
        Usuario entity = new Usuario();
        entity.setIdUsuario("1");
        entity.setCorreoElectronico("cristiancho.96@hotmail.com");
        entity.setContrasena("123456789");
        entity.setActivo(Boolean.TRUE);
        entity.setRol("cliente");
        UsuarioDAOImpl instance = new UsuarioDAOImpl();
        instance.insert(entity);

    }
@Test
    public void testUpdate() {
        System.out.println("update");
        Usuario entity = new Usuario();
        entity.setIdUsuario("2");
        entity.setCorreoElectronico("cristiancho.96@hotmail.com");
        entity.setContrasena("123456789");
        entity.setActivo(Boolean.TRUE);
        entity.setRol("cliente");
        UsuarioDAOImpl instance = new UsuarioDAOImpl();
        instance.update(entity);

    }
    @Test
    public void testDelete() {
        System.out.println("delete");
        Usuario entity = new Usuario();
        entity.setIdUsuario("2");
        UsuarioDAOImpl instance = new UsuarioDAOImpl();
        instance.delete(entity);
//// TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
