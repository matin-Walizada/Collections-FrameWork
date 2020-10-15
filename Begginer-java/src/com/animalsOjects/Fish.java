package com.animalsOjects;

public class Fish implements Animal {

	@Override
	public String doflt() {
		 
		return "no at all they move by swimiing";
	}

	@Override
	public String dohunt() {
		 
		return "yes the big fishes do hunt";
	}

	@Override
	public int numberLeges() {
	 
		return 0;
	}

	@Override
	public String LivingArea() {
		 
		return "in Oceans";
	}

	@Override
	public String showColor() {
		 
		return " fishes are in defferent color";
	}

	@Override
	public String toString() {
		return "Fish [doflt()=" + doflt() + ", dohunt()=" + dohunt() + ", numberLeges()=" + numberLeges()
				+ ", LivingArea()=" + LivingArea() + ", showColor()=" + showColor() + "]";
	}
	
	
	
	

}
