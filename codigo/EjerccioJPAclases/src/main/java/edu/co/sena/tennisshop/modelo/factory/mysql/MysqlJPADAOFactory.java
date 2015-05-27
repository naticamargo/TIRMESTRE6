/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.factory.mysql;

import edu.co.sena.tennishop.midelo.jpa.dao.interfaces.FacturaDAO;
import edu.co.sena.tennishop.midelo.jpa.dao.interfaces.ICarritoComprasDAO;
import edu.co.sena.tennishop.midelo.jpa.dao.interfaces.ICatalogoDAO;
import edu.co.sena.tennishop.midelo.jpa.dao.interfaces.ICategoriaDAO;
import edu.co.sena.tennishop.midelo.jpa.dao.interfaces.ICuentaDAO;
import edu.co.sena.tennishop.midelo.jpa.dao.interfaces.IDepartamentoDAO;
import edu.co.sena.tennishop.midelo.jpa.dao.interfaces.IDomicilioDAO;
import edu.co.sena.tennishop.midelo.jpa.dao.interfaces.IIVentarioDAO;
import edu.co.sena.tennishop.midelo.jpa.dao.interfaces.IItemCarritoDAO;
import edu.co.sena.tennishop.midelo.jpa.dao.interfaces.IMunicipioDAO;
import edu.co.sena.tennishop.midelo.jpa.dao.interfaces.IProveedorDAO;
import edu.co.sena.tennishop.midelo.jpa.dao.interfaces.IUsuarioDAO;
import edu.co.sena.tennishop.midelo.jpa.dao.interfaces.ItemDAO;
import edu.co.sena.tennishop.midelo.jpa.dao.interfaces.PagoDAO;
import edu.co.sena.tennishop.midelo.jpa.dao.interfaces.PedidoDAO;
import edu.co.sena.tennishop.midelo.jpa.dao.interfaces.ProductoDAO;
import edu.co.sena.tennisshop.modelo.jpa.dao.implementacion.CarritoComprasDAOImpl;
import edu.co.sena.tennisshop.modelo.jpa.dao.implementacion.CatalogoDAOImpl;
import edu.co.sena.tennisshop.modelo.jpa.dao.implementacion.CategoriaDAOImpl;
import edu.co.sena.tennisshop.modelo.jpa.dao.implementacion.CuentaDAOImpl;
import edu.co.sena.tennisshop.modelo.jpa.dao.implementacion.DepartamentoDAOImpl;
import edu.co.sena.tennisshop.modelo.jpa.dao.implementacion.DomiciloDAOImpl;
import edu.co.sena.tennisshop.modelo.jpa.dao.implementacion.FacturaDAOImpl;
import edu.co.sena.tennisshop.modelo.jpa.dao.implementacion.IItemCarritoDAOImpl;
import edu.co.sena.tennisshop.modelo.jpa.dao.implementacion.IIventarioDAOImpl;
import edu.co.sena.tennisshop.modelo.jpa.dao.implementacion.ItemDAOImpl;
import edu.co.sena.tennisshop.modelo.jpa.dao.implementacion.MunicipioDAOImpl;
import edu.co.sena.tennisshop.modelo.jpa.dao.implementacion.PagoDAOImpl;
import edu.co.sena.tennisshop.modelo.jpa.dao.implementacion.PedidoDAOImpl;
import edu.co.sena.tennisshop.modelo.jpa.dao.implementacion.ProductoDAOImpl;
import edu.co.sena.tennisshop.modelo.jpa.dao.implementacion.ProveedorDAOImpl;
import edu.co.sena.tennisshop.modelo.jpa.dao.implementacion.UsuarioDAOImpl;

/**
 *
 * @author ADMIN
 */
public class MysqlJPADAOFactory extends DAOAbstractFactory{

    @Override
    public ICarritoComprasDAO createCarritoComprasDAO() {
        return new  CarritoComprasDAOImpl();
    }

    @Override
    public ICategoriaDAO createCategoriaDAO() {
        return new  CategoriaDAOImpl();
    }

    @Override
    public ICatalogoDAO createCatalogoDAO() {
        return new  CatalogoDAOImpl();
    }

    @Override
    public ICuentaDAO createCuentaDAO() {
         return new  CuentaDAOImpl();
    }

    @Override
    public FacturaDAO createFacturaDAO() {
       return new  FacturaDAOImpl();
    }

    @Override
    public IDepartamentoDAO createDepartamentoDAO() {
        return new  DepartamentoDAOImpl();
    }

    @Override
    public IDomicilioDAO createDomicilioDAO() {
       return new  DomiciloDAOImpl();
    }

    @Override
    public IIVentarioDAO createInventarioDAO() {
        return new  IIventarioDAOImpl();
    }

    @Override
    public IItemCarritoDAO createItemCarritoDAO() {
       return new  IItemCarritoDAOImpl();
    }

    @Override
    public IMunicipioDAO createMunicipioDAO() {
       return new  MunicipioDAOImpl();
    }

    @Override
    public IProveedorDAO createProveedorDAO() {
       return new  ProveedorDAOImpl();
    }

    @Override
    public IUsuarioDAO createUsuarioDAO() {
        return new  UsuarioDAOImpl();
    }

    @Override
    public ItemDAO createItemDAO() {
        return new  ItemDAOImpl();
    }

    @Override
    public PagoDAO createPagoDAO() {
        return new  PagoDAOImpl();
    }

    @Override
    public PedidoDAO createPedidoDAO() {
         return new  PedidoDAOImpl();
    }

    @Override
    public ProductoDAO createProductoDAO() {
        return new  ProductoDAOImpl();
    }
    
}
