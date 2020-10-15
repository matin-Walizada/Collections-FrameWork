package com.core.java;

public class LambdiaExpressoin  {
 
	int math(int a, int b, FuncInterface1 funInter) {
		
		return funInter.mathNumber(a, b);
	}
	
	
	public static void main(String[] args) {
		
	 
		FuncInterface1 add =  (x,y) -> x + y;
		
		FuncInterface1 min = (a,b) -> a - b;
		
		LambdiaExpressoin theExpressoin = new LambdiaExpressoin();
		
		
		System.out.println(theExpressoin.math(10, 20, add));
		System.out.println(theExpressoin.math(100, 50, min));
		
		
		
		 
		
		
	}
 
}
