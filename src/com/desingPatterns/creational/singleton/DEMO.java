package com.desingPatterns.creational.singleton;

/**
 * 
 * @author isivroes
 *
 */
public class DEMO {

	public static void main(String[] args) {
		Configuration configuration = Configuration.getConfiguration("url", "postgres");
		
		System.out.println(configuration.toString());
	}

}
