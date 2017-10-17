package timeEntryPackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginUser {
	
public static WebDriver LoginTheUser(WebDriver driver1) throws InterruptedException, IOException {
		
	driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver1.findElement(By.id("loginEmail")).sendKeys("plasmasuperuser");;
	driver1.findElement(By.id("loginPass")).sendKeys("Plasma2!");;

	
	driver1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	//[Excel Row=1]Test if LoginButton is displayed, add to excel sheet
	String Xpath= ".//*[@id='lnkLogin']";
	TestCase.TestIf(Xpath, driver1, 1);
	
	driver1.findElement(By.id("lnkLogin")).click();	
	
	driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		return driver1;
	}
}
