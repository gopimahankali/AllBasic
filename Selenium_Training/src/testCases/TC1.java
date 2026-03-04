package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC1 {
	
	String launchStatus;
	
	WebDriver driver;
	
	@BeforeTest
	public void launchApplication() {
		
		//Launch Application Code
	    driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		if(driver.getTitle().equals("Demo Web Shop")) {
			launchStatus =	"Application Launched Successfully - PASS";
		} else {
			launchStatus =  "Application Launch Failed - FAIL";
		}
	}
	
	@Test
	public void searchTest() {
		
		Reporter.log(launchStatus, true);
		
		// Search Test Code
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("computers");
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		
	}
	
	@AfterTest
	public void closeApplication() {
		
		// Close Application Code
		driver.quit();
		
	}
	

}
