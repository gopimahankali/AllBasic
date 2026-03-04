package Selenium_Basics;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Working_With_Multiple_Windows {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Code to handle multiple windows will go here
		WebElement search = driver.findElement(By.xpath("//input[contains(@class,'lNPl8b')]"));
		search.sendKeys("iPhone 17 Pro Max");
		search.submit();
		String parent = driver.getWindowHandle();
		System.out.println("Parent Window Handle: " + parent);
		//execute the functionality that opens a new window
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable
				(By.xpath("//div[contains(@class,'RG5Slk') and "
						+ "contains(text(),'Apple iPhone 17 Pro Max (Deep Blue, 256 GB)')]"))).click();
		
		Thread.sleep(5000);
              //get all the windows opened (Identify all the windows including child window)
		
		Set<String> child = driver.getWindowHandles();
		System.out.println("Window Handles: " + child);
		
		//switch to child window (Iterate on the set of child window using switchto method)
		for(String window:child) {
			//switching to child window using switchto()
			
			driver.switchTo().window(window);
			String title = driver.getTitle();
			System.out.println(driver.getCurrentUrl());
			System.out.println("Window Title: " + title);
			if(title.contains("Apple iPhone 17 Pro Max (256 GB Storage)")) {
				driver.switchTo().window(window);
			}
			
			}
		//perform operation on child window
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/span[contains(@class,'ZhHnSZ')]")).click();
		Thread.sleep(2000);
		
		driver.quit();
		

	}
	
	
}
