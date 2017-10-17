package timeEntryPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exl_Write {
	
public static void SetData(String result, int rowa) throws InterruptedException, IOException {
		
	File file =    new File("C:\\TimeEntryPD\\TimeEntry\\TestCasesSheet\\tetc1.xlsx");
	
	FileInputStream inputStream = new FileInputStream(file);
	
	@SuppressWarnings("resource")
	XSSFWorkbook Workbook1 = new XSSFWorkbook(inputStream);
	XSSFSheet sh1= Workbook1.getSheetAt(0);
	
	sh1.getRow(rowa).createCell(2).setCellValue(result);
	
    FileOutputStream outputStream = new FileOutputStream(file);
	
    Workbook1.write(outputStream);
    
    outputStream.close();
	
	}

}
