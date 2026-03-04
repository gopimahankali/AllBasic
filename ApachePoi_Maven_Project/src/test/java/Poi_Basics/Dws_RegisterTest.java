package Poi_Basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Dws_RegisterTest {

	private ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	
	@DataProvider(name = "RegisterTestData", parallel = true)
	public Object[][] getTestData() throws Exception {

		String path = "./Test_Data/DWS_TestData.xlsx";
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Register.Test_Data");
		int rowCount = sheet.getPhysicalNumberOfRows();
		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
		
		Object[][] data = new Object[rowCount - 1][cellCount];

		for (int i = 1; i < rowCount; i++) {
			for (int j = 0; j <= cellCount - 1; j++) {
				data[i - 1][j] = sheet.getRow(i).getCell(j).toString();

			}
		}

		wb.close();
		fis.close();

		return data;

	}

	@Parameters("browser")
	@BeforeMethod
	public void web(String browser) {
		
		  
		  String bro = browser; 
		  if(bro.equalsIgnoreCase("chrome")) 
		  { 
			  driver.set(new ChromeDriver()); 
			  }
		  else if(bro.equalsIgnoreCase("firefox")) 
		  { 
			  driver.set(new FirefoxDriver()); 
		  }else if(bro.equalsIgnoreCase("edge")) { 
			  driver.set(new EdgeDriver()); 
			  }
		 
		driver.get().manage().window().maximize();
		driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get().get("https://demowebshop.tricentis.com/");

	}

	@Test(dataProvider = "RegisterTestData")
	public void RegisterTest(String firstname, String lastname, String email, String password, String confirmpassword) {

		// driver.set(new FirefoxDriver());
		// driver.set(new ChromeDriver());

		driver.get().findElement(By.xpath("//a[text()='Register']")).click();
		driver.get().findElement(By.cssSelector("input[id='gender-male']")).click();

		driver.get().findElement(By.id("FirstName")).sendKeys(firstname);
		driver.get().findElement(By.id("LastName")).sendKeys(lastname);
		driver.get().findElement(By.id("Email")).sendKeys(email);

		driver.get().findElement(By.id("Password")).sendKeys(password);
		driver.get().findElement(By.id("ConfirmPassword")).sendKeys(confirmpassword);

		driver.get().findElement(By.id("register-button")).click();

	}

	@AfterMethod
	public void close() {
		driver.get().quit();
		driver.remove();
	}
}
