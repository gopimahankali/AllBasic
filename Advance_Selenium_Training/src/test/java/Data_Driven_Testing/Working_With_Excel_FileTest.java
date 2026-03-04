package Data_Driven_Testing;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Working_With_Excel_FileTest {
	public static void main(String[] args) throws Exception, Exception {
	
		String path ="./Excel_Data/Test_Data.xlsx";
			
		//Step 1: get the excel path location & java object of the physical excel file
		FileInputStream fis = new FileInputStream(path);
		//Step 2: open workbook in read mode
		Workbook wb = WorkbookFactory.create(fis);
		
		//Step 3: get the control of the "Test_Data" sheet
		Sheet sheet = wb.getSheet("Test_Data");
		
		//Step 4: get the control of the "1st" row
		Row row = sheet.getRow(1);
		
		//Step 5: get the control of the "2nd" cell and read the data
		Cell cell = row.getCell(2);
		String s = cell.getStringCellValue();
		
		//Step 6: get the control of the "1st" cell and read the data
		Cell cell1 = row.getCell(1);
		System.out.println("Last Name : "+cell1.getStringCellValue());
		
		System.out.println("Email     : "+s);
		
		//STep 6: close the Workbook
		wb.close();
		fis.close(); 
		
	}

	
}
