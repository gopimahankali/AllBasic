package Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Working_With_Notifications {

	public static void main(String[] args) {
		FirefoxOptions opt = new FirefoxOptions();
		opt.addPreference("dom.webnotifications.enabled", false);// to get argument enter about:config in firefox search bar and search for
		// dom.webnotifications.enabled and set its value to false to disable notifications
		WebDriver driver = new FirefoxDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		
		

	}

}
