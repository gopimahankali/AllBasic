package Assignments_OrangeHrm;

import org.testng.annotations.Test;

public class Read_Runtime_ParameterTest {
	
	@Test
	public void runTimeParameter() {
		String url= System.getProperty("url");
		System.out.println("Env Data : "+url);
		
	}

}
