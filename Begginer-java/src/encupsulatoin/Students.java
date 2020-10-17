package encupsulatoin;

public class Students {
	// 1 should create variables private
	private int id;
	private String name;

	// 2 each variable need to have a getter and setter method

	// getter method return the value of variable
	public int getId() {
		return id;
	}

	// setter method assign value to the variable
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void showStudentInfo() {
		if(getId() == 10 && getName() == "Suhila") {
			System.out.println("the student is present in the class");
		} else {
			System.out.println("that student is not in this Academy");
		}
			
	}

}
