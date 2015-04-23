package edu.co.sena.tennisshop.integracion.jpa.entitis;

import edu.co.sena.tennisshop.integracion.jpa.entitis.CuentaPK;
import edu.co.sena.tennisshop.integracion.jpa.entitis.Domicilio;
import edu.co.sena.tennisshop.integracion.jpa.entitis.Factura;
import edu.co.sena.tennisshop.integracion.jpa.entitis.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-04-07T15:03:45")
@StaticMetamodel(Cuenta.class)
public class Cuenta_ { 

    public static volatile SingularAttribute<Cuenta, Usuario> usuarioIdUsuario;
    public static volatile SingularAttribute<Cuenta, String> segundoNombre;
    public static volatile SingularAttribute<Cuenta, String> primerNombre;
    public static volatile SingularAttribute<Cuenta, String> primerApellido;
    public static volatile SingularAttribute<Cuenta, CuentaPK> cuentaPK;
    public static volatile SingularAttribute<Cuenta, String> segundoApellido;
    public static volatile SingularAttribute<Cuenta, String> contrasena;
    public static volatile SingularAttribute<Cuenta, String> usuario;
    public static volatile SingularAttribute<Cuenta, String> correoElectronico;
    public static volatile CollectionAttribute<Cuenta, Domicilio> domicilioCollection;
    public static volatile CollectionAttribute<Cuenta, Factura> facturaCollection;

}