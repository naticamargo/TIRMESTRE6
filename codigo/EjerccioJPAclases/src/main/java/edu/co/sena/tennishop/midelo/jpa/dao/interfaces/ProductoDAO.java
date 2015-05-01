/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennishop.midelo.jpa.dao.interfaces;

import edu.co.sena.entity.jpa.Producto;
import java.util.List;

/**
 *
 * @author pc
 */
public interface ProductoDAO {
    
      public void insert(Producto Entity);

    public void update(Producto Entity);

    public void delete(Producto Entity);

    public List<Producto> findByAll();

    public Producto findByIdProducto(String idProducto);

    public List<Producto> findByNombreProdcuto(String NombreProdcuto);

    public List<Producto> findByPrecio(Double Precio);

    public List<Producto> findByCantidad(Integer Cantidad);

    public List<Producto> findByDescripcion(String Descripcion);
    
    public List<Producto> findByCatalogoIdCatalogo( Integer CatalogoIdCatalogo);

    public List<Producto> findByCategoriaIdCategoria(Integer CategoriaIdCategoria);
}
