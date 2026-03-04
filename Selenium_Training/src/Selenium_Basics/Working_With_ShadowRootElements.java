package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Working_With_ShadowRootElements {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		driver.manage().window().maximize();
		// Shadow DOM handling code will go here
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.findElement(By.xpath("//section[contains(text(),'Shadow')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Shadow Root']")).click();
		
		
		//shadow root element handling using SearchContext
//		Thread.sleep(2000);
//		SearchContext shadow_host = driver.findElement(By.xpath("//form/div[1]")).getShadowRoot();
//		shadow_host.findElement(By.cssSelector("input[type='text']")).sendKeys("Qspiders");
//		
//		
//		// Shadow_Host for password field
//		 SearchContext shadow_host1 = driver.findElement(By.xpath("//form/div[2]")).getShadowRoot();
//		 shadow_host1.findElement(By.cssSelector("input[type='text']")).sendKeys("Qspiders123");
		Thread.sleep(2000);
		WebElement shadowHost1 = driver.findElement(By.xpath("//form/div[1]"));
		WebElement username = (WebElement) js.executeScript(
				"return arguments[0].shadowRoot.querySelector('input[type=\"text\"]');",
				shadowHost1
		);
		username.sendKeys("Qspiders");

		// -------- Second Shadow DOM (Password) --------
		WebElement shadowHost2 = driver.findElement(By.xpath("//form/div[2]"));

		WebElement password = (WebElement) js.executeScript(
				"return arguments[0].shadowRoot.querySelector('input[type=\"text\"]');",
				shadowHost2
		);
		password.sendKeys("Qspiders123");
		driver.quit();
		
	
	}

}
