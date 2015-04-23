/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.factory;

import java.sql.Connection;
import edu.co.sena.dao.*;
import edu.co.sena.jdbc.*;

public class DomicilioDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return DomicilioDao
	 */
	public static DomicilioDao create()
	{
		return new DomicilioDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return DomicilioDao
	 */
	public static DomicilioDao create(Connection conn)
	{
		return new DomicilioDaoImpl( conn );
	}

}
