package com.core.java;

public class Parent {

	String fname;
	int age;
	String eyeColor;
	String hairColor;

	public Parent(String fname, int age, String eyeColor, String hairColor) {

		this.fname = fname;
		this.age = age;
		this.eyeColor = eyeColor;
		this.hairColor = hairColor;
	}

	@Override
	public String toString() {
		return "Parent [fname=" + fname + ", age =" + age + ", eyeColor=" + eyeColor + ", hairColor=" + hairColor + "]";
	}

	public static void main(String[] args) {
		
		Parent theParent = new Parent("kazim", 43, "brown", "black");
		
		System.out.println(theParent);
	 
		

		
			
	
	}

}
