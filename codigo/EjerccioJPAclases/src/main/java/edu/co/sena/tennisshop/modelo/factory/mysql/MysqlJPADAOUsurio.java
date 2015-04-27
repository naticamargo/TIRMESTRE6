/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.factory.mysql;



import edu.co.sena.tennishop.midelo.jpa.dao.interfaces.IUsuarioDAO;
import edu.co.sena.tennisshop.modelo.factory.DAOAbstractFactory;
import edu.co.sena.tennisshop.modelo.jpa.dao.implementacion.UsuarioDAOImpl;

/**
 *
 * @author ColsutecR
 */
public class MysqlJPADAOUsurio extends DAOAbstractFactory{

   


    @Override
    public IUsuarioDAO createIUsuarioDAO() {
        return new UsuarioDAOImpl();
    }

   
    
}

