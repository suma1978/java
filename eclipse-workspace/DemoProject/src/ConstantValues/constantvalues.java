package ConstantValues;
import ExReadWrite.Excelreadwrite;

public class constantvalues {
	public static final String chromedriverpath = "/Users/nbommu/Documents/jarfiles/chromedriver";
	public static final String Firefoxdriverpath = "/Users/nbommu/Documents/jarfiles/geckodriver";
	public static final String excelPath = "/Users/nbommu/Documents/eclipse-workspace/DemoProject/src/DataExcel/Test.xlsx";
    public static final String browserType=Excelreadwrite.getExcelValue1("TestData", 1, 3);
    public static final String URL=Excelreadwrite.getExcelValue1("TestData",2,3);
    public static final String userName=Excelreadwrite.getExcelValue1("TestData",3,3);
    public static final String password=Excelreadwrite.getExcelValue1("TestData",4,3);
    public static final String testscenariosheet = "testsheet";
	public static final String testdatasheet = "TestData";
	public static final int runmodecol = 2;
	public static final int resultcol = 3;
    
}
