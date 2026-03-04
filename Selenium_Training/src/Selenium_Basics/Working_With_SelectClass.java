package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_With_SelectClass {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
//navigate to Url
			   driver.get("https://www.facebook.com/");
			   //click on create new account button
			   driver.findElement(By.xpath("//a[text()='Create new account']")).click();
			   //enter first name
			   driver.findElement(By.name("firstname")).sendKeys("John");
			   //enter last name
			   driver.findElement(By.name("lastname")).sendKeys("wick");
			   //enter day
			   WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
			   Select d = new Select(day);
			   d.selectByVisibleText("12");
			   WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
			   Select m = new Select(month);
			   m.selectByIndex(5);
			   WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
			   Select y = new Select(year);
			   y.selectByValue("1995");
			   //select gender
			   driver.findElement(By.xpath("(//input[contains(@class,'_8esa')])[2]")).click(); 
			   //enter mobile number
			   driver.findElement(By.name("reg_email__")).sendKeys("9876543210");
			   
	}

}
