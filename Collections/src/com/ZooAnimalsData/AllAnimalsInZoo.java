package com.ZooAnimalsData;

import java.util.LinkedList;

public class AllAnimalsInZoo {

	public static void main(String[] args) {
		 		// birds objects
		Birds bird1 = new Birds("Eagle", "Gray", "Meat");
		Birds bird2 = new Birds("Parrote", "Green", "Beat");
		Birds bird3 = new Birds("Turky", "Dark Gray", "Beat");
		Birds bird4 = new Birds("Pengoen", "Black and white", "Meat");
		
		// birds objects list
		LinkedList<Birds> theBirdsList = new LinkedList<Birds>();
		theBirdsList.add(bird1);
		theBirdsList.add(bird2);
		theBirdsList.add(bird3);
		theBirdsList.add(bird4);
		
		 // mammals objects
		
		
		Mammals mammal1 = new Mammals("Lion", "Yellow", "Meat");
		Mammals mammal2 = new Mammals("Elephante", "Black", "Grace");
		Mammals mammal3 = new Mammals("zarafa", "yellow and gray", "Grace");
		Mammals mammal4 = new Mammals("Tiger", "Yellow", "Meat");
		
		// mammals Objects list
		LinkedList<Mammals> mammalsList = new LinkedList<Mammals>();
		mammalsList.add(mammal1);
		mammalsList.add(mammal2);
		mammalsList.add(mammal3);
		mammalsList.add(mammal4);
		
		
		// SeasAnimals Objects
		
		SeasAnimals seaAnima1 = new  SeasAnimals("Fish", "Yellow", "Sea Food");
		SeasAnimals seaAnima2 = new  SeasAnimals("Shark", "blue", "Sea Food");
		SeasAnimals seaAnima3 = new  SeasAnimals("Sea Lion", "Gray", "Sea Food");
		SeasAnimals seaAnima4 = new  SeasAnimals("Whal", "Black and white", "Sea Food");
		
		// SeasAnimals Objects list
		
		LinkedList<SeasAnimals> seaAnimalsList = new LinkedList<SeasAnimals>();
		
		seaAnimalsList.add(seaAnima1);
		seaAnimalsList.add(seaAnima2);
		seaAnimalsList.add(seaAnima3);
		seaAnimalsList.add(seaAnima4);
		
		
		
		// Objects Arrays List
		
		
		LinkedList<ZooAnimals> AllZooAnimals = new  LinkedList<ZooAnimals>();
		
		AllZooAnimals.addAll(theBirdsList);
		AllZooAnimals.addAll(mammalsList);
		AllZooAnimals.addAll(seaAnimalsList);
		
		
		for(ZooAnimals AllAnimals : AllZooAnimals) {
			
			System.out.println(AllAnimals);
		}

	}

}
