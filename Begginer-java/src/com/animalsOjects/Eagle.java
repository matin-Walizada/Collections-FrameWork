package com.animalsOjects;

public class Eagle implements Animal {
  
	
	@Override
	public String doflt() {
		 
		return " YES THE Eagle flise 50000 meter high ";
	}

	@Override
	public String dohunt() {
		
		return "yes the eagle hunt small birds";
	}

	@Override
	public int numberLeges() {
		 
		return 2;
	}

	@Override
	public String LivingArea() {
		 
		return "mostly lives in Mountains";
	}

	@Override
	public String showColor() {
		 
		return "Gray";
	}

	@Override
	public String toString() {
		return "Eagle [doflt()=" + doflt() + ", dohunt()=" + dohunt() + ", numberLeges()=" + numberLeges()
				+ ", LivingArea()=" + LivingArea() + ", showColor()=" + showColor() + "]";
	}
	
	
	
	

}
