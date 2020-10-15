package com.java;

public class Address {
	
	int aptNumber;
	String street;
	String city;
	String state;
	int zip;
	
	public int getAptNumber() {
		return aptNumber;
	}
	public void setAptNumber(int aptNumber) {
		this.aptNumber = aptNumber;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
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
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "Address [aptNumber=" + aptNumber + ", street=" + street + ", city=" + city + ", state=" + state
				+ ", zip=" + zip + "]";
	}
	
	

}
