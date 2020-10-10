package com.collection;


// model class
public   class Student implements Comparable {
	// create fields 
	int id;
	String firstName;
	String lastName;
	int age;
	
	public Student() {
		 
	}
	
	// create constructor
	public Student(int id, String firstName, String lastName, int age) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		 
	}
	
	// getters and setters of field
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

 

	@Override
	public int compareTo(Object compateTo) {
		int compareAgge = ((Student) compateTo).getAge();
		return compareAgge - this.age;
	
	}

	
	 
 
	
	
	
	
	

}
