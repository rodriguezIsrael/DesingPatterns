package com.desingPatterns.builder_pattern.builder;

import com.desingPatterns.builder_pattern.dto.Person;

/**
 * This is a person Builder
 * 
 * @author isivroes
 *
 */
public class PersonBuilder {

	/**
	 * Person
	 */
	private Person person;

	/**
	 * Create a new Person
	 */
	public PersonBuilder() {
		person = new Person();
	}

	/**
	 * Set name
	 * 
	 * @param name
	 * @return PersonBuilder
	 */
	public PersonBuilder setName(String name) {
		person.setName(name);
		return this;
	}

	/**
	 * Set country
	 * 
	 * @param country
	 * @return PersonBuilder
	 */
	public PersonBuilder setCountry(String country) {
		person.setCountry(country);
		return this;
	}

	/**
	 * set Age
	 * 
	 * @param age
	 * @return PersonBuilder
	 */
	public PersonBuilder setAge(int age) {
		person.setAge(age);
		return this;
	}

	/**
	 * build a person
	 * 
	 * @return Person
	 */
	public Person build() {
		return person;
	}
}
