package com.desingPatterns.creational.abstract_factory.factory.imp;

import com.desingPatterns.creational.abstract_factory.factory.DBConnectionFactory;
import com.desingPatterns.creational.abstract_factory.factory.products.DBConnection;
import com.desingPatterns.creational.abstract_factory.factory.products.imp.PostgresConnection;

/**
 * FACTORY FOR POSTGRES CONNECTION
 * 
 * @author isivroes
 *
 */
public class PostgresConnectionFactory implements DBConnectionFactory {
	@Override
	public DBConnection getConnection() {
		return new PostgresConnection();
	}
}
