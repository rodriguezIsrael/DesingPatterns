/**
 * 
 */
package com.desingPatterns.structural.bridge_2;

import com.desingPatterns.structural.bridge_2.imp.ShapeBridgeImp;
import com.desingPatterns.structural.bridge_2.imp.color.Green;
import com.desingPatterns.structural.bridge_2.imp.color.Red;
import com.desingPatterns.structural.bridge_2.imp.shape.Circle;
import com.desingPatterns.structural.bridge_2.imp.shape.Square;

/**
 * @since 04/10/2018
 *
 * @author Israel Rodriguez
 */
public class DEMO {

	/**
	 * 
	 */
	public DEMO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ShapeBridge shapeBridge = new ShapeBridgeImp(new Square(), new Red());
		shapeBridge.draw();
		shapeBridge.paint();

		ShapeBridge shapeBridge2 = new ShapeBridgeImp(new Circle(), new Green());
		shapeBridge2.drawAndPaint();

	}

}
