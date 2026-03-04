package Dws_TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Dws_Pages.Dws_Home_Page;

public class Dws_SearchTest {
	
	@Test
	public void TC1() throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		
		//Create object of Dws_Home_Page and use methods
		Dws_Home_Page homePage = new Dws_Home_Page(driver);
		homePage.enterSearchText("computer");
		homePage.clickSearchButton();
		
		homePage.clickRegisterLink();
		Thread.sleep(2000);
		
		driver.quit();
		
	}
	

}
