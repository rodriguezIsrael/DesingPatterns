package com.desingPatterns.builder_pattern.builder;

public class Student {

	private String name;
	private int age;
	private String gender;
	private String university;
	private String bachelorship;

	private Student() {
		System.out.println("create new Student...");
	}

	public static class Builder {
		Student student;

		public Builder() {
			student = new Student();
		}

		public Builder setName(String name) {
			student.name = name;
			return this;
		}

		public Builder setAge(int age) {
			student.age = age;
			return this;
		}

		public Builder setGender(String gender) {
			student.gender = gender;
			return this;
		}

		public BuilderUniversity buildUniversity() {
			return new BuilderUniversity(student);
		}

		public BuilderBachelorship buildBachelorship() {
			return new BuilderBachelorship(student);
		}

	}

	public static class BuilderUniversity {
		Student student;

		public BuilderUniversity(Student student) {
			this.student = student;
		}

		public BuilderUniversity setUniversity(String university) {
			this.student.university = university;
			return this;
		}

		public Student build() {
			return student;
		}
	}

	public static class BuilderBachelorship {
		Student student;

		public BuilderBachelorship(Student student) {
			this.student = student;
		}

		public BuilderBachelorship setBachelorship(String bachelorship) {
			this.student.bachelorship = bachelorship;
			return this;
		}

		public Student build() {
			return student;
		}
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @return the university
	 */
	public String getUniversity() {
		return university;
	}

	/**
	 * @return the bachelorship
	 */
	public String getBachelorship() {
		return bachelorship;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder2 = new StringBuilder();
		builder2.append("Student [");
		if (name != null)
			builder2.append("name=").append(name).append(", ");
		builder2.append("age=").append(age).append(", ");
		if (gender != null)
			builder2.append("gender=").append(gender).append(", ");
		if (university != null)
			builder2.append("university=").append(university).append(", ");
		if (bachelorship != null)
			builder2.append("bachelorship=").append(bachelorship);
		builder2.append("]");
		return builder2.toString();
	}

}
