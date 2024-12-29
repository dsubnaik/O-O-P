//************************************
//Program Name: Exam1
//Developer: Derrick Subnaik
//Date Created: 03/6/2023
//Version: 1.0
//Purpose: Exam1 
//************************************
package studentpackage;
import java.util.ArrayList;

//driver class
public class StudentDriver {

	//main 
	public static void main(String[] args) 
	{
		
		//constant variable for size of undergraduate student array
		final int UNDERGRADUATE_STUDENT_SIZE=4;
		
		//defining attributes for averages of undergraduates age, gpa
		float averageAgeForUndergraduateStudents=0.0f;
		float averageAgeForGraduateStudents=0.0f;
		
		//defining attributes for averages of graduates student age, gpa
		float averageGpaForUndergraduateStudents=0.0f;
		float averageGpaForGraduateStudents=0.0f;
		
		//creating an array for UndergraduateStudents with a size of 4
		UndergraduateStudent[] undergraduateStudents= new UndergraduateStudent[UNDERGRADUATE_STUDENT_SIZE];
		
		//creating an ArrayList for graduateStudents
		ArrayList<GraduateStudent> graduateStudents = new ArrayList<GraduateStudent>();
		
		//adding attributes for UndergraduateStudent array
		undergraduateStudents[0]=new UndergraduateStudent("Nicholas Davis", 202122, 18, 4.0f);
		undergraduateStudents[1]=new UndergraduateStudent("Julie Brown", 232425, 20, 3.1f);
		undergraduateStudents[2]=new UndergraduateStudent("Kevin Williams", 262728, 25, 3.6f);
		undergraduateStudents[3]=new UndergraduateStudent("Olivia Anderson",293031,21,2.4f);
		
		//adding attributes for the graduateStudents arrayList
		graduateStudents.add(new GraduateStudent("John Wilson",112345,23,3.9f));		
		graduateStudents.add(new GraduateStudent("Elizabeth Jones",678910, 21,3.0f));
		graduateStudents.add(new GraduateStudent("Jeff Thompson", 111213, 22,2.5f));
		graduateStudents.add(new GraduateStudent("Karen Smith", 141516, 30,3.7f ));
		graduateStudents.add(new GraduateStudent("Tom Johnson", 171819,22, 3.5f));
		
		//display the undergrad student information from the array
		for(int i=0;i<undergraduateStudents.length;i++)
		{
			undergraduateStudents[i].printStudentInformation();
		}
		
		//display the graduate student arrayList
		for(int i=0;i<graduateStudents.size();i++)
		{
			graduateStudents.get(i).printStudentInformation();
		}
		
		//calculating the total for the average age of undergraduate students
		for(int i=0;i<undergraduateStudents.length;i++)
		{
			averageAgeForUndergraduateStudents += undergraduateStudents[i].getStudentAge();
		}
		
		//divides the total by the size of the array to find the average
		averageAgeForUndergraduateStudents/=undergraduateStudents.length;
		
		//Printing a blank line for users to be able to read easier
		System.out.println();

		//displays the average of age to students
		System.out.println("The average age for undergraduate students is " + averageAgeForUndergraduateStudents);
		
		//calculating the total for the graduate students
		for(int i=0;i<graduateStudents.size();i++)
		{
			averageAgeForGraduateStudents +=graduateStudents.get(i).getStudentAge();
		}
		
		//divides the total by the size of the array 
		averageAgeForGraduateStudents/= graduateStudents.size();
		
		//displaying the age of graduate students
		System.out.println("The average age for graduate students is " + averageAgeForGraduateStudents);
		
		//if the age for undergraduate students is higher
		if(averageAgeForUndergraduateStudents>averageAgeForGraduateStudents)
		{
			System.out.println("The average age is higher in undergraduates student");
		}
		//if the age for graduate students is higher
		else if(averageAgeForGraduateStudents>averageAgeForUndergraduateStudents)
		{
			System.out.println("The average age is higher in graduate students");
		}
		//if the age for graduate students and undergraduate students are equal
		else
		{
			System.out.println("The average age in graduate and undergraduate students are equal");
		}
		
		//calculating the average gpa for undergraduate students
		for(int i=0;i<undergraduateStudents.length;i++)
		{
			averageGpaForUndergraduateStudents += undergraduateStudents[i].getStudentGpa();
		}
		
		//divides the total by the size of the array 
		averageGpaForUndergraduateStudents/=undergraduateStudents.length;;
		
		//displaying to the user the average gpa of undergraduate students
		System.out.printf("The average gpa for undergraduate students is %.2f", averageGpaForUndergraduateStudents);
		
		System.out.println();//printing blank line for user readability
		
		//calculating average gpa for graduate students
		for(int i=0;i<graduateStudents.size();i++)
		{
			averageGpaForGraduateStudents +=graduateStudents.get(i).getStudentGpa();
		}
		
		//divides the total by the size of the array 
		averageGpaForGraduateStudents /= graduateStudents.size();
		
		//displaying to user the average age of graduate students
		System.out.printf("The average gpa for graduate students is %.2f", averageGpaForGraduateStudents);
		
		System.out.println();//printing blank line for user readability
		
		//if the average for undergraduate students gpa is higher
		if(averageGpaForUndergraduateStudents>averageGpaForGraduateStudents)
		{
			System.out.println("The average gpa is higher in undergraduates student");
		}
		//if the average graduate student gpa is higher
		else if(averageGpaForGraduateStudents>averageGpaForUndergraduateStudents)
		{
			System.out.println("The average gpa is is higher in graduate students");
		}
		//if the average gpa for undergraduate and graduate students are equal
		else
		{
			System.out.println("The average gpa in graduate and undergraduate students are equal");
		}
		
	}//End of main

}//End of StudentDriver class
