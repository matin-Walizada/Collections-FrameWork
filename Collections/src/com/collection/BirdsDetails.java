package com.collection;

import java.util.LinkedList;
import java.util.List;

public class BirdsDetails {

	public static void main(String[] args) {
		// object list
		bird bird1 = new bird("Eagle", "Gray", "Mountains", "Meat");
		bird bird2 = new bird("Tota", "multi Color", "Forest", "Beats");
		bird bird3 = new bird("Turky", "Dark Gray", "Deserts", "Meat");
		bird bird4 = new bird("Pengoens", "Black and white", "Ocean", "Fishes");

		List<bird> birdsList = new LinkedList<bird>();
		birdsList.add(bird1);
		birdsList.add(bird2);
		birdsList.add(bird3);
		birdsList.add(bird4);

		for (bird myBird : birdsList) {
			System.out.println(myBird);
		}

	}

}
