/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.dao.jpa.test.implementacion;

import edu.co.sena.entity.jpa.Proveedor;
import edu.co.sena.entity.jpa.ProveedorPK;
import edu.co.sena.tennisshop.modelo.jpa.dao.implementacion.ProveedorDAOImpl;
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
public class ProveedorDAOImplTest {

    Proveedor Entity = new Proveedor();

    public ProveedorDAOImplTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        Entity.setNombreProvvedor("Tennisshop");
        Entity.setProveedorPK(new ProveedorPK("C.C", "1023010294"));
        Entity.setCorreo("Tennisshop@hotmail.com");
        Entity.setTelefono("7734198");
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testInsert() {
        System.out.println("insert");
        ProveedorDAOImpl instance = new ProveedorDAOImpl();
        instance.insert(Entity);

    }

    @Test
    public void testUpdate() {
        System.out.println("update");
        Proveedor entity = new Proveedor();
        entity.setCorreo("cris.96@hotmail.com");
        ProveedorDAOImpl instance = new ProveedorDAOImpl();
        instance.update(entity);

    }

    @Test
    public void testDelete() {
        System.out.println("delete");
        ProveedorDAOImpl instance = new ProveedorDAOImpl();
        Proveedor pro = instance.finByProveedor(new ProveedorPK("C.C", "102301924"));
        instance.delete(pro);
    }

    @Test
    public void testFindByProveedor() {
        System.out.println("findByProveedor");
        Proveedor pro;
        String idtipoDocumento = "C.C";
        String idnumeroDocumento = "102301924";
        ProveedorDAOImpl proveedor = new ProveedorDAOImpl();
        pro = proveedor.finByProveedor(new ProveedorPK(idtipoDocumento, idnumeroDocumento));
        System.out.println(pro.getProveedorPK());
    }

    @Test
    public void testFindByAll() {
        System.out.println("findAll");
        ProveedorDAOImpl instance = new ProveedorDAOImpl();
        List<Proveedor> result = instance.findByAll();
        for (Proveedor result1 : result) {
            System.out.println(result1.getProveedorPK());
        }
    }

    @Test
    public void testFindByNombreProvvedor() {
        System.out.println("findByNombreProvvedor");
        String nombre = "Tennisshop";
        ProveedorDAOImpl instance = new ProveedorDAOImpl();
        List<Proveedor> result = instance.findBynombreProvvedor(nombre);
        for (Proveedor result1 : result) {
            System.out.println(result1.getNombreProvvedor());
        }
    }
    @Test
    public void testFindByCorreo() {
        System.out.println("findByCorreo");
        String Correo = "Tennisshop@hotmail.com";
        ProveedorDAOImpl instance = new ProveedorDAOImpl();
        List<Proveedor> result = instance.findBycorreo(Correo);
        for (Proveedor result1 : result) {
            System.out.println(result1.getCorreo());
        }
    }
    @Test
    public void testFindByTelefono() {
        System.out.println("findByTelefono");
        String telefono = "7734198";
        ProveedorDAOImpl instance = new ProveedorDAOImpl();
        List<Proveedor> result = instance.findBycorreo(telefono);
        for (Proveedor result1 : result) {
            System.out.println(result1.getCorreo());
        }
    }
}
