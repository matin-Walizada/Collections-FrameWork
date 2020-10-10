package com.arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.ws.soap.AddressingFeature;

public class Employee {

	public static void main(String[] args) {
		// we want to create a dynamic list by using ArrayList Class.

		ArrayList<String> myEmployeeNames = new ArrayList<String>();

		// WE added one element to our myEmployeeNames array
		myEmployeeNames.add("KAMAL");
		myEmployeeNames.add("Suhila");
		myEmployeeNames.add("samim");
		myEmployeeNames.add("khan");
		myEmployeeNames.add("Zahrah");

		System.out.println("===========// iterator================\n");
		Iterator myList = myEmployeeNames.iterator();
		while (myList.hasNext()) {
			System.out.println(myList.next());
		}

		System.out.println("===========// for Each loop================\n");

		for (String employees : myEmployeeNames) {
			System.out.println(employees);
		}

		System.out.println("===========// for loop================\n");

		
			for(int a = 0; a < myEmployeeNames.size(); a++ ) {
				System.out.println(myEmployeeNames.get(a));
			}
			
			
			
			System.out.println("===========// forEch() Method================\n");
			
			myEmployeeNames.forEach(e -> {
				System.out.println(e);
			});
			
			
			System.out.println("===========// forEchRemainig() Method================\n");
			
			Iterator <String> myemp = myEmployeeNames.iterator();
			myemp.forEachRemaining(empList ->{
				System.out.println(empList);
			});
			
	}

}
