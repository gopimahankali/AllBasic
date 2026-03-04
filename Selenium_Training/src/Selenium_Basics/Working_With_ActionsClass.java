package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
//mouse and keyboard actions
public class Working_With_ActionsClass {
	public static void main(String[] args) throws InterruptedException {
	   //WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   //navigate to url
	  // driver.get("https://www.amazon.in/");
	   Actions actions = new Actions(driver);
	   
	   //Mouse Hover Action
	 /*
	   Thread.sleep(2000);
	   //move to webElement
	   WebElement lan = driver.findElement(By.xpath("//span[contains(@class,'icp-nav-link-inner')]"));
	   actions.moveToElement(lan).build().perform();
	   Thread.sleep(2000);
	   WebElement Tel = driver.findElement(By.xpath("(//a[contains(@href,'#switch-lang=te_IN')])[1]"));
	   actions.moveToElement(Tel).click().build().perform(); 
	   */
	 
	   //Double Click and Right Click
	  /* 
	   driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	   WebElement doubleClickBtn = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	   actions.doubleClick(doubleClickBtn).build().perform();
	   Thread.sleep(2000);
	   WebElement rightClickBtn = driver.findElement(By.xpath("//span[text()='right click me']"));
	   actions.contextClick(rightClickBtn).build().perform();
	   actions.moveToElement(driver.findElement(By.xpath("//span[text()='Copy']")))
	   .click().perform();
      */
	   
	   /*
	   //Drag and Drop
	   driver.get("https://testautomationcentral.com/demo/drag_and_drop.html");
	   Thread.sleep(2000);
	   WebElement source = driver.findElement(By.id("draggable"));
	   WebElement target = driver.findElement(By.id("droppable"));
	   actions.dragAndDrop(source, target).build().perform();	
	   */
	  
	  /* 
	   //Click and Hold & Drag and Drop
	   driver.get("https://testautomationcentral.com/demo/drag_and_drop.html");
	   Thread.sleep(2000);
	   WebElement source = driver.findElement(By.id("draggable"));
	   WebElement target = driver.findElement(By.id("droppable"));
	   actions.clickAndHold(source).moveToElement(target).click().perform();
	   actions.dragAndDrop(source, target).perform();
	   */
	   
	   /*
	   //Keyboard Actions
	   driver.get("https://www.facebook.com/");
	   Thread.sleep(2000);
	   WebElement createNewAcc = driver.findElement(By.xpath("//a[text()='Create new account']"));
	   createNewAcc.click();
	   Thread.sleep(2000);
	   WebElement firstName = driver.findElement(By.name("firstname"));
	   //actions.moveToElement(firstName).click().sendKeys("Selenium").perform();
	   actions.moveToElement(firstName).click().keyDown(Keys.SHIFT).sendKeys("selenium").keyUp(Keys.SHIFT).perform();
      */
	   
	   //Scroll//
	   //Scroll to a particular element
	   driver.get("https://www.amazon.in/");
	   Thread.sleep(2000);
	   WebElement scrollTo = driver.findElement(By.xpath("//div[text()='Make Money with Us']"));
	  // actions.scrollToElement(scrollTo).perform();
	   //Scroll by a specific amount of pixels
	   Thread.sleep(2000);
	   actions.scrollByAmount(0,3000).perform();
	   
	   
	}
	

}
