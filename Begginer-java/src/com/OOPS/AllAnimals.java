package com.OOPS;

public class AllAnimals {

	public static void main(String[] args) {
	 
		Animal theBirds = new Bird();
		
		theBirds.animalData();
		theBirds.move();
		System.out.println(theBirds.eat());
		System.out.println(" Number of Leages " + theBirds.numberOfLeag());
		
		
		
		AllNewAnimals thebirs2 = new Bird();
		System.out.println(thebirs2.livingArea());
		System.out.println(thebirs2.spices());
		AllNewAnimals.showAnimalData();
		
		System.out.println("===========\n");
		
		Lion theLions = new Lion();
		theLions.move();
		System.out.println(theLions.eat());
		System.out.println(" Number of Leages " + theLions.numberOfLeag());
		System.out.println(theLions.livingArea());
		System.out.println(theLions.spices());
		System.out.println("===========\n");
		
		Fish theFish = new Fish();
		theFish.move();
		System.out.println(theFish.eat());
		System.out.println(" Number of Leages " + theFish.numberOfLeag());
		System.out.println(theFish.livingArea());
		System.out.println(theFish.spices());
	}

}
