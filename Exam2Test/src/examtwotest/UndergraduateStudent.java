//************************************
//Program Name: UndergraduateStudent.java
//Developer: Derrick Subnaik
//Date Created: 04/26/2024
//Version: 1.0
//Purpose: Exam 2
//************************************
package examtwotest;
//UndergraduateStudentclass
public class UndergraduateStudent extends Student {
	
	public static int undergraduateStudentCount=0;
	
	//constructor
	UndergraduateStudent (String name, int studentID, String major)
	{
		super(name, studentID, major);
		
		undergraduateStudentCount++;
	}//end of constructor
}//end of UndergraduateStudent
