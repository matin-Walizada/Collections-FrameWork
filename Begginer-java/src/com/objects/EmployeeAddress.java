package com.objects;

public class EmployeeAddress {
	
	private int aptNumber;
	private String stree;
	private	String city;
	private	String state;
	private	int zipCode;
	
	// getter method get the value of our variabls
	public int getAptNumber() {
		return aptNumber;
	}
	// setter method set the value of our variabls
	public void setAptNumber(int aptNumber) {
		this.aptNumber = aptNumber;
	}
	public String getStree() {
		return stree;
	}
	public void setStree(String stree) {
		this.stree = stree;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	
	// annotation
	@Override 
	public String toString() {
		return "EmployeeAddress [APT= " + aptNumber + ", stree=" + stree + ", city=" + city + ", state=" + state
				+ ", zipCode=" + zipCode + ", getAptNumber()=" + getAptNumber() + ", getStree()=" + getStree()
				+ ", getCity()=" + getCity() + ", getState()=" + getState() + ", getZipCode()=" + getZipCode() + "]";
	}
	
	
	
	
	// getter and setter
	
	

}
