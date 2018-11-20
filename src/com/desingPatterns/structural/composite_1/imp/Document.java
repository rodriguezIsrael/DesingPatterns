package com.desingPatterns.structural.composite_1.imp;

import com.desingPatterns.structural.composite_1.File;

public class Document implements File{

	private String name;
	
	public Document(String name) {
		this.name = name;
	}
	
	@Override
	public void add(File file) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(File file) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		System.out.println("******************");
		System.out.println("FILE: " + this.name);
		System.out.println("******************");
	}

}
