package com.desingPatterns.structural.composite_1;

public interface File  {

	public void add(File file);

	public void delete(int index);

	public void delete(File file);

	public void show();
}
