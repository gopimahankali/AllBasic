package Assignments_OrangeHrm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;

import junit.framework.Assert;

public class New_unit_DataBaseTest {
	
	@Test
	public void database() throws Exception {
		
		String expectedProjectName = "Website";
		Boolean flag = false;
		
		Driver ref = new Driver();
		DriverManager.registerDriver(ref);
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_database","root","Omsairam@123");
		
		Statement sta = con.createStatement();
		ResultSet resultSet = sta.executeQuery("select * from projects");
		
		while(resultSet.next()) {
			
			String projectName = resultSet.getString(2);
			
			if(expectedProjectName.equals(projectName)) {
				flag=true;
				System.out.println(expectedProjectName+" is available==PASS");
			}
			
		}
		if(flag==false) {
			System.out.println(expectedProjectName+" is not available==FAIL");
			Assert.fail();
		}
		
		con.close();
		
	}

}
