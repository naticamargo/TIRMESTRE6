/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.dao.jpa.test.implementacion;


import edu.co.sena.entity.jpa.Domicilio;
import edu.co.sena.entity.jpa.DomicilioPK;
import edu.co.sena.tennisshop.modelo.jpa.dao.implementacion.DomiciloDAOImpl;
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
public class DomicilioDAOImplTest {

    Domicilio Entity = new Domicilio();

    public DomicilioDAOImplTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

        Entity.setBarrio("yomasa");
        Entity.setDirrecion("cr &a #81-30");
        Entity.setDomicilioPK(new DomicilioPK(1, "C.C", "1023010294"));
        Entity.setLocalidad("quintadeusme");
        Entity.setTelefono("77341098");
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
        DomiciloDAOImpl instance = new DomiciloDAOImpl();
        instance.insert(Entity);

    }

    @Test
    public void testUpdate() {
        System.out.println("update");
        Domicilio entity = new Domicilio();
        entity.setDirrecion("cr 6a #81-30");
        DomiciloDAOImpl instance = new DomiciloDAOImpl();
        instance.update(entity);

    }

    @Test
    public void testDelete() {
        System.out.println("delete");
        DomiciloDAOImpl instance = new DomiciloDAOImpl();
        Domicilio pro = instance.finByDomicilioPk(new DomicilioPK(1, "C.C", "1023010294"));
        instance.delete(pro);
    }

    @Test
    public void testFindByDomicilio() {
        System.out.println("findByDomicilio");
        Domicilio pro;
        String idtipoDocumento = "C.C";
        String idnumeroDocumento = "102301924";
        integer idDOMICILIO = "1";
        DomiciloDAOImpl Domicilio = new DomiciloDAOImpl();
        pro = Domicilio.finByDomicilioPk(new DomicilioPK(idDOMICILIO, idtipoDocumento, idnumeroDocumento));
        System.out.println(pro.getDomicilioPK());
    }

    @Test
    public void testFindByAll() {
        System.out.println("findAll");
        DomiciloDAOImpl instance = new DomiciloDAOImpl();
        List<Domicilio> result = instance.findByAll();
        for (Domicilio result1 : result) {
            System.out.println(result1.getDomicilioPK());
        }
    }

    @Test
    public void testFindByBarrio() {
        System.out.println("findByBarrio");
        String nombre = "moreno";
        DomiciloDAOImpl instance = new DomiciloDAOImpl();
        List<Domicilio> result = instance.findByBarrio(nombre);
        for (Domicilio result1 : result) {
            System.out.println(result1.getBarrio());
        }
    }

    @Test
    public void testFindByDirrecion() {
        System.out.println("findByCuenta");
        String PrimerNombre = "Stefany";
        DomiciloDAOImpl instance = new DomiciloDAOImpl();
        List<Domicilio> result = instance.findByDirrecion(PrimerNombre);
        for (Domicilio result1 : result) {
            System.out.println(result1.getDirrecion());
        }
    }

    @Test
    public void testFindByLocalidad() {
        System.out.println("findByLocalidad");
        String Localidad = "munoz";
        DomiciloDAOImpl instance = new DomiciloDAOImpl();
        List<Domicilio> result = instance.findByLocalidad(Localidad);
        for (Domicilio result1 : result) {
            System.out.println(result1.getLocalidad());
        }
    }

    @Test
    public void testFindByTelefono() {
        System.out.println("findByTelefono");
        String Telefono = "andrea";
        DomiciloDAOImpl instance = new DomiciloDAOImpl();
        List<Domicilio> result = instance.findByTelefono(Telefono);
        for (Domicilio result1 : result) {
            System.out.println(result1.getTelefono());
        }
    }

}
