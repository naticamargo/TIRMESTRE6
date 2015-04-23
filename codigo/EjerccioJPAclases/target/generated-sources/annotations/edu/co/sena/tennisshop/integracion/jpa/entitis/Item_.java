package edu.co.sena.tennisshop.integracion.jpa.entitis;

import edu.co.sena.tennisshop.integracion.jpa.entitis.ItemPK;
import edu.co.sena.tennisshop.integracion.jpa.entitis.Pedido;
import edu.co.sena.tennisshop.integracion.jpa.entitis.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-04-07T15:03:45")
@StaticMetamodel(Item.class)
public class Item_ { 

    public static volatile SingularAttribute<Item, ItemPK> itemPK;
    public static volatile SingularAttribute<Item, Float> valorTotal;
    public static volatile SingularAttribute<Item, Pedido> pedido;
    public static volatile SingularAttribute<Item, Integer> cantidad;
    public static volatile SingularAttribute<Item, Producto> producto;
    public static volatile SingularAttribute<Item, Float> valorUnitario;

}