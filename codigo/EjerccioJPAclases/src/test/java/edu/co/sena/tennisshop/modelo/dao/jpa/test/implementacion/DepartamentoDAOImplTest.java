/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.dao.jpa.test.implementacion;

import edu.co.sena.entity.jpa.Departamento;
import edu.co.sena.tennisshop.modelo.jpa.dao.implementacion.DepartamentoDAOImpl;
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
public class DepartamentoDAOImplTest {
    Departamento Entity = new Departamento();
    public DepartamentoDAOImplTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        Entity.setIdDEPARTAMENTO(1);
        Entity.setNombreDeparamento("Cundinamarca");
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
        Departamento entity = new Departamento();
        Entity.setIdDEPARTAMENTO(1);
        Entity.setNombreDeparamento("Cundinamarca");
        DepartamentoDAOImpl instance = new DepartamentoDAOImpl();
        instance.insert(entity);

    }

    @Test
    public void testUpdate() {
        System.out.println("update");
        Departamento entity = new Departamento();
        Entity.setIdDEPARTAMENTO(2);
        Entity.setNombreDeparamento("Amazonas");
        DepartamentoDAOImpl instance = new DepartamentoDAOImpl();
        instance.update(entity);
    }

    @Test
    public void testDelete() {
        System.out.println("delete");
        Departamento entity = new Departamento();
        Entity.setIdDEPARTAMENTO(2);
        DepartamentoDAOImpl instance = new DepartamentoDAOImpl();
        instance.delete(entity);

    }
    
    @Test
    public void testFindByIdDepartamento() {
        System.out.println("findByIdDepartamento");
        Departamento cct;
        Integer idDepartamento= 1;
        DepartamentoDAOImpl depar = new DepartamentoDAOImpl();
        cct = depar.findByIdDEPARTAMENTO(idDepartamento);
        System.out.println(cct.toString());
    }
    
    @Test
    public void testFindbyAll() {
        System.out.println("findByAll");
        DepartamentoDAOImpl instance = new DepartamentoDAOImpl();
        List<Departamento> result = instance.findByAll();
        for (Departamento result1 : result) {
            System.out.println(result1.toString());
        }
    }
    @Test
    public void testFindByNombreDeparamento() {
        System.out.println("findByNombreDeparamento");
        String nombre = "Cundinamarca";
        DepartamentoDAOImpl instance = new DepartamentoDAOImpl();
        List<Departamento> result = instance.findByNombreDeparamento(nombre);
        for (Departamento result1 : result) {
            System.out.println(result1.toString());
        }
    }
}
