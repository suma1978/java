package mainScript;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.reporters.jq.ReporterPanel;

import commonmethods.Actionkeywords;
import constantvalues.ConstantValues;
import constantvalues.LocatorValues;
import pages.AddressbookPage;
import pages.LandingPage;
import pages.MembershipPage;
import pages.ShoppingcartPage;
import readwrite.ExcelRW;

public class Driverscript {

//-----------------------------------------PAGE OBJECT MODEL APPROACH--------------------------------------------------------	
//	public static WebDriver driver;
//	public static WebDriverWait wait; 
//	
//	public static WebDriver browserType(String bName) {
//		if (bName.equalsIgnoreCase("Chrome")) {
//			System.setProperty("webdriver.chrome.driver", ConstantValues.chromedriverpath);
//			driver = new ChromeDriver();	
//			driver.manage().window().maximize();
////			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//			
//		} else if (bName.equalsIgnoreCase("Firefox")) {
//			System.setProperty("webdriver.gecko.driver", ConstantValues.Firefoxdriverpath);
//			driver = new FirefoxDriver();			
//			driver.manage().window().maximize();
//		} else {
//			System.out.println("Wrong browser name entered");
//		}
//		return driver;
//	}
//
//	public static void main(String[] args) throws Exception {
//		ExcelRW.excelPath(ConstantValues.excelPath);
//		browserType(ConstantValues.browsertype);
//		
//		driver.get(ConstantValues.URL);
//		
//		LandingPage.membershiplink();
//		LandingPage.individualLink();
//		
//		MembershipPage.cartValue();
//		MembershipPage.joinNowButton();
//		
//		ShoppingcartPage.totalPriceshoppingcart();
//		ShoppingcartPage.createanaccount();
//		
//		if (MembershipPage.cartValue.equals(ShoppingcartPage.totalPriceshoppingcart)) {
//			System.out.println("MY TEST CASE IS PASS");
//		} else {
//			System.out.println("MY TEST CASE IS FAIL");
//		}
//		
//		AddressbookPage.enterfirstname(ConstantValues.enterfirstName);
//		AddressbookPage.enterlastName(ConstantValues.enterlastName);
//		AddressbookPage.enterusername(ConstantValues.enteruserName);
//		AddressbookPage.enteremailid(ConstantValues.enterEmailid);
//		AddressbookPage.enterpassword(ConstantValues.enterpassword);
//		AddressbookPage.enterconfirmpassword(ConstantValues.enterconfirmpassword);
//		AddressbookPage.entercompanyName(ConstantValues.entercompanyname);
//		AddressbookPage.enterstreetName(ConstantValues.enterStreetName);
//		AddressbookPage.entercountry(ConstantValues.enterCountry);
//		AddressbookPage.enterState(ConstantValues.enterState);
//		AddressbookPage.entercityName(ConstantValues.enterCityName);
//		AddressbookPage.enterzipcode(ConstantValues.enterZipcode);
//		AddressbookPage.enterphone(ConstantValues.enterPhone);
//--------------------------------------------------------END PAGE OBJECT MODEL APPROACH---------------------------------------------		
//	}
//------------------------------------------WORKING WITH REUSEABLE METHODS-----------------------------------------------------
	@Test
		public static void main() throws Exception 
	{
			Reporter.log("This is my Main Method");
			ExcelRW.excelPath(ConstantValues.excelPath);
			Actionkeywords.browserType(ConstantValues.browsertype);
			Actionkeywords.openBrowser(ConstantValues.URL);
			
			Actionkeywords.mousehover_Withoutclick(LocatorValues.membershiplink_LandingPage);
			Actionkeywords.mousehover_Withclick(LocatorValues.individualLink_LandingPage);
			
			String cartValue_MembershipPage = Actionkeywords.fetchValue(LocatorValues.cartValue_MembershipPage);
			Actionkeywords.handling_click(LocatorValues.joinnowbutton_MembershipPage);
			
			String totalPriceshoppingcart_ShoppingcartPage = Actionkeywords.fetchValue(LocatorValues.totalPriceshoppingcart_ShoppingcartPage);
			Actionkeywords.handling_click(LocatorValues.createanaccount_ShoppingcartPage);
			
			if (cartValue_MembershipPage.equalsIgnoreCase(totalPriceshoppingcart_ShoppingcartPage)) {
			System.out.println("MY TEST CASE IS PASS");
			} else {
			System.out.println("MY TEST CASE IS FAIL");
			}
			
			Actionkeywords.handling_textbox(LocatorValues.enterfirstname_AddressbookPage, ConstantValues.enterfirstName);
			Actionkeywords.handling_textbox(LocatorValues.enterlastname_AddressbookPage, ConstantValues.enterlastName);
			Actionkeywords.handling_textbox(LocatorValues.enterusertname_AddressbookPage, ConstantValues.enteruserName);
			Actionkeywords.handling_textbox(LocatorValues.enteremail_AddressbookPage, ConstantValues.enterEmailid);
			Actionkeywords.handling_textbox(LocatorValues.enterpassword_AddressbookPage, ConstantValues.enterpassword);
			Actionkeywords.handling_textbox(LocatorValues.enterconfirmpassword_AddressbookPage, ConstantValues.enterconfirmpassword);
			Actionkeywords.handling_textbox(LocatorValues.entercompany_AddressbookPage, ConstantValues.entercompanyname);
			Actionkeywords.handling_textbox(LocatorValues.enterstreet_AddressbookPage, ConstantValues.enterStreetName);
			Actionkeywords.handling_Dropdown(LocatorValues.entercountry_AddressbookPage, ConstantValues.enterCountry);
			Actionkeywords.handling_Dropdown(LocatorValues.enterstate_AddressbookPage, ConstantValues.enterState);
			Actionkeywords.handling_textbox(LocatorValues.entercity_AddressbookPage, ConstantValues.enterCityName);
			Actionkeywords.handling_textbox(LocatorValues.enterzip_AddressbookPage, ConstantValues.enterZipcode);
			Actionkeywords.handling_textbox(LocatorValues.enterphone_AddressbookPage, ConstantValues.enterPhone);
		  // Actionkeywords.closebrowser();
		}
		
		@AfterTest
		public void closedriver()
		{
			Actionkeywords.closebrowser();
		}
		
}
