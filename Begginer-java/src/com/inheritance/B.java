package com.inheritance;

public class B extends A {

	
	
	
	// inherating parent class constructor
	public B(int id, String name) {
		super(id, name);
		 
	}

	int aptNumber = 300;

	void showAddress() {
		System.out.println("this is B class method");
	}

	// super

	void showAllInfo() {

		System.out.println(aptNumber);
		System.out.println(super.aptNumber);

		showAddress();
		super.showAddress();

	}

	public static void main(String[] args) {

		B theB = new B(10, "Khan");
		
	System.out.println(theB.id);
	System.out.println(theB.name);

		theB.showAllInfo();
	}

}
