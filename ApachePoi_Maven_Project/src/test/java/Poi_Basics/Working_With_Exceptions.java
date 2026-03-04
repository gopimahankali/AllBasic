package Poi_Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Working_With_Exceptions {

	@Test
	public void exceptions() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		WebElement elect = driver.findElement(By.xpath("//span[text()='Electronics']"));
	
		driver.navigate().back();
		try{
			elect.click();
		}
		catch(StaleElementReferenceException e)
		
		{
			driver.findElement(By.xpath("//span[text()='Electronics']")).click();
		}
		driver.quit();
		
		
	}
	
}
