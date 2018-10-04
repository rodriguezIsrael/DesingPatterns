package com.desingPatterns.creational.abstract_factory.factory.imp;


import com.desingPatterns.creational.abstract_factory.factory.DBConnectionFactory;
import com.desingPatterns.creational.abstract_factory.factory.products.DBConnection;
import com.desingPatterns.creational.abstract_factory.factory.products.imp.MysqlConnection;

/**
 * FACTORY FOR MYSQL CONNECTION
 * 
 * @author isivroes
 *
 */
public class MySQLConnectionFactory implements DBConnectionFactory{

	@Override
	public DBConnection getConnection() {
		return new MysqlConnection();
	}

}
