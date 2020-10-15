package com.Arrays;

public class SingleArray {

	public static void main(String[] args) {
		// firts syntext
		String[] teachersName = new String[4];

		teachersName[0] = "Shabana";
		teachersName[1] = "Khram";
		teachersName[2] = "Suhila";
		teachersName[3] = "friha";

		// seconde syntaxt
		// for loop
		// initialization condition - increement / decreement
		for (int a = 0; a < teachersName.length; a++) {

			System.out.println(teachersName[a]);
		}
		// for each
		System.out.println("======================for each loop============\n");
		
		for(String t : teachersName ) {
			System.out.println(t);
		}
		
		
		System.out.println("=============seconde array=======\n");

		String[] teacherName = { "zamir", "khatera", "sammi", "farhad" };

		for (int i = 0; i < teacherName.length; i++) {
			System.out.println(teacherName[i]);

		}
		
		
		int numbers[] = {1,2,3,4,5,6,7,8,9};
		
		System.out.println(numbers[0]);
		
		
		
		// 2 Diamentional array
		
		int [][] aptNumbers = new int[6][5];
		
		aptNumbers[0][0] = 20; aptNumbers[0][1] = 100; aptNumbers[0][2] = 40;aptNumbers[0][3] = 50; aptNumbers[0][4] = 2;
		aptNumbers[1][0] = 11; aptNumbers[1][1] = 21; aptNumbers[1][2] = 60; aptNumbers[1][3] = 70; aptNumbers[1][4] = 44;
		aptNumbers[2][0] = 34; aptNumbers[2][1] = 23; aptNumbers[2][2] = 79; aptNumbers[2][3] = 46; aptNumbers[2][4] = 67;
		aptNumbers[3][0] = 17; aptNumbers[3][1] = 18; aptNumbers[3][2] = 52; aptNumbers[3][3] = 59; aptNumbers[3][4] = 38;
		aptNumbers[4][0] = 91; aptNumbers[4][1] = 95; aptNumbers[4][2] = 73; aptNumbers[4][3] = 200; aptNumbers[4][4] = 65;
		aptNumbers[5][0] = 1010; aptNumbers[5][1] = 210; aptNumbers[5][2] = 35; aptNumbers[5][3] = 72; aptNumbers[5][4] = 5;
 		
		System.out.println("==============2 D============\n");
			System.out.println(aptNumbers[4][3]);
			aptNumbers[4][3] = 300;
			
			System.out.println("==============2 D============\n");
			System.out.println(aptNumbers[4][3]);
			
			
			System.out.println("============2 D ARRAY ELEMENTS\n");
			
			
			for(int r = 0; r < aptNumbers.length; r++)	
				
				for(int c = 0; c < aptNumbers[r].length; c++) {
					
					System.out.println(aptNumbers[r][c]);
					
				}
										 
			String teachersN[][] = {   {"KAMA", "JAMAL", "Samira","dawood"}, 
									   {"khibar", "samim", "homira", "asif"},
									   {"friba","sumaya","aftab", "farhad"},
									   {"fazam", "khabir","zalim","khan",},
				
											};
			System.out.println("=============seconde sayntaxt 2 d loop===========");
			
			for(int x = 0; x < teachersN.length; x++)
				for(int y = 0; y < teachersN[x].length; y++) {
					System.out.println(teachersN[x][y]);
				}
			
			
			System.out.println("=============seconde sayntaxt 2 d for each loop===========");
			for(String [] a : teachersN ) {
				for(String v : a ) {
					System.out.println(v);
					 
				}
			}
			
			
			
			
			String names [][][] = {
					
					
					
					//0{//0{"kamal", "jamal", "samira", "dawood"}, 
						//1{"kamal", "jamal", "samira", "dawood"},   
						//2{"kamal", "jamal", "samira", "dawood"}
				//	},
					
					
					
					//1{//0{"kamal", "jamal", "samira", "dawood"}, 
					//1	{"kamal", "jamal", "samira", "dawood"},   
					//2{"kamal", "jamal", "samira", "dawood"}
					//}
					
					
					
					//2{ //0  {"kamal", "jamal", "samira", "dawood"}, 
						//1{"kamal", "jamal", "samira", "dawood"},   
						//2{"kamal", "jamal", "samira", "dawood"}
					//},
					
					
					
					 
					 
					
			};
			
	}
	
	


}
