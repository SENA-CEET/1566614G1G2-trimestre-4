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

public interface ListaChequeoDao
{
	/** 
	 * Inserts a new row in the lista_chequeo table.
	 */
	public ListaChequeoPk insert(ListaChequeo dto) throws ListaChequeoDaoException;

	/** 
	 * Updates a single row in the lista_chequeo table.
	 */
	public void update(ListaChequeoPk pk, ListaChequeo dto) throws ListaChequeoDaoException;

	/** 
	 * Deletes a single row in the lista_chequeo table.
	 */
	public void delete(ListaChequeoPk pk) throws ListaChequeoDaoException;

	/** 
	 * Returns the rows from the lista_chequeo table that matches the specified primary-key value.
	 */
	public ListaChequeo findByPrimaryKey(ListaChequeoPk pk) throws ListaChequeoDaoException;

	/** 
	 * Returns all rows from the lista_chequeo table that match the criteria 'id_lista = :idLista'.
	 */
	public ListaChequeo findByPrimaryKey(String idLista) throws ListaChequeoDaoException;

	/** 
	 * Returns all rows from the lista_chequeo table that match the criteria ''.
	 */
	public ListaChequeo[] findAll() throws ListaChequeoDaoException;

	/** 
	 * Returns all rows from the lista_chequeo table that match the criteria 'programa_codigo_version = :programaCodigoVersion'.
	 */
	public ListaChequeo[] findByPrograma(String programaCodigoVersion) throws ListaChequeoDaoException;

	/** 
	 * Returns all rows from the lista_chequeo table that match the criteria 'id_lista = :idLista'.
	 */
	public ListaChequeo[] findWhereIdListaEquals(String idLista) throws ListaChequeoDaoException;

	/** 
	 * Returns all rows from the lista_chequeo table that match the criteria 'estado = :estado'.
	 */
	public ListaChequeo[] findWhereEstadoEquals(short estado) throws ListaChequeoDaoException;

	/** 
	 * Returns all rows from the lista_chequeo table that match the criteria 'programa_codigo_version = :programaCodigoVersion'.
	 */
	public ListaChequeo[] findWhereProgramaCodigoVersionEquals(String programaCodigoVersion) throws ListaChequeoDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the lista_chequeo table that match the specified arbitrary SQL statement
	 */
	public ListaChequeo[] findByDynamicSelect(String sql, Object[] sqlParams) throws ListaChequeoDaoException;

	/** 
	 * Returns all rows from the lista_chequeo table that match the specified arbitrary SQL statement
	 */
	public ListaChequeo[] findByDynamicWhere(String sql, Object[] sqlParams) throws ListaChequeoDaoException;

}
