/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.jpa.dao.implementacion;

import edu.co.sena.entity.jpa.Categoria;
import edu.co.sena.jpa.util.EntityManagerHelper;
import edu.co.sena.tennishop.midelo.jpa.dao.interfaces.ICategoriaDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author ADMIN
 */
public class CategoriaDAOImplTest  implements ICategoriaDAO{
    public static final String NOMBRE = "nombre";
    public static final String MARCA = "marca";

    private EntityManager getEntityManager() {
        return EntityManagerHelper.getEntityManager();
    }
    
    @Override
    public void insert(Categoria entity) {
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
    public void update(Categoria Entity) {
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
    public void delete(Categoria Entity) {
         EntityManager em = EntityManagerHelper.getEntityManager();
        try {
            EntityManagerHelper.beginTransaction();
            em.remove(em.find(Categoria.class, Entity.getIdCategoria()));
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
    public List<Categoria> findByAll() {
        EntityManager em = getEntityManager();
        List<Categoria> categoriaTemporal = null;
        Query query = em.createNamedQuery("Categoria.findAll");
        try {
         categoriaTemporal = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return categoriaTemporal;
    }

    @Override
    public Categoria findByIdCategoria(Integer idCategoria) {
       EntityManager em = getEntityManager();
        Categoria categoriaTemporal = null;
        try {
            categoriaTemporal = em.find(Categoria.class, idCategoria);
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            if (em != null) {
                EntityManagerHelper.closeEntityManager();
            }
        }
        return categoriaTemporal;
                
                
    }

    @Override
    public List<Categoria> findByNombre(String nombre) {
           EntityManager em = getEntityManager();
        List<Categoria> categoriaTemporal = null;

        try {
            Query query = em.createNamedQuery("Categoria.findByNombre");
            query.setParameter(CategoriaDAOImplTest.NOMBRE, nombre);
            categoriaTemporal = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return categoriaTemporal;
    }

    @Override
    public List<Categoria> findByMarca(String marca) {
          EntityManager em = getEntityManager();
        List<Categoria> categoriaTemporal = null;

        try {
            Query query = em.createNamedQuery("Categoria.findByNombre");
            query.setParameter(CategoriaDAOImplTest.MARCA,marca);
            categoriaTemporal = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return categoriaTemporal;
    }
    
}
