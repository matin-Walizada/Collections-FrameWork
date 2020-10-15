package com.core.java;

public class Toyota {

	String name;
	int year;
	String color;
	String model;

	// costructor is a block of code which initialize newly creatd object

	// how to create construct
	// we creat constructor from name of our class with a paranthises() and carly{}
	// braces infron of it

	int speed() {

		return 100;
	}

	public Toyota(String carName, int year, String color, String model) {

		this.name = name;
		this.year = year;
		this.color = color;
		this.model = model;
		 
	}

	@Override
	public String toString() {
		return "Toyota [name=" + name + ", year=" + year + ", color=" + color + ", model=" + model + ", speed()="
				+ speed() + "]";
	}

	public static void main(String[] args) {

		Toyota myCar = new Toyota("Camery", 2020, "white", "XLE");

		System.out.println(myCar);
	}

}
