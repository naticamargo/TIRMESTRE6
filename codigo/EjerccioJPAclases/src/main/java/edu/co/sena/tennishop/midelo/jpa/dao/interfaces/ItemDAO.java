/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennishop.midelo.jpa.dao.interfaces;

import edu.co.sena.tennisshop.integracion.jpa.entitis.Item;
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

    public Item findByIdItem();

    public List<Item> findByItemPK(Object ItemPK);

    public List<Item> findByCantidad(Object Cantidad);

    public List<Item> findByValorUnitario(Object ValorUnitario);

    public List<Item> findByValorTotal(Object ValorTotal);

}
