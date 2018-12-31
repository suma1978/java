package TestCases;

import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ExcelExportAndFileIO.ReadExcelFile;
import Operation.ReadObject;
import Operation.UIOperation;

public class HybridExecuteTest {

	WebDriver driver;
	
	@Test(dataProvider="hybridData")
	public void testLogin(String testcaseName,String keyword,String objectName,String objectType,String value) throws Exception
	{
		if(testcaseName!=null&&testcaseName.length()!=0){
		    
		System.setProperty("webdriver.chrome.driver", "/Users/nbommu/Documents/jarfiles/chromedriver");
		 driver=new ChromeDriver();
		}
		
		ReadObject object=new ReadObject();
		Properties allobject=object.getobjectRepository();
		UIOperation operation=new UIOperation(driver);
		operation.perform(allobject, keyword, objectName,objectType, value);
			
			//operation.perform(allobject, row.getCell(1).toString(),row.getCell(2).toString(),row.getCell(3).toString(),row.getCell(4).toString());
			
		}
	@DataProvider(name="hybridData")
	public Object[][] getDataFromDataprovider() throws IOException
	{
		Object[][] object = null;
		ReadExcelFile exlfile=new ReadExcelFile();
		XSSFSheet excelSheet=(XSSFSheet) exlfile.readExcel(System.getProperty("user.dir")+"/","testCase.xlsx",  "KeywordFramework");
		int rowCount=excelSheet.getLastRowNum()-excelSheet.getFirstRowNum();
		System.out.println(rowCount);
		//int c=excelSheet.getRow(1).getLastCellNum();
		//System.out.println(c);
		object = new Object[rowCount][5];
		for(int i=0;i<rowCount;i++)
		{
			Row row=excelSheet.getRow(i+1);
			//System.out.println(row.getCell(1).toString());
			
			for (int j = 0; j < row.getLastCellNum(); j++) {
	            //Print excel data in console
	            object[i][j] = row.getCell(j).toString();

	   		// System.out.println(row.getCell(j).toString());
			}
		}
		 System.out.println("END");
	     return object; 
	}
		
		
	}
	

