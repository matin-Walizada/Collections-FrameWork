package com.objects;

public class TeamLead extends Employee {
	
	
	double salary;
	String jobTitle;
	
	
	public TeamLead(int id, String firstName, String lastName, double salary, String jobTitle) {
		super(id, firstName, lastName);
		
		this.salary = salary;
		this.jobTitle = jobTitle;
	}
	
	
	
	
	@Override
	public String toString() {
		return "TeamLead [salary=" + salary + ", jobTitle=" + jobTitle + ", id=" + id + ", firstName=" + firstName
				+ ", lastName=" + lastName + "]";
	}




	public static void main(String[] args) {
		
		TeamLead theLead = new TeamLead(20, "shabana", "kazimi", 20000, "Team LEAD");
		
		System.out.println(theLead);
		
		EmployeeAddress theEmployeeAddress = new EmployeeAddress();
		
		theEmployeeAddress.setAptNumber(100);
		theEmployeeAddress.setStree("WASHINTON ST");
		theEmployeeAddress.setCity("washinton dc");
		theEmployeeAddress.setState("DC");
		theEmployeeAddress.setZipCode(4321);
		
	System.out.println(theEmployeeAddress);
		
		
		
	}
	
	
	
	
	
	
	

}
