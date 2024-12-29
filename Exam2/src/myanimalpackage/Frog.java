//************************************
//Program Name: Frog.java
//Developer: Derrick Subnaik
//Date Created: 04/26/2024
//Version: 1.0
//Purpose: Subclass of Animal, provides specific behavior for a Frog
//************************************
package myanimalpackage;

//Frog class is a subclass of Animal
public class Frog extends Animal{

	//Frog constructor
	Frog(int x, int y)
	{
		//calls the constructor of the parent class
		super(x,y);
	}//end of constructor
	
	//move method is overridden from parent class
	//move method also prints that the Frog was moved
	//and adjusts the Frogs locationX and locationY by 2
	@Override
	public void move()
	{
		//adding 2 to locationX
		locationX+=2;
		
		//adding 2 to locationY
		locationY+=2;
		
		System.out.println("The Frog moved.");
		
	}//end of move method
	
	//makeSound method is overridden from parent class
	//makeSound method prints the sound that a frog makes
	@Override
	public void makeSound()
	{
		System.out.println("The Frog : Croak Croak!\n");
	}//end of makeSound
	
	//toString method returns the current location of Frog
	@Override
	public String toString()
	{
		return "The current location is (" + locationX + "," + locationY +").";
	}//end of toString
	
}//end of Frog class
