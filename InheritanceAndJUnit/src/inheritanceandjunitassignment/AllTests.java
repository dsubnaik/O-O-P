//************************************
//Program Name: LabelFrame.java
//Developer: Derrick Subnaik
//Date Created: 04/4/2024
//Version: 1.0
//Purpose: Assignment Inheritance and JUnit
//************************************
package inheritanceandjunitassignment;

//AllTests suite runs all tests

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ 
	TestCalculator.class, 
	TestCalculusCalculator.class, 
	TestGeometryCalculator.class })
public class AllTests {

}
