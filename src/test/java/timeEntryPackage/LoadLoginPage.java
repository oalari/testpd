package timeEntryPackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;

public class LoadLoginPage {
	
	public static WebDriver LoadPage(WebDriver driver1) {
		
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver1.get("https://att-staging.c2m.net/login.aspx");
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver1;
	}

}
