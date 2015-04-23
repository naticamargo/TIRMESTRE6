/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.dto;

import edu.co.sena.dao.*;
import edu.co.sena.factory.*;
import edu.co.sena.exceptions.*;
import java.io.Serializable;
import java.util.*;

public class Catalogo implements Serializable
{
	/** 
	 * This attribute maps to the column ID_CATOLOGO in the catalogo table.
	 */
	protected int idCatologo;

	/** 
	 * This attribute represents whether the attribute idCatologo has been modified since being read from the database.
	 */
	protected boolean idCatologoModified = false;

	/** 
	 * This attribute maps to the column NOMBRE in the catalogo table.
	 */
	protected String nombre;

	/** 
	 * This attribute represents whether the attribute nombre has been modified since being read from the database.
	 */
	protected boolean nombreModified = false;

	/** 
	 * This attribute maps to the column DESCRIPCION in the catalogo table.
	 */
	protected String descripcion;

	/** 
	 * This attribute represents whether the attribute descripcion has been modified since being read from the database.
	 */
	protected boolean descripcionModified = false;

	/**
	 * Method 'Catalogo'
	 * 
	 */
	public Catalogo()
	{
	}

	/**
	 * Method 'getIdCatologo'
	 * 
	 * @return int
	 */
	public int getIdCatologo()
	{
		return idCatologo;
	}

	/**
	 * Method 'setIdCatologo'
	 * 
	 * @param idCatologo
	 */
	public void setIdCatologo(int idCatologo)
	{
		this.idCatologo = idCatologo;
		this.idCatologoModified = true;
	}

	/** 
	 * Sets the value of idCatologoModified
	 */
	public void setIdCatologoModified(boolean idCatologoModified)
	{
		this.idCatologoModified = idCatologoModified;
	}

	/** 
	 * Gets the value of idCatologoModified
	 */
	public boolean isIdCatologoModified()
	{
		return idCatologoModified;
	}

	/**
	 * Method 'getNombre'
	 * 
	 * @return String
	 */
	public String getNombre()
	{
		return nombre;
	}

	/**
	 * Method 'setNombre'
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
		this.nombreModified = true;
	}

	/** 
	 * Sets the value of nombreModified
	 */
	public void setNombreModified(boolean nombreModified)
	{
		this.nombreModified = nombreModified;
	}

	/** 
	 * Gets the value of nombreModified
	 */
	public boolean isNombreModified()
	{
		return nombreModified;
	}

	/**
	 * Method 'getDescripcion'
	 * 
	 * @return String
	 */
	public String getDescripcion()
	{
		return descripcion;
	}

	/**
	 * Method 'setDescripcion'
	 * 
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion)
	{
		this.descripcion = descripcion;
		this.descripcionModified = true;
	}

	/** 
	 * Sets the value of descripcionModified
	 */
	public void setDescripcionModified(boolean descripcionModified)
	{
		this.descripcionModified = descripcionModified;
	}

	/** 
	 * Gets the value of descripcionModified
	 */
	public boolean isDescripcionModified()
	{
		return descripcionModified;
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
		
		if (!(_other instanceof Catalogo)) {
			return false;
		}
		
		final Catalogo _cast = (Catalogo) _other;
		if (idCatologo != _cast.idCatologo) {
			return false;
		}
		
		if (idCatologoModified != _cast.idCatologoModified) {
			return false;
		}
		
		if (nombre == null ? _cast.nombre != nombre : !nombre.equals( _cast.nombre )) {
			return false;
		}
		
		if (nombreModified != _cast.nombreModified) {
			return false;
		}
		
		if (descripcion == null ? _cast.descripcion != descripcion : !descripcion.equals( _cast.descripcion )) {
			return false;
		}
		
		if (descripcionModified != _cast.descripcionModified) {
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
		_hashCode = 29 * _hashCode + idCatologo;
		_hashCode = 29 * _hashCode + (idCatologoModified ? 1 : 0);
		if (nombre != null) {
			_hashCode = 29 * _hashCode + nombre.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (nombreModified ? 1 : 0);
		if (descripcion != null) {
			_hashCode = 29 * _hashCode + descripcion.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (descripcionModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return CatalogoPk
	 */
	public CatalogoPk createPk()
	{
		return new CatalogoPk(idCatologo);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "edu.co.sena.dto.Catalogo: " );
		ret.append( "idCatologo=" + idCatologo );
		ret.append( ", nombre=" + nombre );
		ret.append( ", descripcion=" + descripcion );
		return ret.toString();
	}

}
