package com.collection;

import java.util.LinkedList;

public class Employees {

	public static void main(String[] args) {
		
		 LinkedList <String> employeesList = new LinkedList<String>();
		 
		 employeesList.add("Samim");
		 employeesList.add("karim");
		 employeesList.add("feriba");
		 employeesList.add("khadija");
		 employeesList.add(2, "shamila");
		 
		 
		 LinkedList <String> NewemployeesList = new LinkedList<String>();
		 
		 NewemployeesList.add("Zabih");
		 NewemployeesList.add("Khalid");
		 NewemployeesList.add("zalim");
		 
		
		 
		 NewemployeesList.remove(2);
		  employeesList.addAll(NewemployeesList);
		 
		 for(String emp :  employeesList) {
			 System.out.println(emp);
		 }
		 
		 

	}

}
