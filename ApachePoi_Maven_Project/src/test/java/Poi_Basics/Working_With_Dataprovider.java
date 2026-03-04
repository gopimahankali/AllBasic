package Poi_Basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Working_With_Dataprovider {
	
	@DataProvider(name = "excel")
	public Object[][] getData() throws Exception {
		
		String path = "./Test_Data/DWS_TestData.xlsx";
		FileInputStream file = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(file);
		Sheet sh = wb.getSheet("Register.Test_Data");
		int row = sh.getPhysicalNumberOfRows();
		int cell = sh.getRow(0).getPhysicalNumberOfCells();
		Object[][] data = new Object[row-1][cell];
		for(int i=1; i<row; i++) {
			for(int j = 0; j<=cell-1; j++) {
				data[i-1][j]= sh.getRow(i).getCell(j).toString();
			}
		}
		
		wb.close();
		file.close();
		return data;
		
		
		
		
	}
	@Test(dataProvider = "excel")
	public void print(String firstname, String lastname, String email, String password, String confirmpassword) {
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(email);
	System.out.println(confirmpassword);
		
		
		
	}

}
