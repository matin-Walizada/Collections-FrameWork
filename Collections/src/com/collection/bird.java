package com.collection;

public class bird {
	
	String name;
	String color;
	String livingArea;
	String food;
	
	// constructor generate
	public bird(String name, String color, String livingArea, String food) {
		
		this.name = name;
		this.color = color;
		this.livingArea = livingArea;
		this.food = food;
	}

	
	// Generates getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getLivingArea() {
		return livingArea;
	}

	public void setLivingArea(String livingArea) {
		this.livingArea = livingArea;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

// Override toString() method
	@Override
	public String toString() {
		return "bird [Name =" + name + ", CoLor =" + color + ", livingArea =" + livingArea + ", food=" + food + "]";
	}
	
	
	
	
	
	
	
	

}
