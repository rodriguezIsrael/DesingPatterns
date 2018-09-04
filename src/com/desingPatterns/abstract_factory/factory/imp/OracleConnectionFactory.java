package com.desingPatterns.abstract_factory.factory.imp;


import com.desingPatterns.abstract_factory.factory.DBConnectionFactory;
import com.desingPatterns.abstract_factory.factory.products.DBConnection;
import com.desingPatterns.abstract_factory.factory.products.imp.OracleConnection;

/**
 * FACTORY FOR ORACLE CONNECTION
 * 
 * @author isivroes
 *
 */
public class OracleConnectionFactory implements DBConnectionFactory {
	@Override
	public DBConnection getConnection() {
		return new OracleConnection();
	}
}
