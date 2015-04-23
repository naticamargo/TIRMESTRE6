package edu.co.sena.tennisshop.integracion.jpa.entitis;

import edu.co.sena.tennisshop.integracion.jpa.entitis.ItemCarrito;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-04-07T15:03:45")
@StaticMetamodel(CarritoCompras.class)
public class CarritoCompras_ { 

    public static volatile SingularAttribute<CarritoCompras, Double> total;
    public static volatile SingularAttribute<CarritoCompras, String> idCARRITO;
    public static volatile SingularAttribute<CarritoCompras, Double> subtotal;
    public static volatile SingularAttribute<CarritoCompras, Double> impuestos;
    public static volatile CollectionAttribute<CarritoCompras, ItemCarrito> itemCarritoCollection;

}