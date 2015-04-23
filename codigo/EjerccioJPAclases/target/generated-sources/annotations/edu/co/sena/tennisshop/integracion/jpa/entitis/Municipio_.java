package edu.co.sena.tennisshop.integracion.jpa.entitis;

import edu.co.sena.tennisshop.integracion.jpa.entitis.Departamento;
import edu.co.sena.tennisshop.integracion.jpa.entitis.Domicilio;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-04-07T15:03:45")
@StaticMetamodel(Municipio.class)
public class Municipio_ { 

    public static volatile SingularAttribute<Municipio, Departamento> dEPARTAMENTOidDEPARTAMENTO;
    public static volatile SingularAttribute<Municipio, Integer> idMUNICIPIO;
    public static volatile SingularAttribute<Municipio, String> nombreMunicipio;
    public static volatile CollectionAttribute<Municipio, Domicilio> domicilioCollection;

}