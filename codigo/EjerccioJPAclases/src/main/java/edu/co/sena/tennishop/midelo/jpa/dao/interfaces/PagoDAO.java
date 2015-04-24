/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennishop.midelo.jpa.dao.interfaces;

import edu.co.sena.tennisshop.integracion.jpa.entitis.Pago;
import java.util.List;

/**
 *
 * @author pc
 */
public interface PagoDAO {

    public void insert(Pago Entity);

    public void update(Pago Entity);

    public void delete(Pago Entity);

    public List<Pago> findByAll();

    public Pago findByIdPago();

    public List<Pago> findByNumeroCuenta(Object NumeroCuenta);

    public List<Pago> findByTargeta(Object Targeta);

    public List<Pago> findByTipoPago(Object TipoPago);

    public List<Pago> findByFacturaIdFactura(Object FacturaIdFactura);
}
