/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennishop.midelo.jpa.dao.interfaces;

import edu.co.sena.tennisshop.integracion.jpa.entitis.Factura;
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

    public Factura findByFactura();

    public List<Factura> findByIdFactura(Object IdFactura);

    public List<Factura> findByCuenta(Object cuenta);

    public List<Factura> findByFechaFactura(Object FechaFactura);

    public List<Factura> findByFormaPago(Object FormaPago);

}
