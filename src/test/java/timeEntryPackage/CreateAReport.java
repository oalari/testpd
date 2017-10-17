package timeEntryPackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAReport {
public static WebDriver CreateReport(WebDriver driver1) throws InterruptedException, IOException {
		
	//Click on Create Report link on top right hand side...
	driver1.findElement(By.xpath(".//*[@id='form1']/div[3]/section/div/div[2]/div[1]/div/div/div/a")).click();
	
		
    	//Click on NEW button.
		driver1.findElement(By.xpath(".//*[@id='form1']/div[3]/section/div/div[1]/div[3]/div[1]/a")).click();

		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//*********************************************
		//*****Test Case Validations*******************
				
				try {
					//Verify that Resource dropdown is visible: #TC9
					String Xpath9= ".//*[@id='timeEntrypopup']/div[2]/div/div[1]/div[1]/div[1]/div";
					TestCase.TestIf(Xpath9, driver1, 9);
					//Verify that ProjectName dropdown is visible: #TC10
					String Xpath10= ".//*[@id='timeEntrypopup']/div[2]/div/div[2]/div[1]/div[1]/div";
					TestCase.TestIf(Xpath10, driver1, 10);
					//Verify that Calendar is visible: #TC11
					String Xpath11= ".//*[@id='calendar_label']";
					TestCase.TestIf(Xpath11, driver1, 11);
					//Verify that Time(hrs) is visible: #TC12
					String Xpath12= ".//*[@id='Time']";
					TestCase.TestIf(Xpath12, driver1, 12);
					//Verify that Notes is visible: #TC13
					String Xpath13= ".//*[@id='Notes']";
					TestCase.TestIf(Xpath13, driver1, 13);
					//Verify that cancel button is visible: #TC14
					String Xpath14= ".//*[@id='timeEntrypopup']/div[3]/div/button[2]";
					TestCase.TestIf(Xpath14, driver1, 14);
					//Verify that add button is visible: #TC15
					String Xpath15= ".//*[@id='AddNewTimeEntry']";
					TestCase.TestIf(Xpath15, driver1, 15);
				} 
				catch (NoSuchElementException err) {
		        System.out.println("The No exception error is:" + err);
				}
				
		//*********************************************		
		//Select a resource and project name from dropdown:
		driver1.findElement(By.xpath(".//*[@id='timeEntrypopup']/div[2]/div/div[1]/div[1]/div[1]/div/span")).click();
	    Thread.sleep(1000); 
	    driver1.findElement(By.xpath(".//*[@id='timeEntrypopup']/div[2]/div/div[1]/div[1]/div[1]/div/ul/li[4]")).click();
	    driver1.findElement(By.xpath(".//*[@id='timeEntrypopup']/div[2]/div/div[2]/div[1]/div[1]/div")).click();
	    Thread.sleep(1000); 
	    driver1.findElement(By.xpath(".//*[@id='timeEntrypopup']/div[2]/div/div[2]/div[1]/div[1]/div/ul/li[4]")).click();
		
		//Select a calendar
	    driver1.findElement(By.xpath(".//*[@id='calendar_label']")).click();
	    driver1.findElement(By.xpath(".//*[@id='datepicker']/div/table/tbody/tr[2]/td[4]/div")).click();
		
		//enter hours
		driver1.findElement(By.xpath(".//*[@id='Time']")).sendKeys("1");
		
		//enter Notes
		driver1.findElement(By.xpath(".//*[@id='Notes']")).sendKeys("Automation Test Scenarios being executed here.");
		
		//click on ADD button
		driver1.findElement(By.xpath(".//*[@id='AddNewTimeEntry']")).click();
		
		driver1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//click on OK for success Alert saying that it has been saved.
		//wait till the alert is visible
		WebDriverWait wait = new WebDriverWait(driver1, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='SuccessMsg']/div[3]/div/button")));
		
		//verification that the success message is dispplayed
		try {
			//Verify New time entry added Success Message is displayed: #TC16
			String Xpath16= ".//*[@id='SuccessMsg']/div[3]/div/button";
			TestCase.TestIf(Xpath16, driver1, 16);
		} 
		catch (NoSuchElementException err) {
        System.out.println("The No exception error is:" + err);
		}
		//*******
		
		//click on the success message-
		driver1.findElement(By.xpath(".//*[@id='SuccessMsg']/div[3]/div/button")).click();
		
	
		driver1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		return driver1;
		}
	
}

