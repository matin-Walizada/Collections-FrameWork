package abstracttion;
// this is an abstract class 
public abstract class Animal {

	// these are abstract methods
	
	abstract void move();
	abstract String eat();
	abstract int numberOfLeag();
	
	
	// this a concrete method default method
	public void animalData() {
		
		System.out.println("all animals eats and drinks");
	}
	
	
	

}
