/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennishop.midelo.jpa.dao.interfaces;

import edu.co.sena.entity.jpa.Pedido;
import java.util.List;

/**
 *
 * @author pc
 */
public interface PedidoDAO {

    public void insert(Pedido Entity);

    public void update(Pedido Entity);

    public void delete(Pedido Entity);

    public List<Pedido> findByAll();

    public Pedido findByFacturaIdFactura(Integer idFactura);

    public List<Pedido> findByTotal(Double total);

    public List<Pedido> findBySubtotal(Double subtotal);

    public List<Pedido> findByImpuestos(Double Impuestos);

}
