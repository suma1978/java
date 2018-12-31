package appModule;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Homepage;
import pages.LoginPage;
import utility.constant;
import utility.Excelutils;

public class SignInAction {
	WebDriver driver;
	
	
	public void closedriver()
	{
	 driver.close();
	 driver.quit();
	}
	public WebDriver DriverInit() throws IOException
	{
		Excelutils.Setexcel(constant.testPath, "sheet1");
		System.setProperty(constant.webDriver, constant.driverExePath);
		  driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get(constant.URL);
		  return driver;
	}

}
