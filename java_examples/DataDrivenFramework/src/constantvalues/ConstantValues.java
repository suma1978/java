package constantvalues;

import readwrite.ExcelRW;

public class ConstantValues {

	public static final String chromedriverpath = "/Users/nbommu/Documents/jarfiles/chromedriver";
	public static final String Firefoxdriverpath = "/Users/nbommu/Documents/jarfiles/geckodriver.exe";
	public static final String excelPath = "/Users/nbommu/Documents/eclipse-workspace/DataDrivenFramework/Test.xlsx";
//	public static final String browsertype = "chrome";
//	public static final String URL = "https://www.aapc.com/";
//	public static final String enterfirstName = "TestUser";
//	public static final String enterlastName = "LastName";
//	public static final String enteruserName = "TestuserlastName";
//	public static final String enterpassword = "Test@1234";
//	public static final String enterconfirmpassword = "Test@1234";
//	public static final String enterEmailid = "Testuserlast@mailinator.com";
//	public static final String entercompanyname = "Edureka";
//	public static final String enterStreetName = "Testt street";
//	public static final String enterCityName = "Salt Lake city";
//	public static final String enterZipcode = "84120";
//	public static final String enterPhone = "1115444444";
//	public static final String enterCountry = "United States";
//	public static final String enterState = "UT";

	public static final String browsertype = ExcelRW.readValue("TestData", 1, 3);
	public static final String URL = ExcelRW.readValue("TestData", 2, 3);
	public static final String enterfirstName = ExcelRW.readValue("TestData", 9, 3);
	public static final String enterlastName = ExcelRW.readValue("TestData", 10, 3);
	public static final String enteruserName = ExcelRW.readValue("TestData", 11, 3);
	public static final String enterpassword = ExcelRW.readValue("TestData", 12, 3);
	public static final String enterconfirmpassword = ExcelRW.readValue("TestData", 13, 3);
	public static final String enterEmailid = ExcelRW.readValue("TestData", 14, 3);
	public static final String entercompanyname = ExcelRW.readValue("TestData", 15, 3);
	public static final String enterStreetName = ExcelRW.readValue("TestData", 16, 3);
	public static final String enterCityName = ExcelRW.readValue("TestData", 17, 3);
	public static final String enterZipcode = ExcelRW.readValue("TestData", 18, 3);
	public static final String enterPhone = ExcelRW.readValue("TestData", 19, 3);
	public static final String enterCountry = ExcelRW.readValue("TestData", 20, 3);
	public static final String enterState = ExcelRW.readValue("TestData", 21, 3);
	
}
