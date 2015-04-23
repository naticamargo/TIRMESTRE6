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
import edu.co.sena.dao.FacturaDao;
import edu.co.sena.dto.Factura;
import edu.co.sena.exceptions.FacturaDaoException;
import edu.co.sena.factory.FacturaDaoFactory;
import java.util.Calendar;
import java.util.TimeZone;

public class FacturaDaoSample
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
		// findByCuenta("", "");
		// findWhereIdFacturaEquals(0);
		// findWhereFechaFacturaEquals(null);
		// findWhereFormaPagoEquals("");
		// findWhereCuentaTipoDocumentoEquals("");
		// findWhereCuentaNumeroDocumentoEquals("");
                  Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT-5")); 
                 Date fechaActual= new Date();
                 fechaActual= calendar.getTime();
                 Factura fact= new Factura();
                 fact.setIdFactura(15789);
                 fact.setFechaFactura(fechaActual);
                 fact.setFormaPago("tarjeta");
                 fact.setCuentaTipoDocumento("CC");
                 fact.setCuentaNumeroDocumento("10898562569");
                 
              FacturaDao daofactura=getFacturaDao();
              daofactura.insert(fact);
              findAll();
              System.out.println("----------------");
                 
                         
                 
                 
               
                         
        }

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			FacturaDao _dao = getFacturaDao();
			Factura _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByCuenta'
	 * 
	 * @param cuentaTipoDocumento
	 * @param cuentaNumeroDocumento
	 */
	public static void findByCuenta(String cuentaTipoDocumento, String cuentaNumeroDocumento)
	{
		try {
			FacturaDao _dao = getFacturaDao();
			Factura _result[] = _dao.findByCuenta(cuentaTipoDocumento, cuentaNumeroDocumento);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereIdFacturaEquals'
	 * 
	 * @param idFactura
	 */
	public static void findWhereIdFacturaEquals(int idFactura)
	{
		try {
			FacturaDao _dao = getFacturaDao();
			Factura _result[] = _dao.findWhereIdFacturaEquals(idFactura);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereFechaFacturaEquals'
	 * 
	 * @param fechaFactura
	 */
	public static void findWhereFechaFacturaEquals(Date fechaFactura)
	{
		try {
			FacturaDao _dao = getFacturaDao();
			Factura _result[] = _dao.findWhereFechaFacturaEquals(fechaFactura);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereFormaPagoEquals'
	 * 
	 * @param formaPago
	 */
	public static void findWhereFormaPagoEquals(String formaPago)
	{
		try {
			FacturaDao _dao = getFacturaDao();
			Factura _result[] = _dao.findWhereFormaPagoEquals(formaPago);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereCuentaTipoDocumentoEquals'
	 * 
	 * @param cuentaTipoDocumento
	 */
	public static void findWhereCuentaTipoDocumentoEquals(String cuentaTipoDocumento)
	{
		try {
			FacturaDao _dao = getFacturaDao();
			Factura _result[] = _dao.findWhereCuentaTipoDocumentoEquals(cuentaTipoDocumento);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereCuentaNumeroDocumentoEquals'
	 * 
	 * @param cuentaNumeroDocumento
	 */
	public static void findWhereCuentaNumeroDocumentoEquals(String cuentaNumeroDocumento)
	{
		try {
			FacturaDao _dao = getFacturaDao();
			Factura _result[] = _dao.findWhereCuentaNumeroDocumentoEquals(cuentaNumeroDocumento);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getFacturaDao'
	 * 
	 * @return FacturaDao
	 */
	public static FacturaDao getFacturaDao()
	{
		return FacturaDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(Factura dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getIdFactura() );
		buf.append( ", " );
		buf.append( dto.getFechaFactura() );
		buf.append( ", " );
		buf.append( dto.getFormaPago() );
		buf.append( ", " );
		buf.append( dto.getCuentaTipoDocumento() );
		buf.append( ", " );
		buf.append( dto.getCuentaNumeroDocumento() );
		System.out.println( buf.toString() );
	}

}
