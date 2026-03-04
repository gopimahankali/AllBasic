package testNG;

import org.testng.annotations.Test;

public class Working_With_Group1 {
	
	@Test(groups = "SmokeTest")
	public void AddToCartTest() {
		
		System.out.println("Add To Cart Test");
	}
	
	@Test(groups = "SmokeTest")
	public void SubScribeTest() {
		
		System.out.println("Subscribe Test");
	}
	
	@Test(groups = "FunctionalityTest")
	public void VoteTest() {
		
		System.out.println("Vote Test");
	}

	
}
