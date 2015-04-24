/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tennisshop.modelo.jpa.dao.implementacion;

import edu.co.sena.jpa.util.EntityManagerHelper;
import edu.co.sena.tennishop.midelo.jpa.dao.interfaces.ICarritoComprasDAO;
import edu.co.sena.tennisshop.integracion.jpa.entitis.CarritoCompras;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author ADMIN
 */
public class CarritoComprasDAOImpl implements ICarritoComprasDAO {

    private EntityManager getEntityManager() {
        return EntityManagerHelper.getEntityManager();
    }

    @Override
    public void insert(CarritoCompras Entity) {
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
    public void update(CarritoCompras Entity) {
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
    public void delete(CarritoCompras Entity) {
        EntityManager em= EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        
         
        try {
           
//            em.remove(em.find(CarritoCompras.class, idcarrito));
            EntityManagerHelper.commit();
            
        } catch (RuntimeException re) {
             System.out.println("erorrr:----------------" + re.getMessage());
        }
       
            
    }

    @Override
    public List<CarritoCompras> findByAll() {
         throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CarritoCompras findByIdCARRITO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CarritoCompras> findByTotal(Object total) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CarritoCompras> findBySubtotal(Object subtotal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CarritoCompras> findByImpuestos(Object Impuestos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
