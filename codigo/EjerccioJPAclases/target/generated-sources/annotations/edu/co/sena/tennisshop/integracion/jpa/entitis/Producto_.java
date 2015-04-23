package edu.co.sena.tennisshop.integracion.jpa.entitis;

import edu.co.sena.tennisshop.integracion.jpa.entitis.Catalogo;
import edu.co.sena.tennisshop.integracion.jpa.entitis.Categoria;
import edu.co.sena.tennisshop.integracion.jpa.entitis.Inventario;
import edu.co.sena.tennisshop.integracion.jpa.entitis.Item;
import edu.co.sena.tennisshop.integracion.jpa.entitis.ItemCarrito;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-04-07T15:03:45")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, String> descripcion;
    public static volatile SingularAttribute<Producto, Float> precio;
    public static volatile SingularAttribute<Producto, String> nombreProdcuto;
    public static volatile SingularAttribute<Producto, Categoria> categoriaIdCategoria;
    public static volatile CollectionAttribute<Producto, Item> itemCollection;
    public static volatile SingularAttribute<Producto, Catalogo> catalogoIdCatologo;
    public static volatile SingularAttribute<Producto, Boolean> descuento;
    public static volatile SingularAttribute<Producto, byte[]> imagen;
    public static volatile CollectionAttribute<Producto, ItemCarrito> itemCarritoCollection;
    public static volatile SingularAttribute<Producto, String> idProducto;
    public static volatile SingularAttribute<Producto, Integer> cantidad;
    public static volatile CollectionAttribute<Producto, Inventario> inventarioCollection;

}