package com.objects;

public class EmployeeAdress {
	
	private String street;
	private int apt;
	private String city;
	private String state;
	private int zipCode;
	
	// create getters and setters of our variables
	
	// what is getters and setters?
	// they are methods associated with our variables to set and get their values
	
	public String getStree() {
		return street;
	}
	public void setStree(String stree) {
		this.street = stree;
	}
	public int getApt() {
		return apt;
	}
	public void setApt(int apt) {
		this.apt = apt;
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
	@Override
	public String toString() {
		return "EmployeeAdress [street=" + street + ", apt=" + apt + ", city=" + city + ", state=" + state
				+ ", zipCode=" + zipCode + "]";
	}
	
	

	
	
	
	

}
