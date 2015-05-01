/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.jpa.dao.implementacion;

import edu.co.sena.entity.jpa.Inventario;
import edu.co.sena.entity.jpa.InventarioPK;
import edu.co.sena.jpa.util.EntityManagerHelper;
import edu.co.sena.tennishop.midelo.jpa.dao.interfaces.IIVentarioDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author ADMIN
 */
public class IIventarioDAOImpl  implements IIVentarioDAO{
    
 public static final String CANTIDAD = "cantidad";
 
 private EntityManager getEntityManager() {
        return EntityManagerHelper.getEntityManager();
    

}
    
    @Override
    public void insert(Inventario entity) {
         EntityManager em = getEntityManager();
        try {
            EntityManagerHelper.beginTransaction();
            em.merge(entity);
            EntityManagerHelper.commit();
        } catch (RuntimeException re) {
            System.out.println("error:----------------" + re.getMessage());
        } finally {
            if (em != null) {
                EntityManagerHelper.closeEntityManager();
            }
    }
    }
        

    @Override
    public void update(Inventario entity) {
          EntityManager em = getEntityManager();
        try {
            EntityManagerHelper.beginTransaction();
            em.merge(entity);
            EntityManagerHelper.commit();
        } catch (RuntimeException re) {
            System.out.println("error:----------------" + re.getMessage());
        } finally {
            if (em != null) {
                EntityManagerHelper.closeEntityManager();
            }
             }
    }

    @Override
    public void delete(Inventario entity) {
        EntityManager em = getEntityManager();
        try {
            EntityManagerHelper.beginTransaction();
            em.merge(entity);
            EntityManagerHelper.commit();
        } catch (RuntimeException re) {
            System.out.println("error:----------------" + re.getMessage());
        } finally {
            if (em != null) {
                EntityManagerHelper.closeEntityManager();
            
 }
    }
    }

    @Override
    public Inventario findByIDInventario(InventarioPK inventarioPK) {
         EntityManager em = getEntityManager();
        Inventario invTemporal = null;
        try {
            invTemporal= em.find(Inventario.class, inventarioPK);
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            if (em != null) {
                EntityManagerHelper.closeEntityManager();
            }
        }
        return invTemporal;
    }

    @Override
    public List<Inventario> findByAll() {
         EntityManager em = getEntityManager();
        List<Inventario> inveTemp = null;
        Query query = em.createNamedQuery("Inventario.findAll");
        try {
            inveTemp = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("error:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return inveTemp;
    }

    @Override
    public List<Inventario> findByCantidad(Integer cantidad) {
        EntityManager em = getEntityManager();
        List<Inventario> inveTemporal = null;

        try {
            Query query = em.createNamedQuery("Inventario.findByCantidad");
            query.setParameter(IIventarioDAOImpl.CANTIDAD,cantidad);
            inveTemporal = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return inveTemporal;
    }
    
    }

    

