/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.jpa.dao.implementacion;

import edu.co.sena.jpa.util.EntityManagerHelper;
import static edu.co.sena.jpa.util.EntityManagerHelper.getEntityManager;
import edu.co.sena.tennishop.midelo.jpa.dao.interfaces.PagoDAO;
import edu.co.sena.tennisshop.integracion.jpa.entitis.Pago;
import edu.co.sena.tennisshop.integracion.jpa.entitis.Producto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author pc
 */
public class PagoDAOImpl implements PagoDAO{
    
     public static final String ID_PAGO = "Id_pago";
    public static final String NUMEROCUENTA = "numero cuenta";
    public static final String TARGETA= "targeta";

    public static final String TIPOPAGO = "tipo pago";
    public static final String FACTURA_ID_FACTURA = "factura_id_factura";

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

    public Pago findByIdPago(int IdPago) {
        EntityManager em= getEntityManager();
        Pago PagoTemp = null;
        try {
            PagoTemp = em.find(Pago.class, IdPago);
        } catch (RuntimeException re) {
            System.out.println("error:----------------" + re.getMessage());
        } finally {
            if (em != null) {
                EntityManagerHelper.closeEntityManager();
            }
        }
        return PagoTemp;
        
    }

    public List<Pago> findByNumeroCuenta(double NumeroCuenta) {
        
        EntityManager em = getEntityManager();
        List<Pago> PagoTemp = null;
        Query query = em.createNamedQuery("Pago.findByNumeroCuenta");
        try {
            PagoTemp = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("error:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return PagoTemp;
    }

    public List<Pago> findByTargeta(String Targeta) {
         EntityManager em = getEntityManager();
        List<Pago> PagoTemp = null;
        Query query = em.createNamedQuery("Pago.findByTargeta");
        try {
            PagoTemp = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("error:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return PagoTemp;
    }

   
    public List<Pago> findByTipoPago(String TipoPago) {
        EntityManager em = getEntityManager();
        List<Pago> PagoTemp = null;
        Query query = em.createNamedQuery("Pago.findByTipoPago");
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
    public List<Pago> findByFacturaIdFactura(Object FacturaIdFactura) {
        EntityManager em = getEntityManager();
        List<Pago> PagoTemp = null;
        Query query = em.createNamedQuery("Pago.findByFacturaIdFactura");
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
    public Pago findByIdPago() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pago> findByNumeroCuenta(Object NumeroCuenta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pago> findByTargeta(Object Targeta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pago> findByTipoPago(Object TipoPago) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
    


       
   

   