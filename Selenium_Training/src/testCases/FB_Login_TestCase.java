package testCases;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FB_Login_TestCase {
	
	WebDriver driver;
	
@Parameters({"url"})

@BeforeTest
public void LaunchBrowser(String url) {
	
	
	
	System.out.println("Launching browser and navigating to: " + url);
	// Code to launch browser and navigate to the URL
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	
}
@Parameters({"username" , "password"})
@Test
public void login(String username, String password) throws Exception {
	
String title = driver.getTitle();
	
SoftAssert s = new SoftAssert();
	//Assertion  to verify if the Facebook home page is loaded
	s.assertEquals(title, "Facebookkk – log in or sign up");
	
	
	// Code to perform login using the provided username and password
	driver.findElement(By.id("email")).sendKeys(username);
	driver.findElement(By.id("pass")).sendKeys(password);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@name='login']")).click();
	
	s.assertAll();
	
}

@AfterTest
public void closeBrowser() throws Exception {
	// Code to close the browser
	Thread.sleep(5000);
	driver.quit();	
}
}
