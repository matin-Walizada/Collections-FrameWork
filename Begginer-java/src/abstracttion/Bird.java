package abstracttion;

public class Bird extends Animal implements AllNewAnimals{

	@Override
	void move() {
		 
			System.out.println("all birds move mostly by flying");
	}

	@Override
	String eat() {


		return "all birds eats Beats";
	}

	@Override
	int numberOfLeag() {


		return 2;
	}

	@Override
	public String livingArea() {


		return "Birds mostly live in Forest";
	}

	@Override
	public String spices() {
		 
		return "some of the birds speciose are in danger ";
	}

	// WE have implement all abstract methods of animal class
	
	
	
	
	
}
