//************************************
//Program Name: Circle.java
//Developer: Derrick Subnaik
//Date Created: 04/11/2024
//Version: 1.0
//Purpose: Polymorphism Assignment
//************************************
package shapes;
import java.lang.Math;//for this class we use it for pi

//Circle class is a subclass of Shape
public class Circle extends Shape{

	//class attributes
	private int centerX=0;
	private int centerY=0;
	private double radius=0;
	
	//Circle constructor
	Circle(int centerX, int centerY, double radius)
	{
		this.centerX=centerX;
		this.centerY=centerY;
		this.radius=radius;
		this.calculateArea();
	}//end of constructor
	
	//getCenterX returns centerX
	public int getCenterX()
	{
		return centerX;
	}
	
	//getCenterY returns centerY
	public int getCenterY()
	{
		return centerY;
	}
	
	//calculateArea is overridden from Shape class
	//calculates the area using area=PI*radius*radius
	@Override
	public void calculateArea()
	{
		area= Math.PI * radius * radius;
	}
	
	////toString displays the attributes of the circle
	@Override
	public String toString()
	{
		//displaying area to two decimals 
		return "Circle Area: " + String.format("%.2f", area)
				+ "\nRadius: " + radius
				+ "\nCenterX: " + centerX
				+ "\nCenterY: " + centerY;
	}//end of toString
	
	
}//end of Circle
