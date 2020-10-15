package com.core.java;

import java.util.List;

public class JavaOprators {
	
	
 
	 
	public String doCoprason() {
		
		int x = 20;
		int y = 10;

		

		if (x != y) {
			System.out.println("x is not equale to y");
		} else {
			System.out.println("x and y are eqaule");
		}

		if (x > y) {

			System.out.println("x is greater than y");

		} else {

			System.out.println("x is not greater than y");

		}

		if (y < x) {
			System.out.println("y is smaller than x ");

		} else {
			System.out.println("y is not smaller than x");
		}

		if (x >= y) {
			System.out.println("x is greater and equal to y ");

		} else {
			System.out.println("x is not greater and equal to y");
		}

		if (y <= x) {

			System.out.println("y is smaller and equal to x ");

		} else {
			System.out.println("y is not smaller and equal to x ");
		}

		
		if (x == y) {
			return "x is equal to y";

		} else {
		return " x is not equal y";
		}
		
		
		
		
	
		
	}

	public static void main(String[] args) {

	
		String workday;
		String weenkendday;

		workday = "sundy";

		System.out.println(weenkendday = (workday == "monday") ? "its not weekdendday" : "its weekendday");
	}

}
