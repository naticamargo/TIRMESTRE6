package edu.co.sena.tennisshop.integracion.jpa.entitis;

import edu.co.sena.tennisshop.integracion.jpa.entitis.Inventario;
import edu.co.sena.tennisshop.integracion.jpa.entitis.ProveedorPK;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-04-07T15:03:44")
@StaticMetamodel(Proveedor.class)
public class Proveedor_ { 

    public static volatile SingularAttribute<Proveedor, String> nombreProvvedor;
    public static volatile SingularAttribute<Proveedor, ProveedorPK> proveedorPK;
    public static volatile SingularAttribute<Proveedor, String> correo;
    public static volatile SingularAttribute<Proveedor, String> telefono;
    public static volatile CollectionAttribute<Proveedor, Inventario> inventarioCollection;

}