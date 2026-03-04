package Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_DataBack_ToExcelTest {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception, Exception {

	String path = "./Excel_Data/Test_Data.xlsx";
	FileInputStream fis = new FileInputStream(path);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet("Test_Data");
	Row row = sh.getRow(3);
	Cell cel = row.createCell(0);
	cel.setCellType(CellType.STRING);
	cel.setCellValue("Jaime");
	
	FileOutputStream fos = new FileOutputStream(path);
	wb.write(fos);
	
	wb.close();
	fis.close();
	fos.close();
	System.out.println("========Executed Successfully========");
	
	
	}
}
