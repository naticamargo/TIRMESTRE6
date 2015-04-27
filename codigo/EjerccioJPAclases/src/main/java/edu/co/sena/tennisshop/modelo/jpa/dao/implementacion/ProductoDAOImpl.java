/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.jpa.dao.implementacion;

import edu.co.sena.jpa.util.EntityManagerHelper;
import edu.co.sena.tennishop.midelo.jpa.dao.interfaces.ProductoDAO;
import edu.co.sena.tennisshop.integracion.jpa.entitis.Producto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author pc
 */
public class ProductoDAOImpl implements ProductoDAO {

    public static final String ID_PRODUCTO = "Id_producto";
    public static final String NOMBRE_PRODCUTO = "nombre prodcuto";
    public static final String PRECIO = "precio";

    public static final String CANTIDAD = "cantidad";
    public static final String DESCRIPCION = "descripcion";
    public static final String CatalogoIdCatalogo = "IdCatalogo_Catalogo";

    public static final String CategoriaIdCategoria = "IdCategoria_Categoria";

    private EntityManager getEntityManager() {
        return EntityManagerHelper.getEntityManager();
    }

    @Override
    public void insert(Producto entity) {
        EntityManager em = getEntityManager();
        try {
            EntityManagerHelper.beginTransaction();
            em.persist(entity);
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
    public void update(Producto entity) {
        EntityManager em = getEntityManager();
        try {
            EntityManagerHelper.beginTransaction();
            em.merge(entity);
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
    public void delete(Producto entity) {
        EntityManager em = getEntityManager();
        try {
            EntityManagerHelper.beginTransaction();
            entity = getEntityManager().getReference(Producto.class,
                    entity.getIdProducto());
            em.remove(entity);
            EntityManagerHelper.commit();
        } catch (RuntimeException re) {
            System.out.println("error:----------------" + re.getMessage());
//        } finally {
//            if (em != null) {
//                EntityManagerHelper.closeEntityManager();
        }
    }

    @Override
    public List<Producto> findByAll() {
        EntityManager em = getEntityManager();
        List<Producto> ProductoTemp = null;
        Query query = em.createNamedQuery("Producto.findAll");
        try {
            ProductoTemp = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("error:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return ProductoTemp;
    }

    public Producto findByIdProducto(String IdProducto) {
        EntityManager em = getEntityManager();
        Producto ProductoTemp = null;
        try {
            ProductoTemp = em.find(Producto.class, IdProducto);
        } catch (RuntimeException re) {
            System.out.println("error:----------------" + re.getMessage());
        } finally {
            if (em != null) {
                EntityManagerHelper.closeEntityManager();
            }
        }
        return ProductoTemp;
    }

    public List<Producto> findByNombreProdcuto(String NombreProdcuto) {

        EntityManager em = getEntityManager();
        List<Producto> ProductoTemp = null;
        Query query = em.createNamedQuery("Producto.findByNombreProdcuto");
        try {
            ProductoTemp = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("error:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return ProductoTemp;
    }

    public List<Producto> findByPrecio(double Precio) {
        EntityManager em = getEntityManager();
        List<Producto> ProductoTemp = null;
        Query query = em.createNamedQuery("Producto.findByPrecio");
        try {
            ProductoTemp = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("error:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return ProductoTemp;
    }

    public List<Producto> findByCantidad(double Cantidad) {
        EntityManager em = getEntityManager();
        List<Producto> ProductoTemp = null;
        Query query = em.createNamedQuery("Producto.findByCantidad");
        try {
            ProductoTemp = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("error:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return ProductoTemp;
    }

    public List<Producto> findByDescripcion(String Descripcion) {
        EntityManager em = getEntityManager();
        List<Producto> ProductoTemp = null;
        Query query = em.createNamedQuery("Producto.findByDescripcion");
        try {
            ProductoTemp = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("error:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return ProductoTemp;

    }

    public List<Producto> findByCatalogoIdCatalogo(int CatalogoIdCatalogo) {
        EntityManager em = getEntityManager();
        List<Producto> ProductoTemp = null;
        Query query = em.createNamedQuery("Producto.findByIdProducto");
        try {
            ProductoTemp = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("error:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return ProductoTemp;
    }

    public List<Producto> findByCategoriaIdCategoria(int CategoriaIdCategoria) {
        EntityManager em = getEntityManager();
        List<Producto> ProductoTemp = null;
        Query query = em.createNamedQuery("Producto.findByIdProducto");
        try {
            ProductoTemp = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("error:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return ProductoTemp;
    }

    @Override
    public Producto findByIdProducto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Producto> findByNombreProdcuto(Object NombreProdcuto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Producto> findByPrecio(Object Precio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Producto> findByCantidad(Object Cantidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Producto> findByDescripcion(Object Descripcion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Producto> findByCatalogoIdCatalogo(Object CatalogoIdCatalogo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Producto> findByCategoriaIdCategoria(Object CategoriaIdCategoria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
