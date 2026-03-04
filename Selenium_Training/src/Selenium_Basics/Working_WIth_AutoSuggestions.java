package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_WIth_AutoSuggestions {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		/*
		 driver.get("https://www.google.com/");
		 
			    driver.findElement(By.name("q")).sendKeys("selenium");
			    Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[contains(@aria-label,'selenium interview questions')]")).click();
	    */
		
		driver.get("https://www.flipkart.com/");
			    driver.findElement(By.name("q")).sendKeys("puma");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[contains(@class,'Fouwk_')])[2]")).click();
		
		

	}
	

}
