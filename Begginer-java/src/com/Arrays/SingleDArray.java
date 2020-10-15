package com.Arrays;

public class SingleDArray {

	public static void main(String[] args) {

		// declaring and instantiating
		String[] studentsName = new String[10];

		// initializing
		studentsName[0] = "Kamal";
		studentsName[1] = "Kazim";
		studentsName[2] = "zarmina";
		studentsName[3] = "Zainab";
		studentsName[4] = "khan";
		studentsName[5] = "shababa";
		studentsName[6] = "Sabira";
		studentsName[7] = "jamil";
		studentsName[8] = "karim";
		studentsName[9] = "farhad";

//		System.out.println(studentsName[3]);
//		System.out.println(studentsName[9]);
//		
//		System.out.println(studentsName[8]);
//		
//		studentsName[8] = "Fowad";
//		System.out.println(studentsName[8]);
//		System.out.println(studentsName.length);

		// loop through array elements

		// for loop
		System.out.println("=======STDNETS Array=========\n");
		for (int i = 0; i < studentsName.length; i++) {

			System.out.println(studentsName[i]);
		}

		System.out.println("=======Teachers Array=========\n");
		String teachName[] = { "ZAMIR", "Habib", "Suhila", "Fawziya" };

		for (int j = 0; j < teachName.length; j++) {
			System.out.println(teachName[j]);
		}

		int apartments[] = { 20, 40, 50, 44, 67, 88, };
		// for each loop
		for (int apt : apartments) {

			System.out.println(apt);

		}

		System.out.println("=========Employees==========\n");

		String employees[] = { "JHON", "AHMAD", "HARIS", "KAHMILA" };

		for (String emp : employees) {

			System.out.println(emp);
		}

		System.out.println("==========printed using for loop===============\n");
		for (int e = 0; e < employees.length; e++) {

			System.out.println(employees[e]);
		}

		String emp[] = { "kamal", "jamal", "khan", "avv" };

		// i starts with 0 as array index starts with 0 too
		// while loop

		System.out.println("=============printed using while loop===================\n");
		int i = 0;
		while (i < 4) {
			System.out.println(emp[i]);
			i++;
		}

		// arrayName array elements
		int apt[] = { 2, 11, 45, 9 };
		// [0] [1] [2] [3]
		// i starts with 0 as array index starts with 0
		int j = 0;

		do {
			System.out.println(apt[j]);
			j++;
		} while (j < 4);

	}

}
