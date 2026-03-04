package Selenium_Basics;

import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Working_With_Multiple_Windowspractice {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String parent = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		Thread.sleep(5000);
		//click on facebook link which opens in new window
		Set<String> child = driver.getWindowHandles();
		
		for (String win:child) {
			
			driver.switchTo().window(win);
			
			if(driver.getTitle().contains("Facebook")) {
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("testuserfb");
				Thread.sleep(2000);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.quit();
		
		
		

	}
	

}
