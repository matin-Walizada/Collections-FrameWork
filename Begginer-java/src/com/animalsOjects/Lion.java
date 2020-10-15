package com.animalsOjects;

public class Lion implements Animal{

	
 int lege = 4;
	public String loinhunt() {

		return "yes all the lion provid thiere foods from hunting";
	}

	@Override
	public String doflt() {

		return "Lions dont fly";
	}

	@Override
	public String dohunt() {

		return loinhunt();
	}

	@Override
	public int numberLeges() {

		return lege ;
	}

	@Override
	public String LivingArea() {

		return "mostly in forest";
	}

	@Override
	public String showColor() {

		return "yellow";
	}

	@Override
	public String toString() {
		return "Lion [doflt()=" + doflt() + ", dohunt()=" + dohunt() + ", numberLeges()=" + numberLeges()
				+ ", LivingArea()=" + LivingArea() + ", showColor()=" + showColor() + "]";
	}

	
	
	
	
	
}
