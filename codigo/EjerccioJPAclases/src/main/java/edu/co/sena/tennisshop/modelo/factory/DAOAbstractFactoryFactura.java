/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.factory;

import edu.co.sena.tennisshop.modelo.factory.mysql.MysqlJPADAOFactura;

/**
 *
 * @author pc
 */
public abstract  class DAOAbstractFactoryFactura implements DAOFactura{
    public static final int MYSQL_FACTORY = 1;
    
    public final static DAOAbstractFactoryFactura getDAOFactory(int factoryType) throws Exception{
        switch (factoryType) {
          
            case MYSQL_FACTORY:{
                return new MysqlJPADAOFactura();
            }
          
            default:{
                System.out.println("El tipo de fabrica no puede sr implementado o no existe");
                return null;
            }

        }
    }
}

        
