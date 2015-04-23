/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import edu.co.sena.jpa.util.EntityManagerHelper;
import edu.co.sena.tennisshop.integracion.jpa.entitis.Catalogo;
import edu.co.sena.tennisshop.integracion.jpa.entitis.Categoria;
import edu.co.sena.tennisshop.integracion.jpa.entitis.Producto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author ADMIN
 */
public class ProductoJPATest {
     Producto producto;
    EntityManagerFactory emf;
    EntityManager em;
    public ProductoJPATest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
         producto = new Producto();
       producto.setIdProducto("00002");
       producto.setNombreProdcuto("tenis rebok");
       producto.setPrecio(30000);
       producto.setCantidad(4);
       producto.setDescripcion("color negros");
       producto.setCatalogoIdCatologo(new Catalogo(2));
       producto.setCategoriaIdCategoria(new Categoria(3));
     
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
    public void insertarProducto(){
        
        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        em.persist(producto);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        
    
    }
    @Test
    public void actualizarProducto() {

        String idPro = JOptionPane.showInputDialog("Escriba el id del producto");
        String actPrecio = JOptionPane.showInputDialog("Escriba El Precio");
        String actCan = JOptionPane.showInputDialog("Escriba La Cantidad");

        producto.setIdProducto(idPro);
        producto.setPrecio(Float.valueOf(actPrecio));
        producto.setCantidad(Integer.parseInt(actCan));

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        em.merge(producto);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
     @Test
    public void buscarProducto() {

        String idPro = JOptionPane.showInputDialog("Inserte El id del producto");

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Producto pro = em.find(Producto.class, idPro);

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

        System.out.println(pro.toString());
    }
     @Test
    public void borrarUnProducto() {
        String idProducto = JOptionPane.showInputDialog("Escriba el id del producto");
        try {
            em = EntityManagerHelper.getEntityManager();
            EntityManagerHelper.beginTransaction();

            em.remove(em.find(Producto.class, idProducto));
            EntityManagerHelper.commit();
            EntityManagerHelper.closeEntityManager();
            EntityManagerHelper.closeEntityManagerFactory();
        } catch (Exception e) {
            System.out.println("No se pudo eliminar el producto" + e.getMessage());
        }
    }
    @Test
    public void buscarProductos() {
        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        Query q = em.createNamedQuery("Producto.findAll");
        List<Producto> lis = q.getResultList();
        for (Producto productoT : lis) {

            System.out.println(productoT.toString());
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
 @Test
    public void buscarPorNombreProducto() {
        String nombreProdcuto = JOptionPane.showInputDialog("Insertar El nombre Del producto");

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Query query = em.createNamedQuery("Producto.findByNombreProdcuto");
        query.setParameter("nombreProdcuto", nombreProdcuto);

        Producto pro = (Producto) query.getSingleResult();

        List<Producto> lista = query.getResultList();
        for (Producto productoT : lista) {
            System.out.println(pro.toString());
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
    @Test
    public void buscarPorPrecio() {
        String precio = JOptionPane.showInputDialog("Insertar El precio Del producto");

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Query query = em.createNamedQuery("Producto.findByPrecio");
        query.setParameter("precio", Double.parseDouble(precio));

        Producto pro = (Producto) query.getSingleResult();

        List<Producto> lista = query.getResultList();
        for (Producto productoT : lista) {
            System.out.println(pro.toString());
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
    
    @Test
    public void buscarPorCantidad() {
        String cantidad = JOptionPane.showInputDialog("Insertar la cantidad Del producto");

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Query query = em.createNamedQuery("Producto.findByCantidad");
        query.setParameter("cantidad", Integer.parseInt(cantidad));

        Producto pro = (Producto) query.getSingleResult();

        List<Producto> lista = query.getResultList();
        for (Producto productoT : lista) {
            System.out.println(pro.toString());
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
    @Test
    public void buscarPorDescripcion() {
        String descripcion = JOptionPane.showInputDialog("Insertar la descripcion Del producto");

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Query query = em.createNamedQuery("Producto.findByDescripcion");
        query.setParameter("descripcion", descripcion);

        Producto pro = (Producto) query.getSingleResult();

        List<Producto> lista = query.getResultList();
        for (Producto productoT : lista) {
            System.out.println(pro.toString());
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
   
}
