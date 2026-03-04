package Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser_Methods {
	
	public static void main(String[] args) throws InterruptedException {
		//WebDriver driver = new ChromeDriver();
		//Launch the fire fox driver
		WebDriver driver = new FirefoxDriver();
		//driver.get("https://www.google.com/");
		//maximize the browser window
		driver.manage().window().maximize();
		//navigate to google home page
		driver.navigate().to("https://www.google.com/");
		//navigate to amazon home page
		driver.navigate().to("https://www.amazon.com/");
		//navigate back to google home page
		driver.navigate().back();
		//navigate forward to amazon home page
		driver.navigate().forward();
		//refresh the amazon home page
		driver.navigate().refresh();
		//get url of the current page
		//pause the thread for 2 seconds
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		//print the url in the console
		System.out.println("Current URL: " + url);
		//get the title of the current page
		String title = driver.getTitle();
		//print the title in the console
		System.out.println("Page Title: " + title);
		//get the page source of the current page
		String pagesource = driver.getPageSource();
		//print the length of the page source in the console
		System.out.println("Page Source Length: " + pagesource);
		//get the window handle of the current page
		String windowhandle = driver.getWindowHandle();
		//print the window handle in the console
		System.out.println("Window Handle: " + windowhandle);
		//close the browser
		driver.close();

	}

}
