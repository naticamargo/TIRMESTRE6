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
 * This class represents the primary key of the municipio table.
 */
public class MunicipioPk implements Serializable
{
	protected int idMUNICIPIO;

	/** 
	 * This attribute represents whether the primitive attribute idMUNICIPIO is null.
	 */
	protected boolean idMUNICIPIONull;

	/** 
	 * Sets the value of idMUNICIPIO
	 */
	public void setIdMUNICIPIO(int idMUNICIPIO)
	{
		this.idMUNICIPIO = idMUNICIPIO;
	}

	/** 
	 * Gets the value of idMUNICIPIO
	 */
	public int getIdMUNICIPIO()
	{
		return idMUNICIPIO;
	}

	/**
	 * Method 'MunicipioPk'
	 * 
	 */
	public MunicipioPk()
	{
	}

	/**
	 * Method 'MunicipioPk'
	 * 
	 * @param idMUNICIPIO
	 */
	public MunicipioPk(final int idMUNICIPIO)
	{
		this.idMUNICIPIO = idMUNICIPIO;
	}

	/** 
	 * Sets the value of idMUNICIPIONull
	 */
	public void setIdMUNICIPIONull(boolean idMUNICIPIONull)
	{
		this.idMUNICIPIONull = idMUNICIPIONull;
	}

	/** 
	 * Gets the value of idMUNICIPIONull
	 */
	public boolean isIdMUNICIPIONull()
	{
		return idMUNICIPIONull;
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
		
		if (!(_other instanceof MunicipioPk)) {
			return false;
		}
		
		final MunicipioPk _cast = (MunicipioPk) _other;
		if (idMUNICIPIO != _cast.idMUNICIPIO) {
			return false;
		}
		
		if (idMUNICIPIONull != _cast.idMUNICIPIONull) {
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
		_hashCode = 29 * _hashCode + idMUNICIPIO;
		_hashCode = 29 * _hashCode + (idMUNICIPIONull ? 1 : 0);
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
		ret.append( "edu.co.sena.dto.MunicipioPk: " );
		ret.append( "idMUNICIPIO=" + idMUNICIPIO );
		return ret.toString();
	}

}
