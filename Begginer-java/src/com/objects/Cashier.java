package com.objects;

public class Cashier extends Employee {

	double salar;
	String jobTitle;

	public Cashier(int id, String firstName, String lastName, double salar, String jobTitle) {
		super(id, firstName, lastName);

		this.salar = salar;
		this.jobTitle = jobTitle;
	}

	public static void main(String[] args) {
		Cashier theCashier = new Cashier(10, "Kazim", "ahmadi", 1000, "Cashier");

		System.out.println("Emp ID: " + theCashier.id);
		System.out.println("Emp First Name: " + theCashier.firstName);
		System.out.println(theCashier.lastName);
		System.out.println(theCashier.salar);
		System.out.println(theCashier.jobTitle);

		EmployeeAddress theEmployeeAddress = new EmployeeAddress();

		theEmployeeAddress.setAptNumber(2020);
		theEmployeeAddress.setStree("Walstreet");
		theEmployeeAddress.setCity("new york city");
		theEmployeeAddress.setState("NEW YORK");
		theEmployeeAddress.setZipCode(1234);

		System.out.println(theEmployeeAddress.getAptNumber());
		System.out.println(theEmployeeAddress.getStree());
		System.out.println(theEmployeeAddress.getCity());
		System.out.println(theEmployeeAddress.getState());
		System.out.println(theEmployeeAddress.getZipCode());

	}

}
