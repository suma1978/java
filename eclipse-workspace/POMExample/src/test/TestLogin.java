package test;

import org.testng.annotations.Test;

import pages.Homepage;
import pages.LoginPage;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import utility.constant;
import appModule.SignInAction;
import utility.Excelutils;

public class TestLogin {
	WebDriver driver;
	Homepage homepageobj;
	LoginPage loginpageobj;
	SignInAction signobj;
	String userName;
	String pwd;
	
  @Test
  public void ActualCase() throws Exception {
	  
	  loginpageobj=new LoginPage(driver);
	  //Verify login page title
	  String pageTitle=loginpageobj.returnTitle();
	  Assert.assertTrue(pageTitle.toLowerCase().contains(constant.matchHeader));
	  
	 // loginpageobj.loginTogo(constant.userName, constant.password);
	  userName=Excelutils.getcellVal(1, 1);
	  pwd=Excelutils.getcellVal(1, 2);
	  System.out.println(userName +pwd);
	  loginpageobj.loginTogo(userName, pwd);
	  
	  homepageobj=new Homepage(driver);
	  Assert.assertTrue(homepageobj.returnUserName().toLowerCase().contains(constant.homeTitle));
	 
	  
	  
	  
	  
	  
  }
  @BeforeTest
  public void Driversetup() throws IOException {
	  signobj=new SignInAction();
	  this.driver=signobj.DriverInit();
	 /* System.setProperty(constant.webDriver, constant.driverExePath);
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get(constant.URL);*/
  }

  @AfterTest
  public void afterTest() throws Exception {
	  
	  //signobj.closedriver();
	  
	  //Excelutils.setCelldata("PASS", 1, 3);
	  
	 
	 /* driver.close();
	  driver.quit();*/
  }
@AfterMethod
public void check(ITestResult result) throws Exception
{
	try
	{
	if (result.getStatus() == ITestResult.FAILURE)
    {
		
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		File src=screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File (constant.destPath + result.getName() +".png"));
		Excelutils.setCelldata("FAILED", 1, 3);
       System.out.println("FAILED"); 
		}
		
     else if (result.getStatus() == ITestResult.SKIP)
    {
        System.out.println("Test Case Has Been Skipped");
    } else
    {
        System.out.println("Test Case Passed");
        Excelutils.setCelldata("PASS", 1, 3);
    }
	}
	catch(Exception e)
	{
		throw(e);
	}
   
	signobj.closedriver();
}

}
