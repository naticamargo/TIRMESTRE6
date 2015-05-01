/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.jpa.dao.implementacion;

import edu.co.sena.entity.jpa.ItemCarrito;
import edu.co.sena.entity.jpa.ItemCarritoPK;
import edu.co.sena.jpa.util.EntityManagerHelper;
import edu.co.sena.tennishop.midelo.jpa.dao.interfaces.IItemCarritoDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author ADMIN
 */
public class IItemCarritoDAOImpl implements IItemCarritoDAO {
      public static final String CANTIDAD="cantidad";
    public static final String VALORUNITARIO="costounitario";
    public static final String VALORTOTAL="costototal";
   
    private EntityManager getEntityManager() {
        return EntityManagerHelper.getEntityManager();
    }
    @Override
    public void insert(ItemCarrito entity) {
        EntityManager em = getEntityManager();
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
    public void update(ItemCarrito entity) {
       EntityManager em = getEntityManager();
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
    public void delete(ItemCarrito entity) {
       EntityManager em = getEntityManager();
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
    public ItemCarrito findByIDItemDeCarrito(ItemCarritoPK itemCarritoPK) {
        EntityManager em = getEntityManager();
        ItemCarrito itemTemporal = null;
        try {
            itemTemporal= em.find(ItemCarrito.class, itemCarritoPK);
        } catch (RuntimeException re) {
            System.out.println(" Error : " + re.getMessage());
        } finally {
            if (em != null) {
                EntityManagerHelper.closeEntityManager();
            }
        }
        return itemTemporal;
    }

    @Override
    public List<ItemCarrito> findByAll() {
        EntityManager em = getEntityManager();
        List<ItemCarrito> itemTemporal = null;
        Query query = em.createNamedQuery("ItemCarrito.findAll");
        try {
            itemTemporal = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return itemTemporal;
    }

    @Override
    public List<ItemCarrito> findByCantidad(Integer cantidad) {
         EntityManager em = getEntityManager();
        List<ItemCarrito> itemTemporal = null;

        try {
            Query query= em.createNamedQuery("ItemCarrito.findByCantidad");
            query.setParameter(ItemDAOImpl.CANTIDAD, cantidad);
            itemTemporal=query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return itemTemporal;
    }

    @Override
    public List<ItemCarrito> findByValorUnitario(Double costoUnitario) {
        EntityManager em = getEntityManager();
        List<ItemCarrito> itemTemporal = null;

        try {
            Query query= em.createNamedQuery("ItemCarrito.findByValorUnitario");
            query.setParameter(ItemDAOImpl.VALOR_UNITARIO,costoUnitario );
            itemTemporal=query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return itemTemporal;
    }

    @Override
    public List<ItemCarrito> findByValorTotal(Double costoTotal) {
        EntityManager em = getEntityManager();
        List<ItemCarrito> itemTemporal = null;

        try {
            Query query= em.createNamedQuery("ItemCarrito.findByValorUnitario");
            query.setParameter(ItemDAOImpl.VALOR_UNITARIO,costoTotal );
            itemTemporal=query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return itemTemporal;
    }
    
}
