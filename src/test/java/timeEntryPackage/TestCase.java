package timeEntryPackage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCase {
	
	public static void TestIf(String Xpath1, WebDriver driver1, int row) throws InterruptedException, IOException{
		if(driver1.findElement(By.xpath(Xpath1)).isDisplayed()) 
		{
			row= row+1;
			System.out.println("Test Case "+ (row-2) +" = Pass! (Excel sheet has been updated)");
			String result="Pass";
			Exl_Write.SetData(result, row);
		
		}else{
			System.out.println("Test Case "+ (row-2) +" = Fail! (Excel sheet has been updated)");
			
		};
		
	}

	public static void TestText(String Xpath1, String text1, WebDriver driver1, int row) throws InterruptedException, IOException{
		if(driver1.findElement(By.xpath(Xpath1)).isDisplayed() ) 
		{
			row= row+1;
			System.out.println("Test Case "+ (row-2) +" = Pass! (Excel sheet has been updated)");
			String result="Pass";
			Exl_Write.SetData(result, row);
		
		}else{
			System.out.println("Test Case "+ (row-2) +" = Fail! (Excel sheet has been updated)");
			
		};
		
	}
	
	public static void TestDownload(int row) throws InterruptedException, IOException{
		
		 String downloadFilepath = "C:\\TimeEntryPD\\TimeEntry\\DownFiles";
 
		 Path path = Paths.get(downloadFilepath);

		 if (Files.exists(path)) {
			 row= row+1;
				System.out.println("Test Case "+ (row-2) +" = Pass! (Excel sheet has been updated)");
				String result="Pass";
				Exl_Write.SetData(result, row);
		 } else {
			 row= row+1;
				System.out.println("Test Case "+ (row-2) +" = Pass! (Excel sheet has been updated)");
				String result="Fail";
				Exl_Write.SetData(result, row);
		 };
		 
		
	}
	
}
