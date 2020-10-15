package com.core.java;

public class Employee {
 
	
	// 1 golable variable are created in side the class

	public String name = "kamal";
	int age = 45;

	// class static instance variables are created with static word inside the class

	       static int empAge = 26;
           static String empName = "Shabana";

	// 2 local variables are created inside the method()

	static void sum() {

		int a = 40;
		int b = 60;
		System.out.println(a + b);
	  
	}
	
	
	public static void main(String[] args) {
		
		// how to access my global variables?
		// we access the global variables through object.
		
		Employee  myEmployee = new Employee();
		
		System.out.println(myEmployee.name);
		System.out.println(myEmployee.age);
		
		// how to access my class variables?
		// we can access class variables without object, with object, with class name;
		
		System.out.println("// accessing without object \n");
		System.out.println(empAge);
		System.out.println(empName);
		
		
		Employee myEmployeeInfo = new Employee();
		
	System.out.println("//accessing with object\n");
		System.out.println(myEmployeeInfo.empAge);
		System.out.println(myEmployeeInfo.empName);
		
		
		System.out.println("//accessing with class name \n");
		
		System.out.println(Employee.empAge);
		System.out.println(Employee.empName);
		
		
		
		// how to access my local variables?
		// to access local variables we should call the method with object
		System.out.println("=============\n");
		Employee myObject = new Employee();
			sum();
		
	}
	

}
