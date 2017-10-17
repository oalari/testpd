package timeEntryPackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ExportToPDF {
	public static WebDriver ExporttoPDF(WebDriver driver1) throws InterruptedException, IOException {
		driver1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//click on the cancel button if the export func. is still open.
		String CancelButtonXpath=".//*[@id='exportpopup']/div[3]/div/button[4]";
		if(driver1.findElement(By.xpath(CancelButtonXpath)).isDisplayed())
		{
			driver1.findElement(By.xpath(CancelButtonXpath)).click();
		}
		
		//Click on Export to PDF link...
		JavascriptExecutor jse = (JavascriptExecutor)driver1;
		jse.executeScript("arguments[0].scrollIntoView()", driver1.findElement(By.xpath(".//*[@id='form1']/div[3]/section/div/div[1]/div[3]/div[2]/a[2]"))); 
		driver1.findElement(By.xpath(".//*[@id='form1']/div[3]/section/div/div[1]/div[3]/div[2]/a[2]")).click();
	    
		Thread.sleep(1000); 
		
		//ensure select all is clicked, we want to select all for download.
		driver1.findElement(By.xpath(".//*[@id='selectALL_1']")).click();
		driver1.findElement(By.xpath(".//*[@id='selectALL_1']")).click();
		
		String ExportButtonXpath=".//*[@id='exportpopup']/div[3]/div/button[2]";
		
		//CLICK ON EXPORT button
		JavascriptExecutor jse1 = (JavascriptExecutor)driver1;
		jse1.executeScript("arguments[0].scrollIntoView()", driver1.findElement(By.xpath(ExportButtonXpath))); 
        driver1.findElement(By.xpath(ExportButtonXpath)).click();
        
    	Thread.sleep(1000); 
    	
        //Verify that file downloaded correctly  TC#28
        TestCase.TestDownload(28);
		
		return driver1;
}
}