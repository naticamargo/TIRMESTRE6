/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennishop.midelo.jpa.dao.interfaces;

import edu.co.sena.tennisshop.integracion.jpa.entitis.CarritoCompras;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface ICarritoComprasDAO {
    public void insert(CarritoCompras Entity);
    public void update(CarritoCompras Entity);
    public void delete(CarritoCompras Entity);
    public List<CarritoCompras> findByAll();
    public CarritoCompras findByIdCARRITO();
    public List<CarritoCompras> findByTotal(Object total );
    public List<CarritoCompras> findBySubtotal(Object subtotal );
   public List<CarritoCompras> findByImpuestos(Object Impuestos);
    
    
    
}
