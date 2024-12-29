//************************************
//Program Name: Student.java
//Developer: Derrick Subnaik
//Date Created: 04/26/2024
//Version: 1.0
//Purpose: Exam 2
//************************************
package examtwotest;

//student class
public abstract class Student {

	//initialize variables
	private String name=null;
	private int studentID=0;
	private String major=null;
	
	//constructor
	Student(String name, int studentID, String major)
	{
		this.name=name;
		this.studentID=studentID;
		this.major=major;
	}
	
	protected void setMajor(String major)
	{
		this.major=major;
	}
	
	// to String method
	@Override
	public String toString()
	{
		return "Student Name : " + this.name
				+ "\nStudent Id : " + this.studentID
				+ "\nStudent Major : " + this.major;
	}
}//end of student

