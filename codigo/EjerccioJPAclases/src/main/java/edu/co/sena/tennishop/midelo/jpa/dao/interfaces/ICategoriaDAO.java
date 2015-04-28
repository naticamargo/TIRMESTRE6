/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennishop.midelo.jpa.dao.interfaces;

import edu.co.sena.entity.jpa.Categoria;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface ICategoriaDAO {
    public void insert(Categoria entity);
   public void update(Categoria Entity);
   public void delete(Categoria Entity);
   public List<Categoria> findByAll();
   public Categoria findByIdCategoria(Integer idCategoria);
   public List<Categoria> findByNombre(String nombre);
   public List<Categoria> findByMarca(String marca);
   
}
