package com.java;

public class Employee {

	int id;
	String name;
	int age;

	public Employee(int id, String name, int age) {

		this.id = id;
		this.name = name;
		this.age = age;

	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {

		Employee theEmployee = new Employee(01, "kamal", 30);

		Address address = new Address();

		address.setAptNumber(10);
		address.setStreet("walSreet");
		address.setCity("New York City");
		address.setState("NEW YORK");
		address.setZip(12345);

		System.out.println(theEmployee);
		System.out.println(address);

	
	
	 
	 
	
	for(int i = 0; i < 10	; i++) {
		
		System.out.println( i );
	}
	}

}
