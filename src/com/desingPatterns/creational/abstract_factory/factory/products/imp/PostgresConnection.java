package com.desingPatterns.creational.abstract_factory.factory.products.imp;

import com.desingPatterns.creational.abstract_factory.factory.products.DBConnection;

/**
 * 
 * @author isivroes
 *
 */
public class PostgresConnection implements DBConnection {

	@Override
	public boolean doingConnection() {
		System.out.println("Realizando conexi�n via POSTGRES");
		return true;
	}

	@Override
	public void statusConnection() {
		System.out.println("CONEXION A POSTGRES ESTABLECIDA");
	}
}
