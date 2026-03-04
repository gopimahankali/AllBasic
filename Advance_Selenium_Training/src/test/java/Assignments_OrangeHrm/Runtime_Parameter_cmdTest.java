package Assignments_OrangeHrm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Runtime_Parameter_cmdTest {
	
	@Test
	public void cmdTest() throws Exception {
		
		
		String browser = System.getProperty("browser");
		String url = System.getProperty("url");
		String user = System.getProperty("username");
		String pass = System.getProperty("password");
		
		WebDriver driver = null;
		if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("chrome")){
			driver = new ChromeDriver();	
		}else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}else {
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		driver.findElement(By.xpath("//p[text()='manda user']")).click();
//		WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
//		Actions a = new Actions(driver);
//	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	   
//	    wait.until(ExpectedConditions. visibilityOf(logout));
//	    		a.moveToElement(logout).perform();
//	    		
	    driver.quit();
		
	}
		
		
		
	

}
