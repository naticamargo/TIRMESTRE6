package edu.co.sena.tennisshop.integracion.jpa.entitis;

import edu.co.sena.tennisshop.integracion.jpa.entitis.Cuenta;
import edu.co.sena.tennisshop.integracion.jpa.entitis.Pago;
import edu.co.sena.tennisshop.integracion.jpa.entitis.Pedido;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-04-07T15:03:45")
@StaticMetamodel(Factura.class)
public class Factura_ { 

    public static volatile SingularAttribute<Factura, Integer> idFactura;
    public static volatile SingularAttribute<Factura, Date> fechaFactura;
    public static volatile SingularAttribute<Factura, Cuenta> cuenta;
    public static volatile SingularAttribute<Factura, Pedido> pedido;
    public static volatile SingularAttribute<Factura, String> formaPago;
    public static volatile SingularAttribute<Factura, Pago> pago;

}