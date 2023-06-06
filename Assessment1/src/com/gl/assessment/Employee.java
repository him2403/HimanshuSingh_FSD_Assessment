package com.gl.assessment;

public class Employee {

	private String firstName, lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Employee(String a, String b) {
		firstName = a;
		lastName = b;
	}

	String displayName() {
		String name = firstName + " " + lastName;
		return name;
	}

}
