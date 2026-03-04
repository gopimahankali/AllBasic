package Dws_TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Dws_Pages.Dws_Home_Page;
import Dws_Pages.Dws_Register_page;

public class Dws_RegisterTest {
	
	@Parameters("browser")
	@Test
	public void TC2(String browser) {
	
	String BROWSER =browser;	
		
	WebDriver driver=null;
		if (BROWSER.equals("chrome")) {
			driver = new ChromeDriver();
		} else if(BROWSER.equals("firefox")){
			driver = new FirefoxDriver();
		}
		
		
//	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demowebshop.tricentis.com/");
	
	//Create object of Dws_Home_Page
	Dws_Home_Page homePage = new Dws_Home_Page(driver);
	homePage.clickRegisterLink();
	
	//Create object of Dws_Register_page
	Dws_Register_page registerPage = new Dws_Register_page(driver);
	
	registerPage.clickMaleRadioButton();
	registerPage.enterFirstName("John");
	registerPage.enterLastName("Wick");
	registerPage.enterEmail("Wick_1924@gmail.com");
	registerPage.enterPassword("John@1924");
	registerPage.enterConfirmPassword("John@1924");
	registerPage.clickRegisterButton();
	
	driver.quit();
	
	
	
}

}
