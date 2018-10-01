package com.desingPatterns.creational.abstract_factory.factory.products.imp;

import com.desingPatterns.creational.abstract_factory.factory.products.DBConnection;

/**
 * 
 * @author isivroes
 *
 */
public class OracleConnection implements DBConnection{

	@Override
	public boolean doingConnection() {
		System.out.println("Realizando conexión via ORACLE");
		return true;
	}

	@Override
	public void statusConnection() {
		System.out.println("CONEXION A ORACLE ESTABLECIDA");		
	}

}
