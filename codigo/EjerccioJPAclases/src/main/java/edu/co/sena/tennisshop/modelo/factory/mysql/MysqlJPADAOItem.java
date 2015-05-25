/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.factory.mysql;

import edu.co.sena.tennishop.midelo.jpa.dao.interfaces.ItemDAO;
import edu.co.sena.tennisshop.modelo.factory.DAOAbstractFactoryItem;
import edu.co.sena.tennisshop.modelo.jpa.dao.implementacion.ItemDAOImpl;

/**
 *
 * @author pc
 */
public class MysqlJPADAOItem extends DAOAbstractFactoryItem {

    public ItemDAO createItemDAO() {
        return new ItemDAOImpl();
    }
}
