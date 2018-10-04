/**
 * 
 */
package com.desingPatterns.structural.bridge_1.imp;

import com.desingPatterns.structural.bridge_1.Implementador;

/**
 * @since 04/10/2018
 *
 * @author Israel Rodriguez
 */
public class ImplementacionA implements Implementador {

	/**
	 * 
	 */
	public ImplementacionA() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.desingPatterns.structural.bridge.Implementador#operacion()
	 */
	@Override
	public void operacion() {
		System.out.println("Esta es la implementacion A");

	}

}
