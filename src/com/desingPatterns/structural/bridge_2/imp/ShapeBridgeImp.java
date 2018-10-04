/**
 * 
 */
package com.desingPatterns.structural.bridge_2.imp;

import com.desingPatterns.structural.bridge_2.Color;
import com.desingPatterns.structural.bridge_2.ShapeBridge;
import com.desingPatterns.structural.bridge_2.Shape;

/**
 * @since 04/10/2018
 *
 * @author Israel Rodriguez
 */
public class ShapeBridgeImp implements ShapeBridge {

	private Shape shape;
	private Color color;

	/**
	* 
	*/
	public ShapeBridgeImp(Shape shape, Color color) {
		this.shape = shape;
		this.color = color;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.desingPatterns.structural.bridge_2.DrawShape#draw()
	 */
	@Override
	public void draw() {
		shape.draw();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.desingPatterns.structural.bridge_2.DrawShape#paint()
	 */
	@Override
	public void paint() {
		color.paint();

	}

	@Override

	public void drawAndPaint() {
		this.draw();
		this.paint();
	}
}
