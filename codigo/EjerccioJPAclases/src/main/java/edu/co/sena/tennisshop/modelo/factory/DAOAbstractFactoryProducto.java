/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.factory;

import edu.co.sena.tennisshop.modelo.factory.mysql.MysqlJPADAOProducto;

/**
 *
 * @author pc
 */
public abstract class DAOAbstractFactoryProducto implements DAOProducto {

    public static final int MYSQL_FACTORY = 1;

    public final static DAOAbstractFactoryProducto getDAOFactory(int factoryType) throws Exception {
        switch (factoryType) {

            case MYSQL_FACTORY: {
                return new MysqlJPADAOProducto();
            }

            default: {
                System.out.println("El tipo de fabrica no puede ser implementado o tal vez  no existe");
                return null;
            }
        }
    }
}
