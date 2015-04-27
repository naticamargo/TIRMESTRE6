/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennishop.midelo.jpa.dao.interfaces;
import edu.co.sena.entity.jpa.Usuario;
import java.util.List;
/**
 *
 * @author familia
 */
public interface IUsuarioDAO {
    
 public void insert(Usuario Entity);
    public void update(Usuario Entity);
    public void delete(Usuario Entity);
    public List<Usuario> findByAll();
    public Usuario findByIdUsuario(String IdUsuario );
    public List<Usuario> findByContrasena(String Contrasena);
    public List<Usuario> findByRol(String Rol);
    public List<Usuario> findByActivo(String Activo);
    public List<Usuario> findByCorreoElectronico(String CorreoElectronico );
    
}
