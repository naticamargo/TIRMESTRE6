/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.jpa.dao.implementacion;

import edu.co.sena.tennishop.midelo.jpa.dao.interfaces.IMunicipioDAO;
import edu.co.sena.jpa.util.EntityManagerHelper;
import edu.co.sena.entity.jpa.Municipio;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author familia
 */
public class MunicipioDAOImpl implements IMunicipioDAO {
public static final String NOMBRE= "nombreMunicipio";
    private EntityManager getEntityManager() {
        return EntityManagerHelper.getEntityManager();
    }

    @Override
    public void insert(Municipio Entity) {

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
    public void update(Municipio Entity) {
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
    public void delete(Municipio Entity) {
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
    public List<Municipio> findByAll() {
        EntityManager em = getEntityManager();
        List<Municipio> municipiosTemporal = null;
        Query query = em.createNamedQuery("Municipio.findAll");
        try {
            municipiosTemporal = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return municipiosTemporal;
    }

    @Override
    public Municipio findByIdMUNICIPIO(Integer idMUNICIPIO) {
        EntityManager em = getEntityManager();
        Municipio municipioTemporal= null;

        try {
            municipioTemporal=em.find(Municipio.class, idMUNICIPIO);
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return municipioTemporal;
    }

    @Override
    public List<Municipio> findByNombreMunicipio(String nombreMunicipio) {
        EntityManager em = getEntityManager();
        List<Municipio> municipiosTemporal = null;

        try {
            Query query= em.createNamedQuery("Municipio.findByNombreMunicipio");
            query.setParameter(MunicipioDAOImpl.NOMBRE, nombreMunicipio);
            municipiosTemporal=query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return municipiosTemporal;
    }
    } 

    

