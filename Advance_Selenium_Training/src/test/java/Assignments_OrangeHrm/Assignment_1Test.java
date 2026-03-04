package Assignments_OrangeHrm;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

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

public class Assignment_1Test {
	
	private static final String Expectedconditions = null;

	public static void main(String[] args) throws Exception {
		String path = "./Excel_Data/Common_Data.properties";
		
		FileInputStream fis = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fis);
		
		String browser = prop.getProperty("Browser");
		String url = prop.getProperty("Url");
		String user = prop.getProperty("Email");
		String pass = prop.getProperty("Password");
		
		//
		
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
		driver.findElement(By.name("username")).sendKeys(user);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//p[text()='manda user']")).click();
		WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
		Actions a = new Actions(driver);
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	   
	    wait.until(ExpectedConditions. visibilityOf(logout));
	    		a.moveToElement(logout).perform();
	    		
	    driver.quit();
	  
	}

}
