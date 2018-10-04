/**
 * 
 */
package com.desingPatterns.structural.bridge_1.imp;

import com.desingPatterns.structural.bridge_1.Abstraccion;
import com.desingPatterns.structural.bridge_1.Implementador;

/**
 * @since 04/10/2018
 *
 * @author Israel Rodriguez
 */
public class AbstraccionRefinada implements Abstraccion {

	private Implementador implementador;

	/**
	 * 
	 */
	public AbstraccionRefinada(Implementador implementador) {
		this.implementador = implementador;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.desingPatterns.structural.bridge.Abstraccion#operacion()
	 */
	@Override
	public void operacion() {
		implementador.operacion();
	}
}