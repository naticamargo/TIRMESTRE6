/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennishop.midelo.jpa.dao.interfaces;

import edu.co.sena.entity.jpa.Municipio;
import java.util.List;

/**
 *
 * @author familia
 */
public interface IMunicipioDAO {
    
    public void insert(Municipio Entity);
    public void update(Municipio Entity);
    public void delete(Municipio Entity);
    public List<Municipio> findByAll();
    public Municipio findByIdMUNICIPIO(Integer idMUNICIPIO );
    public List<Municipio> findByNombreMunicipio(String nombreMunicipio);
    
}
