/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.jpa.dao.implementacion;

import edu.co.sena.jpa.util.EntityManagerHelper;
import static edu.co.sena.jpa.util.EntityManagerHelper.getEntityManager;
import edu.co.sena.tennishop.midelo.jpa.dao.interfaces.FacturaDAO;
import edu.co.sena.entity.jpa.Factura;
import edu.co.sena.entity.jpa.Pedido;
import edu.co.sena.entity.jpa.Producto;
import java.util.Date;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author pc
 */
public class FacturaDAOImpl implements FacturaDAO {

    
    public static final String FECHA = "fecha";
    public static final String FECHAFACTURA = "fecha factura";
    public static final String FORMAPAGO = "formapago";

    private EntityManager getEntityManager() {
        return EntityManagerHelper.getEntityManager();
    }

    @Override
    public void insert(Factura Entity) {
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
    public void update(Factura Entity) {
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
    public void delete(Factura Entity) {
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
    public List<Factura> findByAll() {
        EntityManager em = getEntityManager();
        List<Factura> FacturaTemp = null;
        Query query = em.createNamedQuery("Factura.findAll");
        try {
            FacturaTemp = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("error:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return FacturaTemp;
    }

    @Override
    public Factura findByIdFactura(Integer IdFactura) {
        EntityManager em = getEntityManager();
         Factura facturaTemporal = null;
        try {
            facturaTemporal = em.find(Factura.class, IdFactura);
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            if (em != null) {
                EntityManagerHelper.closeEntityManager();
            }
        }
        return facturaTemporal;
    }

    @Override
    public List<Factura> findByFechaFactura(Date FechaFactura) {
        EntityManager em = getEntityManager();
        List<Factura> facTemporales = null;
        try {
           Query query = em.createNamedQuery("Factura.findByFechaFactura");
            query.setParameter(FacturaDAOImpl.FECHA, FechaFactura);
            facTemporales = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
               EntityManagerHelper.closeEntityManager();
            }
          return  facTemporales;
       
    }

    @Override
    public List<Factura> findByFormaPago(String FormaPago) {
        EntityManager em = getEntityManager();
        List<Factura> facTemporal = null;

        try {
            Query query = em.createNamedQuery("Factura.findByFormaPago");
            query.setParameter(FacturaDAOImpl.FORMAPAGO,FormaPago);
            facTemporal = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return facTemporal;
    }

    }

    


