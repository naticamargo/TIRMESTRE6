/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.factory;

import edu.co.sena.tennishop.midelo.jpa.dao.interfaces.PedidoDAO;
import edu.co.sena.tennisshop.modelo.factory.mysql.MysqlJPADAOPedido;

/**
 *
 * @author pc
 */
public abstract class DAOAbstractFactoryPedido implements DAOPedido {

    public static final int MYSQL_FACTORY = 1;
    
    public final static DAOAbstractFactoryPedido getDAOFactory(int factoryType) throws Exception{
        switch (factoryType) {
          
            case MYSQL_FACTORY:{
                return new MysqlJPADAOPedido();
            }
          
            default:{
                System.out.println("El tipo de fabrica no puede ser implementado o tal vez  no existe");
                return null;
            }
}
    }
}
    
    

