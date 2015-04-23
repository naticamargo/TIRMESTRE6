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

public interface MunicipioDao
{
	/** 
	 * Inserts a new row in the municipio table.
	 */
	public MunicipioPk insert(Municipio dto) throws MunicipioDaoException;

	/** 
	 * Updates a single row in the municipio table.
	 */
	public void update(MunicipioPk pk, Municipio dto) throws MunicipioDaoException;

	/** 
	 * Deletes a single row in the municipio table.
	 */
	public void delete(MunicipioPk pk) throws MunicipioDaoException;

	/** 
	 * Returns the rows from the municipio table that matches the specified primary-key value.
	 */
	public Municipio findByPrimaryKey(MunicipioPk pk) throws MunicipioDaoException;

	/** 
	 * Returns all rows from the municipio table that match the criteria 'idMUNICIPIO = :idMUNICIPIO'.
	 */
	public Municipio findByPrimaryKey(int idMUNICIPIO) throws MunicipioDaoException;

	/** 
	 * Returns all rows from the municipio table that match the criteria ''.
	 */
	public Municipio[] findAll() throws MunicipioDaoException;

	/** 
	 * Returns all rows from the municipio table that match the criteria 'DEPARTAMENTO_idDEPARTAMENTO = :departamentoIddepartamento'.
	 */
	public Municipio[] findByDepartamento(int departamentoIddepartamento) throws MunicipioDaoException;

	/** 
	 * Returns all rows from the municipio table that match the criteria 'idMUNICIPIO = :idMUNICIPIO'.
	 */
	public Municipio[] findWhereIdMUNICIPIOEquals(int idMUNICIPIO) throws MunicipioDaoException;

	/** 
	 * Returns all rows from the municipio table that match the criteria 'NOMBRE_MUNICIPIO = :nombreMunicipio'.
	 */
	public Municipio[] findWhereNombreMunicipioEquals(String nombreMunicipio) throws MunicipioDaoException;

	/** 
	 * Returns all rows from the municipio table that match the criteria 'DEPARTAMENTO_idDEPARTAMENTO = :departamentoIddepartamento'.
	 */
	public Municipio[] findWhereDepartamentoIddepartamentoEquals(int departamentoIddepartamento) throws MunicipioDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the municipio table that match the specified arbitrary SQL statement
	 */
	public Municipio[] findByDynamicSelect(String sql, Object[] sqlParams) throws MunicipioDaoException;

	/** 
	 * Returns all rows from the municipio table that match the specified arbitrary SQL statement
	 */
	public Municipio[] findByDynamicWhere(String sql, Object[] sqlParams) throws MunicipioDaoException;

}
