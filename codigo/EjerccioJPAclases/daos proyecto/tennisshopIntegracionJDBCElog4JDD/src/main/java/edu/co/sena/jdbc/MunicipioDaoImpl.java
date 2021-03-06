/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.jdbc;

import edu.co.sena.dao.*;
import edu.co.sena.factory.*;
import edu.co.sena.dto.*;
import edu.co.sena.exceptions.*;
import java.sql.Connection;
import java.util.Collection;
import org.apache.log4j.Logger;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class MunicipioDaoImpl extends AbstractDAO implements MunicipioDao
{
	/** 
	 * The factory class for this DAO has two versions of the create() method - one that
takes no arguments and one that takes a Connection argument. If the Connection version
is chosen then the connection will be stored in this attribute and will be used by all
calls to this DAO, otherwise a new Connection will be allocated for each operation.
	 */
	protected java.sql.Connection userConn;

	protected static final Logger logger = Logger.getLogger( MunicipioDaoImpl.class );

	/** 
	 * All finder methods in this class use this SELECT constant to build their queries
	 */
	protected final String SQL_SELECT = "SELECT idMUNICIPIO, NOMBRE_MUNICIPIO, DEPARTAMENTO_idDEPARTAMENTO FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( idMUNICIPIO, NOMBRE_MUNICIPIO, DEPARTAMENTO_idDEPARTAMENTO ) VALUES ( ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET idMUNICIPIO = ?, NOMBRE_MUNICIPIO = ?, DEPARTAMENTO_idDEPARTAMENTO = ? WHERE idMUNICIPIO = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE idMUNICIPIO = ?";

	/** 
	 * Index of column idMUNICIPIO
	 */
	protected static final int COLUMN_ID_M_U_N_I_C_I_P_I_O = 1;

	/** 
	 * Index of column NOMBRE_MUNICIPIO
	 */
	protected static final int COLUMN_NOMBRE_MUNICIPIO = 2;

	/** 
	 * Index of column DEPARTAMENTO_idDEPARTAMENTO
	 */
	protected static final int COLUMN_DEPARTAMENTO_IDDEPARTAMENTO = 3;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 3;

	/** 
	 * Index of primary-key column idMUNICIPIO
	 */
	protected static final int PK_COLUMN_ID_M_U_N_I_C_I_P_I_O = 1;

	/** 
	 * Inserts a new row in the municipio table.
	 */
	public MunicipioPk insert(Municipio dto) throws MunicipioDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			StringBuffer sql = new StringBuffer();
			StringBuffer values = new StringBuffer();
			sql.append( "INSERT INTO " + getTableName() + " (" );
			int modifiedCount = 0;
			if (dto.isIdMUNICIPIOModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "idMUNICIPIO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isNombreMunicipioModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "NOMBRE_MUNICIPIO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isDepartamentoIddepartamentoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "DEPARTAMENTO_idDEPARTAMENTO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (modifiedCount==0) {
				// nothing to insert
				throw new IllegalStateException( "Nothing to insert" );
			}
		
			sql.append( ") VALUES (" );
			sql.append( values );
			sql.append( ")" );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdMUNICIPIOModified()) {
				stmt.setInt( index++, dto.getIdMUNICIPIO() );
			}
		
			if (dto.isNombreMunicipioModified()) {
				stmt.setString( index++, dto.getNombreMunicipio() );
			}
		
			if (dto.isDepartamentoIddepartamentoModified()) {
				stmt.setInt( index++, dto.getDepartamentoIddepartamento() );
			}
		
			if (logger.isDebugEnabled()) {
				logger.debug( "Executing " + sql.toString() + " with values: " + dto);
			}
		
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			if (logger.isDebugEnabled()) {
				logger.debug( rows + " rows affected (" + (t2-t1) + " ms)");
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			logger.error( "Exception: " + _e.getMessage(), _e );
			throw new MunicipioDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the municipio table.
	 */
	public void update(MunicipioPk pk, Municipio dto) throws MunicipioDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			StringBuffer sql = new StringBuffer();
			sql.append( "UPDATE " + getTableName() + " SET " );
			boolean modified = false;
			if (dto.isIdMUNICIPIOModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "idMUNICIPIO=?" );
				modified=true;
			}
		
			if (dto.isNombreMunicipioModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "NOMBRE_MUNICIPIO=?" );
				modified=true;
			}
		
			if (dto.isDepartamentoIddepartamentoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "DEPARTAMENTO_idDEPARTAMENTO=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE idMUNICIPIO=?" );
			if (logger.isDebugEnabled()) {
				logger.debug( "Executing " + sql.toString() + " with values: " + dto);
			}
		
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdMUNICIPIOModified()) {
				stmt.setInt( index++, dto.getIdMUNICIPIO() );
			}
		
			if (dto.isNombreMunicipioModified()) {
				stmt.setString( index++, dto.getNombreMunicipio() );
			}
		
			if (dto.isDepartamentoIddepartamentoModified()) {
				stmt.setInt( index++, dto.getDepartamentoIddepartamento() );
			}
		
			stmt.setInt( index++, pk.getIdMUNICIPIO() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			if (logger.isDebugEnabled()) {
				logger.debug( rows + " rows affected (" + (t2-t1) + " ms)");
			}
		
		}
		catch (Exception _e) {
			logger.error( "Exception: " + _e.getMessage(), _e );
			throw new MunicipioDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the municipio table.
	 */
	public void delete(MunicipioPk pk) throws MunicipioDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			if (logger.isDebugEnabled()) {
				logger.debug( "Executing " + SQL_DELETE + " with PK: " + pk);
			}
		
			stmt = conn.prepareStatement( SQL_DELETE );
			stmt.setInt( 1, pk.getIdMUNICIPIO() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			if (logger.isDebugEnabled()) {
				logger.debug( rows + " rows affected (" + (t2-t1) + " ms)");
			}
		
		}
		catch (Exception _e) {
			logger.error( "Exception: " + _e.getMessage(), _e );
			throw new MunicipioDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the municipio table that matches the specified primary-key value.
	 */
	public Municipio findByPrimaryKey(MunicipioPk pk) throws MunicipioDaoException
	{
		return findByPrimaryKey( pk.getIdMUNICIPIO() );
	}

	/** 
	 * Returns all rows from the municipio table that match the criteria 'idMUNICIPIO = :idMUNICIPIO'.
	 */
	public Municipio findByPrimaryKey(int idMUNICIPIO) throws MunicipioDaoException
	{
		Municipio ret[] = findByDynamicSelect( SQL_SELECT + " WHERE idMUNICIPIO = ?", new Object[] {  new Integer(idMUNICIPIO) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the municipio table that match the criteria ''.
	 */
	public Municipio[] findAll() throws MunicipioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY idMUNICIPIO", null );
	}

	/** 
	 * Returns all rows from the municipio table that match the criteria 'DEPARTAMENTO_idDEPARTAMENTO = :departamentoIddepartamento'.
	 */
	public Municipio[] findByDepartamento(int departamentoIddepartamento) throws MunicipioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DEPARTAMENTO_idDEPARTAMENTO = ?", new Object[] {  new Integer(departamentoIddepartamento) } );
	}

	/** 
	 * Returns all rows from the municipio table that match the criteria 'idMUNICIPIO = :idMUNICIPIO'.
	 */
	public Municipio[] findWhereIdMUNICIPIOEquals(int idMUNICIPIO) throws MunicipioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE idMUNICIPIO = ? ORDER BY idMUNICIPIO", new Object[] {  new Integer(idMUNICIPIO) } );
	}

	/** 
	 * Returns all rows from the municipio table that match the criteria 'NOMBRE_MUNICIPIO = :nombreMunicipio'.
	 */
	public Municipio[] findWhereNombreMunicipioEquals(String nombreMunicipio) throws MunicipioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE NOMBRE_MUNICIPIO = ? ORDER BY NOMBRE_MUNICIPIO", new Object[] { nombreMunicipio } );
	}

	/** 
	 * Returns all rows from the municipio table that match the criteria 'DEPARTAMENTO_idDEPARTAMENTO = :departamentoIddepartamento'.
	 */
	public Municipio[] findWhereDepartamentoIddepartamentoEquals(int departamentoIddepartamento) throws MunicipioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DEPARTAMENTO_idDEPARTAMENTO = ? ORDER BY DEPARTAMENTO_idDEPARTAMENTO", new Object[] {  new Integer(departamentoIddepartamento) } );
	}

	/**
	 * Method 'MunicipioDaoImpl'
	 * 
	 */
	public MunicipioDaoImpl()
	{
	}

	/**
	 * Method 'MunicipioDaoImpl'
	 * 
	 * @param userConn
	 */
	public MunicipioDaoImpl(final java.sql.Connection userConn)
	{
		this.userConn = userConn;
	}

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows)
	{
		this.maxRows = maxRows;
	}

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows()
	{
		return maxRows;
	}

	/**
	 * Method 'getTableName'
	 * 
	 * @return String
	 */
	public String getTableName()
	{
		return "tennisshop.municipio";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Municipio fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Municipio dto = new Municipio();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Municipio[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Municipio dto = new Municipio();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Municipio ret[] = new Municipio[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Municipio dto, ResultSet rs) throws SQLException
	{
		dto.setIdMUNICIPIO( rs.getInt( COLUMN_ID_M_U_N_I_C_I_P_I_O ) );
		dto.setNombreMunicipio( rs.getString( COLUMN_NOMBRE_MUNICIPIO ) );
		dto.setDepartamentoIddepartamento( rs.getInt( COLUMN_DEPARTAMENTO_IDDEPARTAMENTO ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Municipio dto)
	{
		dto.setIdMUNICIPIOModified( false );
		dto.setNombreMunicipioModified( false );
		dto.setDepartamentoIddepartamentoModified( false );
	}

	/** 
	 * Returns all rows from the municipio table that match the specified arbitrary SQL statement
	 */
	public Municipio[] findByDynamicSelect(String sql, Object[] sqlParams) throws MunicipioDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = sql;
		
		
			if (logger.isDebugEnabled()) {
				logger.debug( "Executing " + SQL);
			}
		
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			logger.error( "Exception: " + _e.getMessage(), _e );
			throw new MunicipioDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns all rows from the municipio table that match the specified arbitrary SQL statement
	 */
	public Municipio[] findByDynamicWhere(String sql, Object[] sqlParams) throws MunicipioDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = SQL_SELECT + " WHERE " + sql;
		
		
			if (logger.isDebugEnabled()) {
				logger.debug( "Executing " + SQL);
			}
		
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			logger.error( "Exception: " + _e.getMessage(), _e );
			throw new MunicipioDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

}
