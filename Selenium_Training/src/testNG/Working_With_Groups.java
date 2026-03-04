package testNG;

import org.testng.annotations.Test;

public class Working_With_Groups {
	
	@Test(groups = "SmokeTest")
	public void LoginTest() {
		
		System.out.println("Login Test");
	}
	
	@Test(groups = "SmokeTest")
	public void RegisterTest() {
		
		System.out.println("Register Test");
	}
	
	@Test(groups = "FunctionalityTest")
	public void SearchTest() {
		
		System.out.println("Search Test");
	}

}
