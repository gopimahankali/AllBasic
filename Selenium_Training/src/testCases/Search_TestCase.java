package testCases;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Search_TestCase {
	@Test(invocationCount = 2, threadPoolSize = 2)
	public void searchTest() {
		
		// Test code for search functionality
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		// Open Application
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Search for "computers"
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("computers");
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		
		// Close Browser
		driver.quit();
		
		
	}

}
