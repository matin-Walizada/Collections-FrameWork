package com.core.java;

public class AllTeachers {

	public static void main(String[] args) {
		PhesicsTeacher theTeacher = new PhesicsTeacher(1, "shaban", "Ahmadi", "Kabul", "phesics", 10000.00);
				
		System.out.println(theTeacher);


		
		EnglishTeacher theEnglishTeacher = new EnglishTeacher(2, "samim", "khan", "kabul", "Enlish", 20000.00);
		
		
		System.out.println(theEnglishTeacher);
		
		
		
		ComputerTeacher theComputerTeacher = new ComputerTeacher(3, "Shadab", "zamiry", "kabul", "COMPUTER", 40000.00);
		
		
		System.out.println(theComputerTeacher.id);
		System.out.println(theComputerTeacher.firstName);
		System.out.println(theComputerTeacher.lastName);
		System.out.println(theComputerTeacher.address);
		System.out.println(theComputerTeacher.subject);
		System.out.println(theComputerTeacher.salary);
		
	}

}
