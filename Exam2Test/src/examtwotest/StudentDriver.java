//************************************
//Program Name: StudentDriver.java
//Developer: Derrick Subnaik
//Date Created: 04/26/2024
//Version: 1.0
//Purpose: Exam 2
//************************************
package examtwotest;

public class StudentDriver {

	public static void main(String[] args) {
		
		//creating an instance 
		UndergraduateStudent undergraduateStudent1 = new UndergraduateStudent("Isaac Newton", 1, "Undergraduate Physics");
		
		//displaying to user undergraduateStudent1 info
		System.out.println(undergraduateStudent1.toString());
				
		//displaying current count
		System.out.println("\nNumber of Undergraduate Students is "+UndergraduateStudent.undergraduateStudentCount);
		
		//creating an instance
		UndergraduateStudent undergraduateStudent2 = new UndergraduateStudent("Albert Einstein", 10, "Undergraduate Physics");
		
		
		//displaying to user undergraduateStudent2 info
		System.out.println(undergraduateStudent2.toString());
		
		//displaying current count
		System.out.println("\nNumber of Undergraduate Students is "+UndergraduateStudent.undergraduateStudentCount);
		
		//creating an instance
		GraduateStudent graduateStudent1 = new GraduateStudent("Marie Curie", 2, "Graduate Chemistry");
				
		//displaying to user graduateStudent1 info
		System.out.println(graduateStudent1.toString());
		
		//displaying current count
		System.out.println("\nNumber of Undergraduate Students is "+GraduateStudent.graduateStudentCount);
	}//end of main

}//end of StudentDriver
