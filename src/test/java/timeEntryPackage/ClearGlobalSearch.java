package timeEntryPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClearGlobalSearch {
	public static WebDriver ClickClear(WebDriver driver1) throws InterruptedException {
		
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//click on clear button in the filter section
		driver1.findElement(By.xpath(".//*[@id='form1']/div[3]/section/div/div[1]/div[2]/div/div/div/div[1]/div[5]/div/div/button[2]")).click();
		
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver1;

	}
}
