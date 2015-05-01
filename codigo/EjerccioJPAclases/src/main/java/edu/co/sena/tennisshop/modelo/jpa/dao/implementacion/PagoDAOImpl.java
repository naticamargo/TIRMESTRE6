/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.jpa.dao.implementacion;

import edu.co.sena.jpa.util.EntityManagerHelper;
import static edu.co.sena.jpa.util.EntityManagerHelper.getEntityManager;
import edu.co.sena.tennishop.midelo.jpa.dao.interfaces.PagoDAO;
import edu.co.sena.entity.jpa.Pago;
import edu.co.sena.entity.jpa.Producto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author pc
 */
public class PagoDAOImpl implements PagoDAO{
    
     
    public static final String NUMEROCUENTA = "numero cuenta";
    public static final String TARGETA= "targeta";
    public static final String TIPOPAGO = "tipo pago";
    

    private EntityManager getEntityManager() {
        return EntityManagerHelper.getEntityManager();
    

}

    @Override
    public void insert(Pago Entity) {
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
    public void update(Pago Entity) {
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
    public void delete(Pago Entity) {
         EntityManager em = getEntityManager();
        try {
            EntityManagerHelper.beginTransaction();
            em.merge(  Entity);
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
    public List<Pago> findByAll() {
        EntityManager em = getEntityManager();
        List<Pago> PagoTemp = null;
        Query query = em.createNamedQuery("Pago.findAll");
        try {
            PagoTemp = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("error:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return PagoTemp;
    }

    @Override
    public List<Pago> findByNumeroCuenta(String NumeroCuenta) {
        EntityManager em = getEntityManager();
        List<Pago> pagoTemporal = null;

        try {
            Query query = em.createNamedQuery("Pago.findByNumeroCuenta");
            query.setParameter(PagoDAOImpl.NUMEROCUENTA,NumeroCuenta);
            pagoTemporal = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return pagoTemporal;
    }

    @Override
    public List<Pago> findByTargeta(String Targeta) {
       EntityManager em = getEntityManager();
        List<Pago> pagoTemporal = null;

        try {
            Query query = em.createNamedQuery("Pago.findByTargeta");
            query.setParameter(PagoDAOImpl.TARGETA,Targeta);
            pagoTemporal = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return pagoTemporal;
    }

    @Override
    public List<Pago> findByTipoPago(String TipoPago) {
        EntityManager em = getEntityManager();
        List<Pago> pagoTemporal = null;

        try {
            Query query = em.createNamedQuery("Pago.findByTipoPago");
            query.setParameter(PagoDAOImpl.TIPOPAGO,TipoPago);
            pagoTemporal = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return pagoTemporal;
    }

    @Override
    public Pago findByFacturaIdFactura(Integer FacturaIdFactura) {
         EntityManager em = getEntityManager();
        Pago pagoTemporal = null;
        try {
            pagoTemporal= em.find(Pago.class, FacturaIdFactura);
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            if (em != null) {
                EntityManagerHelper.closeEntityManager();
            }
        }
        return pagoTemporal;
    }

  
    }
    


       
   

   