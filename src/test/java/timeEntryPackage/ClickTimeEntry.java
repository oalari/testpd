package timeEntryPackage;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ClickTimeEntry {
	public static WebDriver ClickOnTimeEntry(WebDriver driver1) throws InterruptedException, IOException {
		
		//wait till the time entry icon is visible
		WebDriverWait wait = new WebDriverWait(driver1, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='AppContainer']/div[2]/ul/li[2]/div[2]/a/strong")));
		
		//assert that the app exists
		Assert.assertTrue(driver1.findElement(By.xpath(".//*[@id='AppContainer']/div[2]/ul/li[2]/div[2]/a/strong")).isDisplayed(), "Time Entry App does not Exist");
		
		//[Excel Row=2]Test if app is displayed, add to excel sheet
		String Xpath= ".//*[@id='AppContainer']/div[2]/ul/li[2]/div[2]/a/strong";
		TestCase.TestIf(Xpath, driver1, 2);
		
		//click on the Time Entry App:
		driver1.findElement(By.xpath(".//*[@id='AppContainer']/div[2]/ul/li[2]/div[1]/a[1]/img")).click();	
		
		//driver1.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			return driver1;
		}
}
