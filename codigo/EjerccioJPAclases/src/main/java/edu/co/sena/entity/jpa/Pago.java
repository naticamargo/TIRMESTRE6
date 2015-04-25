/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.entity.jpa;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ADMIN
 */
@Entity
@Table(name = "pago")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pago.findAll", query = "SELECT p FROM Pago p"),
    @NamedQuery(name = "Pago.findByTipoPago", query = "SELECT p FROM Pago p WHERE p.tipoPago = :tipoPago"),
    @NamedQuery(name = "Pago.findByNumeroCuenta", query = "SELECT p FROM Pago p WHERE p.numeroCuenta = :numeroCuenta"),
    @NamedQuery(name = "Pago.findByTargeta", query = "SELECT p FROM Pago p WHERE p.targeta = :targeta"),
    @NamedQuery(name = "Pago.findByFacturaIdFactura", query = "SELECT p FROM Pago p WHERE p.facturaIdFactura = :facturaIdFactura")})
public class Pago implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "TIPO_PAGO")
    private String tipoPago;
    @Column(name = "NUMERO_CUENTA")
    private String numeroCuenta;
    @Column(name = "TARGETA")
    private String targeta;
    @Id
    @Basic(optional = false)
    @Column(name = "FACTURA_ID_FACTURA")
    private Integer facturaIdFactura;
    @JoinColumn(name = "FACTURA_ID_FACTURA", referencedColumnName = "ID_FACTURA", insertable = false, updatable = false)
    @OneToOne(optional = false, fetch = FetchType.EAGER)
    private Factura factura;

    public Pago() {
    }

    public Pago(Integer facturaIdFactura) {
        this.facturaIdFactura = facturaIdFactura;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTargeta() {
        return targeta;
    }

    public void setTargeta(String targeta) {
        this.targeta = targeta;
    }

    public Integer getFacturaIdFactura() {
        return facturaIdFactura;
    }

    public void setFacturaIdFactura(Integer facturaIdFactura) {
        this.facturaIdFactura = facturaIdFactura;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (facturaIdFactura != null ? facturaIdFactura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pago)) {
            return false;
        }
        Pago other = (Pago) object;
        if ((this.facturaIdFactura == null && other.facturaIdFactura != null) || (this.facturaIdFactura != null && !this.facturaIdFactura.equals(other.facturaIdFactura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.co.sena.entity.jpa.Pago[ facturaIdFactura=" + facturaIdFactura + " ]";
    }
    
}
