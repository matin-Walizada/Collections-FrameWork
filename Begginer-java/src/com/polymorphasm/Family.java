package com.polymorphasm;

public class Family {

	// method overloading

	void study() {
		System.out.println("every one in the family studies");

	}

	void study(String subject) {

		System.out.println("every one study in the family " + subject + "Language for the first time");
	}

	void study(String subject, int grade) {
		System.out.println("every one studey " + subject + grade + "based on thier age");
	}

	public static void main(String[] args) {

		Family theFamily = new Family();
		theFamily.study();
		theFamily.study(" Enlish ");
		theFamily.study(" Coding ", 7);

	}

}
