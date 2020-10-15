package com.Arrays;

public class MyArrays {

	public static void main(String[] args) {

		// Single Dimensional array
		String studentsName[] = { "Kazim", "shabana", "khan", "farid" };
		char[] alphabets = { 'A', 'B', 'C', 'D', 'E' };

		for (int i = 0; i < studentsName.length; i++) {
			System.out.println(studentsName[i]);
		}

		System.out.println("=================\n");
		for (char alpha : alphabets) {

			System.out.println(alpha);

		}

		// two Dimensional array is a table

		String teachersName[][] = {

				{ "kamal", "jamal", "farid", "shabana" }, { "fahad", "samim", "farida", "Humira" },
				{ "shadab", "khan", "jamil", "farzad" }

		};

		System.out.println("================\n");
		for (int x = 0; x < teachersName.length; x++)
			for (int y = 0; y < teachersName[x].length; y++) {

				System.out.println(teachersName[x][y]);
			}

		for (String z[] : teachersName) {
			for (String n : z) {
				System.out.println(n);
			}
		}

		int aptN[][] = {

				{ 10, 20, 30, 40, 50 }, { 15, 20, 30, 40, 50 }, { 12, 20, 30, 40, 50 },

		};

		// Syntax 1
		String studentsInfo[][][] = new String[4][4][5];

		// 0 table

		studentsInfo[0][0][0] = "Karim";
		studentsInfo[0][0][1] = "shabana";
		studentsInfo[0][0][2] = "kazim";
		studentsInfo[0][0][3] = "fariba";
		studentsInfo[0][0][4] = "zamir";
		studentsInfo[0][1][0] = "jawid";
		studentsInfo[0][1][1] = "karim";
		studentsInfo[0][1][2] = "fariba";
		studentsInfo[0][1][3] = "zahid";
		studentsInfo[0][1][4] = "fazam";
		studentsInfo[0][2][0] = "Karim";
		studentsInfo[0][2][1] = "shabana";
		studentsInfo[0][2][2] = "kazim";
		studentsInfo[0][2][3] = "fariba";
		studentsInfo[0][2][4] = "zamir";
		studentsInfo[0][3][0] = "jawid";
		studentsInfo[0][3][1] = "karim";
		studentsInfo[0][3][2] = "fariba";
		studentsInfo[0][3][3] = "zahid";
		studentsInfo[0][3][4] = "fazam";

		// 1

		studentsInfo[1][0][0] = "Karim";
		studentsInfo[1][0][1] = "shabana";
		studentsInfo[1][0][2] = "kazim";
		studentsInfo[1][0][3] = "fariba";
		studentsInfo[1][0][4] = "zamir";
		studentsInfo[1][1][0] = "jawid";
		studentsInfo[1][1][1] = "karim";
		studentsInfo[1][1][2] = "fariba";
		studentsInfo[1][1][3] = "zahid";
		studentsInfo[1][1][4] = "fazam";
		studentsInfo[1][2][0] = "Karim";
		studentsInfo[1][2][1] = "shabana";
		studentsInfo[1][2][2] = "kazim";
		studentsInfo[1][2][3] = "fariba";
		studentsInfo[1][2][4] = "zamir";
		studentsInfo[1][3][0] = "jawid";
		studentsInfo[1][3][1] = "karim";
		studentsInfo[1][3][2] = "fariba";
		studentsInfo[1][3][3] = "zahid";
		studentsInfo[1][3][4] = "fazam";

		// 2

		studentsInfo[2][0][0] = "Karim";
		studentsInfo[2][0][1] = "shabana";
		studentsInfo[2][0][2] = "kazim";
		studentsInfo[2][0][3] = "fariba";
		studentsInfo[2][0][4] = "zamir";
		studentsInfo[2][1][0] = "jawid";
		studentsInfo[2][1][1] = "karim";
		studentsInfo[2][1][2] = "fariba";
		studentsInfo[2][1][3] = "zahid";
		studentsInfo[2][1][4] = "fazam";
		studentsInfo[2][2][0] = "Karim";
		studentsInfo[2][2][1] = "shabana";
		studentsInfo[2][2][2] = "kazim";
		studentsInfo[2][2][3] = "fariba";
		studentsInfo[2][2][4] = "zamir";
		studentsInfo[2][3][0] = "jawid";
		studentsInfo[2][3][1] = "karim";
		studentsInfo[2][3][2] = "fariba";
		studentsInfo[2][3][3] = "zahid";
		studentsInfo[2][3][4] = "fazam";

		// 3
		studentsInfo[3][0][0] = "Karim";
		studentsInfo[3][0][1] = "shabana";
		studentsInfo[3][0][2] = "kazim";
		studentsInfo[3][0][3] = "fariba";
		studentsInfo[3][0][4] = "zamir";
		studentsInfo[3][1][0] = "jawid";
		studentsInfo[3][1][1] = "karim";
		studentsInfo[3][1][2] = "fariba";
		studentsInfo[3][1][3] = "zahid";
		studentsInfo[3][1][4] = "fazam";
		studentsInfo[3][2][0] = "Karim";
		studentsInfo[3][2][1] = "shabana";
		studentsInfo[3][2][2] = "kazim";
		studentsInfo[3][2][3] = "fariba";
		studentsInfo[3][2][4] = "zamir";
		studentsInfo[3][3][0] = "jawid";
		studentsInfo[3][3][1] = "karim";
		studentsInfo[3][3][2] = "fariba";
		studentsInfo[3][3][3] = "zahid";
		studentsInfo[3][3][4] = "fazam";

		System.out.println("================3 D WITH FOR EACH LOOP====================\n");
		for (String students[][] : studentsInfo) {
			for (String stu[] : students) {
				for (String s : stu) {
					System.out.println(s);
				}
			}
		}

		// Syntax 2
		String teachersInfo[][][] = {

				{ { "zubir", "kashif", "hamid", "friba", "ahmad", "karim" },
						{ "gul ahmad", "kashif", "hidar", "babor", "jan", "farid" },
						{ "fhaim", "omaer", "payaz", "freshta", "manan", "khan" },
						{ "tamoor", "dawood", "shabanam", "farzana", "zhaid", "ahmad" },

				},

				{ { "zubir", "kashif", "hamid", "friba", "ahmad", "karim" },
						{ "gul ahmad", "kashif", "hidar", "babor", "jan", "farid" },
						{ "fhaim", "omaer", "payaz", "freshta", "manan", "khan" },
						{ "tamoor", "dawood", "shabanam", "farzana", "zhaid", "ahmad" },

				},

				{ { "zubir", "kashif", "hamid", "friba", "ahmad", "karim" },
						{ "gul ahmad", "kashif", "hidar", "babor", "jan", "farid" },
						{ "fhaim", "omaer", "payaz", "freshta", "manan", "khan" },
						{ "tamoor", "dawood", "shabanam", "farzana", "zhaid", "ahmad" },

				},
			
				{ { "zubir", "kashif", "hamid", "friba", "ahmad", "karim" },
						{ "gul ahmad", "kashif", "hidar", "babor", "jan", "farid" },
						{ "fhaim", "omaer", "payaz", "freshta", "manan", "khan" },
						{ "tamoor", "dawood", "shabanam", "farzana", "zhaid", "ahmad" },

				}

		};

		System.out.println("====================3 D ARRAY WITH FOR LOOP===========================\n");
		for (int x = 0; x < teachersInfo.length; x++) {
			System.out.println("===========================tables" + x  + "==========\n");
			for (int y = 0; y < teachersInfo[x].length; y++) {
				System.out.println("===========================rows" + y  + "==========\n");
				for (int z = 0; z < teachersInfo[x][y].length; z++) {

					System.out.println(teachersInfo[x][y][z]);
				}
			}

		}

	}

}
