package mainscript;
import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import CommonMethods.CommonActions;
import testcases.testscenarios;

import ConstantValues.constantvalues;

import ExReadWrite.Excelreadwrite;

public class CallingMethodds {
	public static Boolean bvalue;
	
@BeforeMethod
public void main() throws Exception
{
	Excelreadwrite.excelFilePath(constantvalues.excelPath);
}
@Test(priority=1)
public void testcase1() throws Exception

{
	bvalue=true;
	//testscenarios.testlogin();
	testscenarios.invalidlogin();
	if(bvalue==false)
	{
	Excelreadwrite.writevaltocell("testsheet", 1, constantvalues.resultcol, "FAIL");	
	}
	else
	{
		System.out.println("It's Passed");
		Excelreadwrite.writevaltocell("testsheet", 1, constantvalues.resultcol, "PASS");	
	}
	
}
@AfterMethod
public static void checkresult(ITestResult result) throws Exception
{
if(result.getStatus()==ITestResult.FAILURE)
{
	System.out.println("FAILED"); 
	Excelreadwrite.writevaltocell(constantvalues.testscenariosheet, 1, constantvalues.resultcol, "FAILED");
	TakesScreenshot screenshot=(TakesScreenshot)CommonActions.driver;
	File src=screenshot.getScreenshotAs(OutputType.FILE);
	//FileUtils.copyFile(src,new File (constant.destPath + result.getName() +".png"));
}
else if(result.getStatus()==ITestResult.SUCCESS)
{
	System.out.println("PASS");
	Excelreadwrite.writevaltocell(constantvalues.testscenariosheet, 1, constantvalues.resultcol, "PASS");
}
//CommonActions.closebrowser();
}

@AfterMethod
public void closebrowser()

{
	CommonActions.closebrowser();
	
}
}
