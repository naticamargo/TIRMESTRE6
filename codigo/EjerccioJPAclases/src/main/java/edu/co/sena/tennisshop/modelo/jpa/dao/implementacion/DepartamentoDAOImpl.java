/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.jpa.dao.implementacion;

import edu.co.sena.jpa.util.EntityManagerHelper;
import edu.co.sena.tennishop.midelo.jpa.dao.interfaces.IDepartamentoDAO;
import edu.co.sena.entity.jpa.Departamento;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author familia
 */
public class DepartamentoDAOImpl implements IDepartamentoDAO {
public static final String NOMBRE= "NombreDeparamento";
    private EntityManager getEntityManager() {
        return EntityManagerHelper.getEntityManager();
    }

    @Override
    public void insert(Departamento Entity) {

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
    public void update(Departamento Entity) {
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
    public void delete(Departamento Entity) {
        EntityManager em = getEntityManager();
        try {
            EntityManagerHelper.beginTransaction();
            Entity = em.getReference(Departamento.class, Entity.getIdDEPARTAMENTO());
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
    public List<Departamento> findByAll() {
        
        EntityManager em = getEntityManager();
        List<Departamento> departamentoTemporal = null;
        Query query = em.createNamedQuery("Departamento.findAll");
        try {
         departamentoTemporal = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return departamentoTemporal;
    }

    @Override
    public Departamento findByIdDEPARTAMENTO(Integer idDEPARTAMENTO) {
       
         EntityManager em = getEntityManager();
        Departamento departamentosTemporal = null;

        try {
            departamentosTemporal=em.find(Departamento.class, idDEPARTAMENTO);
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return departamentosTemporal;
    }

    @Override
    public List<Departamento> findByNombreDeparamento(String NombreDeparamento) {
        
        EntityManager em = getEntityManager();
        List<Departamento> departamentosTemporal = null;

        try {
            Query query= em.createNamedQuery("findByNombreDeparamento");
            query.setParameter(DepartamentoDAOImpl.NOMBRE, NombreDeparamento);
            departamentosTemporal=query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return departamentosTemporal;
    }

}
