package Data_Driven_Testing;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Vtiger_LoginTest {
	public static void main(String[] args) throws Exception {
		
String path = "./Properties_Test/CommonData.properties";
		
		//Step1 : get the java representation object of the physical file
		 FileInputStream name = new FileInputStream(path);
		 
		 //Step2 : load all the keys from properties files using properties class 
		 Properties p = new Properties();
		 p.load(name);
		 
		 String browser = p.getProperty("Browser");
		 String url = p.getProperty("Url");
		 String email = p.getProperty("Email");
		 String pass = p.getProperty("Password");
		 
		 WebDriver driver = new FirefoxDriver();
		 driver.get(url);
		 driver.findElement(By.id("email")).sendKeys(email);
		 driver.findElement(By.id("pass")).sendKeys(pass);
		 Thread.sleep(5000);
		 driver.quit();
		 
		 
		 
		 
	}

}
