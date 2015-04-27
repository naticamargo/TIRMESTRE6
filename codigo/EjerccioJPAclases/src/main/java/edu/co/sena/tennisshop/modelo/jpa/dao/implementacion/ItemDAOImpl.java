/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.jpa.dao.implementacion;

import edu.co.sena.jpa.util.EntityManagerHelper;
import static edu.co.sena.jpa.util.EntityManagerHelper.getEntityManager;
import edu.co.sena.tennishop.midelo.jpa.dao.interfaces.ItemDAO;
import edu.co.sena.tennisshop.integracion.jpa.entitis.Item;
import edu.co.sena.tennisshop.integracion.jpa.entitis.Pedido;
import edu.co.sena.tennisshop.integracion.jpa.entitis.Producto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author pc
 */
public class ItemDAOImpl implements ItemDAO {

    public static final String ID_ITEM = "Id_item";
    public static final String ItemPK = "ItemPk";
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

    public Item findByIdItem(Integer IdItem) {
        EntityManager em = getEntityManager();
        Item ItemTemp = null;
        try {
            ItemTemp = em.find(Item.class, IdItem);
        } catch (RuntimeException re) {
            System.out.println("error:----------------" + re.getMessage());
        } finally {
            if (em != null) {
                EntityManagerHelper.closeEntityManager();
            }
        }
        return ItemTemp;
    }

    @Override
    public List<Item> findByItemPK(Object ItemPK) {
        EntityManager em = getEntityManager();
        Item ItemTemp = null;
        try {
            ItemTemp = em.find(Item.class, ItemPK);
        } catch (RuntimeException re) {
            System.out.println(" Error : " + re.getMessage());
        } finally {
            if (em != null) {
                EntityManagerHelper.closeEntityManager();
            }
        }
        return (List<Item>) ItemTemp;
    }

    public List<Item> findByCantidad(int Cantidad) {
        EntityManager em = getEntityManager();
        List<Item> ItemTemp = null;
        Query query = em.createNamedQuery("Item.findByCantidad");
        try {
            ItemTemp = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("error:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return ItemTemp;

    }

    public List<Item> findByValorUnitario(float ValorUnitario) {
        EntityManager em = getEntityManager();
        List<Item> ItemTemp = null;
        Query query = em.createNamedQuery("Item.findByValorUnitario");
        try {
            ItemTemp = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("error:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return ItemTemp;

    }

    public List<Item> findByValorTotal(float ValorTotal) {
        EntityManager em = getEntityManager();
        List<Item> ItemTemp = null;
        Query query = em.createNamedQuery("Item.findByValorTotal");
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
    public Item findByIdItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Item> findByCantidad(Object Cantidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Item> findByValorUnitario(Object ValorUnitario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Item> findByValorTotal(Object ValorTotal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
