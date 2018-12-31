package test.java;
package mainscript;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class NewTest {
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
		
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
