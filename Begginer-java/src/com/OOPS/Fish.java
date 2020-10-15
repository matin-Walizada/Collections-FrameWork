package com.OOPS;

public class Fish extends Animal implements AllNewAnimals {

	@Override
	void move() {
		 System.out.println("fishes moves by swimming");

	}

	@Override
	String eat() {
		 
		return "FISHES eat SeaFood";
	}

	@Override
	int numberOfLeag() {
		 
		return 0;
	}

	@Override
	public String livingArea() {
		 
		return "MOSTLY FISHES LIVES IN Oceans";
	}

	@Override
	public String spices() {
		 
		return "some spicios of fish are not now exist";
	}

}
