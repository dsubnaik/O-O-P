//************************************
//Program Name: Shape.java
//Developer: Derrick Subnaik
//Date Created: 04/11/2024
//Version: 1.0
//Purpose: Polymorphism Assignment
//************************************
package shapes;

//Shape class is abstract 
public abstract class Shape {
	
	//area is protected so it can be used in subclasses
	protected double area=0;
	
	//getArea returns the area 
	public double getArea()
	{
		return area;
	}
	
	//calculateArea is an abstract method and overridden in subclasses
	abstract void calculateArea();
	
	//toString method is overridden from Java library
	//and displays the Area
	@Override
	public String toString()
	{
		return "Area: " + area;
	}
	
}//end of Shape class
