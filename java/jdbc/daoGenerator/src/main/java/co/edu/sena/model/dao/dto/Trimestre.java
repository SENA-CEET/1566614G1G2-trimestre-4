/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package co.edu.sena.model.dao.dto;

import co.edu.sena.controller.dao.*;
import co.edu.sena.controller.factory.*;
import co.edu.sena.controller.dao.exceptions.*;
import java.io.Serializable;
import java.util.*;

public class Trimestre implements Serializable
{
	/** 
	 * This attribute maps to the column id_trimestre in the trimestre table.
	 */
	protected String idTrimestre;

	/** 
	 * This attribute maps to the column jornada_nombre in the trimestre table.
	 */
	protected String jornadaNombre;

	/**
	 * Method 'Trimestre'
	 * 
	 */
	public Trimestre()
	{
	}

	/**
	 * Method 'getIdTrimestre'
	 * 
	 * @return String
	 */
	public String getIdTrimestre()
	{
		return idTrimestre;
	}

	/**
	 * Method 'setIdTrimestre'
	 * 
	 * @param idTrimestre
	 */
	public void setIdTrimestre(String idTrimestre)
	{
		this.idTrimestre = idTrimestre;
	}

	/**
	 * Method 'getJornadaNombre'
	 * 
	 * @return String
	 */
	public String getJornadaNombre()
	{
		return jornadaNombre;
	}

	/**
	 * Method 'setJornadaNombre'
	 * 
	 * @param jornadaNombre
	 */
	public void setJornadaNombre(String jornadaNombre)
	{
		this.jornadaNombre = jornadaNombre;
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
		
		if (!(_other instanceof Trimestre)) {
			return false;
		}
		
		final Trimestre _cast = (Trimestre) _other;
		if (idTrimestre == null ? _cast.idTrimestre != idTrimestre : !idTrimestre.equals( _cast.idTrimestre )) {
			return false;
		}
		
		if (jornadaNombre == null ? _cast.jornadaNombre != jornadaNombre : !jornadaNombre.equals( _cast.jornadaNombre )) {
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
		if (idTrimestre != null) {
			_hashCode = 29 * _hashCode + idTrimestre.hashCode();
		}
		
		if (jornadaNombre != null) {
			_hashCode = 29 * _hashCode + jornadaNombre.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return TrimestrePk
	 */
	public TrimestrePk createPk()
	{
		return new TrimestrePk(idTrimestre, jornadaNombre);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "co.edu.sena.model.dao.dto.Trimestre: " );
		ret.append( "idTrimestre=" + idTrimestre );
		ret.append( ", jornadaNombre=" + jornadaNombre );
		return ret.toString();
	}

}
