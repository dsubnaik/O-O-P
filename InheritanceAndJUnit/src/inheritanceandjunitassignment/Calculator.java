//************************************
//Program Name: LabelFrame.java
//Developer: Derrick Subnaik
//Date Created: 04/4/2024
//Version: 1.0
//Purpose: Assignment Inheritance and JUnit
//************************************
package inheritanceandjunitassignment;
import java.lang.Math;


//Calculator class has basic math methods 
public class Calculator {
	
	
	private final String NAME="Calculator";
	
	//addTwoIntegers returns the sum of two integers using the Math library
	public int addTwoIntegers(int integerOne, int integerTwo)
	{
		return Math.addExact(integerOne, integerTwo);
	}
	
	//subtractTwoIntegers returns the difference of two integers using the math library
	public int subtractTwoIntegers(int integerOne, int integerTwo)
	{
		return Math.subtractExact(integerOne, integerTwo);
	}
	
	//multiplyTwoIntegers returns the product of two integers using the math library
	public int multiplyTwoIntegers(int integerOne, int integerTwo)
	{
		return Math.multiplyExact(integerOne, integerTwo);
	}
	
	//divideTwoIntegers returns the quotient of two integers
	public int divideTwoIntegers(int integerOne, int integerTwo)
	{
		return integerOne/integerTwo;
	}
	
	//listProvidedOperations returns a list of the operations in this class
	protected String listProvidedOperations()
	{
		return "addTwoIntegers\n"
				+ "subtractTwoIntegers\n"
				+ "multiplyTwoIntegers\n"
				+ "divideTwoIntegers\n"
				+ "listProvidedOperations\n";
	}//end of listProvidedOperations
	
}//end of Calculator
