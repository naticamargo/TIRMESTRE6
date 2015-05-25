/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.factory;

import edu.co.sena.tennishop.midelo.jpa.dao.interfaces.FacturaDAO;

/**
 *
 * @author pc
 */
public interface DAOFactura{
    public FacturaDAO createItemDAO();
}
