package com.core.java;

public class Son extends Dougther {

	public Son(String fname, int age, String eyeColor, String hairColor, String lastName) {
		super(fname, age, eyeColor, hairColor, lastName);

	}

	@Override
	public String toString() {
		return "Son [lastName=" + lastName + ", fname=" + fname + ", age=" + age + ", eyeColor=" + eyeColor
				+ ", hairColor=" + hairColor + "]";
	}

	public static void main(String[] args) {

		Son theSon = new Son("kamal", 20, "black", "black", "kazimi");
	}

}
