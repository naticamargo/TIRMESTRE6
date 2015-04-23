package edu.co.sena.tennisshop.integracion.jpa.entitis;

import edu.co.sena.tennisshop.integracion.jpa.entitis.Cuenta;
import edu.co.sena.tennisshop.integracion.jpa.entitis.Municipio;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-04-07T15:03:45")
@StaticMetamodel(Domicilio.class)
public class Domicilio_ { 

    public static volatile SingularAttribute<Domicilio, Integer> idDOMICILIO;
    public static volatile SingularAttribute<Domicilio, String> barrio;
    public static volatile SingularAttribute<Domicilio, String> dirrecion;
    public static volatile SingularAttribute<Domicilio, Cuenta> cuenta;
    public static volatile SingularAttribute<Domicilio, String> localidad;
    public static volatile SingularAttribute<Domicilio, String> telefono;
    public static volatile SingularAttribute<Domicilio, Municipio> mUNICIPIOidMUNICIPIO;

}