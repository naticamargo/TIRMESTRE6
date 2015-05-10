/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.jpa.dao.implementacion;

import edu.co.sena.entity.jpa.CarritoCompras;
import edu.co.sena.entity.jpa.Catalogo;
import edu.co.sena.jpa.util.EntityManagerHelper;
import edu.co.sena.tennishop.midelo.jpa.dao.interfaces.ICatalogoDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author ADMIN
 */
public class CatalogoDAOImpl implements ICatalogoDAO {
      
    public static final String NOMBRE= "nombre";
    public static final String DESCRIPCION = "descripcion";
    
      private EntityManager getEntityManager() {
        return EntityManagerHelper.getEntityManager();
    }
    
    @Override
    public void insert(Catalogo entity) {
      EntityManager em = EntityManagerHelper.getEntityManager();
        try {
            EntityManagerHelper.beginTransaction();
            em.persist(entity);
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
    public void update(Catalogo Entity) {
       EntityManager em = EntityManagerHelper.getEntityManager();
        try {
            EntityManagerHelper.beginTransaction();
            em.merge(Entity);
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
    public void delete(Catalogo Entity) {
        EntityManager em = EntityManagerHelper.getEntityManager();
        try {
            EntityManagerHelper.beginTransaction();
            em.remove(em.find(Catalogo.class, Entity.getIdCatologo()));
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
    public List<Catalogo> findByAll() {
        EntityManager em = getEntityManager();
        List<Catalogo> catalogoTemporal = null;
        Query query = em.createNamedQuery("Catalogo.findAll");
        try {
         catalogoTemporal = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return catalogoTemporal;
    }

    @Override
    public Catalogo findByIdCatologo(Integer idCatalogo) {
       EntityManager em = getEntityManager();
        Catalogo catalogoTemporal = null;
        try {
            catalogoTemporal = em.find(Catalogo.class, idCatalogo);
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            if (em != null) {
                EntityManagerHelper.closeEntityManager();
            }
        }
        return catalogoTemporal;
    }

    @Override
    public List<Catalogo> findByNombre(String nombre) {
         EntityManager em = getEntityManager();
        List<Catalogo> catalogoTemporal = null;

        try {
            Query query = em.createNamedQuery("Catalogo.findByNombre");
            query.setParameter(CatalogoDAOImpl.NOMBRE,nombre);
            catalogoTemporal = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return catalogoTemporal;
    }

    @Override
    public List<Catalogo> findByDescripcion(String descripcion) {
        EntityManager em = getEntityManager();
        List<Catalogo> catalogoTemporal = null;

        try {
            Query query = em.createNamedQuery("Catalogo.findByDescripcion");
            query.setParameter(CatalogoDAOImpl.DESCRIPCION,descripcion);
            catalogoTemporal = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return catalogoTemporal;
    }
    
}
