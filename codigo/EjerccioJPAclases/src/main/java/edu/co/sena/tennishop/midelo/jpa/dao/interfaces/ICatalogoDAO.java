/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennishop.midelo.jpa.dao.interfaces;


import edu.co.sena.entity.jpa.Catalogo;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface ICatalogoDAO {
   public void insert(Catalogo entity);
   public void update(Catalogo Entity);
   public void delete(Catalogo Entity);
   public List<Catalogo> findByAll();
}
