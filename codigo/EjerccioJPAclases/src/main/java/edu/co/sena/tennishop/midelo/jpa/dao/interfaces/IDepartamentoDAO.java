/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennishop.midelo.jpa.dao.interfaces;


import edu.co.sena.entity.jpa.Departamento;
import java.util.List;

/**
 *
 * @author familia
 */
public interface IDepartamentoDAO {
    
    public void insert(Departamento Entity);
    public void update(Departamento Entity);
    public void delete(Departamento Entity);
    public List<Departamento> findByAll();
    public Departamento findByIdDEPARTAMENTO(Integer idDEPARTAMENTO );
    public List<Departamento> findByNombreDeparamento(String NombreDeparamento );
   
    
}
