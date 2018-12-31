package utilities;
import org.openqa.selenium.By;

import ConstantValues.locatorvalues;

public class locatorvaluesplit {
	
	public static By loc_splitvalues(String locatorvalue)
	{
		String locatorBy=locatorvalue.split(":")[0];
		String locatorstr=locatorvalue.split(":")[1];
		if(locatorBy.equalsIgnoreCase("name"))
			return By.name(locatorstr);
		else if(locatorBy.equalsIgnoreCase("xpath"))
		   return By.xpath(locatorstr);
		
		return null;
	}
	

}
