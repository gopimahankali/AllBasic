package Poi_Basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Working_With_PropertiesFile {
	
	@Test
	public void demo1() throws Exception {
		
		String path = "./Test_Configuration/TestConfiguration.properties";
		FileInputStream fis = new FileInputStream(path);
		
		//create an object of properties class
		
		Properties p = new Properties();
		p.load(fis);
		
		String fname = p.getProperty("Firstname");
		System.out.println(fname);
	
		
		
	}

}
