/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennishop.midelo.jpa.dao.interfaces;

import edu.co.sena.entity.jpa.Pago;
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

   public List<Pago> findByNumeroCuenta(String NumeroCuenta);

    public List<Pago> findByTargeta(String Targeta);

    public List<Pago> findByTipoPago(String TipoPago);

    public Pago findByFacturaIdFactura(Integer FacturaIdFactura);
}
