package Data_Driven_Testing;

import java.io.FileInputStream;
import java.util.Properties;

public class Properties_FileTest {
	public static void main(String[] args) throws Exception {
		
		String path = "./Properties_Test/CommonData.properties";
		
		//Step1 : get the java representation object of the physical file
		 FileInputStream name = new FileInputStream(path);
		 
		 //Step2 : load all the keys from properties files using properties class 
		 Properties p = new Properties();
		 p.load(name);
		 //Step 3 : get the value based on key
		 
		 System.out.println(p.getProperty("Browser"));
		 
		 
	}

}
