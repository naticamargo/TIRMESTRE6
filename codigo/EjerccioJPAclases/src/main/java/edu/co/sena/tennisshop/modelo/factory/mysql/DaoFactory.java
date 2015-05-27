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

/**
 *
 * @author ADMIN
 */
public interface DaoFactory {
      public ICarritoComprasDAO  createCarritoComprasDAO ();
      public ICategoriaDAO createCategoriaDAO();
      public ICatalogoDAO createCatalogoDAO();
      public ICuentaDAO createCuentaDAO();
      public FacturaDAO createFacturaDAO();
      public IDepartamentoDAO createDepartamentoDAO();
      public IDomicilioDAO createDomicilioDAO();
      public IIVentarioDAO createInventarioDAO();
      public IItemCarritoDAO createItemCarritoDAO();
      public IMunicipioDAO createMunicipioDAO();
      public IProveedorDAO createProveedorDAO();
      public IUsuarioDAO createUsuarioDAO();
      public ItemDAO createItemDAO();
      public PagoDAO createPagoDAO();
      public PedidoDAO createPedidoDAO();
      public ProductoDAO createProductoDAO();
      
}
