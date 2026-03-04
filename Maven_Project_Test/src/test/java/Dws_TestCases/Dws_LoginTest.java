package Dws_TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dws_LoginTest {
	
	@Test
	public void TC3() {

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://demowebshop.tricentis.com/");
			
		//Create object of Dws_Home_Page and use methods
			Dws_Pages.Dws_Home_Page homePage = new Dws_Pages.Dws_Home_Page(driver);
			homePage.clickLoginLink();
			
			//Create object of Dws_Login_Page and use methods
			Dws_Pages.Dws_Login_Page loginPage = new Dws_Pages.Dws_Login_Page(driver);
			loginPage.enterEmail("Wick_1924@gmail.com");
			loginPage.enterPassword("John@1924");
			loginPage.clickLoginButton();
			
			driver.quit();
			
		
	}

}
