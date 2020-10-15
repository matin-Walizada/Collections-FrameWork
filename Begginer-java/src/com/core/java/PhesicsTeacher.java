package com.core.java;

public class PhesicsTeacher extends Teacher {
	

	String subject;
	double salary;
	
	public PhesicsTeacher(int id, String firstName, String lastName, String address, String subject, double salary) {
		super(id, firstName, lastName, address);
		
		this.subject = subject;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "PhesicsTeacher [subject=" + subject + ", salary=" + salary + ", id=" + id + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", address=" + address + "]";
	}
	
	
	
	
	
	

}
