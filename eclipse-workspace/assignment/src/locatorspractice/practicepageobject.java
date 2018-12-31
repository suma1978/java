package locatorspractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class practicepageobject
{
	@FindBy(how=How.NAME, using="firstname")
	public WebElement firstname;
	@FindBy(how=How.NAME,using="lastname")
	public WebElement lastname;

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "/Users/nbommu/Documents/jarfiles/chromedriver");
		System.setProperty("webdriver.chrome.logfile", "TestLog.txt");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		//Initialize the page object
		practicepageobject pageobject=PageFactory.initElements(driver, practicepageobject.class);
		pageobject.firstname.sendKeys("Suma");
		pageobject.lastname.sendKeys("Thota");
		
		//Read values from the textbox
		pageobject.firstname.getText();
		pageobject.lastname.getText();
		driver.close();
		driver.quit();
		
	}

}


