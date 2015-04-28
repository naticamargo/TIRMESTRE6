/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.dao.jpa.test.implementacion;

import edu.co.sena.entity.jpa.Municipio;
import edu.co.sena.tennisshop.modelo.jpa.dao.implementacion.MunicipioDAOImpl;
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
        System.out.println("delete");
        Municipio entity = new Municipio();
        Entity.setIdMUNICIPIO(2);
        MunicipioDAOImpl instance = new MunicipioDAOImpl();
        instance.delete(entity);
//// TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
}
