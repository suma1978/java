package TestCases;

import java.io.IOException;
import java.util.Properties;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import ExcelExportAndFileIO.ReadExcelFile;
import Operation.ReadObject;
import Operation.UIOperation;

public class ExecuteTestCase {
WebDriver driver;
	
	@Test
	public void testLogin() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "/Users/nbommu/Documents/jarfiles/chromedriver");
		 driver=new ChromeDriver();
		ReadExcelFile exlfile=new ReadExcelFile();
		ReadObject object=new ReadObject();
		Properties allobject=object.getobjectRepository();
		UIOperation operation=new UIOperation(driver);
	XSSFSheet excelSheet=(XSSFSheet) exlfile.readExcel(System.getProperty("user.dir")+"/","testCase.xlsx",  "KeywordFramework");
		int rowcount=excelSheet.getLastRowNum()-excelSheet.getFirstRowNum();
		for(int i=1;i<rowcount+1;i++)
		{
			System.out.println("Current Row is :"+ i);
			Row row=excelSheet.getRow(i);
			System.out.println("row count  is )" + rowcount);
			System.out.println(row.getCell(4));
			if(row.getCell(0)==null)
			{
				System.out.println(row.getCell(1).toString()+"----"+ row.getCell(2).toString()+"----"+
			            row.getCell(3).toString()+"----"+ row.getCell(4).toString());	
			
			operation.perform(allobject, row.getCell(1).toString(),row.getCell(2).toString(),row.getCell(3).toString(),row.getCell(4).toString());
			}
			else
			{
				System.out.println("Test Case 1");
				System.out.println("New Test Case ->" + row.getCell(0).toString());
			}
		}
		
	}
	@AfterMethod
	public void closeDriver()
	{
		driver.close();
		driver.quit();
	}
	
}
   