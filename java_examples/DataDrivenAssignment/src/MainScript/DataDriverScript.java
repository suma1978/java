package MainScript;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import Excelreadwrite.ExcelFileRW;
import constantvalues.ConstantValues;
import commonmethods.CommonActionkeywords;
import constantvalues.AllLocatorValues;

public class DataDriverScript {
	@Test
	public static void main() throws Exception 
	{
		Reporter.log("This is my Main Method");
		
		
		ExcelFileRW.excelPath(ConstantValues.excelPath);
		String btype=ConstantValues.browsertype;
		System.out.println(btype);
		CommonActionkeywords.browserType(btype);
		
		
		CommonActionkeywords.openBrowser(ConstantValues.URL);
		CommonActionkeywords.handling_click(AllLocatorValues.loginlink_landingpage);
		CommonActionkeywords.handling_textbox(AllLocatorValues.useremailId_loginpage,ConstantValues.userNameL);
		CommonActionkeywords.handling_textbox(AllLocatorValues.userpassword_loginpage,ConstantValues.password);
		CommonActionkeywords.handling_click(AllLocatorValues.signInbutton_lolginpage);
		CommonActionkeywords.handling_click(AllLocatorValues.dropdownmenu_community);
		CommonActionkeywords.handling_click(AllLocatorValues.dropdownmenu_community_blog);
		CommonActionkeywords.handling_click(AllLocatorValues.interviewquestionlink_blogpage);
		CommonActionkeywords.handling_click(AllLocatorValues.logout_interviewquestionpage);
		
		//CommonActionkeywords.closebrowser();
		
	}
	@AfterTest
	public void closebrowser()
	{
		CommonActionkeywords.closebrowser();
	}

}
