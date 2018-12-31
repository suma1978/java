package commonmethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import constantvalues.ConstantValues;
import mainScript.Driverscript;
import utilities.Locatorvaluesplit;

public class Actionkeywords {

	
	public static WebDriver driver;
	public static WebDriverWait wait; 
	public static String fetchedvalue;
	
	public static WebDriver browserType(String bName) {
		if (bName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", ConstantValues.chromedriverpath);
			driver = new ChromeDriver();	
			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			
		} else if (bName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", ConstantValues.Firefoxdriverpath);
			driver = new FirefoxDriver();			
			driver.manage().window().maximize();
		} else {
			System.out.println("Wrong browser name entered");
		}
		return driver;
	}
	
	public static void openBrowser(String testdata) {
		driver.get(testdata);
	}
	
	public static void mousehover_Withoutclick(String locatorvalue) {
	WebElement membershiplink = driver.findElement(Locatorvaluesplit.loc_Split(locatorvalue));
	Actions act = new Actions(driver);
	act.moveToElement(membershiplink).build().perform();
	}
	
	public static void mousehover_Withclick(String locatorvalue) {
	WebElement individualLink = driver.findElement(Locatorvaluesplit.loc_Split(locatorvalue));
	Actions act = new Actions(driver);
	act.moveToElement(individualLink).click().build().perform();
	}
	
	public static String fetchValue(String locatorvalue) throws Exception {
	fetchedvalue = driver.findElement(Locatorvaluesplit.loc_Split(locatorvalue)).getText();
	System.out.println(fetchedvalue);
	return fetchedvalue;
	}
	
	public static void handling_click(String locatorvalue) {
	WebElement joinNowButton = driver.findElement(Locatorvaluesplit.loc_Split(locatorvalue));
	joinNowButton.click();
	}
	
	public static void handling_textbox(String locatorvalue, String testdata) {
	WebDriverWait wait = new WebDriverWait(driver, 20);
	WebElement enterfirstName = wait.until(ExpectedConditions.visibilityOfElementLocated(Locatorvaluesplit.loc_Split(locatorvalue)));
	enterfirstName.sendKeys(testdata);
	}
	
	public static void handling_Dropdown(String locatorvalue, String testdata) {
	WebElement enterCountry = driver.findElement(Locatorvaluesplit.loc_Split(locatorvalue));
	Select selcountry = new Select(enterCountry);
	selcountry.selectByVisibleText(testdata);
	}
	
	public static void closebrowser() {
		driver.close();
		driver.quit();
	}
}
