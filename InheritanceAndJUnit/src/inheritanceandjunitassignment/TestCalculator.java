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

//TestCalculator class tests the methods in Calculator Class
class TestCalculator {

	//creating a calculator object
	Calculator calculator = new Calculator();
	
	//initializng necessary attributes
	int addResult=0;
	int subtractResult=0;
	int multiplyResult=0;
	int divideResult=0;
	
	//testAddTwoIntegers method
	@Test
	public void testAddTwoIntegers()
	{
		System.out.println("Test 1 Running: testAddTwoIntegers");
		addResult=calculator.addTwoIntegers(8,4);//calling addTwoIntegers method
		assertEquals(12, addResult);//testing addResult with expected value
		System.out.println("Test 1 Passed: addTwoIntegers");
	}//end of testAddTwoIntegers
	
	//testSubtractTwoIntegers method
	@Test
	public void testSubtractTwoIntegers()
	{
		System.out.println("Test 2 Running: testSubtractTwoIntegers");
		subtractResult=calculator.subtractTwoIntegers(20, 10);//calling subtractTwoIntegers method
		assertEquals(10, subtractResult);//testing subtractResult with expected value
		System.out.println("Test 2 Passed: testSubtractTwoIntegers");
	}//end of testSubtractTwoIntegers method
	
	//testMultiplyTwoIntegers method
	@Test
	public void testMultiplyTwoIntegers ()
	{
	System.out.println("Test 3 Running: testMultiplyTwoIntegers");
	multiplyResult = calculator.multiplyTwoIntegers(3,7);//calling multiplyTwoIntegers method
	assertEquals(21, multiplyResult);//testing multiplyResult with expected value
	System.out.println("Test 3 Passed: testMultiplyTwoIntegers");
	}//end of testMultiplyTwoIntegers
	
	//testDivideTwoIntegers method
	@Test
	public void testDivideTwoIntegers ()
	{
	System.out.println("Test 4 Running: testDivideTwoIntegers");
	divideResult = calculator.divideTwoIntegers(16,4);//calling divideTwoIntegers method
	assertEquals(4, divideResult);//testing divideResult with expected value
	System.out.println("Test 4 Passed: testDivideTwoIntegers");
	}//end of testDivideTwoIntegers
	 

}//end of TestCalculator
