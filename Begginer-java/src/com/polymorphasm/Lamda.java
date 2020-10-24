package com.polymorphasm;

import java.util.List;

public class Lamda {
static String name = " samim ";
static int age = 26;

static String showName() {
	
	return "Samim";
}

private MyFuntional myFuntional;

static int showAge() {
	
	return 28;
}

	static int result = showAge();

//	
//	String showStudentInfo(String name ) {
//		return "the student which got the highest score in Kankor was a girl" + name;
//		
//		
//	}
	//what what .is the way of implementation of functional interface?
	// the functional interface is implemented by lambda expression and inner class
	
	public static void main(String[] args) {
		 // lambda expression
		 MyFuntional thexpression = (name, age) -> "the student which got the highest score in Kankor was a girl she was  " + name + " sister and she is a " + age + "years old";
	
		 // called the inteface method
		 System.out.println(thexpression.showStudentInfo(" kamal", 18));

	
	
	// inner class anonymous class
	
	MyFuntional theinneVariable = new MyFuntional() {

		@Override
		public String showStudentInfo(String name, int age) {
			// TODO Auto-generated method stub
			return name + age;
		}
		 
	};
	System.out.println(theinneVariable.showStudentInfo(showName(), result));
	
 
	 

	 
	
	
	
	}

	
	

}
