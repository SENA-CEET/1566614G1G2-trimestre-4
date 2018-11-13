/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package co.edu.sena.model.dao.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the tipo_instructor table.
 */
public class TipoInstructorPk implements Serializable
{
	protected String modalidad;

	/** 
	 * Sets the value of modalidad
	 */
	public void setModalidad(String modalidad)
	{
		this.modalidad = modalidad;
	}

	/** 
	 * Gets the value of modalidad
	 */
	public String getModalidad()
	{
		return modalidad;
	}

	/**
	 * Method 'TipoInstructorPk'
	 * 
	 */
	public TipoInstructorPk()
	{
	}

	/**
	 * Method 'TipoInstructorPk'
	 * 
	 * @param modalidad
	 */
	public TipoInstructorPk(final String modalidad)
	{
		this.modalidad = modalidad;
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
		
		if (!(_other instanceof TipoInstructorPk)) {
			return false;
		}
		
		final TipoInstructorPk _cast = (TipoInstructorPk) _other;
		if (modalidad == null ? _cast.modalidad != modalidad : !modalidad.equals( _cast.modalidad )) {
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
		if (modalidad != null) {
			_hashCode = 29 * _hashCode + modalidad.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "co.edu.sena.model.dao.dto.TipoInstructorPk: " );
		ret.append( "modalidad=" + modalidad );
		return ret.toString();
	}

}