package timeEntryPackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomFilter {

	public static WebDriver TestCustomFilter(WebDriver driver1) throws InterruptedException, IOException {
		String EdCustFilt=".//*[@id='form1']/div[3]/section/div/div[1]/div[2]/div/div/div/div[2]/div[2]/div/a";

        driver1.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
        driver1.findElement(By.xpath(EdCustFilt)).click();
			
		//click on Add New button:
		driver1.findElement(By.xpath(".//*[@id='editcustomfilter']/div[3]/div/a")).click();

//*********************************************
//*****Test Case Validations*******************
				
				try {					
					//Verify that Filter text box is visible: #TC29
					String Xpath29= ".//*[@id='txtFilterName']";
					TestCase.TestIf(Xpath29, driver1, 29);
					//Verify that GLobar search text box is visible: #TC30
					String Xpath30= ".//*[@id='txtGlobalSearchFil']";
					TestCase.TestIf(Xpath30, driver1, 30);
					//Verify that Resource Mangaer dropdown text box is visible: #TC31
					String Xpath31= ".//*[@id='addcustomfilter']/div[2]/div/div[3]/div[1]/div/div";
					TestCase.TestIf(Xpath31, driver1, 31);
					//Verify that Resource dropdown text box is visible: #TC32
					String Xpath32= ".//*[@id='addcustomfilter']/div[2]/div/div[3]/div[2]/div/div";
					TestCase.TestIf(Xpath32, driver1, 32);
					//Verify that Project Name text box is visible: #TC33
					String Xpath33= ".//*[@id='txtProjectName']";
					TestCase.TestIf(Xpath33, driver1, 33);
					//Verify that From Date text box is visible: #TC34
					String Xpath34= ".//*[@id='calCustomFrom']";
					TestCase.TestIf(Xpath34, driver1, 34);
					//Verify that TO date text box is visible: #TC35
					String Xpath35= ".//*[@id='calCustomFrom']";
					TestCase.TestIf(Xpath35, driver1, 35);
					//Verify that cancel button link is visible: #TC36
					String Xpath36= ".//*[@id='addcustomfilter']/div[3]/div/button[2]";
					TestCase.TestIf(Xpath36, driver1, 36);
					//Verify that save button link is visible: #TC37
					String Xpath37= ".//*[@id='addcustomfilter']/div[3]/div/button[1]";
					TestCase.TestIf(Xpath37, driver1, 37);

				} 
				catch (NoSuchElementException err) {
		        System.out.println("The No exception error is:" + err);
				}
//*********************************************
				
		//Enter filter name text
		driver1.findElement(By.xpath(".//*[@id='txtFilterName']")).sendKeys("Automated Filter1");
		
		//enter GLobal search criteria
		driver1.findElement(By.xpath(".//*[@id='txtGlobalSearchFil']")).sendKeys("Ind");
		
		//click on SAVE button:
		driver1.findElement(By.xpath(".//*[@id='addcustomfilter']/div[3]/div/button[1]")).click();
		Thread.sleep(1000);
		//wait till the OK button is visible
		//WebDriverWait wait = new WebDriverWait(driver1, 15);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='SuccessMsg']/div[3]/div/button")));

		//Verify that filter is successfully saved: #TC38
		String Xpath38= ".//*[@id='SuccessMsg']/div[3]/div/button";
		TestCase.TestIf(Xpath38, driver1, 38);
		
		Thread.sleep(1000);
		
		//click on OK button in the popup that follows:
		driver1.findElement(By.xpath(".//*[@id='SuccessMsg']/div[3]/div/button")).click();
				
		Thread.sleep(1000);
		
		//Select the latest Item added from dropdown
		//driver1.findElement(By.xpath(".//*[@id='form1']/div[3]/section/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div/div/ul/li[2]")).click();
	    
		return driver1;
	}
	
}
