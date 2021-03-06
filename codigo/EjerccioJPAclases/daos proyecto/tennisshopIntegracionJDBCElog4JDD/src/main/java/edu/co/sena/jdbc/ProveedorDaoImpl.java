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

public class ProveedorDaoImpl extends AbstractDAO implements ProveedorDao
{
	/** 
	 * The factory class for this DAO has two versions of the create() method - one that
takes no arguments and one that takes a Connection argument. If the Connection version
is chosen then the connection will be stored in this attribute and will be used by all
calls to this DAO, otherwise a new Connection will be allocated for each operation.
	 */
	protected java.sql.Connection userConn;

	protected static final Logger logger = Logger.getLogger( ProveedorDaoImpl.class );

	/** 
	 * All finder methods in this class use this SELECT constant to build their queries
	 */
	protected final String SQL_SELECT = "SELECT TIPO_DOCUMENTO, NUMERO_DOCUMENTO, NOMBRE_PROVVEDOR, TELEFONO, CORREO FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( TIPO_DOCUMENTO, NUMERO_DOCUMENTO, NOMBRE_PROVVEDOR, TELEFONO, CORREO ) VALUES ( ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET TIPO_DOCUMENTO = ?, NUMERO_DOCUMENTO = ?, NOMBRE_PROVVEDOR = ?, TELEFONO = ?, CORREO = ? WHERE TIPO_DOCUMENTO = ? AND NUMERO_DOCUMENTO = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE TIPO_DOCUMENTO = ? AND NUMERO_DOCUMENTO = ?";

	/** 
	 * Index of column TIPO_DOCUMENTO
	 */
	protected static final int COLUMN_TIPO_DOCUMENTO = 1;

	/** 
	 * Index of column NUMERO_DOCUMENTO
	 */
	protected static final int COLUMN_NUMERO_DOCUMENTO = 2;

	/** 
	 * Index of column NOMBRE_PROVVEDOR
	 */
	protected static final int COLUMN_NOMBRE_PROVVEDOR = 3;

	/** 
	 * Index of column TELEFONO
	 */
	protected static final int COLUMN_TELEFONO = 4;

	/** 
	 * Index of column CORREO
	 */
	protected static final int COLUMN_CORREO = 5;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 5;

	/** 
	 * Index of primary-key column TIPO_DOCUMENTO
	 */
	protected static final int PK_COLUMN_TIPO_DOCUMENTO = 1;

	/** 
	 * Index of primary-key column NUMERO_DOCUMENTO
	 */
	protected static final int PK_COLUMN_NUMERO_DOCUMENTO = 2;

	/** 
	 * Inserts a new row in the proveedor table.
	 */
	public ProveedorPk insert(Proveedor dto) throws ProveedorDaoException
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
			if (dto.isTipoDocumentoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "TIPO_DOCUMENTO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isNumeroDocumentoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "NUMERO_DOCUMENTO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isNombreProvvedorModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "NOMBRE_PROVVEDOR" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isTelefonoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "TELEFONO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isCorreoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "CORREO" );
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
			if (dto.isTipoDocumentoModified()) {
				stmt.setString( index++, dto.getTipoDocumento() );
			}
		
			if (dto.isNumeroDocumentoModified()) {
				stmt.setString( index++, dto.getNumeroDocumento() );
			}
		
			if (dto.isNombreProvvedorModified()) {
				stmt.setString( index++, dto.getNombreProvvedor() );
			}
		
			if (dto.isTelefonoModified()) {
				stmt.setString( index++, dto.getTelefono() );
			}
		
			if (dto.isCorreoModified()) {
				stmt.setString( index++, dto.getCorreo() );
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
			throw new ProveedorDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the proveedor table.
	 */
	public void update(ProveedorPk pk, Proveedor dto) throws ProveedorDaoException
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
			if (dto.isTipoDocumentoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "TIPO_DOCUMENTO=?" );
				modified=true;
			}
		
			if (dto.isNumeroDocumentoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "NUMERO_DOCUMENTO=?" );
				modified=true;
			}
		
			if (dto.isNombreProvvedorModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "NOMBRE_PROVVEDOR=?" );
				modified=true;
			}
		
			if (dto.isTelefonoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "TELEFONO=?" );
				modified=true;
			}
		
			if (dto.isCorreoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "CORREO=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE TIPO_DOCUMENTO=? AND NUMERO_DOCUMENTO=?" );
			if (logger.isDebugEnabled()) {
				logger.debug( "Executing " + sql.toString() + " with values: " + dto);
			}
		
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isTipoDocumentoModified()) {
				stmt.setString( index++, dto.getTipoDocumento() );
			}
		
			if (dto.isNumeroDocumentoModified()) {
				stmt.setString( index++, dto.getNumeroDocumento() );
			}
		
			if (dto.isNombreProvvedorModified()) {
				stmt.setString( index++, dto.getNombreProvvedor() );
			}
		
			if (dto.isTelefonoModified()) {
				stmt.setString( index++, dto.getTelefono() );
			}
		
			if (dto.isCorreoModified()) {
				stmt.setString( index++, dto.getCorreo() );
			}
		
			stmt.setString( index++, pk.getTipoDocumento() );
			stmt.setString( index++, pk.getNumeroDocumento() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			if (logger.isDebugEnabled()) {
				logger.debug( rows + " rows affected (" + (t2-t1) + " ms)");
			}
		
		}
		catch (Exception _e) {
			logger.error( "Exception: " + _e.getMessage(), _e );
			throw new ProveedorDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the proveedor table.
	 */
	public void delete(ProveedorPk pk) throws ProveedorDaoException
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
			stmt.setString( 1, pk.getTipoDocumento() );
			stmt.setString( 2, pk.getNumeroDocumento() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			if (logger.isDebugEnabled()) {
				logger.debug( rows + " rows affected (" + (t2-t1) + " ms)");
			}
		
		}
		catch (Exception _e) {
			logger.error( "Exception: " + _e.getMessage(), _e );
			throw new ProveedorDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the proveedor table that matches the specified primary-key value.
	 */
	public Proveedor findByPrimaryKey(ProveedorPk pk) throws ProveedorDaoException
	{
		return findByPrimaryKey( pk.getTipoDocumento(), pk.getNumeroDocumento() );
	}

	/** 
	 * Returns all rows from the proveedor table that match the criteria 'TIPO_DOCUMENTO = :tipoDocumento AND NUMERO_DOCUMENTO = :numeroDocumento'.
	 */
	public Proveedor findByPrimaryKey(String tipoDocumento, String numeroDocumento) throws ProveedorDaoException
	{
		Proveedor ret[] = findByDynamicSelect( SQL_SELECT + " WHERE TIPO_DOCUMENTO = ? AND NUMERO_DOCUMENTO = ?", new Object[] { tipoDocumento, numeroDocumento } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the proveedor table that match the criteria ''.
	 */
	public Proveedor[] findAll() throws ProveedorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY TIPO_DOCUMENTO, NUMERO_DOCUMENTO", null );
	}

	/** 
	 * Returns all rows from the proveedor table that match the criteria 'TIPO_DOCUMENTO = :tipoDocumento'.
	 */
	public Proveedor[] findWhereTipoDocumentoEquals(String tipoDocumento) throws ProveedorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE TIPO_DOCUMENTO = ? ORDER BY TIPO_DOCUMENTO", new Object[] { tipoDocumento } );
	}

	/** 
	 * Returns all rows from the proveedor table that match the criteria 'NUMERO_DOCUMENTO = :numeroDocumento'.
	 */
	public Proveedor[] findWhereNumeroDocumentoEquals(String numeroDocumento) throws ProveedorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE NUMERO_DOCUMENTO = ? ORDER BY NUMERO_DOCUMENTO", new Object[] { numeroDocumento } );
	}

	/** 
	 * Returns all rows from the proveedor table that match the criteria 'NOMBRE_PROVVEDOR = :nombreProvvedor'.
	 */
	public Proveedor[] findWhereNombreProvvedorEquals(String nombreProvvedor) throws ProveedorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE NOMBRE_PROVVEDOR = ? ORDER BY NOMBRE_PROVVEDOR", new Object[] { nombreProvvedor } );
	}

	/** 
	 * Returns all rows from the proveedor table that match the criteria 'TELEFONO = :telefono'.
	 */
	public Proveedor[] findWhereTelefonoEquals(String telefono) throws ProveedorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE TELEFONO = ? ORDER BY TELEFONO", new Object[] { telefono } );
	}

	/** 
	 * Returns all rows from the proveedor table that match the criteria 'CORREO = :correo'.
	 */
	public Proveedor[] findWhereCorreoEquals(String correo) throws ProveedorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CORREO = ? ORDER BY CORREO", new Object[] { correo } );
	}

	/**
	 * Method 'ProveedorDaoImpl'
	 * 
	 */
	public ProveedorDaoImpl()
	{
	}

	/**
	 * Method 'ProveedorDaoImpl'
	 * 
	 * @param userConn
	 */
	public ProveedorDaoImpl(final java.sql.Connection userConn)
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
		return "tennisshop.proveedor";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Proveedor fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Proveedor dto = new Proveedor();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Proveedor[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Proveedor dto = new Proveedor();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Proveedor ret[] = new Proveedor[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Proveedor dto, ResultSet rs) throws SQLException
	{
		dto.setTipoDocumento( rs.getString( COLUMN_TIPO_DOCUMENTO ) );
		dto.setNumeroDocumento( rs.getString( COLUMN_NUMERO_DOCUMENTO ) );
		dto.setNombreProvvedor( rs.getString( COLUMN_NOMBRE_PROVVEDOR ) );
		dto.setTelefono( rs.getString( COLUMN_TELEFONO ) );
		dto.setCorreo( rs.getString( COLUMN_CORREO ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Proveedor dto)
	{
		dto.setTipoDocumentoModified( false );
		dto.setNumeroDocumentoModified( false );
		dto.setNombreProvvedorModified( false );
		dto.setTelefonoModified( false );
		dto.setCorreoModified( false );
	}

	/** 
	 * Returns all rows from the proveedor table that match the specified arbitrary SQL statement
	 */
	public Proveedor[] findByDynamicSelect(String sql, Object[] sqlParams) throws ProveedorDaoException
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
			throw new ProveedorDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the proveedor table that match the specified arbitrary SQL statement
	 */
	public Proveedor[] findByDynamicWhere(String sql, Object[] sqlParams) throws ProveedorDaoException
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
			throw new ProveedorDaoException( "Exception: " + _e.getMessage(), _e );
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
