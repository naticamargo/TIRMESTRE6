/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.dao.jpa.test.implementacion;

import edu.co.sena.entity.jpa.Usuario;
import edu.co.sena.tennisshop.modelo.jpa.dao.implementacion.UsuarioDAOImpl;
import java.util.List;
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
        Entity.setIdUsuario("101");
        Entity.setCorreoElectronico("cristiancho.96@hotmail.com");
        Entity.setContrasena("123456789");
        Entity.setActivo(Boolean.TRUE);
        Entity.setRol("cliente");
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
        UsuarioDAOImpl instance = new UsuarioDAOImpl();
        instance.insert(Entity);

    }

    @Test
    public void testUpdate() {
        System.out.println("update");
        Usuario entity = new Usuario();
        entity.setCorreoElectronico("cris.96@hotmail.com");
        UsuarioDAOImpl instance = new UsuarioDAOImpl();
        instance.update(entity);

    }

    @Test
    public void testDelete() {
        System.out.println("Delete");
        UsuarioDAOImpl instance = new UsuarioDAOImpl();
        Usuario cct = instance.findByIdUsuario("101");
        instance.delete(cct);

    }

    @Test
    public void testFindByAll() {
        System.out.println("findByAll");
        UsuarioDAOImpl instance = new UsuarioDAOImpl();
        List<Usuario> result = instance.findByAll();
        for (Usuario result1 : result) {
            System.out.println(result1.getIdUsuario());
        }
    }
    
    @Test
    public void testFindByCorreoElectronico() {
        System.out.println("findByCorreoElectronico");
        String CorreoElectronico = "cristiancho.96@hotmail.com";
        UsuarioDAOImpl instance = new UsuarioDAOImpl();
        List<Usuario> result = instance.findByCorreoElectronico(CorreoElectronico);
        for (Usuario result1 : result) {
            System.out.println(result1.getIdUsuario());
        }
    }
    
    @Test
    public void testFindByContrasena() {
        System.out.println("findByContrasena");
        String Contrasena = "123456789";
        UsuarioDAOImpl instance = new UsuarioDAOImpl();
        List<Usuario> result = instance.findByContrasena(Contrasena);
        for (Usuario result1 : result) {
            System.out.println(result1.getIdUsuario());
        }
    }
    @Test
    public void testFindByRol() {
        System.out.println("findByRol");
        String Rol = "Cliente";
        UsuarioDAOImpl instance = new UsuarioDAOImpl();
        List<Usuario> result = instance.findByRol(Rol);
        for (Usuario result1 : result) {
            System.out.println(result1.getIdUsuario());
        }
    }
    @Test
    public void testFindByActivo() {
        System.out.println("findByActivo");
        String activo = "1";
        UsuarioDAOImpl instance = new UsuarioDAOImpl();
        List<Usuario> result = instance.findByActivo(activo);
        for (Usuario result1 : result) {
            System.out.println(result1.getIdUsuario());
        }
    }
}
