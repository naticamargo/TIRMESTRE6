/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio;

import edu.co.sena.jpa.util.EntityManagerHelper;
import edu.co.sena.entity.jpa.Catalogo;
import edu.co.sena.entity.jpa.Producto;
import edu.co.sena.entity.jpa.Categoria;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ADMIN
 */
public class CategoriaEJERCICIO {
    Categoria categoria;
    List<Producto> productos;
    Producto producto1;
    Producto producto2;
    Producto prodcuto3;
    Producto producto4;
    
    EntityManagerFactory emf;
    EntityManager em;
    public CategoriaEJERCICIO() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        
        categoria = new Categoria();
        categoria.setIdCategoria(1);
        categoria.setNombre("tenis");
        categoria.setMarca("adidas");
        
        productos= new ArrayList<>();
        producto1= new Producto();
        producto1.setIdProducto("56890");
        producto1.setNombreProdcuto("tenis hombre");
        producto1.setPrecio(67000);
        producto1.setCantidad(2);
        producto1.setDescuento(Boolean.TRUE);
        producto1.setCatalogoIdCatologo(new Catalogo(1));
        producto1.setCategoriaIdCategoria(new Categoria(1));
         
        producto2= new Producto();
        producto2.setIdProducto("34670");
        producto2.setNombreProdcuto("tenis hombre");
        producto2.setPrecio(67000);
        producto2.setCantidad(2);
        producto2.setDescuento(Boolean.TRUE);
        producto2.setCatalogoIdCatologo(new Catalogo(1));
        producto2.setCategoriaIdCategoria(new Categoria(1));
        
        prodcuto3= new Producto();
        prodcuto3.setIdProducto("56890");
        prodcuto3.setNombreProdcuto("tenis hombre");
        prodcuto3.setPrecio(67000);
        prodcuto3.setCantidad(2);
        prodcuto3.setDescuento(Boolean.TRUE);
        prodcuto3.setCatalogoIdCatologo(new Catalogo(1));
        prodcuto3.setCategoriaIdCategoria(new Categoria(1));
        
        producto4.setIdProducto("fdre");
        producto4.setNombreProdcuto("nike color azul");
        producto4.setPrecio(254689);
        producto4.setCantidad(4);
        producto4.setDescuento(Boolean.TRUE);
        producto4.setDescripcion("Caballero");
        producto4.setCatalogoIdCatologo(new Catalogo(1));
        producto4.setCategoriaIdCategoria(new Categoria(1));
        
       
      productos.add(producto1);
      productos.add(producto2);
      productos.add(prodcuto3);
      
      
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
     @Test
    public void insertarproductocategoria(){
        
        
        categoria.setProductoCollection(productos);
        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        em.persist(categoria);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        
    
    }
     @Test
    public void insertarcategoriaProducto(){
        
        
        producto4.setCategoriaIdCategoria(new Categoria(1));
        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        em.persist(categoria);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        
    
    }
}

