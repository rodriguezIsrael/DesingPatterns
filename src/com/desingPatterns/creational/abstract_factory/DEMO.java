package com.desingPatterns.creational.abstract_factory;

import com.desingPatterns.creational.abstract_factory.factory.DBConnectionFactory;
import com.desingPatterns.creational.abstract_factory.factory.imp.MySQLConnectionFactory;
import com.desingPatterns.creational.abstract_factory.factory.imp.OracleConnectionFactory;
import com.desingPatterns.creational.abstract_factory.factory.imp.PostgresConnectionFactory;
import com.desingPatterns.creational.abstract_factory.factory.products.DBConnection;

/**
 * THIS IS AN EXAMPLE OF ABSTRACT FACTORY.
 * 
 * 
 * @author isivroes
 *
 */
public class DEMO {

	public static void main(String[] args) {
		
		String option = "MYSQL";
//		String option = "POSTGRES";
//		String option = "ORACLE";

		
		
		
		switch (option) {
		case "ORACLE":
			createConnection(new OracleConnectionFactory());
			break;

		case "POSTGRES":
			createConnection(new PostgresConnectionFactory());

			break;

		case "MYSQL":
			createConnection(new MySQLConnectionFactory());

			break;

		default:
			break;
		}
	}

	/**
	 * 
	 * @param factory - DBConnectionFactory
	 */
	public static void createConnection(DBConnectionFactory factory) {
		DBConnection connection = factory.getConnection();
		connection.doingConnection();
		connection.statusConnection();
	}

}
