package utilities;

import org.openqa.selenium.By;

public class locatorsplit {
	
	public static By loc_Split(String locatorValue)
	{
		String loc_type=locatorValue.split(":")[0];
		String loc_value=locatorValue.split(":")[1];
		switch(loc_type.toUpperCase())
		{
		case ("ID"):
		
		 return By.id(loc_value);
		 case("XPATH"):
			return By.xpath(loc_value);
		case ("CLASS"):
			return By.className(loc_value);
		case ("CSSSELECTOR"):
			return By.cssSelector(loc_value);
		case ("NAME"):
			return By.name(loc_value);
		case ("LINKTEXT"):
			return By.linkText(loc_value);
		case("PARTIALLINKTEXT"):
			return By.partialLinkText(loc_value);
		
		}
		return null;
	}

}
