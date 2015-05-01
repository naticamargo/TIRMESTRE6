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

    public static final String ID_FACTURA = "Id_factura";
    public static final String CUENTA = "cuenta";
    public static final String FECHAFACTURA = "fecha factura";
    public static final String FORMAPAGO = "forma pago";

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
    public Factura findByFactura() {
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
        return (Factura) FacturaTemp;
    }

    public List<Factura> findByIdFactura(Integer IdFactura) {

        EntityManager em = getEntityManager();
        Factura FacturaTemp = null;
        try {
            FacturaTemp = em.find(Factura.class, IdFactura);
        } catch (RuntimeException re) {
            System.out.println("error:----------------" + re.getMessage());
        } finally {
            if (em != null) {
                EntityManagerHelper.closeEntityManager();
            }
        }
        return (List<Factura>) FacturaTemp;

    }

    public List<Factura> findByCuenta(String Cuenta) {
        EntityManager em = getEntityManager();
        List<Factura> FacturaTemp = null;
        Query query = em.createNamedQuery("Factura.");
        try {
            FacturaTemp = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("error:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return FacturaTemp;
    }

    public List<Factura> findByFechaFactura(Date FechaFactura) {

        EntityManager em = getEntityManager();
        List<Factura> FacturaTemp = null;
        Query query = em.createNamedQuery("Factura.findByFechaFactura");
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
    public List<Factura> findByFormaPago(Object FormaPago) {
        EntityManager em = getEntityManager();
        List<Factura> FacturaTemp = null;
        Query query = em.createNamedQuery("Factura.findByFormaPago");
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
    public List<Factura> findByIdFactura(Object IdFactura) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Factura> findByCuenta(Object Cuenta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Factura> findByFechaFactura(Object FechaFactura) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
