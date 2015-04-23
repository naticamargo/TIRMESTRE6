/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.negocio.example2;

import edu.co.sena.negocio.example.*;
import java.math.*;
import java.util.Date;
import java.util.Collection;
import edu.co.sena.dao.CatalogoDao;
import edu.co.sena.dto.Catalogo;
import edu.co.sena.exceptions.CatalogoDaoException;
import edu.co.sena.factory.CatalogoDaoFactory;

public class CatalogoDaoSample
{
	/**
	 * Method 'main'
	 * 
	 * @param arg
	 * @throws Exception
	 */
	public static void main(String[] arg) throws Exception
	{
		// Uncomment one of the lines below to test the generated code
		
		 findAll();
		// findWhereIdCatologoEquals(0);
		// findWhereNombreEquals("");
		// findWhereDescripcionEquals("");
             Catalogo cat= new Catalogo();
             cat.setIdCatologo(154);
             cat.setNombre("Tennis");
             cat.setDescripcion("Dama vs Caballero");
             
             CatalogoDao daoCatalogo=getCatalogoDao();
           daoCatalogo.insert(cat);
             findAll();
             System.out.println("-------------");
             cat.setNombre("tenis dama");
             //daoCatalogo.update(cat.createPk(), cat);
             
             //daoCatalogo.delete(cat.createPk());
             findAll();
             System.out.println("------------------");   
                   
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			CatalogoDao _dao = getCatalogoDao();
			Catalogo _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereIdCatologoEquals'
	 * 
	 * @param idCatologo
	 */
	public static void findWhereIdCatologoEquals(int idCatologo)
	{
		try {
			CatalogoDao _dao = getCatalogoDao();
			Catalogo _result[] = _dao.findWhereIdCatologoEquals(idCatologo);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereNombreEquals'
	 * 
	 * @param nombre
	 */
	public static void findWhereNombreEquals(String nombre)
	{
		try {
			CatalogoDao _dao = getCatalogoDao();
			Catalogo _result[] = _dao.findWhereNombreEquals(nombre);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereDescripcionEquals'
	 * 
	 * @param descripcion
	 */
	public static void findWhereDescripcionEquals(String descripcion)
	{
		try {
			CatalogoDao _dao = getCatalogoDao();
			Catalogo _result[] = _dao.findWhereDescripcionEquals(descripcion);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getCatalogoDao'
	 * 
	 * @return CatalogoDao
	 */
	public static CatalogoDao getCatalogoDao()
	{
		return CatalogoDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(Catalogo dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getIdCatologo() );
		buf.append( ", " );
		buf.append( dto.getNombre() );
		buf.append( ", " );
		buf.append( dto.getDescripcion() );
		System.out.println( buf.toString() );
	}

}
