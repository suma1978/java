package constantvalues;
import Excelreadwrite.ExcelFileRW;



public class ConstantValues {
	
	public static final String chromedriverpath = "/Users/nbommu/Documents/jarfiles/chromedriver";
	public static final String Firefoxdriverpath = "/Users/nbommu/Documents/jarfiles/geckodriver.exe";
	public static final String excelPath = "/Users/nbommu/Downloads/HybridFramework3/Test.xlsx";
	//public static String excelPath="/Users/nbommu/Documents/eclipse-workspace/DataDrivenAssignment/Test.xlsx";
	
	public static final String browsertype = ExcelFileRW.readValue("TestData",1,3);
	
	public static final String URL=ExcelFileRW.readValue("TestData",2,3 );
	public static final String userNameL=ExcelFileRW.readValue("TestData",4,3 );
	public static final String password=ExcelFileRW.readValue("TestData",5,3 );
	
	
	
}
