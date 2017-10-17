package timeEntryPackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class EnterTime {

public static WebDriver EnterProjectTime(WebDriver driver1) throws IOException, InterruptedException {

	    //Switch focus to the new opened tab:
		for (String handle1 : driver1.getWindowHandles()) {
		System.out.println(handle1); driver1.switchTo().window(handle1);    	}
		
//*********************************************
//*****Test Case Validations*******************
		
		try {
		//Verify that Project Id text box is visible: #TC3
		String Xpath3= ".//*[@id='ProjectId']";
		TestCase.TestIf(Xpath3, driver1, 3);
		//Verify that Notes text box is visible: #TC4
		String Xpath4= ".//*[@id='Notes']";
		TestCase.TestIf(Xpath4, driver1, 4);
		//Verify that Hours box is visible: #TC5
		String Xpath5= ".//*[@id='Time']";
		TestCase.TestIf(Xpath5, driver1, 5);
		//Verify that (+)button is visible: #TC6
		String Xpath6= ".//*[@id='Time']";
		TestCase.TestIf(Xpath6, driver1, 6);
		//Verify that 'Create Report' Link is visible: #TC7
		String Xpath7= ".//*[@id='form1']/div[3]/section/div/div[2]/div[1]/div/div/div/a";
		TestCase.TestIf(Xpath7, driver1, 7);
		//Verify that 'TOtal hours section is visible: #TC8
		String Xpath8= ".//*[@id='form1']/div[3]/section/div/div[2]/div[2]/div/div[5]/div[1]/div/div/div";
		TestCase.TestIf(Xpath8, driver1, 8);
		} 
		catch (NoSuchElementException err) {
        System.out.println("The No exception error is:" + err);
		}
		
//*********************************************
		
	    //Enter Project ID:
		driver1.findElement(By.xpath(".//*[@id='ProjectId']")).sendKeys("Test");	
		//enter Notes:
		driver1.findElement(By.xpath(".//*[@id='Notes']")).sendKeys("Test_Notes_by_Lari");	
		//enter Time:
		driver1.findElement(By.xpath(".//*[@id='Time']")).sendKeys("2");	
		//click on plus+ button to add row:
		driver1.findElement(By.xpath(".//*[@id='form1']/div[3]/section/div/div[2]/div[2]/div/div[1]/div[3]/div/div/div[2]/a/i")).click();
		
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver1;
		}
	
}
