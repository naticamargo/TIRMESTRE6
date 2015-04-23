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

public class Usuario implements Serializable
{
	/** 
	 * This attribute maps to the column ID_USUARIO in the usuario table.
	 */
	protected String idUsuario;

	/** 
	 * This attribute represents whether the attribute idUsuario has been modified since being read from the database.
	 */
	protected boolean idUsuarioModified = false;

	/** 
	 * This attribute maps to the column CONTRASENA in the usuario table.
	 */
	protected String contrasena;

	/** 
	 * This attribute represents whether the attribute contrasena has been modified since being read from the database.
	 */
	protected boolean contrasenaModified = false;

	/** 
	 * This attribute maps to the column ROL in the usuario table.
	 */
	protected String rol;

	/** 
	 * This attribute represents whether the attribute rol has been modified since being read from the database.
	 */
	protected boolean rolModified = false;

	/** 
	 * This attribute maps to the column ACTIVO in the usuario table.
	 */
	protected short activo;

	/** 
	 * This attribute represents whether the primitive attribute activo is null.
	 */
	protected boolean activoNull = true;

	/** 
	 * This attribute represents whether the attribute activo has been modified since being read from the database.
	 */
	protected boolean activoModified = false;

	/**
	 * Method 'Usuario'
	 * 
	 */
	public Usuario()
	{
	}

	/**
	 * Method 'getIdUsuario'
	 * 
	 * @return String
	 */
	public String getIdUsuario()
	{
		return idUsuario;
	}

	/**
	 * Method 'setIdUsuario'
	 * 
	 * @param idUsuario
	 */
	public void setIdUsuario(String idUsuario)
	{
		this.idUsuario = idUsuario;
		this.idUsuarioModified = true;
	}

	/** 
	 * Sets the value of idUsuarioModified
	 */
	public void setIdUsuarioModified(boolean idUsuarioModified)
	{
		this.idUsuarioModified = idUsuarioModified;
	}

	/** 
	 * Gets the value of idUsuarioModified
	 */
	public boolean isIdUsuarioModified()
	{
		return idUsuarioModified;
	}

	/**
	 * Method 'getContrasena'
	 * 
	 * @return String
	 */
	public String getContrasena()
	{
		return contrasena;
	}

	/**
	 * Method 'setContrasena'
	 * 
	 * @param contrasena
	 */
	public void setContrasena(String contrasena)
	{
		this.contrasena = contrasena;
		this.contrasenaModified = true;
	}

	/** 
	 * Sets the value of contrasenaModified
	 */
	public void setContrasenaModified(boolean contrasenaModified)
	{
		this.contrasenaModified = contrasenaModified;
	}

	/** 
	 * Gets the value of contrasenaModified
	 */
	public boolean isContrasenaModified()
	{
		return contrasenaModified;
	}

	/**
	 * Method 'getRol'
	 * 
	 * @return String
	 */
	public String getRol()
	{
		return rol;
	}

	/**
	 * Method 'setRol'
	 * 
	 * @param rol
	 */
	public void setRol(String rol)
	{
		this.rol = rol;
		this.rolModified = true;
	}

	/** 
	 * Sets the value of rolModified
	 */
	public void setRolModified(boolean rolModified)
	{
		this.rolModified = rolModified;
	}

	/** 
	 * Gets the value of rolModified
	 */
	public boolean isRolModified()
	{
		return rolModified;
	}

	/**
	 * Method 'getActivo'
	 * 
	 * @return short
	 */
	public short getActivo()
	{
		return activo;
	}

	/**
	 * Method 'setActivo'
	 * 
	 * @param activo
	 */
	public void setActivo(short activo)
	{
		this.activo = activo;
		this.activoNull = false;
		this.activoModified = true;
	}

	/**
	 * Method 'setActivoNull'
	 * 
	 * @param value
	 */
	public void setActivoNull(boolean value)
	{
		this.activoNull = value;
		this.activoModified = true;
	}

	/**
	 * Method 'isActivoNull'
	 * 
	 * @return boolean
	 */
	public boolean isActivoNull()
	{
		return activoNull;
	}

	/** 
	 * Sets the value of activoModified
	 */
	public void setActivoModified(boolean activoModified)
	{
		this.activoModified = activoModified;
	}

	/** 
	 * Gets the value of activoModified
	 */
	public boolean isActivoModified()
	{
		return activoModified;
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
		
		if (!(_other instanceof Usuario)) {
			return false;
		}
		
		final Usuario _cast = (Usuario) _other;
		if (idUsuario == null ? _cast.idUsuario != idUsuario : !idUsuario.equals( _cast.idUsuario )) {
			return false;
		}
		
		if (idUsuarioModified != _cast.idUsuarioModified) {
			return false;
		}
		
		if (contrasena == null ? _cast.contrasena != contrasena : !contrasena.equals( _cast.contrasena )) {
			return false;
		}
		
		if (contrasenaModified != _cast.contrasenaModified) {
			return false;
		}
		
		if (rol == null ? _cast.rol != rol : !rol.equals( _cast.rol )) {
			return false;
		}
		
		if (rolModified != _cast.rolModified) {
			return false;
		}
		
		if (activo != _cast.activo) {
			return false;
		}
		
		if (activoNull != _cast.activoNull) {
			return false;
		}
		
		if (activoModified != _cast.activoModified) {
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
		if (idUsuario != null) {
			_hashCode = 29 * _hashCode + idUsuario.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (idUsuarioModified ? 1 : 0);
		if (contrasena != null) {
			_hashCode = 29 * _hashCode + contrasena.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (contrasenaModified ? 1 : 0);
		if (rol != null) {
			_hashCode = 29 * _hashCode + rol.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (rolModified ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) activo;
		_hashCode = 29 * _hashCode + (activoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (activoModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return UsuarioPk
	 */
	public UsuarioPk createPk()
	{
		return new UsuarioPk(idUsuario);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "edu.co.sena.dto.Usuario: " );
		ret.append( "idUsuario=" + idUsuario );
		ret.append( ", contrasena=" + contrasena );
		ret.append( ", rol=" + rol );
		ret.append( ", activo=" + activo );
		return ret.toString();
	}

}
