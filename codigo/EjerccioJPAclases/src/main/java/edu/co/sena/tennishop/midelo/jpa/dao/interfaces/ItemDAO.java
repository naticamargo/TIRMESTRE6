/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennishop.midelo.jpa.dao.interfaces;

import edu.co.sena.entity.jpa.Item;
import edu.co.sena.entity.jpa.ItemPK;
import java.util.List;

/**
 *
 * @author pc
 */
public interface ItemDAO {

    public void insert(Item Entity);

    public void update(Item Entity);

    public void delete(Item Entity);

    public List<Item> findByAll();

   public List<Item> findByIDItem(ItemPK itempkLlaves);

    public List<Item> findByCantidad(Integer Cantidad);

    public List<Item> findByValorUnitario(Float ValorUnitario);

    public List<Item> findByValorTotal( Float ValorTotal);

}
