package timeEntryPackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class GlobalSearch {
	public static WebDriver SearchFunc(WebDriver driver1) throws InterruptedException, IOException {
		
		
		//*********************************************
		//*****Test Case Validations*******************
				
				try {
					//Verify that Filter functionality is visible: #TC17
					String Xpath17= ".//*[@id='form1']/div[3]/section/div/div[1]/div[2]/div/heading";
					TestCase.TestIf(Xpath17, driver1, 17);
					//Verify that GLobal search textbox is visible: #TC18
					String Xpath18= ".//*[@id='gsearch']";
					TestCase.TestIf(Xpath18, driver1, 18);
					//Verify that resource manager dropdown is visible: #TC19
					String Xpath19= ".//*[@id='form1']/div[3]/section/div/div[1]/div[2]/div/div/div/div[1]/div[2]/div[1]/div/div";
					TestCase.TestIf(Xpath19, driver1, 19);
					//Verify that resource dropdown is visible: #TC20
					String Xpath20= ".//*[@id='form1']/div[3]/section/div/div[1]/div[2]/div/div/div/div[1]/div[2]/div[2]/div/div";
					TestCase.TestIf(Xpath20, driver1, 20);
					//Verify that project name text box is visible: #TC21
					String Xpath21= ".//*[@id='ProjectIdAuot']";
					TestCase.TestIf(Xpath21, driver1, 21);
					//Verify that From date box is visible: #TC22
					String Xpath22= ".//*[@id='calendar_ms_label']";
					TestCase.TestIf(Xpath22, driver1, 22);
					//Verify that To date box is visible: #TC23
					String Xpath23= ".//*[@id='calendar_md_label']";
					TestCase.TestIf(Xpath23, driver1, 23);
					//Verify that clear button is visible: #TC24
					String Xpath24= ".//*[@id='form1']/div[3]/section/div/div[1]/div[2]/div/div/div/div[1]/div[5]/div/div/button[2]";
					TestCase.TestIf(Xpath24, driver1, 24);
					//Verify that submit button is visible: #TC25
					String Xpath25= ".//*[@id='form1']/div[3]/section/div/div[1]/div[2]/div/div/div/div[1]/div[5]/div/div/button[1]";
					TestCase.TestIf(Xpath25, driver1, 25);
					
				} 
				catch (NoSuchElementException err) {
		        System.out.println("The No exception error is:" + err);
				}
				
		//*********************************************		
				
		//Enter the independce day text
		driver1.findElement(By.xpath(".//*[@id='gsearch']")).sendKeys("Independence Day");
		
		//click on search button
		driver1.findElement(By.xpath(".//*[@id='form1']/div[3]/section/div/div[1]/div[2]/div/div/div/div[1]/div[5]/div/div/button[1]")).click();
		
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//*****Verify search results*******************
		// #TC26
		try {
		String Xpath26= ".//*[@id='form1']/div[3]/section/div/div[1]/div[4]/div[1]/div[1]/table/tbody/tr[1]/td[4]";
		String text1="Independence Day";
		TestCase.TestText(Xpath26, text1, driver1, 26);
				} 
		catch (NoSuchElementException err) {
        System.out.println("The No exception error is:" + err);
		}
		//*********************************************
		return driver1;

	}
		
}
