package edu.co.sena.tennisshop.integracion.jpa.entitis;

import edu.co.sena.tennisshop.integracion.jpa.entitis.InventarioPK;
import edu.co.sena.tennisshop.integracion.jpa.entitis.Producto;
import edu.co.sena.tennisshop.integracion.jpa.entitis.Proveedor;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-04-07T15:03:44")
@StaticMetamodel(Inventario.class)
public class Inventario_ { 

    public static volatile SingularAttribute<Inventario, InventarioPK> inventarioPK;
    public static volatile SingularAttribute<Inventario, Proveedor> proveedor;
    public static volatile SingularAttribute<Inventario, Integer> cantidad;
    public static volatile SingularAttribute<Inventario, Producto> producto;

}