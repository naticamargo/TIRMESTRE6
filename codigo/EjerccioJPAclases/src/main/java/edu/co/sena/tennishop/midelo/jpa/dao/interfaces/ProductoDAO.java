/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennishop.midelo.jpa.dao.interfaces;

import edu.co.sena.tennisshop.integracion.jpa.entitis.Producto;
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

    public Producto findByIdProducto();

    public List<Producto> findByNombreProdcuto(Object NombreProdcuto);

    public List<Producto> findByPrecio(Object Precio);

    public List<Producto> findByCantidad(Object Cantidad);

    public List<Producto> findByDescripcion(Object Descripcion);
    
    public List<Producto> findByCatalogoIdCatalogo(Object CatalogoIdCatalogo);

    public List<Producto> findByCategoriaIdCategoria(Object CategoriaIdCategoria);
}
