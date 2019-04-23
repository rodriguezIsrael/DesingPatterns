package com.desingPatterns.creational.decorator_1.decorators;

import com.desingPatterns.creational.decorator_1.Shapes.Shape;

/**
 * 
 * @author Israel Rodriguez
 *
 */
public abstract class ShapeDecorator implements Shape {

	protected Shape decoratedShape;

	public ShapeDecorator(Shape decoratedShape) {
		super();
		this.decoratedShape = decoratedShape;
	}
}
