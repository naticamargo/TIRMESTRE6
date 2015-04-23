package edu.co.sena.tennisshop.integracion.jpa.entitis;

import edu.co.sena.tennisshop.integracion.jpa.entitis.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-04-07T15:03:44")
@StaticMetamodel(Catalogo.class)
public class Catalogo_ { 

    public static volatile SingularAttribute<Catalogo, String> descripcion;
    public static volatile SingularAttribute<Catalogo, Integer> idCatologo;
    public static volatile CollectionAttribute<Catalogo, Producto> productoCollection;
    public static volatile SingularAttribute<Catalogo, String> nombre;

}