//************************************
//Program Name: Rectangle.java
//Developer: Derrick Subnaik
//Date Created: 04/11/2024
//Version: 1.0
//Purpose: Polymorphism Assignment
//************************************
package shapes;

//Rectangle class is a subclass of Shape
public class Rectangle extends Shape{
	
	//class attributes
	private int width=0;
	private int length=0;
	
	//Rectangle Constructor
	Rectangle(int width, int length)
	{
		this.width=width;
		this.length=length;
		this.calculateArea();
	}//end of constructor
	
	//getWidth returns the width of the rectangle
	public int getWidth()
	{
		return width;
	}
	
	//getLength returns the length of the rectangle
	public int getLength()
	{
		return length;
	}
	
	//calculateArea is overridden from Shape class
	//calculates the area using area=length*width
	@Override
	public void calculateArea()
	{
		area= length * width;
	}
	
	//toString displays the attributes of the rectangle
	@Override
	public String toString()
	{
		//displaying area to two decimals
		return "Rectangle Area: " + String.format("%.2f", area)
				+ "\nLength: " + length
				+ "\nWidth: " + width;
		
	}//end of toString
	
}//end of rectangle
