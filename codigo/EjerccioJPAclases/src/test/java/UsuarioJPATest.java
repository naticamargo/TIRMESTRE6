/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import edu.co.sena.jpa.util.EntityManagerHelper;
import edu.co.sena.entity.jpa.Categoria;
import edu.co.sena.entity.jpa.Cuenta;
import edu.co.sena.entity.jpa.CuentaPK;
import edu.co.sena.entity.jpa.Producto;
import edu.co.sena.entity.jpa.Usuario;
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
public class UsuarioJPATest {
    Usuario usuario;
    EntityManagerFactory emf;
    EntityManager em;
    public UsuarioJPATest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        usuario= new Usuario();
        usuario.setIdUsuario("5678");
        usuario.setContrasena("689");
        usuario.setActivo(Boolean.TRUE);
        usuario.setRol("cliente");
        usuario.setCorreoElectronico("PEPITO@HOTMAIL.COM");
                
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
    public void insertarUsuario(){
        
        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        em.persist(usuario);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        
    
    }
    @Test
    public void actualizarCuenta() {

        String idUsu = JOptionPane.showInputDialog("Escriba el id del usuario");
        String contraseña= JOptionPane.showInputDialog("Escriba la contraseña del usuario");
        

        usuario.setIdUsuario(idUsu);
        usuario.setContrasena(contraseña);
        
        

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        em.merge(usuario);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
    public void buscarUnUsuario() {

        String idUsuario = JOptionPane.showInputDialog("Inserte El id del usuario ");
    
        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Usuario usu = em.find(Usuario.class, idUsuario);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

        System.out.println(usu.toString());
    }
    @Test
    public void borrarUnUsuario() {
        String idUsuario = JOptionPane.showInputDialog("Escriba el id del usuario");
        try {
            em = EntityManagerHelper.getEntityManager();
            EntityManagerHelper.beginTransaction();

            em.remove(em.find(Usuario.class, idUsuario));
            EntityManagerHelper.commit();
            EntityManagerHelper.closeEntityManager();
            EntityManagerHelper.closeEntityManagerFactory();
        } catch (Exception e) {
            System.out.println("No se pudo eliminar el usuario" + e.getMessage());
        }
    }
      @Test
    public void buscarUsuarios() {

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        Query q = em.createNamedQuery("Usuario.findAll");
        List<Usuario> lis = q.getResultList();
        for (Usuario usuarioT : lis) {
            System.out.println(usuarioT.toString() );
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
     @Test
    public void buscarContraseña() {
        String contrasena = JOptionPane.showInputDialog("Insertar la contrasena del usuario");

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Query query = em.createNamedQuery("Usuario.findByContrasena");
        query.setParameter("contrasena", contrasena);

       Usuario usu = (Usuario) query.getSingleResult();

        List<Usuario> lista = query.getResultList();
        for (Usuario usuarioT : lista) {
            System.out.println(usu.toString());
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
     @Test
    public void buscarCorreoElectronico() {
        String correoElectronico = JOptionPane.showInputDialog("Insertar la correo del usuario");

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Query query = em.createNamedQuery("Usuario.findByCorreoElectronico");
        query.setParameter("correoElectronico", correoElectronico);

       Usuario usu = (Usuario) query.getSingleResult();

        List<Usuario> lista = query.getResultList();
        for (Usuario usuarioT : lista) {
            System.out.println(usu.toString());
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
   
    @Test
    public void buscarPorActivo() {
        String activo = JOptionPane.showInputDialog("Insertar la  activo del usuario");

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Query query = em.createNamedQuery("Usuario.findByActivo");
        query.setParameter("activo", Boolean.valueOf(activo));

       Usuario usu = (Usuario) query.getSingleResult();

        List<Usuario> lista = query.getResultList();
        for (Usuario usuarioT : lista) {
            System.out.println(usu.toString());
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
     @Test
    public void buscarPorRol() {
        String rol = JOptionPane.showInputDialog("Insertar el rol del usuario");

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Query query = em.createNamedQuery("Usuario.findByRol");
        query.setParameter("rol", rol);

       Usuario usu = (Usuario) query.getSingleResult();

        List<Usuario> lista = query.getResultList();
        for (Usuario usuarioT : lista) {
            System.out.println(usu.toString());
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }
}
    
        




