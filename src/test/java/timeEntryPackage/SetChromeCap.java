package timeEntryPackage;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SetChromeCap {
	static DesiredCapabilities cap;
public static  DesiredCapabilities StartChrome(WebDriver driver1) {
	
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
	  
	  String downloadFilepath = "C:\\TimeEntryPD\\TimeEntry\\DownFiles";
	  HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
    chromePrefs.put("profile.default_content_settings.popups", 0);
    chromePrefs.put("download.default_directory", downloadFilepath);
    ChromeOptions options = new ChromeOptions();
    HashMap<String, Object> chromeOptionsMap = new HashMap<String, Object>();
    options.setExperimentalOption("prefs", chromePrefs);
    options.addArguments("--test-type");
    options.addArguments("--disable-extensions"); //to disable browser extension popup
    cap = DesiredCapabilities.chrome();
    cap.setCapability(ChromeOptions.CAPABILITY, chromeOptionsMap);
    cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
    cap.setCapability(ChromeOptions.CAPABILITY, options);
	  
    return cap;
}
}
