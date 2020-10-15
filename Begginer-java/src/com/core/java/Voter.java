package com.core.java;

import java.util.Scanner;

public class Voter {

	void checCarPrice() {
		
	
		int carPrice = 30000;
		String carName = "Bmw";
		
		if(carPrice < 40000 && carName == "Bmw") {
			System.out.println("thi is the car what i want ");
				if(carPrice > 10000) 
			System.out.println("the starting price should be 10000 k");
		}
	}
	
	
	


	public static void main(String[] args) {

		Voter theVoter = new Voter();
		
		theVoter.checCarPrice();
		
		

	}

}
