package com.desingPatterns.structural.decorator_1.decorators;

import com.desingPatterns.structural.decorator_1.Shapes.Shape;
import com.desingPatterns.structural.decorator_1.enums.Color;

public class FillColorDecorator extends ShapeDecorator {

	protected Color color;

	public FillColorDecorator(Shape decoratedShape, Color color) {
		super(decoratedShape);
		this.color = color;
	}

	@Override
	public void draw() {
		decoratedShape.draw();
		System.out.println("Fill Color: " + color);
	}

	@Override
	public void resize() {
		decoratedShape.resize();
	}

	@Override
	public String description() {
		return decoratedShape.description() + " filled with " + color + " color.";
	}

	@Override
	public boolean isHide() {

		return decoratedShape.isHide();
	}

}
