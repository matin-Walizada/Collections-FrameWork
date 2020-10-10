package com.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class MyCollectionList {

	public static void main(String[] args) {
		// 1 List

		List<String> studentList = new ArrayList<String>();
		studentList.add("Kamal");
		studentList.add("Ahmad");

		List<String> studentNames = new LinkedList<String>();
		studentNames.add("Zhala");
		studentNames.add("Fahim");

		List<String> students = new Vector<String>();
		students.add("Zhala");
		students.add("Fahim");

		List<String> studentsListName = new Stack<String>();
		studentsListName.add("Zhala");
		studentsListName.add("Fahim");

		// 2 Set

		Set<Integer> apartmenNumbers = new TreeSet<Integer>();
		apartmenNumbers.add(20);
		apartmenNumbers.add(30);
		apartmenNumbers.add(43);

		Set<String> State = new HashSet<String>();
		State.add("NEW YORK");
		State.add("Texas");
		State.add("Virginia");
		
		System.out.println(State.isEmpty());
		State.remove("Texas");
		
		System.out.println(State);

		Set<Double> salaary = new LinkedHashSet<Double>();
		salaary.add(20000.00);
		salaary.add(50000.00);
		salaary.add(70000.00);
		
		// 3 Map
		
		HashMap<String, String> CountrisList = new HashMap<String, String>();
		CountrisList.put("AFG", "Afghansita");
		CountrisList.put("USA", "United States");
		CountrisList.put("GR", "German");
		CountrisList.put("JP", "Japan");
		
		
		TreeMap<Integer, Integer> countrisMobilesNumber = new TreeMap<Integer, Integer>();
		countrisMobilesNumber.put(1, 34453453);
		countrisMobilesNumber.put(93, 794524556);
		countrisMobilesNumber.put(96, 34534534);
		countrisMobilesNumber.put(96, 794524556);
		
		Hashtable<Integer, String> studentsInfolist = new Hashtable<Integer, String>();
		studentsInfolist.put(01, "Zamir");
		studentsInfolist.put(02, "Suhila");
		studentsInfolist.put(03, "Farzana");
		studentsInfolist.put(04, "Kamila");
		LinkedHashMap<String, String> TeachersSubjectsAndNames = new LinkedHashMap<String, String>();
		TeachersSubjectsAndNames.put("English", "Tahmina");
		TeachersSubjectsAndNames.put("Computer Sciences", "Tamana");
		TeachersSubjectsAndNames.put("Phesycs", "Adil");
		
		

	}

}
