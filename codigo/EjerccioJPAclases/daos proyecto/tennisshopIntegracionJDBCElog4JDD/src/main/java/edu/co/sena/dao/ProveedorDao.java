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

public interface ProveedorDao
{
	/** 
	 * Inserts a new row in the proveedor table.
	 */
	public ProveedorPk insert(Proveedor dto) throws ProveedorDaoException;

	/** 
	 * Updates a single row in the proveedor table.
	 */
	public void update(ProveedorPk pk, Proveedor dto) throws ProveedorDaoException;

	/** 
	 * Deletes a single row in the proveedor table.
	 */
	public void delete(ProveedorPk pk) throws ProveedorDaoException;

	/** 
	 * Returns the rows from the proveedor table that matches the specified primary-key value.
	 */
	public Proveedor findByPrimaryKey(ProveedorPk pk) throws ProveedorDaoException;

	/** 
	 * Returns all rows from the proveedor table that match the criteria 'TIPO_DOCUMENTO = :tipoDocumento AND NUMERO_DOCUMENTO = :numeroDocumento'.
	 */
	public Proveedor findByPrimaryKey(String tipoDocumento, String numeroDocumento) throws ProveedorDaoException;

	/** 
	 * Returns all rows from the proveedor table that match the criteria ''.
	 */
	public Proveedor[] findAll() throws ProveedorDaoException;

	/** 
	 * Returns all rows from the proveedor table that match the criteria 'TIPO_DOCUMENTO = :tipoDocumento'.
	 */
	public Proveedor[] findWhereTipoDocumentoEquals(String tipoDocumento) throws ProveedorDaoException;

	/** 
	 * Returns all rows from the proveedor table that match the criteria 'NUMERO_DOCUMENTO = :numeroDocumento'.
	 */
	public Proveedor[] findWhereNumeroDocumentoEquals(String numeroDocumento) throws ProveedorDaoException;

	/** 
	 * Returns all rows from the proveedor table that match the criteria 'NOMBRE_PROVVEDOR = :nombreProvvedor'.
	 */
	public Proveedor[] findWhereNombreProvvedorEquals(String nombreProvvedor) throws ProveedorDaoException;

	/** 
	 * Returns all rows from the proveedor table that match the criteria 'TELEFONO = :telefono'.
	 */
	public Proveedor[] findWhereTelefonoEquals(String telefono) throws ProveedorDaoException;

	/** 
	 * Returns all rows from the proveedor table that match the criteria 'CORREO = :correo'.
	 */
	public Proveedor[] findWhereCorreoEquals(String correo) throws ProveedorDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the proveedor table that match the specified arbitrary SQL statement
	 */
	public Proveedor[] findByDynamicSelect(String sql, Object[] sqlParams) throws ProveedorDaoException;

	/** 
	 * Returns all rows from the proveedor table that match the specified arbitrary SQL statement
	 */
	public Proveedor[] findByDynamicWhere(String sql, Object[] sqlParams) throws ProveedorDaoException;

}