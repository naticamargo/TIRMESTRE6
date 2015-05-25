/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.factory.mysql;
import edu.co.sena.tennishop.midelo.jpa.dao.interfaces.FacturaDAO;
import edu.co.sena.tennisshop.modelo.factory.DAOAbstractFactoryFactura;
import edu.co.sena.tennisshop.modelo.jpa.dao.implementacion.FacturaDAOImpl;

/**
 *
 * @author pc
 */
public class MysqlJPADAOFactura extends DAOAbstractFactoryFactura {
 
    

    @Override
    public FacturaDAO createItemDAO() {
        return new FacturaDAOImpl();
        
    }
}
    
        
    