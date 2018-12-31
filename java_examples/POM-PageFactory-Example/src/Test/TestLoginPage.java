package Test;

import java.io.IOException;
import PageFactory.GmailLoginPage;
import utility.constant;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import PageFactory.GmailHomePage;

import appModule.SignInAction;
public class TestLoginPage {

	WebDriver driver;
	SignInAction signobj;
	GmailLoginPage loginpageobj;
	GmailHomePage homepageObj;
	
	@BeforeTest 
	public void Driversetup() throws IOException
	{
		signobj=new SignInAction();
		  this.driver=signobj.DriverInit();
	}
	@AfterTest
	public void closeDriver()
	{
		signobj.closedriver();
	}
	
	
	@Test
	public void SignIn() throws Exception
	{
		loginpageobj=new GmailLoginPage(driver);
		homepageObj=new GmailHomePage(driver);
	
		loginpageobj.logintoAccount(constant.userName, constant.password);
	
		homepageObj.clickcompose(constant.SendTo,constant.subject);
		
	}
	
	
	
}
