package Excel_Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utilities {
	
	public Object[][] excel() throws Exception, IOException {
		 
		String path = "./Orange_Hrm_Test/OrangeHrm_Test";
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Register.Test_Data");
		int rowCount = sheet.getPhysicalNumberOfRows();
		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
		
		Object[][] data = new Object[rowCount - 1][cellCount];

		for (int i = 1; i < rowCount; i++) {
			for (int j = 0; j <= cellCount - 1; j++) {
				data[i - 1][j] = sheet.getRow(i).getCell(j).toString();

			}
		}

		wb.close();
		fis.close();

		return data;

	}
	}



