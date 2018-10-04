/**
 * 
 */
package com.desingPatterns.structural.bridge_1;

import com.desingPatterns.structural.bridge_1.imp.AbstraccionRefinada;
import com.desingPatterns.structural.bridge_1.imp.ImplementacionA;
import com.desingPatterns.structural.bridge_1.imp.ImplementacionB;

/**
 * @since 04/10/2018
 *
 * @author Israel Rodriguez
 */
public class DEMO {

	public static void main(String... strings) {

		Abstraccion[] abstracciones = new Abstraccion[2];
		abstracciones[0] = new AbstraccionRefinada(new ImplementacionA());
		abstracciones[1] = new AbstraccionRefinada(new ImplementacionB());

		for (Abstraccion abstraccion : abstracciones) {
			abstraccion.operacion();
		}
	}

}
