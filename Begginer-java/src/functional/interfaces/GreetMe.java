package functional.interfaces;

public class GreetMe {
	
	static String name = "sana";
	static int age = 23;
	
	static String showName(String name ){
		 
		 return name;
	 }
	
	static int showage( int age){
		 
		 return age;
	 }

	public static void main(String[] args) {
		
		
		Thread theThread = new Thread( (()->System.out.println("Thread Class") ) );
		
		theThread.run();
		
		
		Runnable theLambdaExpresson = () -> System.out.println("Runnable thread Interface");
		
		theLambdaExpresson.run();

		Greeting sayToEeveryOne = () -> {
		};
		sayToEeveryOne.HelloWorld();

		Greeting theGreeting = new Greeting() {

			@Override
			public void HelloWorld() {
				System.out.println("this is innner class which is implementation of functional interface");

			}

		};

		theGreeting.HelloWorld();
		
		 // Lambda expression implement
	 
		MyLambdia theLambdia = (String name, int age) -> name + age;
		
		System.out.println(theLambdia.showLengh("kamal ", 24));
	 
		 // Anonymose class
		
		
		
		MyLambdia theLambdia2 = new MyLambdia() {
			
			@Override
			public String showLengh(String name, int age) {
			 
				return name + age;
			}
		};
		
	
		System.out.println(theLambdia2.showLengh(showName(name), showage(age)));
		
		
	 
	}
	

}
			// functional interface
		interface MyLambdia{
			
			String showLengh(String name, int age);
			
		}



