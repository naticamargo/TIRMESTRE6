package edu.co.sena.tennisshop.integracion.jpa.entitis;

import edu.co.sena.tennisshop.integracion.jpa.entitis.CarritoCompras;
import edu.co.sena.tennisshop.integracion.jpa.entitis.ItemCarritoPK;
import edu.co.sena.tennisshop.integracion.jpa.entitis.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-04-07T15:03:44")
@StaticMetamodel(ItemCarrito.class)
public class ItemCarrito_ { 

    public static volatile SingularAttribute<ItemCarrito, Float> valorTotal;
    public static volatile SingularAttribute<ItemCarrito, ItemCarritoPK> itemCarritoPK;
    public static volatile SingularAttribute<ItemCarrito, Integer> cantidad;
    public static volatile SingularAttribute<ItemCarrito, Producto> producto;
    public static volatile SingularAttribute<ItemCarrito, CarritoCompras> carritoCompras;
    public static volatile SingularAttribute<ItemCarrito, Float> valorUnitario;

}