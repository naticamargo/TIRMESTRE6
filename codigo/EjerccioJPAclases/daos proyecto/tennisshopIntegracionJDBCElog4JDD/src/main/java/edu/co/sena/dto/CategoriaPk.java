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
 * This class represents the primary key of the categoria table.
 */
public class CategoriaPk implements Serializable
{
	protected int idCategoria;

	/** 
	 * This attribute represents whether the primitive attribute idCategoria is null.
	 */
	protected boolean idCategoriaNull;

	/** 
	 * Sets the value of idCategoria
	 */
	public void setIdCategoria(int idCategoria)
	{
		this.idCategoria = idCategoria;
	}

	/** 
	 * Gets the value of idCategoria
	 */
	public int getIdCategoria()
	{
		return idCategoria;
	}

	/**
	 * Method 'CategoriaPk'
	 * 
	 */
	public CategoriaPk()
	{
	}

	/**
	 * Method 'CategoriaPk'
	 * 
	 * @param idCategoria
	 */
	public CategoriaPk(final int idCategoria)
	{
		this.idCategoria = idCategoria;
	}

	/** 
	 * Sets the value of idCategoriaNull
	 */
	public void setIdCategoriaNull(boolean idCategoriaNull)
	{
		this.idCategoriaNull = idCategoriaNull;
	}

	/** 
	 * Gets the value of idCategoriaNull
	 */
	public boolean isIdCategoriaNull()
	{
		return idCategoriaNull;
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
		
		if (!(_other instanceof CategoriaPk)) {
			return false;
		}
		
		final CategoriaPk _cast = (CategoriaPk) _other;
		if (idCategoria != _cast.idCategoria) {
			return false;
		}
		
		if (idCategoriaNull != _cast.idCategoriaNull) {
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
		_hashCode = 29 * _hashCode + idCategoria;
		_hashCode = 29 * _hashCode + (idCategoriaNull ? 1 : 0);
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
		ret.append( "edu.co.sena.dto.CategoriaPk: " );
		ret.append( "idCategoria=" + idCategoria );
		return ret.toString();
	}

}
