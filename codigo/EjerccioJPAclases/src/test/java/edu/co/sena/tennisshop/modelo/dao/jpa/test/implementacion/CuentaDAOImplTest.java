/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.dao.jpa.test.implementacion;

import edu.co.sena.entity.jpa.Cuenta;
import edu.co.sena.entity.jpa.CuentaPK;
import edu.co.sena.entity.jpa.Usuario;
import edu.co.sena.tennisshop.modelo.jpa.dao.implementacion.CuentaDAOImpl;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author familia
 */
public class CuentaDAOImplTest {
    
    Cuenta Entity = new Cuenta();
    
    public CuentaDAOImplTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        Entity.setCuentaPK(new CuentaPK(null, null));
        Entity.setPrimerApellido("Moreno");
        Entity.setPrimerNombre("Stefany");
        Entity.setSegundoApellido("Munoz");
        Entity.setSegundoNombre("Andrea");
        Entity.setUsuario("Andre123");
        Entity.setUsuarioIdUsuario(new Usuario("1"));
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
        CuentaDAOImpl instance = new CuentaDAOImpl();
        instance.insert(Entity);

    }

    @Test
    public void testUpdate() {
        System.out.println("update");
        Cuenta entity = new Cuenta();
        entity.setUsuarioIdUsuario(new Usuario("1"));
        CuentaDAOImpl instance = new CuentaDAOImpl();
        instance.update(entity);

    }

    @Test
    public void testDelete() {
        System.out.println("delete");
        CuentaDAOImpl instance = new CuentaDAOImpl();
        Cuenta pro = instance.finByCuentaPk(new CuentaPK("C.C", "1023010294"));
        instance.delete(pro);
    }
    
    @Test
    public void testFindByProveedor() {
        System.out.println("findByProveedor");
        Cuenta pro;
        String idtipoDocumento = "C.C";
        String idnumeroDocumento = "102301924";
        CuentaDAOImpl cuenta = new CuentaDAOImpl();
        pro = cuenta.finByCuentaPk(new CuentaPK(idtipoDocumento, idnumeroDocumento));
        System.out.println(pro.getCuentaPK());
    }
     @Test
    public void testFindByAll() {
        System.out.println("findAll");
        CuentaDAOImpl instance = new CuentaDAOImpl();
        List<Cuenta> result = instance.findByAll();
        for (Cuenta result1 : result) {
            System.out.println(result1.getCuentaPK());
        }
    }
    @Test
    public void testFindByPrimerApellido() {
        System.out.println("findByPrimerApellido");
        String nombre = "moreno";
        CuentaDAOImpl instance = new CuentaDAOImpl();
        List<Cuenta> result = instance.findByPrimerApellido(nombre);
        for (Cuenta result1 : result) {
            System.out.println(result1.getPrimerApellido());
        }
    }
    @Test
    public void testFindByPrimerNombre() {
        System.out.println("findBy");
        String PrimerNombre = "Stefany";
        CuentaDAOImpl instance = new CuentaDAOImpl();
        List<Cuenta> result = instance.findByPrimerNombre(PrimerNombre);
        for (Cuenta result1 : result) {
            System.out.println(result1.getPrimerNombre());
        }
    }
    @Test
    public void testFindBySegundoApellido() {
        System.out.println("findBySegundoApellido");
        String  SegundoApellido= "munoz";
        CuentaDAOImpl instance = new CuentaDAOImpl();
        List<Cuenta> result = instance.findBySegundoApellido(SegundoApellido);
        for (Cuenta result1 : result) {
            System.out.println(result1.getSegundoApellido());
        }
    }
    @Test
    public void testFindBySegundoNombre() {
        System.out.println("findBySegundoNombre");
        String  SegundoNombre= "andrea";
        CuentaDAOImpl instance = new CuentaDAOImpl();
        List<Cuenta> result = instance.findBySegundoNombre(SegundoNombre);
        for (Cuenta result1 : result) {
            System.out.println(result1.getSegundoApellido());
        }
    }
     @Test
    public void testFindByUsuario() {
        System.out.println("findByUsuario");
        String  Usuario= "andrea123";
        CuentaDAOImpl instance = new CuentaDAOImpl();
        List<Cuenta> result = instance.findByUsuario(Usuario);
        for (Cuenta result1 : result) {
            System.out.println(result1.getSegundoApellido());
        }
    }
     @Test
    public void testFindByIdUsuario() {
        System.out.println("findByIdUsuario");
        String  IdUsuario= "1";
        CuentaDAOImpl instance = new CuentaDAOImpl();
        List<Cuenta> result = instance.findByUsuario(IdUsuario);
        for (Cuenta result1 : result) {
            System.out.println(result1.getUsuarioIdUsuario());
        }
    }
}
