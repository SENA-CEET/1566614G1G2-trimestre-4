/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package co.edu.sena.controller.dao;

import co.edu.sena.model.dao.dto.*;
import co.edu.sena.controller.dao.exceptions.*;

public interface CompetenciaDao
{
	/** 
	 * Inserts a new row in the competencia table.
	 */
	public CompetenciaPk insert(Competencia dto) throws CompetenciaDaoException;

	/** 
	 * Updates a single row in the competencia table.
	 */
	public void update(CompetenciaPk pk, Competencia dto) throws CompetenciaDaoException;

	/** 
	 * Deletes a single row in the competencia table.
	 */
	public void delete(CompetenciaPk pk) throws CompetenciaDaoException;

	/** 
	 * Returns the rows from the competencia table that matches the specified primary-key value.
	 */
	public Competencia findByPrimaryKey(CompetenciaPk pk) throws CompetenciaDaoException;

	/** 
	 * Returns all rows from the competencia table that match the criteria 'codigo = :codigo AND programa_codigo_version = :programaCodigoVersion'.
	 */
	public Competencia findByPrimaryKey(String codigo, String programaCodigoVersion) throws CompetenciaDaoException;

	/** 
	 * Returns all rows from the competencia table that match the criteria ''.
	 */
	public Competencia[] findAll() throws CompetenciaDaoException;

	/** 
	 * Returns all rows from the competencia table that match the criteria 'programa_codigo_version = :programaCodigoVersion'.
	 */
	public Competencia[] findByPrograma(String programaCodigoVersion) throws CompetenciaDaoException;

	/** 
	 * Returns all rows from the competencia table that match the criteria 'codigo = :codigo'.
	 */
	public Competencia[] findWhereCodigoEquals(String codigo) throws CompetenciaDaoException;

	/** 
	 * Returns all rows from the competencia table that match the criteria 'denominacion = :denominacion'.
	 */
	public Competencia[] findWhereDenominacionEquals(String denominacion) throws CompetenciaDaoException;

	/** 
	 * Returns all rows from the competencia table that match the criteria 'programa_codigo_version = :programaCodigoVersion'.
	 */
	public Competencia[] findWhereProgramaCodigoVersionEquals(String programaCodigoVersion) throws CompetenciaDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the competencia table that match the specified arbitrary SQL statement
	 */
	public Competencia[] findByDynamicSelect(String sql, Object[] sqlParams) throws CompetenciaDaoException;

	/** 
	 * Returns all rows from the competencia table that match the specified arbitrary SQL statement
	 */
	public Competencia[] findByDynamicWhere(String sql, Object[] sqlParams) throws CompetenciaDaoException;

}
