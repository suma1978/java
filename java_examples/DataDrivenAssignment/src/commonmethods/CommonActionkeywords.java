package commonmethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import constantvalues.ConstantValues;
import utilities.locatorsplit;

public class CommonActionkeywords {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static String fetchdvalue;
	public static void browserType(String bName) {
		
		System.out.println(bName);
		if(bName.equalsIgnoreCase("chrome"))
		{
			System.out.println(bName);
			System.setProperty("webdriver.chrome.driver",ConstantValues.chromedriverpath );
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}
		else if(bName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",ConstantValues.Firefoxdriverpath );
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
	}
	public static void openBrowser(String testdata)
	{
		driver.get(testdata);
	}
	public static void dropdownmenu_withclick(String locatorValue)
	{
		wait=new WebDriverWait(driver, 10);
		WebElement communitylink=wait.until(ExpectedConditions.elementToBeClickable(locatorsplit.loc_Split(locatorValue)));
		
		communitylink.click();
	}
	public static void handling_click(String locatorValue)
	{
		wait=new WebDriverWait(driver, 10);
		WebElement loginbutton=wait.until(ExpectedConditions.elementToBeClickable(locatorsplit.loc_Split(locatorValue)));
		loginbutton.click();
	}
	public static void handling_textbox(String locatorValue,String testdata)
	{
		wait=new WebDriverWait(driver, 10);
		WebElement textboxval=wait.until(ExpectedConditions.visibilityOfElementLocated(locatorsplit.loc_Split(locatorValue)));
		textboxval.sendKeys(testdata);
	}
	public static void closebrowser() {
		driver.close();
		driver.quit();
	}

}
