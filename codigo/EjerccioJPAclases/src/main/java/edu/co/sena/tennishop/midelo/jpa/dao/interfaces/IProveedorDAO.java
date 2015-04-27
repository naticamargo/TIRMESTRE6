/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennishop.midelo.jpa.dao.interfaces;

import edu.co.sena.entity.jpa.Proveedor;
import edu.co.sena.entity.jpa.ProveedorPK;
import java.util.List;
/**
 *
 * @author familia
 */
public interface IProveedorDAO {
    
    public void insert(Proveedor Entity);
    public void update(Proveedor Entity);
    public void delete(Proveedor Entity);
    public List<Proveedor> findByAll();
    
    public List<Proveedor> findBytipoDocumento(String tipoDocumento);
    public List<Proveedor> findBynumeroDocumento(String numeroDocumento);
    public List<Proveedor> findBynombreProvvedor(String nombreProvvedor);
    public List<Proveedor> findBytelefono(String telefono );
    public List<Proveedor> findBycorreo(String correo );
    public Proveedor finByCuentaPk(ProveedorPK cuentaPKLlaves);
    
}
