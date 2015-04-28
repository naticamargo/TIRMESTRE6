/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennishop.midelo.jpa.dao.interfaces;

import edu.co.sena.entity.jpa.ItemCarrito;
import edu.co.sena.entity.jpa.ItemCarritoPK;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface IItemCarritoDAO {
    public void insert(ItemCarrito entity);
    public void update(ItemCarrito entity);
    public void delete(ItemCarrito entity);
    
    public ItemCarrito findByIDItemDeCarrito(ItemCarritoPK itemCarritoPK); 
    
    public List<ItemCarrito> findByAll();
           
      public List<ItemCarrito> findByCantidad(Integer cantidad);
      public List<ItemCarrito> findByValorUnitario(Double costoUnitario);
      public List<ItemCarrito> findByValorTotal(Double costoTotal);
}
