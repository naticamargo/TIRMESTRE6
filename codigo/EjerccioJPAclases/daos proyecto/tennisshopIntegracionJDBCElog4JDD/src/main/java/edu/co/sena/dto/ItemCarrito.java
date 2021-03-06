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

public class ItemCarrito implements Serializable
{
	/** 
	 * This attribute maps to the column CANTIDAD in the item_carrito table.
	 */
	protected int cantidad;

	/** 
	 * This attribute represents whether the attribute cantidad has been modified since being read from the database.
	 */
	protected boolean cantidadModified = false;

	/** 
	 * This attribute maps to the column VALOR_UNITARIO in the item_carrito table.
	 */
	protected float valorUnitario;

	/** 
	 * This attribute represents whether the attribute valorUnitario has been modified since being read from the database.
	 */
	protected boolean valorUnitarioModified = false;

	/** 
	 * This attribute maps to the column VALOR_TOTAL in the item_carrito table.
	 */
	protected float valorTotal;

	/** 
	 * This attribute represents whether the attribute valorTotal has been modified since being read from the database.
	 */
	protected boolean valorTotalModified = false;

	/** 
	 * This attribute maps to the column PRODUCTO_ID_PRODUCTO in the item_carrito table.
	 */
	protected String productoIdProducto;

	/** 
	 * This attribute represents whether the attribute productoIdProducto has been modified since being read from the database.
	 */
	protected boolean productoIdProductoModified = false;

	/** 
	 * This attribute maps to the column CARRITO_COMPRAS_idCARRITO in the item_carrito table.
	 */
	protected String carritoComprasIdcarrito;

	/** 
	 * This attribute represents whether the attribute carritoComprasIdcarrito has been modified since being read from the database.
	 */
	protected boolean carritoComprasIdcarritoModified = false;

	/**
	 * Method 'ItemCarrito'
	 * 
	 */
	public ItemCarrito()
	{
	}

	/**
	 * Method 'getCantidad'
	 * 
	 * @return int
	 */
	public int getCantidad()
	{
		return cantidad;
	}

	/**
	 * Method 'setCantidad'
	 * 
	 * @param cantidad
	 */
	public void setCantidad(int cantidad)
	{
		this.cantidad = cantidad;
		this.cantidadModified = true;
	}

	/** 
	 * Sets the value of cantidadModified
	 */
	public void setCantidadModified(boolean cantidadModified)
	{
		this.cantidadModified = cantidadModified;
	}

	/** 
	 * Gets the value of cantidadModified
	 */
	public boolean isCantidadModified()
	{
		return cantidadModified;
	}

	/**
	 * Method 'getValorUnitario'
	 * 
	 * @return float
	 */
	public float getValorUnitario()
	{
		return valorUnitario;
	}

	/**
	 * Method 'setValorUnitario'
	 * 
	 * @param valorUnitario
	 */
	public void setValorUnitario(float valorUnitario)
	{
		this.valorUnitario = valorUnitario;
		this.valorUnitarioModified = true;
	}

	/** 
	 * Sets the value of valorUnitarioModified
	 */
	public void setValorUnitarioModified(boolean valorUnitarioModified)
	{
		this.valorUnitarioModified = valorUnitarioModified;
	}

	/** 
	 * Gets the value of valorUnitarioModified
	 */
	public boolean isValorUnitarioModified()
	{
		return valorUnitarioModified;
	}

	/**
	 * Method 'getValorTotal'
	 * 
	 * @return float
	 */
	public float getValorTotal()
	{
		return valorTotal;
	}

	/**
	 * Method 'setValorTotal'
	 * 
	 * @param valorTotal
	 */
	public void setValorTotal(float valorTotal)
	{
		this.valorTotal = valorTotal;
		this.valorTotalModified = true;
	}

	/** 
	 * Sets the value of valorTotalModified
	 */
	public void setValorTotalModified(boolean valorTotalModified)
	{
		this.valorTotalModified = valorTotalModified;
	}

	/** 
	 * Gets the value of valorTotalModified
	 */
	public boolean isValorTotalModified()
	{
		return valorTotalModified;
	}

	/**
	 * Method 'getProductoIdProducto'
	 * 
	 * @return String
	 */
	public String getProductoIdProducto()
	{
		return productoIdProducto;
	}

	/**
	 * Method 'setProductoIdProducto'
	 * 
	 * @param productoIdProducto
	 */
	public void setProductoIdProducto(String productoIdProducto)
	{
		this.productoIdProducto = productoIdProducto;
		this.productoIdProductoModified = true;
	}

	/** 
	 * Sets the value of productoIdProductoModified
	 */
	public void setProductoIdProductoModified(boolean productoIdProductoModified)
	{
		this.productoIdProductoModified = productoIdProductoModified;
	}

	/** 
	 * Gets the value of productoIdProductoModified
	 */
	public boolean isProductoIdProductoModified()
	{
		return productoIdProductoModified;
	}

	/**
	 * Method 'getCarritoComprasIdcarrito'
	 * 
	 * @return String
	 */
	public String getCarritoComprasIdcarrito()
	{
		return carritoComprasIdcarrito;
	}

	/**
	 * Method 'setCarritoComprasIdcarrito'
	 * 
	 * @param carritoComprasIdcarrito
	 */
	public void setCarritoComprasIdcarrito(String carritoComprasIdcarrito)
	{
		this.carritoComprasIdcarrito = carritoComprasIdcarrito;
		this.carritoComprasIdcarritoModified = true;
	}

	/** 
	 * Sets the value of carritoComprasIdcarritoModified
	 */
	public void setCarritoComprasIdcarritoModified(boolean carritoComprasIdcarritoModified)
	{
		this.carritoComprasIdcarritoModified = carritoComprasIdcarritoModified;
	}

	/** 
	 * Gets the value of carritoComprasIdcarritoModified
	 */
	public boolean isCarritoComprasIdcarritoModified()
	{
		return carritoComprasIdcarritoModified;
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
		
		if (!(_other instanceof ItemCarrito)) {
			return false;
		}
		
		final ItemCarrito _cast = (ItemCarrito) _other;
		if (cantidad != _cast.cantidad) {
			return false;
		}
		
		if (cantidadModified != _cast.cantidadModified) {
			return false;
		}
		
		if (valorUnitario != _cast.valorUnitario) {
			return false;
		}
		
		if (valorUnitarioModified != _cast.valorUnitarioModified) {
			return false;
		}
		
		if (valorTotal != _cast.valorTotal) {
			return false;
		}
		
		if (valorTotalModified != _cast.valorTotalModified) {
			return false;
		}
		
		if (productoIdProducto == null ? _cast.productoIdProducto != productoIdProducto : !productoIdProducto.equals( _cast.productoIdProducto )) {
			return false;
		}
		
		if (productoIdProductoModified != _cast.productoIdProductoModified) {
			return false;
		}
		
		if (carritoComprasIdcarrito == null ? _cast.carritoComprasIdcarrito != carritoComprasIdcarrito : !carritoComprasIdcarrito.equals( _cast.carritoComprasIdcarrito )) {
			return false;
		}
		
		if (carritoComprasIdcarritoModified != _cast.carritoComprasIdcarritoModified) {
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
		_hashCode = 29 * _hashCode + cantidad;
		_hashCode = 29 * _hashCode + (cantidadModified ? 1 : 0);
		_hashCode = 29 * _hashCode + Float.floatToIntBits(valorUnitario);
		_hashCode = 29 * _hashCode + (valorUnitarioModified ? 1 : 0);
		_hashCode = 29 * _hashCode + Float.floatToIntBits(valorTotal);
		_hashCode = 29 * _hashCode + (valorTotalModified ? 1 : 0);
		if (productoIdProducto != null) {
			_hashCode = 29 * _hashCode + productoIdProducto.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (productoIdProductoModified ? 1 : 0);
		if (carritoComprasIdcarrito != null) {
			_hashCode = 29 * _hashCode + carritoComprasIdcarrito.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (carritoComprasIdcarritoModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return ItemCarritoPk
	 */
	public ItemCarritoPk createPk()
	{
		return new ItemCarritoPk(productoIdProducto, carritoComprasIdcarrito);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "edu.co.sena.dto.ItemCarrito: " );
		ret.append( "cantidad=" + cantidad );
		ret.append( ", valorUnitario=" + valorUnitario );
		ret.append( ", valorTotal=" + valorTotal );
		ret.append( ", productoIdProducto=" + productoIdProducto );
		ret.append( ", carritoComprasIdcarrito=" + carritoComprasIdcarrito );
		return ret.toString();
	}

}
