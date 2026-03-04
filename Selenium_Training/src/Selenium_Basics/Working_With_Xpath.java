package Selenium_Basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Working_With_Xpath {
	public static void main(String[] args) throws InterruptedException {
       // WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
        //navigate to Url
       /*  driver.get("https://www.5movierulz.doctor/");
        // Using Absolute xpath to locate search text field and enter the movie name
        driver.findElement(By.xpath("/html/body/div/div/form/div/input[1]")).sendKeys("Akanda 2");
        //Click on the search button
        driver.findElement(By.xpath("/html/body/div/div/form/div/input[2]")).click();
        Thread.sleep(5000);
        driver.quit();*/
        //relative xpath
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        Thread.sleep(5000);
       WebElement ele = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
       ele.sendKeys("Iphone 17 promax 512 gb orange");
       ele.submit();
       Thread.sleep(5000);
       driver.findElement(By.xpath("(//a[contains(@class,'a-link-normal s-line-clamp-2')])[1]")).click();
       Thread.sleep(5000);
     String parent = driver.getWindowHandle();
     for(String child:driver.getWindowHandles()) {
		 if(!parent.equals(child)) {
			 driver.switchTo().window(child);
		 }
	 }
	   
driver.findElement(By.xpath("(//*[local-name() = 'i'])[10]")).click();

Thread.sleep(5000);
// Explicit wait
JavascriptExecutor js = (JavascriptExecutor) driver;

WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//click on exchange button

WebElement exchange = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div//span[@id='chooseButton']")));

exchange.click();
//select brand

WebElement brand = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Select Brand']")));

	js.executeScript("arguments[0].click();", brand);
 //select apple
WebElement apple = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@id,'buyBackDropDown1_1')]")));
js.executeScript("arguments[0].click();", apple);
//select model
WebElement model = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(@id,'AppleId')]")));
model.click();
//select iphone 16  
WebElement device = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[contains(@id,'Apple_')])[20]")));
device.click();
//select storage
WebElement storage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(@id,'AppleiPhone 16')]")));
storage.click();
driver.findElement(By.xpath("//a[text()='8GB | 256GB']")).click();
//select condition
WebElement a = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='noBodyDamageCheckbox']")));
js.executeScript("arguments[0].click();", a);
Thread.sleep(2000);
driver.quit();

    }

}
