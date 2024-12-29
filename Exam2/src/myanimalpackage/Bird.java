//************************************
//Program Name: Bird.java
//Developer: Derrick Subnaik
//Date Created: 04/26/2024
//Version: 1.0
//Purpose: Subclass of Animal, provides specific behavior for Bird
//************************************
package myanimalpackage;

//Bird class is a subclass of Animal
public class Bird extends Animal{

	//Bird Constructor
	Bird(int x, int y)
	{
		//calls the constructor in the parent class
		super(x,y);
	}//end of constructor
	
	//move method is overridden from Animal class
	//this method prints that the bird moved
	//and adjusts the birds locationX and locationY by 10
	@Override
	public void move()
	{
		//adding 10 to birds locationX
		locationX+=10;
		
		//adding 10 to birds locationY
		locationY+=10;
		
		System.out.println("The Bird moved.");
	}//end of move
	
	//makeSound method is overridden from parent class
	//prints the sound that a bird makes
	@Override
	public void makeSound()
	{
		System.out.println("The Bird : Tweet Tweet!\n");
	}//end of makeSound
	
	//toString method returns the current location of bird
	@Override
	public String toString()
	{
		return "The current location is (" + locationX + "," + locationY +").";
	}//end of toString
	
}//end of Bird class
