package Data_Driven_Testing;

import java.io.FileReader;
import java.time.Duration;

import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Working_WIth_JasonFileText {

	@Test
	public void loginTest() throws Exception {
		
		//step1 : parse json physical file in to java object using JsonParser class
		JSONParser parser = new JSONParser();
		Object obj= parser.parse(new FileReader("./Properties_Test/AppCommonData.json"));
		
		//Step : 2 Convert java Object to Json Object using down casting
		JSONObject map = (JSONObject)obj;
		
		//Step 3: get the value from json file using key
		String browser = map.get("Browser").toString();
		String url = map.get("Url").toString();
		String email = map.get("Email").toString();
		String pass = map.get("Password").toString();
		String time = map.get("Timeout").toString();
		
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
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.quit();
		
	}
	
}
