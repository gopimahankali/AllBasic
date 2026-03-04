package testCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Working_With_DataProvider {
	
	//define data provider 
	@DataProvider(name="TestData")
	public Object[][] testData() {
		Object[][]data = new Object[1][2];
		data[0][0] = "Gopi Shankar";
		data[0][1] = "Mahankali";
		return data;
		
	}
	
	@Test(dataProvider="TestData")
	public void TC1(String firstName, String lastName) {
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		
	}
	

}
