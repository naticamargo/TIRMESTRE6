/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.jpa.dao.implementacion;

import edu.co.sena.entity.jpa.Domicilio;
import edu.co.sena.entity.jpa.DomicilioPK;
import edu.co.sena.jpa.util.EntityManagerHelper;
import edu.co.sena.tennishop.midelo.jpa.dao.interfaces.IDomicilioDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author familia
 */
public class DomiciloDAOImpl implements IDomicilioDAO{

    public static final String TELEFONO = "telefono";
    public static final String DIRECCION = "direccion";
    public static final String BARRIO = "barrio";
    public static final String LOCALIDAD = "localidad";
    
    private EntityManager getEntityManager() {
        return EntityManagerHelper.getEntityManager();
        }
    @Override
    public void insert(Domicilio Entity) {
        EntityManager em = EntityManagerHelper.getEntityManager();
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
    public void update(Domicilio Entity) {
        EntityManager em = EntityManagerHelper.getEntityManager();
        try {
            EntityManagerHelper.beginTransaction();
            em.merge(Entity);
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
    public void delete(Domicilio Entity) {
        EntityManager em = getEntityManager();
        try {
            EntityManagerHelper.beginTransaction();
            Entity = em.getReference(Domicilio.class, Entity.getDomicilioPK());
            EntityManagerHelper.commit();
        } catch (RuntimeException re) {
            System.out.println("error:------------ " + re.getMessage());

        } finally {
            if (em != null) {
                EntityManagerHelper.closeEntityManager();;

            }
        }
    }

    @Override
    public List<Domicilio> findByAll() {
        EntityManager em = getEntityManager();
        List<Domicilio> domicilioTemporal = null;
        Query query = em.createNamedQuery("Domicilio.findAll");
        try {
         domicilioTemporal = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return domicilioTemporal;
    }

    @Override
    public Domicilio finByDomicilioPk(DomicilioPK domicilioPKLlaves) {
        EntityManager em = getEntityManager();
        Domicilio domicilioCueTemporal = null;
        try {
            domicilioCueTemporal = em.find(Domicilio.class, domicilioPKLlaves);
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            if (em != null) {
                EntityManagerHelper.closeEntityManager();
            }
        }
        return domicilioCueTemporal;
    }


    @Override
    public List<Domicilio> findByDirrecion(String dirrecion) {
        EntityManager em = getEntityManager();
        List<Domicilio> domicilioTemporal = null;

        try {
            Query query = em.createNamedQuery("Domicilio.findByDireccion");
            query.setParameter(DomiciloDAOImpl.DIRECCION, dirrecion);
            domicilioTemporal = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return domicilioTemporal;
    }

    @Override
    public List<Domicilio> findByTelefono(String telefono) {
        EntityManager em = getEntityManager();
        List<Domicilio> domicilioTemporal = null;

        try {
            Query query = em.createNamedQuery("DomicilioCuenta.findByTelefono");
            query.setParameter(DomiciloDAOImpl.TELEFONO, telefono);
            domicilioTemporal = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return domicilioTemporal;
    }

    @Override
    public List<Domicilio> findByLocalidad(String localidad) {
        EntityManager em = getEntityManager();
        List<Domicilio> domicilioTemporal = null;

        try {
            Query query = em.createNamedQuery("DomicilioCuenta.findByLocalidad");
            query.setParameter(DomiciloDAOImpl.LOCALIDAD, localidad);
            domicilioTemporal = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return domicilioTemporal;
    }

    @Override
    public List<Domicilio> findByBarrio(String barrio) {
        EntityManager em = getEntityManager();
        List<Domicilio> domicilioTemporal = null;

        try {
            Query query = em.createNamedQuery("DomicilioCuenta.findByBarrio");
            query.setParameter(DomiciloDAOImpl.BARRIO, barrio);
            domicilioTemporal = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return domicilioTemporal;
    }
    
}
