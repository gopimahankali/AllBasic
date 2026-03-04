package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Subscribe_TestCase {
@Test
public void subscribeTest() {
	
	// Test code for subscribing to newsletter functionality
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	
	// Open Application
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Reporter.log("Application opened successfully", true);
	
	// Subscribe to Newsletter
	driver.findElement(By.xpath("//input[@id='newsletter-email']")).sendKeys("Test@gmail.com");
	driver.findElement(By.xpath("//input[@id='newsletter-subscribe-button']")).click();
	Reporter.log("Subscribed successfully", true);
	
	// Close Browser
	driver.quit();
	Reporter.log("Subscribe Test case executed successfully", true);
}
}
