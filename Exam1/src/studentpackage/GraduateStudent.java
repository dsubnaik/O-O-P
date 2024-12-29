//************************************
//Program Name: Exam1
//Developer: Derrick Subnaik
//Date Created: 03/6/2023
//Version: 1.0
//Purpose: Exam1 
//************************************
package studentpackage;

public class GraduateStudent 
{
	//initializing attributes
	private String name=null;
	private int studentID=0;
	private int age=0;
	private float gpa=0.0f;
	
	GraduateStudent(String name, int studentID, int age, float gpa)
	{
		this.name=name;
		
		//checking studentID for acceptable value being 6 digits
		if(studentID>99999 && studentID<1000000)
		{
			this.studentID=studentID;
		}
		else
		{
			//displaying to user that ID number is invalid and initialized to 0
			System.out.println("Invalid student ID number , initializing to 0");
			this.studentID=0;
		}
		
		//checking age for acceptable value
		if(age>0 && age<100)
		{
			this.age=age;
		}
		else
		{
			//displaying to user that age is invalid and initialized to 0
			System.out.println("Invalid age, initializing to 0");
			this.age=0;
		}
		
		//checking gpa for acceptable value
		if(gpa>0.0 && gpa<=4.0)
		{
			this.gpa=gpa;
		}
		else
		{
			//displaying to user that gpa is invalid and initialized to 0
			System.out.println("Invalid gpa, initialzing to 0.0");
			this.gpa=0.0f;
		}
	}//end of constructor
	
	//setStudentGpa method
	public void setStudentGpa(float gpa)
	{
		//checking if gpa is in range
		if(gpa>0.0 && gpa<=4.0)
		{
			this.gpa=gpa;
		}
		else
		{
			//displaying to user that gpa is invalid and initialized to 0
			System.out.println("Invlaid gpa, initializing to 0");
			this.gpa=0.0f;
		}
	}//end of setStudentGpa
	
	//getStudentName method returns name
	public String getStudentName()
	{
		return name;
	}
	
	//getStudentID method returns studentID
	public int getStudentID()
	{
		return studentID;
	}
	
	//getStudentAge method returns age
	public int getStudentAge()
	{
		return age;
	}
	
	//getStudentGpa method returns gpa
	public float getStudentGpa()
	{
		return gpa;
	}
	
	//end of getter methods
	
	//printStudentInformation method displays student information to user
	public void printStudentInformation()
	{
		//displaying information to user
		System.out.println("\nGraduate Student:");
		System.out.println("Student Name: " + name);
		System.out.println("StudentID: " + studentID);
		System.out.println("Student age: " + age);
		System.out.printf("Student gpa: %.2f", gpa);//displaying gpa two spots after decimal
		System.out.println();//prints a blank line for better user interface
	}//end of printStudentInformation

}//End of GraduateStudemt class
