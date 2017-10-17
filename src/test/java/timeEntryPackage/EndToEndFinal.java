package timeEntryPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import timeEntryPackage.LoadLoginPage;

public class EndToEndFinal {

	private WebDriver driver;  
	
  @BeforeTest
  public void beforeTest() {
	  
	  //Startup Chrome browser (with the capabilities to download a file).
	  DesiredCapabilities cap1 = SetChromeCap.StartChrome(driver);
	  driver = new ChromeDriver(cap1);  
	  
      }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  }
  
  @Test(priority=1)
  public void f1() {
	  //Open the Login Page:
	  LoadLoginPage.LoadPage(driver);
	  System.out.println(driver.getTitle());
  }
  
  @Test(priority=2)
  public void f2() throws InterruptedException, IOException {
	  //Enter Username and pwd: TC#1
	  LoginUser.LoginTheUser(driver);
  }
  
  @Test(priority=3)
  public void f3() throws InterruptedException, IOException {
	  //CLick on the Time Entry Button TC#2
	  ClickTimeEntry.ClickOnTimeEntry(driver);
  }
  
  @Test(priority=4)
  public void f4() throws InterruptedException, IOException {
	  //**Update the Project name/time in this one everytime you run TC#3,4,5,6,7,8
	  EnterTime.EnterProjectTime(driver);
  }
  
  @Test(priority=5)
  public void f5() throws InterruptedException, IOException {
	  //click on create report- then start a new report TC#9,10,11,12,13,14,15,16
	  CreateAReport.CreateReport(driver);
	
  }
  
  @Test(priority=6)
  public void f6() throws InterruptedException, IOException {
	 //Search Functionality test by Global Search: TC#17-26.
	  GlobalSearch.SearchFunc(driver);
  }

  @Test(priority=7)
  public void f7() throws InterruptedException {
	 //Clear the Search results from above Functionality test by Global Search:
	  ClearGlobalSearch.ClickClear(driver);
  }
  
  @Test(priority=8)
  public void f8() throws InterruptedException, IOException  {
	 //Check the export to excel functionality on the Time Mnagement Page: TC#27
	  ExportToExcel.ExporttoExcel(driver);
  }
  
  @Test(priority=9)
  public void f9() throws InterruptedException, IOException  {
	 //Check the export to PDF functionality on the Time Mnagement Page: TC#28
	  ExportToPDF.ExporttoPDF(driver);
  }
  
  @Test(priority=10)
  public void F10() throws InterruptedException, IOException  {
	 //Creating a custom filter on the Time Mnagement Page: TC#29-38
	  CustomFilter.TestCustomFilter(driver);
  }
  
}