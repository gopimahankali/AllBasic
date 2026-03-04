package Data_Driven_Testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Working_with_DataBaseTest {
	
	public static void main(String[] args) throws Exception {
		
		//step 1: load/register the database driver
		Driver ref = new Driver();
		DriverManager.registerDriver(ref);
		
		//step 2: connect to database
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_database","root","Omsairam@123");
		System.out.println("====Done====");
		//step 3: create sql statement
		Statement st = conn.createStatement();
		
		//Step 4: execute select query & get the result
		ResultSet set = st.executeQuery("select * from projects");
		 while(set.next()) {
			 System.out.println(set.getString(1)+"||"+set.getString(2)+"||"+set.getString(3));
		 }
		
		
		//step 5: close the connection
		conn.close();
		
		
		
		
		
	}

}
