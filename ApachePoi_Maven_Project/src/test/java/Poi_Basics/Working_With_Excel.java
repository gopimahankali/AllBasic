package Poi_Basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Working_With_Excel {
	public static void main(String[] args) throws Exception {
		String path = "./Test_Data/DWS_TestData.xlsx";
		FileInputStream fis = new FileInputStream(path);
		Workbook work = WorkbookFactory.create(fis);
		 Sheet s = work.getSheet("Register.Test_Data");
		int row = s.getPhysicalNumberOfRows();
		int col = s.getRow(0).getPhysicalNumberOfCells();
		for(int i=0; i<=row-1; i++) {
			for(int j=0; j<=col-1; j++) {
				String value = s.getRow(i).getCell(j).toString();
				System.out.print(value + "||");
			}

		}
		work.close();
		fis.close();
		
		String property = "./Test_Configuration/TestConfiguration.properties" ;
		FileInputStream f = new FileInputStream(property);
		Properties p = new Properties();
		p.load(f);
		String firstName = p.getProperty("fname");
		System.out.println(firstName);
		f.close();
	} 

}
