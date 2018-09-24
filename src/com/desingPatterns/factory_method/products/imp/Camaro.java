/**
 * 
 */
package com.desingPatterns.factory_method.products.imp;

import com.desingPatterns.factory_method.products.Car;

/**
 * @since 24/09/2018
 *
 * @author Israel Rodriguez
 */
public class Camaro implements Car {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.desingPatterns.factory_method.Car#run()
	 */
	public void run() {
		System.out.println("Camaro is running");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.desingPatterns.factory_method.Car#stop()
	 */
	public void stop() {
		System.out.println("Camaro is Stopping");

	}

}
