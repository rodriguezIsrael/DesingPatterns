package com.desingPatterns.creational.abstract_factory.factory;

import com.desingPatterns.creational.abstract_factory.factory.products.DBConnection;

/**
 * ABSTRACT FACTORY
 * 
 * @author isivroes
 *
 */
public interface DBConnectionFactory {

	/**
	 * GET CONNECTION
	 * 
	 * @return DBConnection
	 */
	public DBConnection getConnection();
}
