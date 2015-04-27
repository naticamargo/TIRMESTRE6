/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.jpa.dao.implementacion;

import edu.co.sena.jpa.util.EntityManagerHelper;
import edu.co.sena.tennishop.midelo.jpa.dao.interfaces.ICuentaDAO;
import edu.co.sena.entity.jpa.Cuenta;
import edu.co.sena.entity.jpa.CuentaPK;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author familia
 */
public class CuentaDAOImpl implements ICuentaDAO{
    public static final String PRIMERNOMBRE = "primerNombre";
    public static final String SEGUNDONOMBRE = "segundoNombre";
    public static final String PRIMERAAPELLIDO = "primerApellido";
    public static final String SEGUNDOAPELLIDO = "segundoApellido";
    public static final String NUMERODOCUMENTO = "NumeroDocumento";
    public static final String USUARIO = "Usuario";
    public static final String TIPODOCUMENTO = "TipoDocumento";
 private EntityManager getEntityManager() {
        return EntityManagerHelper.getEntityManager();
    }
    @Override
    public void insert(Cuenta Entity) {
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
    public void update(Cuenta Entity) {
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
    public void delete(Cuenta Entity) {
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
    public List<Cuenta> findByAll() {
        EntityManager em = getEntityManager();
        List<Cuenta> cuentaTemporal = null;
        Query query = em.createNamedQuery("Cuenta.findAll");
        try {
            cuentaTemporal = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println(" Error : " + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return cuentaTemporal;
    }

    @Override
    public List<Cuenta> findByPrimerNombre(String primerNombre) {
        EntityManager em = getEntityManager();
        List<Cuenta> cuentaTemporal = null;
        try {
            Query query = em.createNamedQuery("Cuenta.findByPrimerNombre");
            query.setParameter(CuentaDAOImpl.PRIMERNOMBRE, primerNombre);
            cuentaTemporal = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("Error : " + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return cuentaTemporal;
    }

    @Override
    public List<Cuenta> findBySegundoNombre(String SegundoNombre) {
        EntityManager em = getEntityManager();
        List<Cuenta> cuentaTemporal = null;
        try {
            Query query = em.createNamedQuery("Cuenta.findBySegundoNombre");
            query.setParameter(CuentaDAOImpl.SEGUNDONOMBRE,SegundoNombre);
            cuentaTemporal = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("Error : " + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return cuentaTemporal;
    }

    @Override
    public List<Cuenta> findByPrimerApellido(String PrimerApellido) {
        EntityManager em = getEntityManager();
        List<Cuenta> cuentaTemporal = null;
        try {
            Query query = em.createNamedQuery("Cuenta.findByPrimerApellido");
            query.setParameter(CuentaDAOImpl.PRIMERAAPELLIDO, PrimerApellido);
            cuentaTemporal = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("Error : " + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return cuentaTemporal;
    }

    @Override
    public List<Cuenta> findBySegundoApellido(String SegundoApellido) {
        EntityManager em = getEntityManager();
        List<Cuenta> cuentaTemporal = null;
        try {
            Query query = em.createNamedQuery("Cuenta.findBySegundoApellido");
            query.setParameter(CuentaDAOImpl.SEGUNDOAPELLIDO, SegundoApellido);
            cuentaTemporal = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("Error : " + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return cuentaTemporal;
    }

    @Override
    public List<Cuenta> findByTipoDocumento(String TipoDocumento) {
        EntityManager em = getEntityManager();
        List<Cuenta> cuentaTemporal = null;
        try {
            Query query = em.createNamedQuery("Cuenta.findByTipoDocumento");
            query.setParameter(CuentaDAOImpl.TIPODOCUMENTO, TipoDocumento);
            cuentaTemporal = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("Error : " + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return cuentaTemporal;
    }

    @Override
    public List<Cuenta> findByNumeroDocumento(String NumeroDocumento) {
        EntityManager em = getEntityManager();
        List<Cuenta> cuentaTemporal = null;
        try {
            Query query = em.createNamedQuery("Cuenta.findByNumeroDocumento");
            query.setParameter(CuentaDAOImpl.NUMERODOCUMENTO, NumeroDocumento);
            cuentaTemporal = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("Error : " + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return cuentaTemporal;
    }

    @Override
    public List<Cuenta> findByUsuario(String Usuario) {
        EntityManager em = getEntityManager();
        List<Cuenta> cuentaTemporal = null;
        try {
            Query query = em.createNamedQuery("Cuenta.findByUsuario");
            query.setParameter(CuentaDAOImpl.USUARIO, Usuario);
            cuentaTemporal = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("Error : " + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return cuentaTemporal;
    }

    @Override
    public Cuenta finByCuentaPk(CuentaPK cuentaPKLlaves) {
        EntityManager em = getEntityManager();
        Cuenta cuentaTemporal = null;
        try {
            cuentaTemporal= em.find(Cuenta.class, cuentaPKLlaves);
        } catch (RuntimeException re) {
            System.out.println(" Error : " + re.getMessage());
        } finally {
            if (em != null) {
                EntityManagerHelper.closeEntityManager();
            }
        }
        return cuentaTemporal;
    }
    
}
