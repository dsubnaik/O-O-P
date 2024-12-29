package examtwotest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestThrust {

	//delcaring attributes
	public int testResult=0;
	Rocket rocket = new Rocket();
	
	@Test
	public void testThrustThresholds()
	{
		System.out.println("Test running");
		testResult= rocket.thrustRight()-thrustLeft();
		Math.abs(testResult);
		asssertsTrue(testResult<15);
		System.out.println("Test failed");
	}
}
