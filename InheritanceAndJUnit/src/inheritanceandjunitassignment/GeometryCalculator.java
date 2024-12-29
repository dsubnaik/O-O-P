//************************************
//Program Name: LabelFrame.java
//Developer: Derrick Subnaik
//Date Created: 04/4/2024
//Version: 1.0
//Purpose: Assignment Inheritance and JUnit
//************************************
package inheritanceandjunitassignment;

//GeometryCalculator is a subclass of Calculator
public class GeometryCalculator extends Calculator {
	
	//calculateArea returns the area of a rectangle
	//Formula for a rectangle: Area=length*width
	public int calculateArea(int length, int width)
	{
		return length*width;
	}
	
	//calculateVolume returns volume of a shape
	//Formula for Volume: Volume=length*width*height
	public int calculateVolume(int length, int width, int height)
	{
		return length*width*height;
	}
	
	//calculateHypotenuse returns the hypotenuse of a triangle
	//this method uses the pythagorean theorem to calculate the the hypotenuse
	//Pythagorean theorem= a^2+b^2=c^2
	//uses the java math library
	public float calculateHypotenuse(int base, int height)
	{
		return (float) Math.hypot(base, height);
	}
	
	//listProvidedOperations returns a list of the operations in this class and parent class
	protected String listProvidedOperations()
	{
		return super.listProvidedOperations()
				+ "calculateArea\n"
				+ "calculateVolume\n"
				+ "calculateHypotenuse\n";
	}//end of listProvidedOperations

}//end of GeometryClass
