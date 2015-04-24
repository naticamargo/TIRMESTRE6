/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the carrito_compras table.
 */
public class CarritoComprasPk implements Serializable
{
	protected String idCARRITO;

	/** 
	 * Sets the value of idCARRITO
	 */
	public void setIdCARRITO(String idCARRITO)
	{
		this.idCARRITO = idCARRITO;
	}

	/** 
	 * Gets the value of idCARRITO
	 */
	public String getIdCARRITO()
	{
		return idCARRITO;
	}

	/**
	 * Method 'CarritoComprasPk'
	 * 
	 */
	public CarritoComprasPk()
	{
	}

	/**
	 * Method 'CarritoComprasPk'
	 * 
	 * @param idCARRITO
	 */
	public CarritoComprasPk(final String idCARRITO)
	{
		this.idCARRITO = idCARRITO;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof CarritoComprasPk)) {
			return false;
		}
		
		final CarritoComprasPk _cast = (CarritoComprasPk) _other;
		if (idCARRITO == null ? _cast.idCARRITO != idCARRITO : !idCARRITO.equals( _cast.idCARRITO )) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		if (idCARRITO != null) {
			_hashCode = 29 * _hashCode + idCARRITO.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "edu.co.sena.dto.CarritoComprasPk: " );
		ret.append( "idCARRITO=" + idCARRITO );
		return ret.toString();
	}

}