package com.desingPatterns.structural.composite_2.imp;

import com.desingPatterns.structural.composite_2.Employee;

public class Developer implements Employee {

	private String name;
	private double salary;

	public Developer(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public void add(Employee employee) {
		System.out.println("No tienes privilegios....");
	}

	public Employee getChild(int i) {
		System.out.println("No tienes privilegios....");
		return null;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public void print() {
		System.out.println("-------------");
		System.out.println("Name =" + getName());
		System.out.println("Salary =" + getSalary());
		System.out.println("-------------");
	}

	public void remove(Employee employee) {
		System.out.println("No tienes privilegios....");
	}
}
