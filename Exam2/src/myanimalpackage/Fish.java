//************************************
//Program Name: Fish.java
//Developer: Derrick Subnaik
//Date Created: 04/26/2024
//Version: 1.0
//Purpose: Subclass of Animal, provides specific behavior for Fish
//************************************
package myanimalpackage;

//Fish class is a subclass of Animal
public class Fish extends Animal{

	//Fish Constructor
	Fish(int x, int y)
	{
		//calls the Constructor of the parent class
		super(x,y);
	}//end of constructor
	
	//move method is overridden from parent class
	//move method also prints that the fish was moved
	//and adjusts the fish locationX and locationY by 5
	@Override
	public void move()
	{
		//adding 5 to locationX
		locationX+=5;
		
		//adding 5 to locationY
		locationY+=5;
		
		System.out.println("The Fish moved.");
		
	}//end of move method
	
	//makeSound method is overriden from parents
	//makeSound method prints that the fish has no sound
	@Override
	public void makeSound()
	{
		System.out.println("The Fish makes no sound.\n");
	}//end of makeSound
	
	//toString method returns the current location of bird
	@Override
	public String toString()
	{
		return "The current location is (" + locationX + "," + locationY +").";
	}//end of toString
	
}//end of Fish class
