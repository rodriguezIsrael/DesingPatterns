/**
 * 
 */
package com.desingPatterns.structural.bridge_2.imp.color;

import com.desingPatterns.structural.bridge_2.Color;

/**
 * @since 04/10/2018
 *
 * @author Israel Rodriguez
 */
public class Blue implements Color {

	/**
	 * 
	 */
	public Blue() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.desingPatterns.structural.bridge_2.Color#paint()
	 */
	@Override
	public void paint() {
		System.out.println("ITS BLUE");

	}

}
