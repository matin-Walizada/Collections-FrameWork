package com.Arrays;

public class MultiDarray {

	public static void main(String[] args) {

		String student[][][] = {

				{ { "kamal", "khan", "jan", "farid" }, { "kamal", "khan", "jan", "farid" },
						{ "kamal", "khan", "jan", "farid" }, { "kamal", "khan", "jan", "farid" },

				},

				{ { "kamal", "khan", "jan", "farid" }, { "kamal", "khan", "jan", "farid" },
						{ "kamal", "khan", "jan", "farid" }, { "kamal", "khan", "jan", "farid" },

				}, { { "kamal", "khan", "jan", "farid" }, { "kamal", "khan", "jan", "farid" },
						{ "kamal", "khan", "jan", "farid" }, { "kamal", "khan", "jan", "farid" },

				}

		};

		for (int f = 0; f < student.length; f++) {

			for (int exam = 0; exam < student[f].length; exam++) {

				for (int point = 0; point < student[f][exam].length; point++)
					System.out.println((point) + " => " + student[f][exam][point]);

			}

		}

	}

}