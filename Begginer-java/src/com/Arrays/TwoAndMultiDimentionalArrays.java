package com.Arrays;

 

public class TwoAndMultiDimentionalArrays {

	public static void main(String[] args) {

		int aptNumber[][] = new int[2][3];
		// 0 row and columns

		aptNumber[0][0] = 10;
		aptNumber[0][1] = 20;
		aptNumber[0][2] = 50;

		// 1 row and columns
		aptNumber[1][0] = 60;
		aptNumber[1][1] = 89;
		aptNumber[1][2] = 50;

		// System.out.println(aptNumber[1][0]);

		aptNumber[1][2] = 200;

		// System.out.println(aptNumber[1][2]);
		// for loop
//		for(int a = 0; a <aptNumber.length; a++)
//			for(int b = 0; b < aptNumber[a].length; b++) {
//				
//				System.out.println(aptNumber[a][b]);
//				
//			}

		// for each loop
		for (int[] a : aptNumber) {
			for (int b : a) {
				System.out.println(b);
			}

		}
String names [][] = {
		
		{"kamal","khan","jan"},
		{"kamal","khan","jan"}
};

for(String[] n : names) {
	for(String a : n) {
		System.out.println("=======2 D======");
		System.out.println(a);
	}
}
		System.out.println("=======================\n");
		// Multi Dimentional Arrays

		// int apt [][][] = new int[table size][row size][column size]

		int apartmentsNumber[][][] = new int[3][2][3];

		// 0 tale
		apartmentsNumber[0][0][0] = 1;
		apartmentsNumber[0][0][1] = 2;
		apartmentsNumber[0][0][2] = 3;

		apartmentsNumber[0][1][0] = 4;
		apartmentsNumber[0][1][1] = 4;
		apartmentsNumber[0][1][2] = 6;

		// 1 table

		apartmentsNumber[1][0][0] = 7;
		apartmentsNumber[1][0][1] = 8;
		apartmentsNumber[1][0][2] = 9;

		apartmentsNumber[1][1][0] = 10;
		apartmentsNumber[1][1][1] = 11;
		apartmentsNumber[1][1][2] = 12;

		// 2 table
		apartmentsNumber[2][0][0] = 13;
		apartmentsNumber[2][0][1] = 14;
		apartmentsNumber[2][0][2] = 15;

		apartmentsNumber[2][1][0] = 16;
		apartmentsNumber[2][1][1] = 17;
		apartmentsNumber[2][1][2] = 18;

		System.out.println(apartmentsNumber[2][0][1]);

		apartmentsNumber[1][1][1] = 100;
		System.out.println(apartmentsNumber[1][1][1]);

		String EmployeeNames[][][] = { 
				{ { "kamal", "jamal", "shaban" }, { "zamir", "khan", "Ghafoor" } },
				{ { "AHAMD", "JAWID", "KHRUMA" }, { "ZARMIAN", "DAWOOD", "BASHIR" } },
				{ { "SAMM", "HASIB", "KHATARA" }, { "KAZIM", "SHAH", "BADOOR" } },

		};
		System.out.println("=========for loop==============\n");
		for (int a = 0; a < EmployeeNames.length; a++) {

			for (int b = 0; b < EmployeeNames[a].length; b++)

				for (int c = 0; c < EmployeeNames[a][b].length; c++) {

					System.out.println(EmployeeNames[a][b][c]);

				}

		}

		System.out.println("==========for each loop=============\n");

		for (String[][] a : EmployeeNames) {
			for (String[] b : a) {
				for (String c : b) {

					System.out.println(c);

				}
			}
		}
		

	}

}
