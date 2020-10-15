package com.core.java;

public class Employees {

	int id;
	String name;
	String position;
	double salaary;

	public Employees(int id, String name, String position, double salaary) {

		this.id = id;
		this.name = name;
		this.position = position;
		this.salaary = salaary;
	}

	public String doCustomerService() {

		return "answer the calls and texts";
	}

	public String payCompanyBills(String paybills) {

		return paybills;
	}

	public String chargeForServicese(String customerCharges) {

		return customerCharges;

	}

	public static void main(String[] args) {

		Employees theEmployees = new Employees(1, "kamal", "help desk", 10.000);

		System.out.println("ID ==> " + theEmployees.id);
		System.out.println("Name ==> " + theEmployees.name);
		System.out.println("posittion ==> " + theEmployees.position);
		System.out.println("Salaary ==> " + theEmployees.salaary);
		System.out.println("job ==> " + theEmployees.doCustomerService());

		System.out.println("============================\n");

		Employees theEmployees1 = new Employees(2, "sahar", "accountant", 20.000);

		System.out.println("ID ==> " + theEmployees1.id);
		System.out.println("Name ==> " + theEmployees1.name);
		System.out.println("posittion ==> " + theEmployees1.position);
		System.out.println("Salaary ==> " + theEmployees1.salaary);
		System.out.println("job ==> " + theEmployees1.payCompanyBills("she pays 10 dollar for company utilites"));

		System.out.println("============================\n");

		Employees theEmployees2 = new Employees(3, "shabanam", "maintnance", 30.000);

		System.out.println("ID ==> " + theEmployees2.id);
		System.out.println("Name ==> " + theEmployees2.name);
		System.out.println("posittion ==> " + theEmployees2.position);
		System.out.println("Salaary ==> " + theEmployees2.salaary);
		System.out.println("job ==> " + theEmployees2.chargeForServicese("the customers are charged based on serviece they get"));

	}

}
