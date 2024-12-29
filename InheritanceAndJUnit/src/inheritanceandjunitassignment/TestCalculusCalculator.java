//************************************
//Program Name: LabelFrame.java
//Developer: Derrick Subnaik
//Date Created: 04/4/2024
//Version: 1.0
//Purpose: Assignment Inheritance and JUnit
//************************************

package inheritanceandjunitassignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//TestCalculusCalculator class test the methods in CalculusCalculator class
class TestCalculusCalculator {
	
	//creating an calculusCalculator object
	CalculusCalculator calculusCalculator= new CalculusCalculator();
	
	//initialzing necessary attributes
	int squareResult=0;
	int powResult=0;
	int roundResult=0;
	int ceilingResult=0;
	
	//testSquare method
	@Test
	public void testSquare()
	{
		System.out.println("Test 5 running: testSuare");
		squareResult = calculusCalculator.square(9);//calling square method 
		assertEquals(81,squareResult);//testing squareResult with expected value
		System.out.println("Test 5 passed: testSquare");
	}//end of testSquare
	
	//testPow method
	@Test
	public void testPow()
	{
	
		System.out.println("Test 6 running: testPow");
		powResult = calculusCalculator.pow(2,5);//calling pow method
		assertEquals(32,powResult);//testing powResult with expected value
		System.out.println("Test 6 passed: testPow");
	}//end of testPow
	
	//testRound method
	@Test
	public void testRound()
	{
	
		System.out.println("Test 7 running: testRound");
		roundResult = calculusCalculator.round(8.453524f);//calling round method
		assertEquals(8,roundResult);//testing roundResult with expected value
		System.out.println("Test 7 passed: testRound");
	}//end of testRound
	
	//testCeiling method
	@Test
	public void testCeiling()
	{
	
		System.out.println("Test 8 running: testCeiling");
		ceilingResult = calculusCalculator.ceiling(8.453524f);//calling ceiling method
		assertEquals(9,ceilingResult);//testing ceilingResult with expected value
		System.out.println("Test 8 passed: testCeiling");
	}//end of testCeiling
	
	
}//end of TestCalculusCalculator
