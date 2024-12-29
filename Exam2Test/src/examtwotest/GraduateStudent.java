//************************************
//Program Name: GraduateStudent.java
//Developer: Derrick Subnaik
//Date Created: 04/26/2024
//Version: 1.0
//Purpose: Exam 2
//************************************
package examtwotest;

public class GraduateStudent extends Student {

	public static int graduateStudentCount=0;
	
	//constructor
	GraduateStudent(String name, int studentID, String major)
	{
		super(name, studentID, major);
		
		//increase student count 
		graduateStudentCount++;
	}
}//end of graduateStudent
