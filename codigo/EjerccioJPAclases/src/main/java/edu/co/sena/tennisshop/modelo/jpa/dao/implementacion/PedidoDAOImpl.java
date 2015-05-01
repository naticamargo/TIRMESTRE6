/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.jpa.dao.implementacion;

import edu.co.sena.jpa.util.EntityManagerHelper;
import static edu.co.sena.jpa.util.EntityManagerHelper.getEntityManager;
import edu.co.sena.tennishop.midelo.jpa.dao.interfaces.PedidoDAO;
import edu.co.sena.entity.jpa.Pedido;
import edu.co.sena.entity.jpa.Factura;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author pc
 */
public class PedidoDAOImpl implements PedidoDAO {

    
    public static final String TOTAL = "total";
    public static final String SUBTOTAL = "Subtotal";
    public static final String IMPUESTOS = "impuestos";

    private EntityManager getEntityManager() {
        return EntityManagerHelper.getEntityManager();

    }

    @Override
    public void insert(Pedido Entity) {
        EntityManager em = getEntityManager();
        try {
            EntityManagerHelper.beginTransaction();
            em.persist(Entity);
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
    public void update(Pedido Entity) {
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
    public void delete(Pedido Entity) {
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
    public List<Pedido> findByAll() {
        EntityManager em = getEntityManager();
        List<Pedido> PedidoTemp = null;
        Query query = em.createNamedQuery("Pedido.findAll");
        try {
            PedidoTemp = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("error:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return PedidoTemp;
    }

    public Pedido findByFacturaIdFactura(Integer FacturaIdFactura) {
        EntityManager em = getEntityManager();
        Pedido PedidoTemp = null;
        try {
            PedidoTemp = em.find(Pedido.class, FacturaIdFactura);
        } catch (RuntimeException re) {
            System.out.println("error:----------------" + re.getMessage());
        } finally {
            if (em != null) {
                EntityManagerHelper.closeEntityManager();
            }
        }
        return PedidoTemp;
    }

    public List<Pedido> findByTotal(Double total) {
        EntityManager em = getEntityManager();
        List<Pedido> pedidoTemporal = null;

        try {
            Query query = em.createNamedQuery("Pedido.findByTotal");
            query.setParameter(PedidoDAOImpl.TOTAL,total);
            pedidoTemporal = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return pedidoTemporal;
    }

    public List<Pedido> findBySubtotal(Double subtotal) {
         EntityManager em = getEntityManager();
        List<Pedido> pedidoTemporal = null;

        try {
            Query query = em.createNamedQuery("Pedido.findBySubtotal");
            query.setParameter(PedidoDAOImpl.SUBTOTAL,subtotal);
            pedidoTemporal = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return pedidoTemporal;

    }

    public List<Pedido> findByImpuestos(Double Impuestos) {
         EntityManager em = getEntityManager();
        List<Pedido> pedidoTemporal = null;

        try {
            Query query = em.createNamedQuery("Pedido.findByImpuestos");
            query.setParameter(PedidoDAOImpl.IMPUESTOS,Impuestos);
            pedidoTemporal = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return pedidoTemporal;
    }

   

    
}
