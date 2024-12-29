//************************************
//Program Name: LabelFrame.java
//Developer: Derrick Subnaik
//Date Created: 04/4/2024
//Version: 1.0
//Purpose: Assignment Inheritance and JUnit
//************************************
package inheritanceandjunitassignment;
import java.lang.Math;

//CalculusCalculator is a subclass of Calculator
public class CalculusCalculator extends Calculator{
	
	//square returns the number squared
	public int square(int number)
	{
		return number*number;
	}
	
	//pow returns the result of a number raised to a power, uses the java math library
	public int pow(int base, int exponent)
	{
		return (int) Math.pow(base, exponent);
	}
	
	//round returns the rounded integer of a float number, uses the java math library
	public int round(float numberToRound)
	{
		return (int) Math.round(numberToRound);
	}
	
	//ceiling returns the ceiling, a float number rounded up, uses the java math library
	public int ceiling(float numberToRoundUp)
	{
		return (int) Math.ceil(numberToRoundUp);
	}
	
	//listProvidedOperations returns a list of the operations in this class and parent class
	protected String listProvidedOperations()
	{
		return super.listProvidedOperations() 
				+ "square\n"
				+ "pow\n"
				+ "round\n"
				+ "ceiling\n";
	}//end of listProvidedOperations
}//end of CalculusClass
