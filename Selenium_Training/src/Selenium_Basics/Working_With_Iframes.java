package Selenium_Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Working_With_Iframes {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/html/html_iframe.asp");
		//Code to handle iframe will go here
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='W3Schools HTML Tutorial']"))); //Switching to iframe using index
		Thread.sleep(2000);
		 driver.findElement(By.linkText("SQL Tutorial")).click();
		 Thread.sleep(2000);
		 driver.switchTo().defaultContent(); //Switching back to main webpage from iframe
		 driver.findElement(By.xpath("//a[@title='Home']")).click();
		 driver.quit();

		
	}

}
