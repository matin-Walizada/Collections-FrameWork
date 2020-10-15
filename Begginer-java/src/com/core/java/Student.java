package com.core.java;

public class Student {

	String name;
	int age;
	String grade;
	String address;

	int disply() {

		return age;
	}

 

	public Student(String name, int age, String grade, String address) {

		this.name = name;
		this.age = age;
		this.grade = grade;
		this.address = address;
	}

	String goingToSchool() {

		return "this student gose to schoo at 7:00 am";
	}

	String hobby() {

		return "this student play soccer in his free time";
	}

	public static void main(String[] args) {

		Student theStudent = new Student("Kamal", 15, "9 A", "new york ");

		System.out.println(theStudent.name);
		System.out.println(theStudent.age);
		System.out.println(theStudent.grade);
		System.out.println(theStudent.address);

		System.out.println("================\n");

		Student theStudent1 = new Student("SHABANA", 12, "8 A", "new JERSY ");

		System.out.println(theStudent1.name);
		System.out.println(theStudent1.age);
		System.out.println(theStudent1.grade);
		System.out.println(theStudent1.address);

	}

}
