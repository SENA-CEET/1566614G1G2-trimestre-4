/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package co.edu.sena.controller.dao.jdbc;

import co.edu.sena.controller.dao.*;
import co.edu.sena.controller.factory.*;
import co.edu.sena.model.dao.dto.*;
import co.edu.sena.controller.dao.exceptions.*;
import java.sql.Connection;
import java.util.Collection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class TipoDocumentoDaoImpl extends AbstractDAO implements TipoDocumentoDao
{
	/** 
	 * The factory class for this DAO has two versions of the create() method - one that
takes no arguments and one that takes a Connection argument. If the Connection version
is chosen then the connection will be stored in this attribute and will be used by all
calls to this DAO, otherwise a new Connection will be allocated for each operation.
	 */
	protected Connection userConn;

	/** 
	 * All finder methods in this class use this SELECT constant to build their queries
	 */
	protected final String SQL_SELECT = "SELECT documento, descripcion, estado FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( documento, descripcion, estado ) VALUES ( ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET documento = ?, descripcion = ?, estado = ? WHERE documento = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE documento = ?";

	/** 
	 * Index of column documento
	 */
	protected static final int COLUMN_DOCUMENTO = 1;

	/** 
	 * Index of column descripcion
	 */
	protected static final int COLUMN_DESCRIPCION = 2;

	/** 
	 * Index of column estado
	 */
	protected static final int COLUMN_ESTADO = 3;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 3;

	/** 
	 * Index of primary-key column documento
	 */
	protected static final int PK_COLUMN_DOCUMENTO = 1;

	/** 
	 * Inserts a new row in the tipo_documento table.
	 */
	public TipoDocumentoPk insert(TipoDocumento dto) throws TipoDocumentoDaoException
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
		
			stmt = conn.prepareStatement( SQL_INSERT );
			int index = 1;
			stmt.setString( index++, dto.getDocumento() );
			stmt.setString( index++, dto.getDescripcion() );
			stmt.setShort( index++, dto.getEstado() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new TipoDocumentoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the tipo_documento table.
	 */
	public void update(TipoDocumentoPk pk, TipoDocumento dto) throws TipoDocumentoDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_UPDATE + " with DTO: " + dto );
			stmt = conn.prepareStatement( SQL_UPDATE );
			int index=1;
			stmt.setString( index++, dto.getDocumento() );
			stmt.setString( index++, dto.getDescripcion() );
			stmt.setShort( index++, dto.getEstado() );
			stmt.setString( 4, pk.getDocumento() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new TipoDocumentoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the tipo_documento table.
	 */
	public void delete(TipoDocumentoPk pk) throws TipoDocumentoDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_DELETE + " with PK: " + pk );
			stmt = conn.prepareStatement( SQL_DELETE );
			stmt.setString( 1, pk.getDocumento() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new TipoDocumentoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the tipo_documento table that matches the specified primary-key value.
	 */
	public TipoDocumento findByPrimaryKey(TipoDocumentoPk pk) throws TipoDocumentoDaoException
	{
		return findByPrimaryKey( pk.getDocumento() );
	}

	/** 
	 * Returns all rows from the tipo_documento table that match the criteria 'documento = :documento'.
	 */
	public TipoDocumento findByPrimaryKey(String documento) throws TipoDocumentoDaoException
	{
		TipoDocumento ret[] = findByDynamicSelect( SQL_SELECT + " WHERE documento = ?", new Object[] { documento } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the tipo_documento table that match the criteria ''.
	 */
	public TipoDocumento[] findAll() throws TipoDocumentoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY documento", null );
	}

	/** 
	 * Returns all rows from the tipo_documento table that match the criteria 'documento = :documento'.
	 */
	public TipoDocumento[] findWhereDocumentoEquals(String documento) throws TipoDocumentoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE documento = ? ORDER BY documento", new Object[] { documento } );
	}

	/** 
	 * Returns all rows from the tipo_documento table that match the criteria 'descripcion = :descripcion'.
	 */
	public TipoDocumento[] findWhereDescripcionEquals(String descripcion) throws TipoDocumentoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE descripcion = ? ORDER BY descripcion", new Object[] { descripcion } );
	}

	/** 
	 * Returns all rows from the tipo_documento table that match the criteria 'estado = :estado'.
	 */
	public TipoDocumento[] findWhereEstadoEquals(short estado) throws TipoDocumentoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE estado = ? ORDER BY estado", new Object[] {  new Short(estado) } );
	}

	/**
	 * Method 'TipoDocumentoDaoImpl'
	 * 
	 */
	public TipoDocumentoDaoImpl()
	{
	}

	/**
	 * Method 'TipoDocumentoDaoImpl'
	 * 
	 * @param userConn
	 */
	public TipoDocumentoDaoImpl(final Connection userConn)
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
		return "observador_de_proyectos.tipo_documento";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected TipoDocumento fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			TipoDocumento dto = new TipoDocumento();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected TipoDocumento[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			TipoDocumento dto = new TipoDocumento();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		TipoDocumento ret[] = new TipoDocumento[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(TipoDocumento dto, ResultSet rs) throws SQLException
	{
		dto.setDocumento( rs.getString( COLUMN_DOCUMENTO ) );
		dto.setDescripcion( rs.getString( COLUMN_DESCRIPCION ) );
		dto.setEstado( rs.getShort( COLUMN_ESTADO ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(TipoDocumento dto)
	{
	}

	/** 
	 * Returns all rows from the tipo_documento table that match the specified arbitrary SQL statement
	 */
	public TipoDocumento[] findByDynamicSelect(String sql, Object[] sqlParams) throws TipoDocumentoDaoException
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
		
		
			System.out.println( "Executing " + SQL );
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
			_e.printStackTrace();
			throw new TipoDocumentoDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the tipo_documento table that match the specified arbitrary SQL statement
	 */
	public TipoDocumento[] findByDynamicWhere(String sql, Object[] sqlParams) throws TipoDocumentoDaoException
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
		
		
			System.out.println( "Executing " + SQL );
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
			_e.printStackTrace();
			throw new TipoDocumentoDaoException( "Exception: " + _e.getMessage(), _e );
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
