package Selenium_Basics;

import java.io.File;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Flipkart_Test {
	public static void main(String[] args) throws InterruptedException, Exception {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement searchBox = driver.findElement(By.xpath("//input[contains(@class,'nw1UBF v1zwn25')]"));
		searchBox.sendKeys("iPhone 16 pro max");
		searchBox.submit();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = searchBox.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Images/searchbox.png");
		FileHandler.copy(src, dest);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Apple iPhone 16 Pro Max (Natural Titanium, 256 GB)')]"))
				.click();
		String parent = driver.getWindowHandle();

		for (String child : driver.getWindowHandles()) {
			if (!parent.equals(child)) {
				driver.switchTo().window(child);

			}
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'_1psv1zeb9 _1psv1ze0')]")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}
