package encupsulatoin;

public class EmployeeInofo {

 
	
	
	
	
	public static void main(String[] args) {
		
		
Employees theEmployees = new Employees();




	theEmployees.setEmpId(30);
	theEmployees.setEmpName("Kayhan");
	theEmployees.setEmpSalaary(20.0000);
	
	System.out.println(theEmployees.getEmpId());
	System.out.println(theEmployees.getEmpName());
	System.out.println(theEmployees.getEmpSalaary());
	
	if(theEmployees.getEmpId() == 20 && theEmployees.getEmpName() == "Kayhan") {
		System.out.println("this student is in the class");
	} else {
		System.out.println("the student is not in the class");
	}
	

	}

}
