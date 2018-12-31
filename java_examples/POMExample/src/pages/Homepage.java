package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage
{
	WebDriver driver;
	By heading=By.xpath("//table//tr[@class='heading3']");
	
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
	}
	public String returnUserName()
	{
		return driver.findElement(heading).getText();
	}
}
