package com.core.java;

public class Dougther extends Parent {

	String lastName;

	public Dougther(String fname, int age, String eyeColor, String hairColor, String lastName) {
		super(fname, age, eyeColor, hairColor);

		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Dougther [lastName=" + lastName + ", fname=" + fname + ", age=" + age + ", eyeColor=" + eyeColor
				+ ", hairColor=" + hairColor + "]";
	}

	public static void main(String[] args) {

		Dougther theDougther = new Dougther("sahar", 10, "black", "Black", "ahmadi");

		System.out.println(theDougther);

		Parent tHEParent = new Parent("khanjan", 34, "black", "black");
		System.out.println(tHEParent);

		Son theSon = new Son("jawid", 15, "Black", "Black", "Suhrab");

		System.out.println(theSon);
	}

}
