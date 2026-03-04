package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Working_With_RelativeLocators {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		//Subscriptions
	WebElement e = driver.findElement(RelativeLocator.with(By.tagName("span")).below(By.xpath("(//a[contains(@class,'yt-simple-endpoint')])[5]")));
		Thread.sleep(5000);
		e.click();
		//Home
		WebElement ele = driver.findElement(RelativeLocator.with(By.tagName("span")).above(By.xpath("(//a[contains(@class,'yt-simple-endpoint')])[5]")));
		ele.click();
		Thread.sleep(2000);
		driver.findElement(RelativeLocator.with(By.tagName("Button")).near(By.xpath("(//ytd-button-renderer[contains(@class,'style-scope')])[3]"))).click();
		Thread.sleep(2000);
      	driver.quit();
		
	}
	

}
