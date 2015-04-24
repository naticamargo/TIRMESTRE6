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

public class DomicilioDaoImpl extends AbstractDAO implements DomicilioDao
{
	/** 
	 * The factory class for this DAO has two versions of the create() method - one that
takes no arguments and one that takes a Connection argument. If the Connection version
is chosen then the connection will be stored in this attribute and will be used by all
calls to this DAO, otherwise a new Connection will be allocated for each operation.
	 */
	protected java.sql.Connection userConn;

	protected static final Logger logger = Logger.getLogger( DomicilioDaoImpl.class );

	/** 
	 * All finder methods in this class use this SELECT constant to build their queries
	 */
	protected final String SQL_SELECT = "SELECT idDOMICILIO, DIRRECION, TELEFONO, LOCALIDAD, BARRIO, CUENTA_TIPO_DOCUMENTO, CUENTA_NUMERO_DOCUMENTO, MUNICIPIO_idMUNICIPIO FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( idDOMICILIO, DIRRECION, TELEFONO, LOCALIDAD, BARRIO, CUENTA_TIPO_DOCUMENTO, CUENTA_NUMERO_DOCUMENTO, MUNICIPIO_idMUNICIPIO ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET idDOMICILIO = ?, DIRRECION = ?, TELEFONO = ?, LOCALIDAD = ?, BARRIO = ?, CUENTA_TIPO_DOCUMENTO = ?, CUENTA_NUMERO_DOCUMENTO = ?, MUNICIPIO_idMUNICIPIO = ? WHERE idDOMICILIO = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE idDOMICILIO = ?";

	/** 
	 * Index of column idDOMICILIO
	 */
	protected static final int COLUMN_ID_D_O_M_I_C_I_L_I_O = 1;

	/** 
	 * Index of column DIRRECION
	 */
	protected static final int COLUMN_DIRRECION = 2;

	/** 
	 * Index of column TELEFONO
	 */
	protected static final int COLUMN_TELEFONO = 3;

	/** 
	 * Index of column LOCALIDAD
	 */
	protected static final int COLUMN_LOCALIDAD = 4;

	/** 
	 * Index of column BARRIO
	 */
	protected static final int COLUMN_BARRIO = 5;

	/** 
	 * Index of column CUENTA_TIPO_DOCUMENTO
	 */
	protected static final int COLUMN_CUENTA_TIPO_DOCUMENTO = 6;

	/** 
	 * Index of column CUENTA_NUMERO_DOCUMENTO
	 */
	protected static final int COLUMN_CUENTA_NUMERO_DOCUMENTO = 7;

	/** 
	 * Index of column MUNICIPIO_idMUNICIPIO
	 */
	protected static final int COLUMN_MUNICIPIO_IDMUNICIPIO = 8;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 8;

	/** 
	 * Index of primary-key column idDOMICILIO
	 */
	protected static final int PK_COLUMN_ID_D_O_M_I_C_I_L_I_O = 1;

	/** 
	 * Inserts a new row in the domicilio table.
	 */
	public DomicilioPk insert(Domicilio dto) throws DomicilioDaoException
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
			if (dto.isIdDOMICILIOModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "idDOMICILIO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isDirrecionModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "DIRRECION" );
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
		
			if (dto.isLocalidadModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "LOCALIDAD" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isBarrioModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "BARRIO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isCuentaTipoDocumentoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "CUENTA_TIPO_DOCUMENTO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isCuentaNumeroDocumentoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "CUENTA_NUMERO_DOCUMENTO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isMunicipioIdmunicipioModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "MUNICIPIO_idMUNICIPIO" );
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
			if (dto.isIdDOMICILIOModified()) {
				stmt.setInt( index++, dto.getIdDOMICILIO() );
			}
		
			if (dto.isDirrecionModified()) {
				stmt.setString( index++, dto.getDirrecion() );
			}
		
			if (dto.isTelefonoModified()) {
				stmt.setString( index++, dto.getTelefono() );
			}
		
			if (dto.isLocalidadModified()) {
				stmt.setString( index++, dto.getLocalidad() );
			}
		
			if (dto.isBarrioModified()) {
				stmt.setString( index++, dto.getBarrio() );
			}
		
			if (dto.isCuentaTipoDocumentoModified()) {
				stmt.setString( index++, dto.getCuentaTipoDocumento() );
			}
		
			if (dto.isCuentaNumeroDocumentoModified()) {
				stmt.setString( index++, dto.getCuentaNumeroDocumento() );
			}
		
			if (dto.isMunicipioIdmunicipioModified()) {
				stmt.setInt( index++, dto.getMunicipioIdmunicipio() );
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
			throw new DomicilioDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the domicilio table.
	 */
	public void update(DomicilioPk pk, Domicilio dto) throws DomicilioDaoException
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
			if (dto.isIdDOMICILIOModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "idDOMICILIO=?" );
				modified=true;
			}
		
			if (dto.isDirrecionModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "DIRRECION=?" );
				modified=true;
			}
		
			if (dto.isTelefonoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "TELEFONO=?" );
				modified=true;
			}
		
			if (dto.isLocalidadModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "LOCALIDAD=?" );
				modified=true;
			}
		
			if (dto.isBarrioModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "BARRIO=?" );
				modified=true;
			}
		
			if (dto.isCuentaTipoDocumentoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "CUENTA_TIPO_DOCUMENTO=?" );
				modified=true;
			}
		
			if (dto.isCuentaNumeroDocumentoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "CUENTA_NUMERO_DOCUMENTO=?" );
				modified=true;
			}
		
			if (dto.isMunicipioIdmunicipioModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "MUNICIPIO_idMUNICIPIO=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE idDOMICILIO=?" );
			if (logger.isDebugEnabled()) {
				logger.debug( "Executing " + sql.toString() + " with values: " + dto);
			}
		
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdDOMICILIOModified()) {
				stmt.setInt( index++, dto.getIdDOMICILIO() );
			}
		
			if (dto.isDirrecionModified()) {
				stmt.setString( index++, dto.getDirrecion() );
			}
		
			if (dto.isTelefonoModified()) {
				stmt.setString( index++, dto.getTelefono() );
			}
		
			if (dto.isLocalidadModified()) {
				stmt.setString( index++, dto.getLocalidad() );
			}
		
			if (dto.isBarrioModified()) {
				stmt.setString( index++, dto.getBarrio() );
			}
		
			if (dto.isCuentaTipoDocumentoModified()) {
				stmt.setString( index++, dto.getCuentaTipoDocumento() );
			}
		
			if (dto.isCuentaNumeroDocumentoModified()) {
				stmt.setString( index++, dto.getCuentaNumeroDocumento() );
			}
		
			if (dto.isMunicipioIdmunicipioModified()) {
				stmt.setInt( index++, dto.getMunicipioIdmunicipio() );
			}
		
			stmt.setInt( index++, pk.getIdDOMICILIO() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			if (logger.isDebugEnabled()) {
				logger.debug( rows + " rows affected (" + (t2-t1) + " ms)");
			}
		
		}
		catch (Exception _e) {
			logger.error( "Exception: " + _e.getMessage(), _e );
			throw new DomicilioDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the domicilio table.
	 */
	public void delete(DomicilioPk pk) throws DomicilioDaoException
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
			stmt.setInt( 1, pk.getIdDOMICILIO() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			if (logger.isDebugEnabled()) {
				logger.debug( rows + " rows affected (" + (t2-t1) + " ms)");
			}
		
		}
		catch (Exception _e) {
			logger.error( "Exception: " + _e.getMessage(), _e );
			throw new DomicilioDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the domicilio table that matches the specified primary-key value.
	 */
	public Domicilio findByPrimaryKey(DomicilioPk pk) throws DomicilioDaoException
	{
		return findByPrimaryKey( pk.getIdDOMICILIO() );
	}

	/** 
	 * Returns all rows from the domicilio table that match the criteria 'idDOMICILIO = :idDOMICILIO'.
	 */
	public Domicilio findByPrimaryKey(int idDOMICILIO) throws DomicilioDaoException
	{
		Domicilio ret[] = findByDynamicSelect( SQL_SELECT + " WHERE idDOMICILIO = ?", new Object[] {  new Integer(idDOMICILIO) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the domicilio table that match the criteria ''.
	 */
	public Domicilio[] findAll() throws DomicilioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY idDOMICILIO", null );
	}

	/** 
	 * Returns all rows from the domicilio table that match the criteria 'CUENTA_TIPO_DOCUMENTO = :cuentaTipoDocumento AND CUENTA_NUMERO_DOCUMENTO = :cuentaNumeroDocumento'.
	 */
	public Domicilio[] findByCuenta(String cuentaTipoDocumento, String cuentaNumeroDocumento) throws DomicilioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CUENTA_TIPO_DOCUMENTO = ? AND CUENTA_NUMERO_DOCUMENTO = ?", new Object[] { cuentaTipoDocumento, cuentaNumeroDocumento } );
	}

	/** 
	 * Returns all rows from the domicilio table that match the criteria 'MUNICIPIO_idMUNICIPIO = :municipioIdmunicipio'.
	 */
	public Domicilio[] findByMunicipio(int municipioIdmunicipio) throws DomicilioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE MUNICIPIO_idMUNICIPIO = ?", new Object[] {  new Integer(municipioIdmunicipio) } );
	}

	/** 
	 * Returns all rows from the domicilio table that match the criteria 'idDOMICILIO = :idDOMICILIO'.
	 */
	public Domicilio[] findWhereIdDOMICILIOEquals(int idDOMICILIO) throws DomicilioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE idDOMICILIO = ? ORDER BY idDOMICILIO", new Object[] {  new Integer(idDOMICILIO) } );
	}

	/** 
	 * Returns all rows from the domicilio table that match the criteria 'DIRRECION = :dirrecion'.
	 */
	public Domicilio[] findWhereDirrecionEquals(String dirrecion) throws DomicilioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DIRRECION = ? ORDER BY DIRRECION", new Object[] { dirrecion } );
	}

	/** 
	 * Returns all rows from the domicilio table that match the criteria 'TELEFONO = :telefono'.
	 */
	public Domicilio[] findWhereTelefonoEquals(String telefono) throws DomicilioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE TELEFONO = ? ORDER BY TELEFONO", new Object[] { telefono } );
	}

	/** 
	 * Returns all rows from the domicilio table that match the criteria 'LOCALIDAD = :localidad'.
	 */
	public Domicilio[] findWhereLocalidadEquals(String localidad) throws DomicilioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE LOCALIDAD = ? ORDER BY LOCALIDAD", new Object[] { localidad } );
	}

	/** 
	 * Returns all rows from the domicilio table that match the criteria 'BARRIO = :barrio'.
	 */
	public Domicilio[] findWhereBarrioEquals(String barrio) throws DomicilioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE BARRIO = ? ORDER BY BARRIO", new Object[] { barrio } );
	}

	/** 
	 * Returns all rows from the domicilio table that match the criteria 'CUENTA_TIPO_DOCUMENTO = :cuentaTipoDocumento'.
	 */
	public Domicilio[] findWhereCuentaTipoDocumentoEquals(String cuentaTipoDocumento) throws DomicilioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CUENTA_TIPO_DOCUMENTO = ? ORDER BY CUENTA_TIPO_DOCUMENTO", new Object[] { cuentaTipoDocumento } );
	}

	/** 
	 * Returns all rows from the domicilio table that match the criteria 'CUENTA_NUMERO_DOCUMENTO = :cuentaNumeroDocumento'.
	 */
	public Domicilio[] findWhereCuentaNumeroDocumentoEquals(String cuentaNumeroDocumento) throws DomicilioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CUENTA_NUMERO_DOCUMENTO = ? ORDER BY CUENTA_NUMERO_DOCUMENTO", new Object[] { cuentaNumeroDocumento } );
	}

	/** 
	 * Returns all rows from the domicilio table that match the criteria 'MUNICIPIO_idMUNICIPIO = :municipioIdmunicipio'.
	 */
	public Domicilio[] findWhereMunicipioIdmunicipioEquals(int municipioIdmunicipio) throws DomicilioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE MUNICIPIO_idMUNICIPIO = ? ORDER BY MUNICIPIO_idMUNICIPIO", new Object[] {  new Integer(municipioIdmunicipio) } );
	}

	/**
	 * Method 'DomicilioDaoImpl'
	 * 
	 */
	public DomicilioDaoImpl()
	{
	}

	/**
	 * Method 'DomicilioDaoImpl'
	 * 
	 * @param userConn
	 */
	public DomicilioDaoImpl(final java.sql.Connection userConn)
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
		return "tennisshop.domicilio";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Domicilio fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Domicilio dto = new Domicilio();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Domicilio[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Domicilio dto = new Domicilio();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Domicilio ret[] = new Domicilio[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Domicilio dto, ResultSet rs) throws SQLException
	{
		dto.setIdDOMICILIO( rs.getInt( COLUMN_ID_D_O_M_I_C_I_L_I_O ) );
		dto.setDirrecion( rs.getString( COLUMN_DIRRECION ) );
		dto.setTelefono( rs.getString( COLUMN_TELEFONO ) );
		dto.setLocalidad( rs.getString( COLUMN_LOCALIDAD ) );
		dto.setBarrio( rs.getString( COLUMN_BARRIO ) );
		dto.setCuentaTipoDocumento( rs.getString( COLUMN_CUENTA_TIPO_DOCUMENTO ) );
		dto.setCuentaNumeroDocumento( rs.getString( COLUMN_CUENTA_NUMERO_DOCUMENTO ) );
		dto.setMunicipioIdmunicipio( rs.getInt( COLUMN_MUNICIPIO_IDMUNICIPIO ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Domicilio dto)
	{
		dto.setIdDOMICILIOModified( false );
		dto.setDirrecionModified( false );
		dto.setTelefonoModified( false );
		dto.setLocalidadModified( false );
		dto.setBarrioModified( false );
		dto.setCuentaTipoDocumentoModified( false );
		dto.setCuentaNumeroDocumentoModified( false );
		dto.setMunicipioIdmunicipioModified( false );
	}

	/** 
	 * Returns all rows from the domicilio table that match the specified arbitrary SQL statement
	 */
	public Domicilio[] findByDynamicSelect(String sql, Object[] sqlParams) throws DomicilioDaoException
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
			throw new DomicilioDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the domicilio table that match the specified arbitrary SQL statement
	 */
	public Domicilio[] findByDynamicWhere(String sql, Object[] sqlParams) throws DomicilioDaoException
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
			throw new DomicilioDaoException( "Exception: " + _e.getMessage(), _e );
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