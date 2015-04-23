/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import edu.co.sena.jpa.util.EntityManagerHelper;
import edu.co.sena.tennisshop.integracion.jpa.entitis.Cuenta;
import edu.co.sena.tennisshop.integracion.jpa.entitis.Departamento;
import edu.co.sena.tennisshop.integracion.jpa.entitis.Inventario;
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
public class DepartamentoJPATest {
    Departamento departamento;
    EntityManagerFactory emf;
    EntityManager em;
    public DepartamentoJPATest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        departamento = new Departamento();
        departamento.setIdDEPARTAMENTO(1);
        departamento.setNombreDeparamento("Antioquia");
        
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
    public void insertarCuenta(){
    em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        em.persist(departamento);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();
}
   
    @Test
     public void actualizarDepartamento() {
        String catLeida = JOptionPane.showInputDialog("Digite el departamento a Actualizar");
        String catLeidaValor = JOptionPane.showInputDialog("Digite el valor");
        departamento.setIdDEPARTAMENTO(Integer.parseInt(catLeida));
        departamento.setNombreDeparamento(catLeidaValor);
        
        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        em.merge(departamento);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();
     }
 @Test
    public void buscarUnDepartamento() {

        String idDepartamento = JOptionPane.showInputDialog("Inserte El Id A Buscar");
        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Departamento dep = em.find(Departamento.class, idDepartamento);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

        System.out.println(dep.toString());
    }
    @Test
    public void borrarUnDepartemento() {
        String idDepartamento = JOptionPane.showInputDialog("Escriba el id del departamento a eliminar");
        try {
            em = EntityManagerHelper.getEntityManager();
            EntityManagerHelper.beginTransaction();

            em.remove(em.find(Departamento.class, idDepartamento));
            EntityManagerHelper.commit();
            EntityManagerHelper.closeEntityManager();
            EntityManagerHelper.closeEntityManagerFactory();
        } catch (Exception e) {
            System.out.println("No se pudo eliminar el departamento" + e.getMessage());
        }
        
}
     @Test
    public void buscarDepartamentos() {
        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        Query q = em.createNamedQuery("Departamento.findAll");
        List<Departamento> lis = q.getResultList();
        for (Departamento departamentoT : lis) {
            
            System.out.println("Iddepartamento: "+departamentoT.getIdDEPARTAMENTO()+ " / Nombre del Departamento: "+ departamentoT.getNombreDeparamento());
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
    @Test
    public void buscarPorNombre() {
        String nombreDeparamento = JOptionPane.showInputDialog("Insertar el nombre del departamento");

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Query query = em.createNamedQuery("Departamento.findByNombreDeparamento");
        query.setParameter("nombreDeparamento", nombreDeparamento);

        Departamento dep = (Departamento) query.getSingleResult();

        List<Departamento> lista = query.getResultList();
        for (Departamento departamentoT : lista) {
            System.out.println(dep.toString());
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
    
}


    


