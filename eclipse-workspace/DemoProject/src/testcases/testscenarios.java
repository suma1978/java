package testcases;
import ConstantValues.locatorvalues;
import ConstantValues.constantvalues;
import CommonMethods.CommonActions;

public class testscenarios {
	public static void testlogin()
	{
		CommonActions.browserType(constantvalues.browserType);
		CommonActions.openBrowser(constantvalues.URL);
		CommonActions.handling_textbox(locatorvalues.UserName, constantvalues.userName);
		CommonActions.handling_textbox(locatorvalues.pwd, constantvalues.password);
		CommonActions.handling_btn_click(locatorvalues.login);
		CommonActions.fetchtext(locatorvalues.gettitle);
		
	}
	public static void invalidlogin()
	{
		CommonActions.browserType(constantvalues.browserType);
		CommonActions.openBrowser(constantvalues.URL);
		CommonActions.handling_textbox(locatorvalues.UserName, constantvalues.userName);
		CommonActions.handling_textbox(locatorvalues.pwd, constantvalues.password);
		CommonActions.handling_btn_click(locatorvalues.login);
		CommonActions.alerthandle();
	}
}

