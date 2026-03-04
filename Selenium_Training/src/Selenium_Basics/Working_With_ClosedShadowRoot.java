package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_ClosedShadowRoot {
	public static void main(String[] args) throws Exception {
		// Closed Shadow DOM cannot be accessed using standard Selenium methods.
		// Alternative approaches or tools may be required to interact with closed shadow DOM elements.
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui/shadow/closed?sublist=1");
		driver.manage().window().maximize();
		// Since the shadow root is closed, we cannot access its elements directly.
		 driver.findElement(By.xpath("//h1[text()='Login']")).click();
		Actions a = new Actions(driver);
		
		a.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		a.sendKeys("testuser").perform();
		
		a.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		a.sendKeys("password").perform();
		
		a.sendKeys(Keys.TAB).click().perform();
		 driver.quit();
	
	}

}
