/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennishop.midelo.jpa.dao.interfaces;

import edu.co.sena.entity.jpa.Inventario;
import edu.co.sena.entity.jpa.InventarioPK;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface IIVentarioDAO {
    public void insert(Inventario entity);
    public void update(Inventario entity);
    public void delete(Inventario entity);
    
    public Inventario findByIDInventario(InventarioPK inventarioPK);
    public List<Inventario> findByAll();
    public List<Inventario> findByProductoIDproducto(Integer cantidad);
    
    
}
