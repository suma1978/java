package locatorspractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/nbommu/Documents/jarfiles/chromedriver");
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://www.facebook.com");
		String currentURL=driver1.getCurrentUrl();
		System.out.println("CurrentURL is :" + currentURL);
		String pageSource=driver1.getPageSource();
        //System.out.println("PageSource is : " + pageSource);
        String title=driver1.getTitle();
        System.out.println("title is :"+ title);
        
        driver1.findElement(By.tagName("select")).sendKeys("OCT");
        driver1.findElement(By.cssSelector("select[aria-label=\"Day\"][id=\"day\"][title=\"Day\"]")).sendKeys("25");
       
        driver1.findElement(By.id("year")).sendKeys("1996");
       List<WebElement> oRadioButton=driver1.findElements(By.name("sex"));
       System.out.println("Radio button Size is :" + oRadioButton.size());
       boolean bvalue=oRadioButton.get(0).isSelected();
       System.out.println("Slected Value is: " + bvalue);
       
       oRadioButton.get(0).click();
       oRadioButton.get(1).click();
        // driver1.close(); //Closes the  website
        //driver1.quit(); //closes the session
        
        
	}

}
