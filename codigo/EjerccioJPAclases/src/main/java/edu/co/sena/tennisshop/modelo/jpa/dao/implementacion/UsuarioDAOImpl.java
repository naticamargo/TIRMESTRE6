/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.jpa.dao.implementacion;

import edu.co.sena.jpa.util.EntityManagerHelper;
import edu.co.sena.tennishop.midelo.jpa.dao.interfaces.IUsuarioDAO;
import edu.co.sena.entity.jpa.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author familia
 */
public class UsuarioDAOImpl implements IUsuarioDAO {
    public static final String CONTRASENA= "contrasena";
    public  static final String ROL= "rol";
    public static final String ACTIVO="Activo";
    public static final String CORREOELECTRONICO="CorreoElectronico";
    private EntityManager getEntityManager() {
        return EntityManagerHelper.getEntityManager();
    }

    @Override
    public void insert(Usuario Entity) {
         EntityManager em = getEntityManager();
        try {
            EntityManagerHelper.beginTransaction();
            em.persist(Entity);
            EntityManagerHelper.commit();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            if (em != null) {
                EntityManagerHelper.closeEntityManager();
            }

        }
    }

    @Override
    public void update(Usuario Entity) {
         EntityManager em = getEntityManager();
        try {
            EntityManagerHelper.beginTransaction();
            em.persist(Entity);
            EntityManagerHelper.commit();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            if (em != null) {
                EntityManagerHelper.closeEntityManager();
            }

        }
    }

    @Override
    public void delete(Usuario Entity) {
        EntityManager em = getEntityManager();
        try {
            EntityManagerHelper.beginTransaction();
            em.persist(Entity);
            EntityManagerHelper.commit();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            if (em != null) {
                EntityManagerHelper.closeEntityManager();
            }

        }
    }

    @Override
    public List<Usuario> findByAll() {
        EntityManager em = getEntityManager();
        List<Usuario> usuariosTemporal = null;
        Query query = em.createNamedQuery("Usuario.findAll");
        try {
            usuariosTemporal = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return usuariosTemporal;
    }

    @Override
    public Usuario findByIdUsuario(Integer IdUsuario) {
        
        EntityManager em = getEntityManager();
        Usuario usuarioTemporal= null;

        try {
            usuarioTemporal=em.find(Usuario.class, IdUsuario);
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return usuarioTemporal;
    }

    @Override
    public List<Usuario> findByContrasena(String Contrasena) {
        EntityManager em = getEntityManager();
        List<Usuario> usuariosTemporal = null;

        try {
            Query query= em.createNamedQuery("Usuario.findByContrasena");
            query.setParameter(UsuarioDAOImpl.CONTRASENA, Contrasena);
            usuariosTemporal=query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return usuariosTemporal;
    }

    @Override
    public List<Usuario> findByRol(String Rol) {
        
        EntityManager em = getEntityManager();
        List<Usuario> usuariosTemporal = null;

        try {
            Query query= em.createNamedQuery("Usuario.findByRol");
            query.setParameter(UsuarioDAOImpl.ROL, Rol);
            usuariosTemporal=query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return usuariosTemporal;
    }

    @Override
    public List<Usuario> findByActivo(String Activo) {
        EntityManager em = getEntityManager();
        List<Usuario> usuariosTemporal = null;

        try {
            Query query= em.createNamedQuery("Usuario.findByActivo");
            query.setParameter(UsuarioDAOImpl.ACTIVO, Activo);
            usuariosTemporal=query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return usuariosTemporal;
        
    }

    @Override
    public List<Usuario> findByCorreoElectronico(String CorreoElectronico) {
        EntityManager em = getEntityManager();
        List<Usuario> usuariosTemporal = null;

        try {
            Query query= em.createNamedQuery("Usuario.findByCorreoElectronico");
            query.setParameter(UsuarioDAOImpl.CORREOELECTRONICO, CorreoElectronico);
            usuariosTemporal=query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return usuariosTemporal;
    }
    
    
}
