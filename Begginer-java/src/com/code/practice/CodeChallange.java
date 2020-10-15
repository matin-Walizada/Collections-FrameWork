package com.code.practice;

public class CodeChallange {

	
	
	public static void printChallange(int n) {
		for(int i = 1; i <= n; i++) {
			if((i % 3 == 0 ) && ( i % 5 ==0)) {
				System.out.println("its 3 and 5 pale");
				
			}else if(i % 3 == 0) {
			
				System.out.println("it 3 pale");
			}else if(i % 5 == 0 ){
				System.out.println("its 5 pale");
			}else {
				System.out.println(i);
				
			}
		}
 
	}
		// manulally
	 private static String reviersStringManually(String str) {
		 
		 return new StringBuilder(str)
				 .reverse()
				 .toString();
	 }
	 
	 
	 // with string builder
	 
	 	private static String ReversWithStringBuilder(String reversmyValue) {
	 		
	 		StringBuilder builder = new StringBuilder();
	 		
	 		for(int i = reversmyValue.length() - 1; i >= 0; i --) {
	 			
	 			builder.append(reversmyValue.charAt(i));
	 		}
	 		
	 		return builder.toString();
	 	}
	 
	 
	 
	 // stack is a data sctructure it has its onw methods to manipolate data 
	 	//push(add element to stack )
	 	// pop(tack out the firts element)
	 	// peek(refrance first elment but dosent modifie it)
	 	
	 

	public static void main(String[] args) {
		 String str = " this is very nice";
		 String greet = " Nan";
		 System.out.println(reviersStringManually(str));
		 System.out.println(ReversWithStringBuilder(greet));
		// printChallange(100);

	}

}
