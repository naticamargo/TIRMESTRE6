/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennishop.midelo.jpa.dao.interfaces;

import edu.co.sena.entity.jpa.Factura;
import java.util.Date;
import java.util.List;

/**
 *
 * @author pc
 */
public interface FacturaDAO {

    public void insert(Factura Entity);

    public void update(Factura Entity);

    public void delete(Factura Entity);

    public List<Factura> findByAll();

   public Factura findByIdFactura(Integer IdFactura);

   public List<Factura> findByFechaFactura(Date FechaFactura);

    public List<Factura> findByFormaPago(String FormaPago);

}
