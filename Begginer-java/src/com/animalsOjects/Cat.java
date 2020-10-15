package com.animalsOjects;

public class Cat implements Animal {

	@Override
	public String doflt() {
		 
		return "no thet dont fly";
	}

	@Override
	public String dohunt() {
	 
		return "yes thet are mity hunters";
	}

	@Override
	public int numberLeges() {
		 
		return 4;
	}

	@Override
	public String LivingArea() {
		 
		return "they are mostlt pets";
	}

	@Override
	public String showColor() {
		 
		return "cats are in defferent colors by the black ones are scary";
		
		
	}

	@Override
	public String toString() {
		return "Cat [doflt()=" + doflt() + ", dohunt()=" + dohunt() + ", numberLeges()=" + numberLeges()
				+ ", LivingArea()=" + LivingArea() + ", showColor()=" + showColor() + "]";
	}
	
	
	
	

}
