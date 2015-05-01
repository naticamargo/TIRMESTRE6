/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.jpa.dao.implementacion;

import edu.co.sena.jpa.util.EntityManagerHelper;
import edu.co.sena.tennishop.midelo.jpa.dao.interfaces.ICarritoComprasDAO;
import edu.co.sena.entity.jpa.CarritoCompras;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author ADMIN
 */
public class CarritoComprasDAOImpl implements ICarritoComprasDAO {

    public static final String TOTAL = "total";
    public static final String SUBTOTAL = "subtotal";
    public static final String IMPUESTOS = "Impuestos";
    
    
    private EntityManager getEntityManager() {
        return EntityManagerHelper.getEntityManager();
    }

    @Override
    public void insert(CarritoCompras Entity) {
        EntityManager em = EntityManagerHelper.getEntityManager();
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
    public void update(CarritoCompras Entity) {
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
    public void delete(CarritoCompras Entity) {
       EntityManager em = EntityManagerHelper.getEntityManager();
        try {
            EntityManagerHelper.beginTransaction();
            em.remove(em.find(CarritoCompras.class, Entity.getIdCARRITO()));
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
    public List<CarritoCompras> findByAll() {
         EntityManager em = getEntityManager();
        List<CarritoCompras> carritoTemporal = null;
        Query query = em.createNamedQuery("CarritoCompras.findAll");
        try {
         carritoTemporal = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return carritoTemporal;
    }

   

    @Override    
        public List<CarritoCompras> findByTotal(Double total) {
       EntityManager em = getEntityManager();
        List<CarritoCompras> carritoTemporal = null;

        try {
            Query query = em.createNamedQuery("CarritoCompras.findByTotal");
            query.setParameter(CarritoComprasDAOImpl.TOTAL,total);
            carritoTemporal = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return carritoTemporal;
    }

    @Override
    public List<CarritoCompras> findBySubtotal(Double subtotal) {
       EntityManager em = getEntityManager();
        List<CarritoCompras> carritoTemporal = null;

        try {
            Query query = em.createNamedQuery("CarritoCompras.findBySubtotal");
            query.setParameter(CarritoComprasDAOImpl.SUBTOTAL,subtotal);
            carritoTemporal = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return carritoTemporal;
    }

    @Override
    public List<CarritoCompras> findByImpuestos(Double Impuestos) {
         EntityManager em = getEntityManager();
        List<CarritoCompras> carritoTemporal = null;

        try {
            Query query = em.createNamedQuery("CarritoCompras.findByImpuestos");
            query.setParameter(CarritoComprasDAOImpl.IMPUESTOS,Impuestos);
            carritoTemporal = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return carritoTemporal;
    }

    @Override
    public CarritoCompras findByIdCARRITO(String idCarrito) {
       EntityManager em = getEntityManager();
        CarritoCompras carritoTemporal = null;
        try {
            carritoTemporal = em.find(CarritoCompras.class, idCarrito);
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            if (em != null) {
                EntityManagerHelper.closeEntityManager();
            }
        }
        return carritoTemporal;
    }

    
}
