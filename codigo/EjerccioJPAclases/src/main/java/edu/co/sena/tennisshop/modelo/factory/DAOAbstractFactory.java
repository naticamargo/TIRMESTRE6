/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.factory;

import edu.co.sena.tennisshop.modelo.factory.mysql.MysqlJPADAOUsurio;

/**
 *
 * @author ColsutecR
 */
public abstract class DAOAbstractFactory implements DAOUsuario {
    public static final int MYSQL_FACTORY = 1;
    
    public final static DAOAbstractFactory getDAOFactory(int factoryType) throws Exception{
        switch (factoryType) {
          
            case MYSQL_FACTORY:{
                return new MysqlJPADAOUsurio();
            }
          
            default:{
                System.out.println("El tipo de fabrica no puede sr implementado o no existe");
                return null;
            }
    
        }

    }
}