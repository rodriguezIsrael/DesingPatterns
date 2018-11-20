package com.desingPatterns.structural.composite_2.imp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.desingPatterns.structural.composite_2.Employee;

public class Manager implements Employee{

	private String name;
	private double salary;
	List<Employee> employees = new ArrayList<Employee>();

	public Manager(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public void add(Employee employee) {
		employees.add(employee);
	}

	public Employee getChild(int i) {
		return employees.get(i);
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

		Iterator<Employee> employeeIterator = employees.iterator();
		while (employeeIterator.hasNext()) {
			Employee employee = employeeIterator.next();
			employee.print();
		}
	}

	public void remove(Employee employee) {
		employees.remove(employee);
	}
}
