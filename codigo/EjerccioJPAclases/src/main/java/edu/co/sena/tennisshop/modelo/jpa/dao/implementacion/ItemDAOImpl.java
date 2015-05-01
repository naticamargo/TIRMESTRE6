/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.jpa.dao.implementacion;

import edu.co.sena.jpa.util.EntityManagerHelper;
import static edu.co.sena.jpa.util.EntityManagerHelper.getEntityManager;
import edu.co.sena.tennishop.midelo.jpa.dao.interfaces.ItemDAO;
import edu.co.sena.entity.jpa.Item;
import edu.co.sena.entity.jpa.ItemPK;
import edu.co.sena.entity.jpa.Pedido;
import edu.co.sena.entity.jpa.Producto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author pc
 */
public class ItemDAOImpl implements ItemDAO {

    
    public static final String CANTIDAD = "cantidad";
    public static final String VALOR_UNITARIO = "valor_Unitario";
    public static final String VALOR_TOTAL = "valor_total";

    private EntityManager getEntityManager() {
        return EntityManagerHelper.getEntityManager();
    }

    @Override
    public void insert(Item Entity) {
        EntityManager em = getEntityManager();
        try {
            EntityManagerHelper.beginTransaction();
            em.merge(Entity);
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
    public void update(Item Entity) {
        EntityManager em = getEntityManager();
        try {
            EntityManagerHelper.beginTransaction();
            em.merge(Entity);
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
    public void delete(Item Entity) {
        EntityManager em = getEntityManager();
        try {
            EntityManagerHelper.beginTransaction();
            em.merge(Entity);
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
    public List<Item> findByAll() {
        EntityManager em = getEntityManager();
        List<Item> ItemTemp = null;
        Query query = em.createNamedQuery("Item.findAll");
        try {
            ItemTemp = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("error:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return ItemTemp;
    }

    @Override
    public Item findByIDItem(ItemPK itempkLlaves) {
        EntityManager em = getEntityManager();
        Item itemTemporal = null;
        try {
            itemTemporal = em.find(Item.class, itempkLlaves);
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            if (em != null) {
                EntityManagerHelper.closeEntityManager();
            }
        }
        return  itemTemporal;
    }

    @Override
    public List<Item> findByCantidad(Integer Cantidad) {
          EntityManager em = getEntityManager();
        List<Item> itemTemporal = null;

        try {
            Query query = em.createNamedQuery("Item.findByCantidad");
            query.setParameter(ItemDAOImpl.CANTIDAD,Cantidad);
            itemTemporal = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return itemTemporal;
    }

    @Override
    public List<Item> findByValorUnitario(Float ValorUnitario) {
         EntityManager em = getEntityManager();
        List<Item> itemTemporal = null;

        try {
            Query query = em.createNamedQuery("Item.findByValorUnitario");
            query.setParameter(ItemDAOImpl.VALOR_UNITARIO,ValorUnitario);
            itemTemporal = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return itemTemporal;
    }

    @Override
    public List<Item> findByValorTotal(Float ValorTotal) {
       EntityManager em = getEntityManager();
        List<Item> itemTemporal = null;

        try {
            Query query = em.createNamedQuery("Item.findByValorTotal");
            query.setParameter(ItemDAOImpl.VALOR_TOTAL,ValorTotal);
            itemTemporal = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return itemTemporal;
    }

   

}
