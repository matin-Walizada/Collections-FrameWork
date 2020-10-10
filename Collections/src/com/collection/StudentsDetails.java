package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class StudentsDetails {

	public static void main(String[] args) {
		// objects of student class
		Student student1 = new Student(1, "ZAHRA", "kZimi", 24);
		Student student2 = new Student(2, "Fahim", "ahmadi", 43);
		Student student3 = new Student(3, "shabana", "Aram", 21);
		Student student4 = new Student(4, "faiz", "khan", 64);
		Student student5 = new Student(5, "Farid", "Hakim", 54);
		Student student6 = new Student(6, "sardar", "ahmad", 42);
		Student student7 = new Student(7, "Farid", "Hakim", 38);
		
		 HashMap<String, String> countris = new HashMap<String, String>();
		 
		 countris.put("Afg", "Afghanistan");
		 
	
		List<Student> studentsList = new ArrayList<Student>();
		
		studentsList.add(student1);
		studentsList.add(student2);
		studentsList.add(student3);
		studentsList.add(student4);
		studentsList.add(student5);
		studentsList.add(student6);
		studentsList.add(student7);

		Collections.sort(studentsList);

//		for (Student student : studentsList) {
//			if (student.getAge() >= 18) {
//				
//				System.out.println("ID " + student.getId() + "  First Name: " + student.getFirstName() + " Last Name: "
//						+ student.getLastName() + " AGE: " + student.getAge());
//			} else {
//				System.out.println("they are not in age range");
//			}

		}

	}


