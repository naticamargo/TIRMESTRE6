/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.dao.jpa.test.implementacion;

import edu.co.sena.entity.jpa.Municipio;
import edu.co.sena.tennisshop.modelo.jpa.dao.implementacion.MunicipioDAOImpl;
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
public class MunicipioDAOImplTest {

    Municipio Entity = new Municipio();

    public MunicipioDAOImplTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        Entity.setIdMUNICIPIO(1);
        Entity.setNombreMunicipio("Tolima");

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
        Municipio entity = new Municipio();
        Entity.setIdMUNICIPIO(1);
        Entity.setNombreMunicipio("Tolima");
        MunicipioDAOImpl instance = new MunicipioDAOImpl();
        instance.insert(entity);

    }

    @Test
    public void testUpdate() {
        System.out.println("update");
        Municipio entity = new Municipio();
        Entity.setIdMUNICIPIO(2);
        Entity.setNombreMunicipio("Tolima");
        MunicipioDAOImpl instance = new MunicipioDAOImpl();
        instance.update(entity);
    }

    @Test
    public void testDelete() {
        System.out.println("Delete");
        MunicipioDAOImpl instance = new MunicipioDAOImpl();
        Municipio cct = instance.findByIdMUNICIPIO(2);
        instance.delete(cct);
//// TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    @Test
    public void testFindByIdMunicipio() {
        System.out.println("findByIdMunicipio");
        Municipio cct;
        Integer  idMunicipio = 1;
        MunicipioDAOImpl mun = new MunicipioDAOImpl();
        cct = mun.findByIdMUNICIPIO(idMunicipio);
        System.out.println(cct.getIdMUNICIPIO());
    }
     @Test
    public void testFindByAll() {
        System.out.println("findByAll");
        MunicipioDAOImpl instance = new MunicipioDAOImpl();
        List<Municipio> result = instance.findByAll();
        for (Municipio result1 : result) {
            System.out.println(result1.toString());
        }
    }
    @Test
    public void testFindByNombreMunicipio() {
        System.out.println("findByNombreMunicipio");
        String nombre = "Tolima";
        MunicipioDAOImpl instance = new MunicipioDAOImpl();
        List<Municipio> result = instance.findByNombreMunicipio(nombre);
        for (Municipio result1 : result) {
            System.out.println(result1.toString());
        }
    }
}
