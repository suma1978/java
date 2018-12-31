package Operation;

import java.util.Properties;

import org.apache.bcel.generic.NEW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UIOperation {
	
	WebDriver driver;
	public UIOperation(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
public void perform(Properties p,String operation,String objectName,String objectType,String value) throws Exception
{
	System.out.println(" ");
	switch(operation.toUpperCase())
	{
	case "CLICK":
		System.out.println(objectName +","+objectType);
		driver.findElement(this.getobject(p, objectName, objectType)).click();
         break;	
	
	case "SETTEXT":
		driver.findElement(this.getobject(p, objectName, objectType)).sendKeys(value);
        break;
	case "GOTOURL":
	    driver.get(p.getProperty(value));
	break;
	case "GETTEXT":
		String s=driver.findElement(this.getobject(p, objectName, objectType)).getText();
		System.out.println(s);
	     break;
	 
	}
		
	
}
public By getobject(Properties p,String objectName,String objectType) throws Exception
{
	//Find By Xpath
	if(objectType.equalsIgnoreCase("XPATH"))
	{
		return By.xpath(p.getProperty(objectName));
	}
	//find by NAME
	if(objectType.equalsIgnoreCase("NAME"))
	{
		System.out.println("Object found by:"+ objectName );
		return By.name(p.getProperty(objectName));
	}
	if(objectType.equalsIgnoreCase("CLASS")) {
		return By.className(p.getProperty(objectName));
	}
	if(objectType.equalsIgnoreCase("CSS")) {
		return By.cssSelector(p.getProperty(objectName));
	}
	if(objectType.equalsIgnoreCase("LINK")) {
		return By.linkText(p.getProperty(objectName));
	}
	if(objectType.equalsIgnoreCase("PartialLink")) {
		return By.partialLinkText(p.getProperty(objectName));
	}
	else
	{
		throw new Exception("Wrong object typed");
	}
	
}
}
