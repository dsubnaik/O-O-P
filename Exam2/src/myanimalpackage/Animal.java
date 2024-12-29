//************************************
//Program Name: Animal.java
//Developer: Derrick Subnaik
//Date Created: 04/26/2024
//Version: 1.0
//Purpose: Parent class for specific animal types
//************************************
package myanimalpackage;

//abstract class is Animal
public abstract class Animal {

	//declaring attributes 
	//attributes are protected meaning subclasses will have access
	protected int locationX=0;
	protected int locationY=0;
	
	//Animal constructor
	Animal(int x, int y)
	{
		//checking to see if x is in range 0-1000
		if(x>=0 && x<=1000)
		{
			locationX=x;
		}
		else
		{
			//displaying to user that locationX is out of range
			System.out.println("locationX not in range, initializing to 0");
			locationX=0;
		}
		
		//checking to see if y is in range 0-1000
		if(y>=0 && y<=1000)
		{
			locationY=y;
		}
		else
		{
			//displaying to user that location is out of range 
			System.out.println("locationY not in range, intialzing to 0");
			locationX=0;
		}
		
	}//end of Animal constructor
	
	//getLocationX method returns locationX
	public int getLocationX()
	{
		return locationX;
	}
	
	//getLocationY method returns locationY
	public int getLocationY()
	{
		return locationY;
	}
	
	//end of getter methods
	
	//setLocationX method sets locationX
	public void setLocationX(int x)
	{
		//checking to see if x is in range 0-1000
		if(x>=0 && x<=1000)
		{
			locationX=x;
		}
		else
		{
			//displaying to user that locationX is out of range
			System.out.println("locationX not in range, initializing to 0");
			locationX=0;
		}
	}//end of setLocationX
	
	//setLocationY sets locationY
	public void setLocationY(int y)
	{
		//checking to see if y is in range 0-1000
		if(y>=0 && y<=1000)
		{
			locationY=y;
		}
		else
		{
			//displaying to user that location is out of range 
			System.out.println("locationY not in range, intialziing to 0");
			locationX=0;
		}
	}//end of setLocationY
	
	//end of setter methods
	
	//move is an abstract method and overridden in subclasses
	public abstract void move();
	
	//makeSound is an abstract method and overridden in subclasses
	public abstract void makeSound();
	
	//toString method returns the current location of an animal, Override from Object class
	@Override
	public String toString()
	{
		return "The current location is (" + locationX + "," + locationY +").";
	}//end of toString
	
}//end of Animal class
