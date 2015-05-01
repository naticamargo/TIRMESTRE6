/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.jpa.dao.implementacion;

import edu.co.sena.jpa.util.EntityManagerHelper;
import edu.co.sena.tennishop.midelo.jpa.dao.interfaces.IProveedorDAO;
import edu.co.sena.entity.jpa.Proveedor;
import edu.co.sena.entity.jpa.ProveedorPK;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author familia
 */
public class ProveedorDAOImpl implements IProveedorDAO{
    public static final String TIPODOCUMENTO= "tipoDocumento";
    public  static final String NUMERODOCUMENTO= "numeroDocumento";
    public static final String NOMBREPROVEEDOR="nombreProvvedor";
    public static final String TELEFONO="telefono";
    public static final String CORREO="correo";
   
    private EntityManager getEntityManager() {
        return EntityManagerHelper.getEntityManager();
    }

    @Override
    public void insert(Proveedor Entity) {
        EntityManager em = getEntityManager();
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
    public void update(Proveedor Entity) {
       EntityManager em = getEntityManager();
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
    public void delete(Proveedor Entity) {
        EntityManager em = getEntityManager();
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
    public List<Proveedor> findByAll() {
        EntityManager em = getEntityManager();
        List<Proveedor> proveedorTemporal = null;
        Query query = em.createNamedQuery("Proveedor.findAll");
        try {
            proveedorTemporal = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return proveedorTemporal;
    }

    @Override
    public List<Proveedor> findBynombreProvvedor(String nombreProvvedor) {
        EntityManager em = getEntityManager();
        List<Proveedor> proveedorTemporal = null;

        try {
            Query query= em.createNamedQuery("Proveedor.findByNombreProvvedor");
            query.setParameter(ProveedorDAOImpl.NOMBREPROVEEDOR, nombreProvvedor);
            proveedorTemporal=query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return proveedorTemporal;
    }

    @Override
    public List<Proveedor> findBytelefono(String telefono) {
    
        EntityManager em = getEntityManager();
        List<Proveedor> proveedorTemporal = null;

        try {
            Query query= em.createNamedQuery("Proveedor.findByTelefono");
            query.setParameter(ProveedorDAOImpl.TELEFONO, telefono);
            proveedorTemporal=query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return proveedorTemporal;
    }

    @Override
    public List<Proveedor> findBycorreo(String correo) {
        
         EntityManager em = getEntityManager();
        List<Proveedor> proveedorTemporal = null;

        try {
            Query query= em.createNamedQuery("Proveedor.findByCorreo");
            query.setParameter(ProveedorDAOImpl.CORREO, correo);
            proveedorTemporal=query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return proveedorTemporal;
    }



    @Override
    public Proveedor finByProveedor(ProveedorPK proveedorPKllaves) {
         EntityManager em = getEntityManager();
        Proveedor proveedorTemporal = null;
        try {
            proveedorTemporal= em.find(Proveedor.class, proveedorPKllaves);
        } catch (RuntimeException re) {
            System.out.println(" Error : " + re.getMessage());
        } finally {
            if (em != null) {
                EntityManagerHelper.closeEntityManager();
            }
        }
        return proveedorTemporal;
    }

   
}
