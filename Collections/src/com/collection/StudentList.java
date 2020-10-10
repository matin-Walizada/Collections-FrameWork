package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class StudentList {

	
	
	public static void main(String[] args) {
		// create a list of students name using LinkedList Class
		
 
	 List<String> myStudentList = new LinkedList<String>();
		
	 myStudentList.add("Kamal");
	 myStudentList.add("Cuhila");
	 myStudentList.add("Zumira");
	 myStudentList.add("Bazil");
	 myStudentList.add("Ahmad");
	 
	 Collections.sort(myStudentList);
	 for(String s : myStudentList) {
		 System.out.println(s);
	 }
	 List<String> employeeList = new ArrayList<String>();
	 
	 employeeList.add("Kabir");
	 employeeList.add("Zhamim");
	 employeeList.add("Bazim");
	 employeeList.add("Aarid");
	 
	 Collections.sort(employeeList);
	 for(String e : employeeList) {
		 System.out.println(e);
	 }
	 
	 List<String> teachersList = new Vector<String>();
	 teachersList.add("Aarhad");
	 teachersList.add("Ban");
	 teachersList.add("Cazam");
	 teachersList.add("Eamim");
	 teachersList.add("Zhalid");
	 
	 System.out.println("============\n");
	 Collections.sort(teachersList, Collections.reverseOrder());
	 
	 System.out.println(teachersList);
//	 System.out.println("Afg", "Afghanistan");
//	 System.out.println("USA", "United State");
//	 System.out.println("UK", "United Kindom");
//	 System.out.println("jp", "japan");
//	 System.out.println("GRE", "German");
	 
	 HashMap<Integer, String> countrisList = new HashMap<Integer, String>();
	 countrisList.put(93, "Afghanistan");
	 countrisList.put(+1, "United State");
	 countrisList.put(97, "United Kindom");
	 countrisList.put(98, "Japan");
	 countrisList.put(95, "German");
		
	}
}
