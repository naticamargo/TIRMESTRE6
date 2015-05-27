/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.jpa.dao.test;

import edu.co.sena.tennisshop.modelo.dao.jpa.test.implementacion.*;
import edu.co.sena.entity.jpa.CarritoCompras;
import edu.co.sena.tennishop.midelo.jpa.dao.interfaces.ICarritoComprasDAO;
import edu.co.sena.tennisshop.modelo.factory.mysql.DAOAbstractFactory;
import edu.co.sena.tennisshop.modelo.factory.mysql.DaoFactory;
import edu.co.sena.tennisshop.modelo.factory.mysql.MysqlJPADAOFactory;
import edu.co.sena.tennisshop.modelo.jpa.dao.implementacion.CarritoComprasDAOImpl;
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
public class CarritoComprasDAOImplTest {

    CarritoCompras Entity = new CarritoCompras();

    public CarritoComprasDAOImplTest() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        Entity.setIdCARRITO("3");
        Entity.setImpuestos(16);
        Entity.setSubtotal(70000);
        Entity.setTotal(61000);

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
    public void testInsert() throws Exception {
        System.out.println("insert");
        DaoFactory fabrica = MysqlJPADAOFactory.getDAOFactory(DAOAbstractFactory.MYSQL_FACTORY);
        ICarritoComprasDAO ejemplo = fabrica.createCarritoComprasDAO();
        ejemplo.insert(Entity);

    }

    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        Entity.setImpuestos(1);
        DaoFactory fabrica = MysqlJPADAOFactory.getDAOFactory(DAOAbstractFactory.MYSQL_FACTORY);
        ICarritoComprasDAO ejemplo = fabrica.createCarritoComprasDAO();
        ejemplo.insert(Entity);


    }

    @Test
    public void testDelete() throws Exception {
        System.out.println("delete");
       DaoFactory fabrica = MysqlJPADAOFactory.getDAOFactory(DAOAbstractFactory.MYSQL_FACTORY);
        ICarritoComprasDAO ejemplo = fabrica.createCarritoComprasDAO();
        ejemplo.insert(Entity);

        CarritoCompras ct = ejemplo.findByIdCARRITO("3");
        ejemplo.delete(ct);
    }

    @Test
    public void testFindByIdCarrito() throws Exception {
        System.out.println("findByIdCARRITO");
        CarritoCompras ct;
        String idcarrito = "3";
        DaoFactory fabrica = MysqlJPADAOFactory.getDAOFactory(DAOAbstractFactory.MYSQL_FACTORY);
        ICarritoComprasDAO ejemplo = fabrica.createCarritoComprasDAO();
        ct = ejemplo.findByIdCARRITO(idcarrito);
        System.out.println(ct.toString());

    }

    @Test
    public void testFindByAll() throws Exception {
        System.out.println("findByAll");
         DaoFactory fabrica = MysqlJPADAOFactory.getDAOFactory(DAOAbstractFactory.MYSQL_FACTORY);
        ICarritoComprasDAO ejemplo = fabrica.createCarritoComprasDAO();
        List<CarritoCompras> result = ejemplo.findByAll();
        for (CarritoCompras result1 : result) {
            System.out.println(result1.toString());
        }

    }

    @Test
    public void testFindByTotal() throws Exception {
        System.out.println("findByTotal");
        double total = 61000;
        DaoFactory fabrica = MysqlJPADAOFactory.getDAOFactory(DAOAbstractFactory.MYSQL_FACTORY);
        ICarritoComprasDAO ejemplo = fabrica.createCarritoComprasDAO();
        List<CarritoCompras> result = ejemplo.findByTotal(total);
        for (CarritoCompras result1 : result) {
            System.out.println(result1.toString());
        }
    }

    @Test
    public void testFindBySubtotal() throws Exception {
        System.out.println("findBySubtotal");
        double subtotal = 70000;
        DaoFactory fabrica = MysqlJPADAOFactory.getDAOFactory(DAOAbstractFactory.MYSQL_FACTORY);
        ICarritoComprasDAO ejemplo = fabrica.createCarritoComprasDAO();
        List<CarritoCompras> result = ejemplo.findBySubtotal(subtotal);
        for (CarritoCompras result1 : result) {
            System.out.println(result1.toString());
        }
    }

    @Test
    public void testFindByImpuestos() throws Exception {
        System.out.println("findByImpuestos");
        double impuestos = 16;
      DaoFactory fabrica = MysqlJPADAOFactory.getDAOFactory(DAOAbstractFactory.MYSQL_FACTORY);
        ICarritoComprasDAO ejemplo = fabrica.createCarritoComprasDAO();
        List<CarritoCompras> result = ejemplo.findByImpuestos(impuestos);
        for (CarritoCompras result1 : result) {
            System.out.println(result1.toString());
        }
    }

}
