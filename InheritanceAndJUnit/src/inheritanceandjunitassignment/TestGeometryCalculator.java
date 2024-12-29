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
import static org.junit.Assert.*;

//testGeometryCalculator test the methods in GeometryMethodClass
class TestGeometryCalculator {

	//creating a geometryCalculator object
	GeometryCalculator geometryCalculator = new GeometryCalculator();
	
	//initializing necessary attributes
	int areaResult=0;
	int volumeResult=0;
	float hypotenuseResult=0;
	
	//testCalculatArea method
	@Test
	public void testCalculateArea()
	{
		System.out.println("Test 8 running: testCalculateArea");
		areaResult = geometryCalculator.calculateArea(12,8);//calling calculateArea method
		assertEquals(96,areaResult);//testing result with expected value
		System.out.println("Test 8 passed: testCalculateArea");
	}//end of testCalculateArea
	
	//testCalculateVolume method
	@Test
	public void testCalculateVolume()
	{
	
		System.out.println("Test 9 running: testCalculateVolume");
		volumeResult = geometryCalculator.calculateVolume(3,4,5);//calling calculateVolume method
		assertEquals(60,volumeResult);// testing volumeResult with expected value
		System.out.println("Test 9 passed: testCalculateVolume");
	}//end of testCalculateVolume method
	
	//testCalculateHypotenuse method
	@Test
	public void testCalculateHypotenuse()
	{
	
		System.out.println("Test 10 running: testCalculateHypotenuse");
		hypotenuseResult = geometryCalculator.calculateHypotenuse(3,4);//calling calculateHypotenuse method
		assertEquals(5,hypotenuseResult);//testing hypotenuseResult with expected value
		System.out.println("Test 10 passed: testCalculateHypotenuse");
	}

}
