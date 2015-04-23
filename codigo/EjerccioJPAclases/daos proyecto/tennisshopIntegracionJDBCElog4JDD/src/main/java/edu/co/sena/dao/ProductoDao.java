/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.dao;

import edu.co.sena.dto.*;
import edu.co.sena.exceptions.*;

public interface ProductoDao
{
	/** 
	 * Inserts a new row in the producto table.
	 */
	public ProductoPk insert(Producto dto) throws ProductoDaoException;

	/** 
	 * Updates a single row in the producto table.
	 */
	public void update(ProductoPk pk, Producto dto) throws ProductoDaoException;

	/** 
	 * Deletes a single row in the producto table.
	 */
	public void delete(ProductoPk pk) throws ProductoDaoException;

	/** 
	 * Returns the rows from the producto table that matches the specified primary-key value.
	 */
	public Producto findByPrimaryKey(ProductoPk pk) throws ProductoDaoException;

	/** 
	 * Returns all rows from the producto table that match the criteria 'ID_PRODUCTO = :idProducto'.
	 */
	public Producto findByPrimaryKey(String idProducto) throws ProductoDaoException;

	/** 
	 * Returns all rows from the producto table that match the criteria ''.
	 */
	public Producto[] findAll() throws ProductoDaoException;

	/** 
	 * Returns all rows from the producto table that match the criteria 'CATALOGO_ID_CATOLOGO = :catalogoIdCatologo'.
	 */
	public Producto[] findByCatalogo(int catalogoIdCatologo) throws ProductoDaoException;

	/** 
	 * Returns all rows from the producto table that match the criteria 'CATEGORIA_ID_CATEGORIA = :categoriaIdCategoria'.
	 */
	public Producto[] findByCategoria(int categoriaIdCategoria) throws ProductoDaoException;

	/** 
	 * Returns all rows from the producto table that match the criteria 'ID_PRODUCTO = :idProducto'.
	 */
	public Producto[] findWhereIdProductoEquals(String idProducto) throws ProductoDaoException;

	/** 
	 * Returns all rows from the producto table that match the criteria 'NOMBRE_PRODCUTO = :nombreProdcuto'.
	 */
	public Producto[] findWhereNombreProdcutoEquals(String nombreProdcuto) throws ProductoDaoException;

	/** 
	 * Returns all rows from the producto table that match the criteria 'PRECIO = :precio'.
	 */
	public Producto[] findWherePrecioEquals(float precio) throws ProductoDaoException;

	/** 
	 * Returns all rows from the producto table that match the criteria 'IMAGEN = :imagen'.
	 */
	public Producto[] findWhereImagenEquals(byte[] imagen) throws ProductoDaoException;

	/** 
	 * Returns all rows from the producto table that match the criteria 'CANTIDAD = :cantidad'.
	 */
	public Producto[] findWhereCantidadEquals(int cantidad) throws ProductoDaoException;

	/** 
	 * Returns all rows from the producto table that match the criteria 'DESCRIPCION = :descripcion'.
	 */
	public Producto[] findWhereDescripcionEquals(String descripcion) throws ProductoDaoException;

	/** 
	 * Returns all rows from the producto table that match the criteria 'CATALOGO_ID_CATOLOGO = :catalogoIdCatologo'.
	 */
	public Producto[] findWhereCatalogoIdCatologoEquals(int catalogoIdCatologo) throws ProductoDaoException;

	/** 
	 * Returns all rows from the producto table that match the criteria 'CATEGORIA_ID_CATEGORIA = :categoriaIdCategoria'.
	 */
	public Producto[] findWhereCategoriaIdCategoriaEquals(int categoriaIdCategoria) throws ProductoDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the producto table that match the specified arbitrary SQL statement
	 */
	public Producto[] findByDynamicSelect(String sql, Object[] sqlParams) throws ProductoDaoException;

	/** 
	 * Returns all rows from the producto table that match the specified arbitrary SQL statement
	 */
	public Producto[] findByDynamicWhere(String sql, Object[] sqlParams) throws ProductoDaoException;

}
