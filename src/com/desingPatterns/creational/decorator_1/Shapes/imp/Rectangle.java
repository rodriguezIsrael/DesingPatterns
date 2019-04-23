package com.desingPatterns.creational.decorator_1.Shapes.imp;

import com.desingPatterns.creational.decorator_1.Shapes.Shape;

/**
 * 
 * @author Israel Rodriguez
 *
 */
public class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("Drawing Rectangle");
	}

	@Override
	public void resize() {
		System.out.println("Rezising Rectangle");
	}

	@Override
	public String description() {
		System.out.println("Rectangle object");
		return null;
	}

	@Override
	public boolean isHide() {
		System.out.println("Showing if Rectangle is hide");
		return false;
	}


	
}
