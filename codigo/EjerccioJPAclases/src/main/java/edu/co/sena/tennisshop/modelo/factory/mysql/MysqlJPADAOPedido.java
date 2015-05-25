/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.factory.mysql;

import edu.co.sena.tennishop.midelo.jpa.dao.interfaces.PedidoDAO;
import edu.co.sena.tennisshop.modelo.factory.DAOAbstractFactoryPedido;
import edu.co.sena.tennisshop.modelo.jpa.dao.implementacion.PedidoDAOImpl;

/**
 *
 * @author pc
 */
public class MysqlJPADAOPedido extends DAOAbstractFactoryPedido {

    public PedidoDAO createPedidoDAO() {
        return new PedidoDAOImpl();

    }
}
