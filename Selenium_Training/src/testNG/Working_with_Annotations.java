package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Working_with_Annotations {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is before suite annotation");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("This is before class annotation");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("This is after class annotation");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is before method annotation");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("This is after method annotation");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("This is after suite annotation");
	}
	
	@Test
	public void Tc1() {
		System.out.println("This is test case 1");
	}
	
	@Test
	public void Tc2() {
		System.out.println("This is test case 2");
	}
	
@BeforeTest
public void beforeTest() {
	System.out.println("This is before test annotation");
}

@AfterTest
public void afterTest() {
	System.out.println("This is after test annotation");	
	
}


}
