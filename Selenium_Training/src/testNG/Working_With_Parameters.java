package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Working_With_Parameters {

	int sum;
	
	//you have to define the parameters in the testng.xml file
	//you have to execute the testng.xml file to run this test case
	
	@Parameters({"num1" , "num2"})
	@Test
	public void add(int num1, int num2) {
		
		sum = num1 + num2;
		System.out.println("The sum is: " + sum);	
		
	}
}
