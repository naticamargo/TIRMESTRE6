/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.factory.mysql;

import edu.co.sena.entity.jpa.Producto;
import edu.co.sena.tennishop.midelo.jpa.dao.interfaces.ProductoDAO;
import edu.co.sena.tennisshop.modelo.factory.DAOAbstractFactoryProducto;
import edu.co.sena.tennisshop.modelo.jpa.dao.implementacion.ProductoDAOImpl;
import java.util.List;

/**
 *
 * @author pc
 */
public class MysqlJPADAOProducto extends DAOAbstractFactoryProducto {

    public ProductoDAO createProductoDAO() {
        return new ProductoDAOImpl();
    }
}
