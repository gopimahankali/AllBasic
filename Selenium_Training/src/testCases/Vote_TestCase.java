package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Vote_TestCase {
	@Test
	public void voteTest() {
	
		// Test code for voting functionality 
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		// Open Application
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Reporter.log("Application opened successfully", true);
		
		//Vote on a poll 
		driver.findElement(By.xpath("//input[@id='pollanswers-2']")).click();
		driver.findElement(By.xpath("//input[@id='vote-poll-1']")).click();
		Reporter.log("Voted successfully", true);
		
		//close Browser
		driver.quit();
		Reporter.log("Vote Test case executed successfully", true);
	}

}
