package Poi_Basics;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Working_With_ExcelFile {

	@Test
	public void demo() throws Exception {
		String projectPath = "./Test_Data/DWS_TestData.xlsx";
		FileInputStream fis = new FileInputStream(projectPath);
	
		//Create Workbook where the test data is stored
		Workbook work = WorkbookFactory.create(fis);
		
		//Access the data from the workbook
		
		Sheet sheet = work.getSheet("Names");
		//String data = sheet.getRow(1).getCell(0).getStringCellValue();
		
		//System.out.println("Data from Excel Sheet is: " + data);
		
		int rowcount = sheet.getPhysicalNumberOfRows();
		//System.out.println("Number of rows: " + rowcount);
		
		int colcount = sheet.getRow(0).getPhysicalNumberOfCells();
		//System.out.println("Number of columns: " + colcount);
		
		//to print all the rows
		
//		for(int i=0; i<=rowcount-1; i++) {
//			String cellvalue = sheet.getRow(i).getCell(0).toString();
//			System.out.println("Data from row " + i + " is: " + cellvalue);
//			
//		}
		
		// to print all the rows and columns
		for(int i=0; i<=rowcount-1; i++) {
			for(int j=0; j<=colcount-1; j++) {
				String value = sheet.getRow(i).getCell(j).toString();
				System.out.print(value + " ");
			}
			System.out.println();
		}
		
	}
}
