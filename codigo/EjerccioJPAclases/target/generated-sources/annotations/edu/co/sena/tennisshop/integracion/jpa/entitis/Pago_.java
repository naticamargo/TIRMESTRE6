package edu.co.sena.tennisshop.integracion.jpa.entitis;

import edu.co.sena.tennisshop.integracion.jpa.entitis.Factura;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-04-07T15:03:45")
@StaticMetamodel(Pago.class)
public class Pago_ { 

    public static volatile SingularAttribute<Pago, Factura> factura;
    public static volatile SingularAttribute<Pago, String> tipoPago;
    public static volatile SingularAttribute<Pago, String> numeroCuenta;
    public static volatile SingularAttribute<Pago, Integer> facturaIdFactura;
    public static volatile SingularAttribute<Pago, String> targeta;

}