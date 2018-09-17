
package com.desingPatterns.builder_pattern;


import com.desingPatterns.builder_pattern.builder.LaptopBuilder;
import com.desingPatterns.builder_pattern.builder.PersonBuilder;
import com.desingPatterns.builder_pattern.dto.Person;

/**
 * @author isivroes
 *
 */
public class DEMO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Person person = new PersonBuilder().setName("Israel").setCountry("Mexico").setAge(26).build();
		System.out.println(person.toString());

		LaptopBuilder laptop = new LaptopBuilder().setSo("Ubuntu").setDisk("1 TB").setRam("16 GB");
		System.out.println(laptop.toString());

	}

}
