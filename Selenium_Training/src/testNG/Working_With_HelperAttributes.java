package testNG;

import org.testng.annotations.Test;

public class Working_With_HelperAttributes {
	//@Test(priority = 2)
	@Test(dependsOnMethods = "RegisterTest")
	public void LoginTest() {
		
		System.out.println("Login Test executed successfully");
		
	}
	@Test(priority = 4)
	public void SearchTest() {
		
		System.out.println("Search Test executed successfully");
		
	}
	//@Test(priority = 1)
	@Test
	public void RegisterTest() {
		
		System.out.println("Register Test executed successfully");
	}
	@Test(priority = 3)
	public void SubscribeTest() {
		
		System.out.println("Subscribe Test executed successfully");
	}

}
