package Selenium_Basics;


import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Test {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	WebElement searchBox = driver.findElement(By.xpath("//input[contains(@class,'lNPl8b')]"));
	searchBox.sendKeys("iPhone 16 pro max");
	searchBox.submit();
	
	driver.findElement(By.xpath("//div[contains(text(),'Apple iPhone 16 Pro Max (Black Titanium, 256 GB)')]")).click();
	String parent = driver.getWindowHandle();
	
	for (String child : driver.getWindowHandles()) {
		if(!parent.equals(child)) {
			driver.switchTo().window(child);
			
		}
	}
	driver.findElement(By.xpath("//div[contains(@class,'FJ7IAS krlDpl')]")).click();
	Thread.sleep(2000);
driver.quit();	
}
}
