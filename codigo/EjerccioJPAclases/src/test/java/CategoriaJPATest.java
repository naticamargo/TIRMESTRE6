/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import edu.co.sena.jpa.util.EntityManagerHelper;
import edu.co.sena.tennisshop.integracion.jpa.entitis.Categoria;
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
import static org.junit.Assert.*;

/**
 *
 * @author ADMIN
 */
public class CategoriaJPATest {
    
    Categoria categoria;
    EntityManagerFactory emf;
    EntityManager em;
    
    public CategoriaJPATest() {
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
        categoria.setNombre("tenis hombre");
        categoria.setMarca("adidas");
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
    public void insertarCategoria() {
        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        em.persist(categoria);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();
    }
    
    @Test
    public void buscarUnaCategoria() {
        String idCategoria = JOptionPane.showInputDialog("inserte el id a buscar");
        
        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        
        Categoria ct = em.find(Categoria.class, Integer.parseInt(idCategoria));
        
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();
        
        System.out.println(ct.toString());
        
    }
    
    @Test
    public void actualizarCategoria() {
        String catLeida = JOptionPane.showInputDialog("Digite la categoria a Actualizar");
        String catLeidaValor = JOptionPane.showInputDialog("Digite el valor");
        categoria.setIdCategoria(Integer.parseInt(catLeida));
        categoria.setNombre(catLeidaValor);
        
        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        em.merge(categoria);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();
        
    }
     @Test
    public void eliminarUnaCategoria() {
        String idCategoria = JOptionPane.showInputDialog("inserte el id a borrar");

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        em.remove(em.find(Categoria.class, Integer.parseInt(idCategoria)));

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();
    }
    @Test
    public void borrarUnaCategoria() {
        String idCategoria = JOptionPane.showInputDialog("Escriba el id de la categoria a eliminar");
        try {
            em = EntityManagerHelper.getEntityManager();
            EntityManagerHelper.beginTransaction();

            em.remove(em.find(Categoria.class, Integer.parseInt(idCategoria)));
            EntityManagerHelper.commit();
            EntityManagerHelper.closeEntityManager();
            EntityManagerHelper.closeEntityManagerFactory();
        } catch (Exception e) {
            System.out.println("No se pudo eliminar la categoria" + e.getMessage());
        }
    }
    @Test
    public void buscarCategorias() {

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        Query q = em.createNamedQuery("Categoria.findAll");
        List<Categoria> lis = q.getResultList();
        for (Categoria categoriaT : lis) {
            System.out.println(categoriaT.getIdCategoria() + " / " + categoriaT.getNombre() + " / " + categoriaT.getMarca() + " / " );
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
    @Test
    public void buscarPorNombre() {
        String nombre = JOptionPane.showInputDialog("Insertar El nombre De La Categoria");

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Query query = em.createNamedQuery("Categoria.findByNombre");
        query.setParameter("nombre", nombre);

        Categoria ca = (Categoria) query.getSingleResult();

        List<Categoria> lista = query.getResultList();
        for (Categoria categoriaT : lista) {
            System.out.println(ca.toString());
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
    @Test
    public void buscarPorMarca(){
        String  marca = JOptionPane.showInputDialog("Insertar El marca De La Categoria");

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Query query = em.createNamedQuery("Categoria.findByMarca");
        query.setParameter("marca", marca);

        Categoria ca = (Categoria) query.getSingleResult();

        List<Categoria> lista = query.getResultList();
        for (Categoria categoriaT : lista) {
            System.out.println(ca.toString());
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();
    }
}

