package com.desingPatterns.creational.decorator_1.Shapes.imp;

import com.desingPatterns.creational.decorator_1.Shapes.Shape;

/**
 * 
 * @author Israel Rodriguez
 *
 */
public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Drawing Circle");
	}

	@Override
	public void resize() {
		System.out.println("Rezising Circle");
	}

	@Override
	public String description() {
		System.out.println("Circle object");
		return null;
	}

	@Override
	public boolean isHide() {
		System.out.println("Showing if Circle is hide");
		return false;
	}

}
