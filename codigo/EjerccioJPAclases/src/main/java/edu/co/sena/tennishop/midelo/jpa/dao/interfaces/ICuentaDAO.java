/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennishop.midelo.jpa.dao.interfaces;
import edu.co.sena.entity.jpa.Cuenta;
import edu.co.sena.entity.jpa.CuentaPK;

import java.util.List;
/**
 *
 * @author familia
 */
public interface ICuentaDAO {
    
    public void insert(Cuenta Entity);
    public void update(Cuenta Entity);
    public void delete(Cuenta Entity);
    public List<Cuenta> findByAll();
    public List<Cuenta> findByPrimerNombre(String primerNombre );
    public List<Cuenta> findBySegundoNombre(String SegundoNombre);
    public List<Cuenta> findByPrimerApellido(String PrimerApellido);
    public List<Cuenta> findBySegundoApellido(String SegundoApellido);
    public List<Cuenta> findByTipoDocumento(String TipoDocumento );
    public List<Cuenta> findByNumeroDocumento(String NumeroDocumento );
    public List<Cuenta> findByUsuario(String Usuario );
    public Cuenta finByCuentaPk(CuentaPK cuentaPKLlaves);
   
}
