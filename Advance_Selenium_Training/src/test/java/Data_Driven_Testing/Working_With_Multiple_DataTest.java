package Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Working_With_Multiple_DataTest {
	
	public static void main(String[] args) throws Exception {
		
		String path = "./Excel_Data/Test_Data.xlsx";
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Test_Data");
		//getting single data from excel sheet
		
//	    Row row = sh.getRow(1);
//	    String cel = row.getCell(0).toString();
//	    System.out.println(cel);
		
		//Reading multiple data 
		
		int row = sh.getPhysicalNumberOfRows();
		int cel = sh.getRow(0).getPhysicalNumberOfCells();
		for (int i = 1; i<row; i++) {
			System.out.println("Row "+i+" :-");
			for (int j = 0; j<cel; j++) {
				String data = sh.getRow(i).getCell(j).toString();
					System.out.print(data+" | ");
			}
			System.out.println(" ");
			
		}
		
		
	}

}
