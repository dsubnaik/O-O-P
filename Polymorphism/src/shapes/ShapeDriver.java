//************************************
//Program Name: ShapeDriver.java
//Developer: Derrick Subnaik
//Date Created: 04/11/2024
//Version: 1.0
//Purpose: Polymorphism Assignment
//************************************
package shapes;

//Driver class
public class ShapeDriver {
	
	//main method
	public static void main(String[] args) {
		
		//initializing array size
		final int ARRAY_SIZE=4;
		
		//creating an array of shapes
		Shape[] shapes = new Shape[ARRAY_SIZE];
		
		//creating two instances of Circle into the shape array
		shapes[0] = new Circle(3,3,5);
		shapes[1] = new Circle (2,5,8);
		
		//creating two instances of Rectangle into the shape array
		shapes[2] = new Rectangle(4,6);
		shapes[3] = new Rectangle(9,7);
		
		//for loop iterates through array and calls the toString method
		//toString method displays attributes and values for the shape array
		for(Shape shape: shapes)
		{
			System.out.println(shape.toString());
		}
		
	}//end of main

}//end of ShapeDriver
