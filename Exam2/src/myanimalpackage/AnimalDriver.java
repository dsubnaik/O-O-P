//************************************
//Program Name: AnimalDriver.java
//Developer: Derrick Subnaik
//Date Created: 04/26/2024
//Version: 1.0
//Purpose: Animal Driver class 
//************************************
package myanimalpackage;

//AnimalDriver class 
public class AnimalDriver {

	//main method
	public static void main(String[] args) {

		//initializing the size of the array to 3
		final int ARRAY_SIZE=3;
		
		//Creating an array of animals
		Animal[] animals = new Animal[ARRAY_SIZE];
		
		//creating an instance of Circle and storing into first element of animals array
		animals[0]= new Bird(0,0);
		
		//creating an instance of Fish and storing into second element of animals array
		animals[1]= new Fish(0,0);
		
		//creating an instance of Frog and storing into third element of animals array 
		animals[2]= new Frog(0,0);
		
		//for loop iterates through the animals array and calls each method
		for(Animal animal: animals)
		{
			// calls method to display that the animal moved and adjusts the location
			animal.move();
			
			//printing the animals location after the move
			System.out.println(animal.toString());
			
			//calls method to display the sound that the animal makes
			animal.makeSound();
			
		}//end of for loop
		
	}//end of main

}//end of AnimalDriver
