/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.jpa.dao.implementacion;

import edu.co.sena.entity.jpa.Producto;
import edu.co.sena.jpa.util.EntityManagerHelper;
import edu.co.sena.tennishop.midelo.jpa.dao.interfaces.ProductoDAO;
import edu.co.sena.entity.jpa.Producto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author pc
 */
public class ProductoDAOImpl implements ProductoDAO {

 
    public static final String NOMBRE_PRODCUTO = "nombreprodcuto";
    public static final String PRECIO = "precio";

    public static final String CANTIDAD = "cantidad";
    public static final String DESCRIPCION = "descripcion";
   

    private EntityManager getEntityManager() {
        return EntityManagerHelper.getEntityManager();
    }

    @Override
    public void insert(Producto Entity) {
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
    public void update(Producto Entity) {
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
    public void delete(Producto Entity) {
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
    public List<Producto> findByAll() {
        EntityManager em = getEntityManager();
        List<Producto> productoTemp = null;
        Query query = em.createNamedQuery("Producto.findAll");
        try {
            productoTemp = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("error:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return productoTemp;
    }

    @Override
    public Producto findByIdProducto(String idProducto) {
        EntityManager em = getEntityManager();
        Producto productoTemporal= null;

        try {
            productoTemporal=em.find(Producto.class, idProducto);
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return productoTemporal;
    }

    @Override
    public List<Producto> findByNombreProdcuto(String NombreProdcuto) {
        EntityManager em = getEntityManager();
        List<Producto> productoTemporal = null;

        try {
            Query query= em.createNamedQuery("Producto.findByNombreProdcuto");
            query.setParameter(ProductoDAOImpl.NOMBRE_PRODCUTO, NombreProdcuto);
            productoTemporal=query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return productoTemporal;
    }

    @Override
    public List<Producto> findByPrecio(Double Precio) {
        EntityManager em = getEntityManager();
        List<Producto> productoTemporal = null;

        try {
            Query query= em.createNamedQuery("Producto.findByPrecio");
            query.setParameter(ProductoDAOImpl.PRECIO, Precio);
            productoTemporal=query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return productoTemporal;
    }

    @Override
    public List<Producto> findByCantidad(Integer Cantidad) {
        EntityManager em = getEntityManager();
        List<Producto> productoTemporal = null;

        try {
            Query query= em.createNamedQuery("Producto.findByCantidad");
            query.setParameter(ProductoDAOImpl.CANTIDAD, Cantidad);
            productoTemporal=query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return productoTemporal;
    }

    @Override
    public List<Producto> findByDescripcion(String Descripcion) {
        EntityManager em = getEntityManager();
        List<Producto> productoTemporal = null;

        try {
            Query query= em.createNamedQuery("Producto.findByDescuento");
            query.setParameter(ProductoDAOImpl.DESCRIPCION, Descripcion);
            productoTemporal=query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return productoTemporal;
    }

   

}