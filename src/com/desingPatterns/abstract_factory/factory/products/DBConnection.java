package com.desingPatterns.abstract_factory.factory.products;

/**
 * ABSTRACT PRODUCT
 * 
 * @author isivroes
 *
 */
public interface DBConnection {

	/**
	 * METHOD FOR DOING CONNECTION
	 * 
	 * @return boolean
	 */
	public boolean doingConnection();

	/**
	 * INFORMATION ABOUT CONNECTION
	 */
	public void statusConnection();

}
