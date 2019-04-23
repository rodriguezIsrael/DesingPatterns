package com.desingPatterns.creational.decorator_1.decorators;

import com.desingPatterns.creational.decorator_1.Shapes.Shape;
import com.desingPatterns.creational.decorator_1.enums.Color;

/**
 * 
 * @author Israel Rodriguez
 *
 */
public class LineColorDecorator extends ShapeDecorator {

	protected Color color;

	public LineColorDecorator(Shape decoratedShape, Color color) {
		super(decoratedShape);
		this.color = color;
	}

	@Override
	public void draw() {
		decoratedShape.draw();
		System.out.println("Line color: " + color);
	}

	@Override
	public void resize() {
		decoratedShape.resize();

	}

	@Override
	public String description() {

		return decoratedShape.description() + "draw with " + color + " color.";
	}

	@Override
	public boolean isHide() {
		return decoratedShape.isHide();
	}

}
