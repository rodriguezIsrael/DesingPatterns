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
public class Ferrary implements Car {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.desingPatterns.factory_method.Car#run()
	 */
	@Override
	public void run() {
		System.out.println("Ferrary is running");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.desingPatterns.factory_method.Car#stop()
	 */
	@Override
	public void stop() {
		System.out.println("Ferrary is Stopping");

	}

}
