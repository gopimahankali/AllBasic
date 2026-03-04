package Maven_Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dws_SearchTest {
	
	@Test(groups = {"Smoke"})
	public void dwsSearch() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("computer");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		driver.quit();
	}

}
