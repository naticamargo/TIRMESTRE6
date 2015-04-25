/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.entity.jpa;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ADMIN
 */
@Entity
@Table(name = "domicilio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Domicilio.findAll", query = "SELECT d FROM Domicilio d"),
    @NamedQuery(name = "Domicilio.findByIdDOMICILIO", query = "SELECT d FROM Domicilio d WHERE d.domicilioPK.idDOMICILIO = :idDOMICILIO"),
    @NamedQuery(name = "Domicilio.findByDirrecion", query = "SELECT d FROM Domicilio d WHERE d.dirrecion = :dirrecion"),
    @NamedQuery(name = "Domicilio.findByTelefono", query = "SELECT d FROM Domicilio d WHERE d.telefono = :telefono"),
    @NamedQuery(name = "Domicilio.findByLocalidad", query = "SELECT d FROM Domicilio d WHERE d.localidad = :localidad"),
    @NamedQuery(name = "Domicilio.findByBarrio", query = "SELECT d FROM Domicilio d WHERE d.barrio = :barrio"),
    @NamedQuery(name = "Domicilio.findByCuentaTipoDocumento", query = "SELECT d FROM Domicilio d WHERE d.domicilioPK.cuentaTipoDocumento = :cuentaTipoDocumento"),
    @NamedQuery(name = "Domicilio.findByCuentaNumeroDocumento", query = "SELECT d FROM Domicilio d WHERE d.domicilioPK.cuentaNumeroDocumento = :cuentaNumeroDocumento")})
public class Domicilio implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DomicilioPK domicilioPK;
    @Basic(optional = false)
    @Column(name = "DIRRECION")
    private String dirrecion;
    @Basic(optional = false)
    @Column(name = "TELEFONO")
    private String telefono;
    @Column(name = "LOCALIDAD")
    private String localidad;
    @Column(name = "BARRIO")
    private String barrio;
    @JoinColumns({
        @JoinColumn(name = "CUENTA_TIPO_DOCUMENTO", referencedColumnName = "TIPO_DOCUMENTO", insertable = false, updatable = false),
        @JoinColumn(name = "CUENTA_NUMERO_DOCUMENTO", referencedColumnName = "NUMERO_DOCUMENTO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Cuenta cuenta;
    @JoinColumn(name = "MUNICIPIO_idMUNICIPIO", referencedColumnName = "idMUNICIPIO")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Municipio mUNICIPIOidMUNICIPIO;

    public Domicilio() {
    }

    public Domicilio(DomicilioPK domicilioPK) {
        this.domicilioPK = domicilioPK;
    }

    public Domicilio(DomicilioPK domicilioPK, String dirrecion, String telefono) {
        this.domicilioPK = domicilioPK;
        this.dirrecion = dirrecion;
        this.telefono = telefono;
    }

    public Domicilio(int idDOMICILIO, String cuentaTipoDocumento, String cuentaNumeroDocumento) {
        this.domicilioPK = new DomicilioPK(idDOMICILIO, cuentaTipoDocumento, cuentaNumeroDocumento);
    }

    public DomicilioPK getDomicilioPK() {
        return domicilioPK;
    }

    public void setDomicilioPK(DomicilioPK domicilioPK) {
        this.domicilioPK = domicilioPK;
    }

    public String getDirrecion() {
        return dirrecion;
    }

    public void setDirrecion(String dirrecion) {
        this.dirrecion = dirrecion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public Municipio getMUNICIPIOidMUNICIPIO() {
        return mUNICIPIOidMUNICIPIO;
    }

    public void setMUNICIPIOidMUNICIPIO(Municipio mUNICIPIOidMUNICIPIO) {
        this.mUNICIPIOidMUNICIPIO = mUNICIPIOidMUNICIPIO;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (domicilioPK != null ? domicilioPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Domicilio)) {
            return false;
        }
        Domicilio other = (Domicilio) object;
        if ((this.domicilioPK == null && other.domicilioPK != null) || (this.domicilioPK != null && !this.domicilioPK.equals(other.domicilioPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.co.sena.entity.jpa.Domicilio[ domicilioPK=" + domicilioPK + " ]";
    }
    
}
