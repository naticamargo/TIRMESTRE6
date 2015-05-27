/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import edu.co.sena.jpa.util.EntityManagerHelper;
import edu.co.sena.entity.jpa.Catalogo;
import edu.co.sena.entity.jpa.Categoria;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
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
public class CatalogoJPATest {
    Catalogo catalogo;
    EntityManager em;
    public CatalogoJPATest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        catalogo= new Catalogo();
        catalogo.setNombre("coleccion 2015");
        catalogo.setDescripcion("nueva moda");
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
    public void insertarCatalogo(){
        
        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        em.persist(catalogo);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        
    }
     @Test
    public void buscarUnaCatalgo() {
        String idcatalogo = JOptionPane.showInputDialog("inserte el id a buscar");

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

         Catalogo ct = em.find(Catalogo.class, Integer.parseInt(idcatalogo));

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();
        
        System.out.println(ct.toString());    
    }
     @Test
    public void actualizarCatalogo() {
        String catLeida = JOptionPane.showInputDialog("Digite la categoria a Actualizar");
        String catLeidaValor = JOptionPane.showInputDialog("Digite el valor");
        catalogo.setIdCatologo(Integer.parseInt(catLeida));
        catalogo.setNombre(catLeidaValor);
        
        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        em.merge(catalogo);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();
}
    @Test
    public void eliminarUncatalogo() {
        String idCatalogo = JOptionPane.showInputDialog("inserte el id a borrar");

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        em.remove(em.find(Catalogo.class, Integer.parseInt(idCatalogo)));

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();
    }

    @Test
    public void buscarPorNombre(){
        String nombre = JOptionPane.showInputDialog("insertar el nombre de la catalogo");
        
        em= EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        
        Query query= em.createNamedQuery("Catalogo.findByNombre");
        query.setParameter("nombre", nombre);
        
        Catalogo Ca= (Catalogo)query.getSingleResult();
        
        
        List<Catalogo> lis= query.getResultList();
        for (Catalogo li : lis) {
            System.out.println(Ca.toString());
        }
        
       EntityManagerHelper.commit();
       EntityManagerHelper.closeEntityManager();
       EntityManagerHelper.closeEntityManagerFactory();
    
       
       
       
        
    }
     @Test
    public void buscarPorDescripcion(){
        String descripcion = JOptionPane.showInputDialog("insertar la descripcion del catalogo");
        
        em= EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        
        Query query= em.createNamedQuery("Catalogo.findByDescripcion");
        query.setParameter("descripcion", descripcion);
        
        Catalogo Ca= (Catalogo)query.getSingleResult();
        
        
        List<Catalogo> lis= query.getResultList();
        for (Catalogo li : lis) {
            System.out.println(Ca.toString());
        }
        
       EntityManagerHelper.commit();
       EntityManagerHelper.closeEntityManager();
       EntityManagerHelper.closeEntityManagerFactory();
    
       
       
       
        
    }
    
    
}

