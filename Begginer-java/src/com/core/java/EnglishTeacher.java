package com.core.java;

public class EnglishTeacher extends Teacher {
	
	String subject;
	double salary;
	
	
	public EnglishTeacher(int id, String firstName, String lastName, String address, String subject, double salary) {
		super(id, firstName, lastName, address);
		this.subject = subject;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "EnglishTeacher subject= " + subject + ", salary=" + salary + ", id=" + id + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", address=" + address + "";
	}
	
	 
	

}
