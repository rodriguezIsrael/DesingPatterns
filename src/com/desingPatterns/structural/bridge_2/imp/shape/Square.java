/**
 * 
 */
package com.desingPatterns.structural.bridge_2.imp.shape;

import com.desingPatterns.structural.bridge_2.Shape;

/**
 * @since 04/10/2018
 *
 * @author Israel Rodriguez
 */
public class Square implements Shape {

	/**
	 * 
	 */
	public Square() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.desingPatterns.structural.bridge_2.Shape#draw()
	 */
	public void draw() {
		System.out.println("Drawing Square");

	}

}
