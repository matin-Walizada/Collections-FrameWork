package com.core.java;

public class ComputerTeacher extends Teacher {
	
	String subject;
	double salary;
	
	
	
	public ComputerTeacher(int id, String firstName, String lastName, String address, String subject, double salary) {
		super(id, firstName, lastName, address);
		this.subject = subject;
		this.salary = salary;
	}
	
	
	
	
	

}
