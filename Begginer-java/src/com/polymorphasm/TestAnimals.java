package com.polymorphasm;

public class TestAnimals {

	public static void main(String[] args) {
	 
		Animal thAnimal = new Animal();
		System.out.println(	thAnimal.hunt());
	
		Loin theLoin = new Loin();
		System.out.println(theLoin.hunt());
	}

}
