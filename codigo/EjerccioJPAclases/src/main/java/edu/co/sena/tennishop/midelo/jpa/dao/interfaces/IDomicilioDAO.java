/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennishop.midelo.jpa.dao.interfaces;
import edu.co.sena.entity.jpa.Domicilio;
import edu.co.sena.entity.jpa.DomicilioPK;
import java.util.List;

/**
 *
 * @author familia
 */
public interface IDomicilioDAO {
    
    public void insert(Domicilio Entity);
    public void update(Domicilio Entity);
    public void delete(Domicilio Entity);
    public List<Domicilio> findByAll();
    public Domicilio finByDomicilioPk(DomicilioPK domicilioPKLlaves);
    public List<Domicilio> findByDirrecion(String dirrecion);
    public List<Domicilio> findByTelefono(String telefono);
    public List<Domicilio> findByLocalidad(String localidad);
    public List<Domicilio> findByBarrio(String barrio );
    
}
