package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class InstaGram_DataProvider_TestCase {
	
	@DataProvider(name="InstaGramData")
	public Object[][] instaGramTestData() {
		Object[][] data = new Object[1][3];
		data[0][0] = "https://www.facebook.com/";
		data[0][1] = "TestUser-1_2024";
		data[0][2] = "TestUser@12345";
		return data;
		
	}
	
	@Test(dataProvider="InstaGramData")
	public void instaGramLoginTest(String url, String userName, String password) {
		
		SoftAssert a = new SoftAssert();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Further steps to perform login can be added here using userName and password
		a.assertTrue(driver.getTitle().contains("Facebook"));
		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
		driver.quit();
		a.assertAll();
		
	}

}
