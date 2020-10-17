package encupsulatoin;

public class StudentsInfor {

	public static void main(String[] args) {
	 
		
		Students theStudents = new Students();
		theStudents.setId(11);
		theStudents.setName("Mohmoud");
		
		
		System.out.println(theStudents.getId());
		System.out.println(theStudents.getName());
		
		theStudents.showStudentInfo();
	}

}
