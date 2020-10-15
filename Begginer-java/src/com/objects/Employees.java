package com.objects;

public class Employees {

	int id;
	String firstName;
	String lastName;
	String postion;

	// Employees class constructor
	public Employees(int id, String firstName, String lastName, String postion) {

		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.postion = postion;
	}

	
	// we  Override toString() method to print the values of our variables
	@Override
	public String toString() {
		return "Employees [id = " + id + ", firstName= " + firstName + ", lastName= " + lastName + ", postion= " + postion
				+ "]";
	}

	public static void main(String[] args) {
		
		
		Employees theEmployees = new Employees(10, "Samir", "ahmadi", "Lead");
		System.out.println(theEmployees);
		
		EmployeeAdress theEmployeeAdress = new EmployeeAdress();
		// we assign value to our variables with their setter methods
		
		theEmployeeAdress.setStree("1212 Walstreet");
		theEmployeeAdress.setApt(2200);
		theEmployeeAdress.setCity("Menhatan");
		theEmployeeAdress.setState("New York");
		theEmployeeAdress.setZipCode(16001);
		
		System.out.println(theEmployeeAdress);
		
//		// we get value of our variables with their getters methods
//		System.out.println("Street: " + theEmployeeAdress.getStree());
//		System.out.println("apartment #: " + theEmployeeAdress.getApt());
//		System.out.println(theEmployeeAdress.getCity());
//		System.out.println(theEmployeeAdress.getState());
//		System.out.println(theEmployeeAdress.getZipCode());
		
		
			
		
	}

}
