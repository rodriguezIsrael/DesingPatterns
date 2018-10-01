package com.desingPatterns.creational.builder_pattern.dto;

/**
 * 
 * 
 * 
 * @author isivroes
 *
 */
public class Person {

	// -------------------------------
	// ---------- variables ----------
	// -------------------------------

	/**
	 * Person Name
	 */
	private String name;

	/**
	 * Person Country
	 */
	private String country;

	/**
	 * Person Age
	 */
	private int age;

	// -------------------------------
	// -------- constructors ---------
	// -------------------------------

	public Person() {

	}

	// -------------------------
	// -- setters and getters --
	// -------------------------

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country
	 *            the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [" + (name != null ? "name=" + name + ", " : "")
				+ (country != null ? "country=" + country + ", " : "") + "age=" + age + "]";
	}

}
