package com.desingPatterns.structural.composite_1.imp;

import java.util.ArrayList;
import java.util.List;

import com.desingPatterns.structural.composite_1.File;

public class Folder implements File {

	private String name;

	List<File> files = new ArrayList<File>();

	public Folder(String name) {
		this.name = name;
	}

	@Override
	public void add(File file) {
		this.files.add(file);
	}

	@Override
	public void delete(int index) {
		this.files.remove(index);
	}

	@Override
	public void delete(File file) {
		this.files.remove(file);
	}

	@Override
	public void show() {
		System.out.println("***********");
		System.out.println("folder name: " + this.name);
		for (File file : this.files) {
			System.out.println("***********");
			file.show();
			System.out.println("***********");
		}

	}

}
