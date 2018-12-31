package CommonMethods;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;

import ConstantValues.constantvalues;
import ConstantValues.locatorvalues;
import ExReadWrite.Excelreadwrite;
import utilities.locatorvaluesplit;
import mainscript.CallingMethodds;


public class CommonActions {
	public static WebDriver driver;
	public static WebDriverWait wait; 
	public static String fetchedvalue;
	
	public static WebDriver browserType(String bName) {
		try {
			if (bName.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", constantvalues.chromedriverpath);
				driver = new ChromeDriver();	
				driver.manage().window().maximize();
//				driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//				driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
				
			} else if (bName.equalsIgnoreCase("Firefox")) {
				System.setProperty("webdriver.gecko.driver", constantvalues.Firefoxdriverpath);
				driver = new FirefoxDriver();			
				driver.manage().window().maximize();
			} else {
				System.out.println("Wrong browser name entered");
			}			
		} catch (Exception e) {
			CallingMethodds.bvalue=false;
			e.printStackTrace();
		}
		return driver;
	}
	public static void openBrowser(String testdata) {
		try {
			driver.get(testdata);			
		} catch (Exception e) {
			CallingMethodds.bvalue=false;
			e.printStackTrace();
		}
	}
	public static void handling_textbox(String locatorvale,String testdata)
	{
		try {
			
			WebDriverWait wait=new WebDriverWait(driver, 20);
			WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(locatorvaluesplit.loc_splitvalues(locatorvale)));
			element.sendKeys(testdata);
		}catch(Exception e)
		{
			CallingMethodds.bvalue=false;
			e.printStackTrace();
		}
	}
	public static void handling_btn_click(String locator)
	{
		try {
		WebElement button=driver.findElement(locatorvaluesplit.loc_splitvalues(locator));
		button.click();
		}catch(Exception e)
		{
			CallingMethodds.bvalue=false;
			e.printStackTrace();
		}
	}
	
	public static String fetchtext(String locator)
	{
		try {
		fetchedvalue=driver.findElement(locatorvaluesplit.loc_splitvalues(locator)).getText();
		System.out.println(fetchedvalue);
		}catch(Exception e)
		{
			CallingMethodds.bvalue=false;
			e.printStackTrace();
		}
		return fetchedvalue;
		
	}
	public static void closebrowser()
	{
		driver.quit();
	}
	public static void checkresult(ITestResult result) throws Exception
	{
	if(result.getStatus()==ITestResult.FAILURE)
	{
		System.out.println("FAILED"); 
		Excelreadwrite.writeValue(constantvalues.testscenariosheet, 1, constantvalues.resultcol, "FAILED");
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		File src=screenshot.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(src,new File (constant.destPath + result.getName() +".png"));
	}
	else if(result.getStatus()==ITestResult.SUCCESS)
	{
		System.out.println("PASS");
		Excelreadwrite.writeValue(constantvalues.testscenariosheet, 1, constantvalues.resultcol, "PASS");
	}
	}
	public static void alerthandle() 
	{
		
		//Alert alert=
		wait=new WebDriverWait(driver, 20);
				wait.until(ExpectedConditions.alertIsPresent());
		String alertmsg=driver.switchTo().alert().getText();
		System.out.println(alertmsg);
		driver.switchTo().alert().accept();
	}
	
	

}
