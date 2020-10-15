package com.core.java;

public class Employeese {

	int id;
	String firstName;
	String lastName;
	Double Salary;
	
	
	public Employeese(int id, String firstName, String lastName, Double sallary) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.Salary = Salary;
	}

	  void checSalaary() {
		
		if(Salary.equals(Salary) ) {
			
			System.out.println("the employee works in Resturan");
			
			
		} else {
			System.out.println("the employee works in Bank");
		}
	}





	public static void main(String[] args) {
		 Employeese theEmployeese = new Employeese(1, "kamal", "jan", 4000.00);
		 
		 System.out.println(theEmployeese.id);
		 System.out.println(theEmployeese.firstName);
		 System.out.println(theEmployeese.lastName);
		 System.out.println(theEmployeese.lastName);
	theEmployeese.checSalaary();

	}

}
