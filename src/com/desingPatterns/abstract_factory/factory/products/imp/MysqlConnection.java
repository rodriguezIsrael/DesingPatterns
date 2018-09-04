package com.desingPatterns.abstract_factory.factory.products.imp;

import com.desingPatterns.abstract_factory.factory.products.DBConnection;

/**
 * 
 * @author isivroes
 *
 */
public class MysqlConnection implements DBConnection {

	@Override
	public boolean doingConnection() {
		System.out.println("Doing MYSQL connection");
		return true;
	}

	@Override
	public void statusConnection() {
		System.out.println("connection MYSQL done.");
	}

}
