import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import com.gargoylesoftware.htmlunit.BrowserVersion;

import junit.framework.Assert;


public class Headlessbrowser {

	static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		//launchheadless();
		// TODO Auto-generated method stub
		try {
		 driver=new HtmlUnitDriver();
		driver.get("http://www.google.com");
		 WebElement element=driver.findElement(By.name("q"));
	        element.sendKeys("edureka");
	        element.submit();
	        String title=driver.getTitle();

	        System.out.println(title);
	        
	        										
			
	        }
	
    catch (Exception e)
    {
    	System.out.println(e.getMessage());
    	TakesScreenshot screenshot=(TakesScreenshot)driver;
		File src=screenshot.getScreenshotAs(OutputType.FILE);
		System.out.println(System.getProperty("user.dir"));
		FileUtils.copyFile(src,new File (System.getProperty("user.dir") +"/screenshot.png")); 
    	
    }
			driver.quit();;
		
		
System.out.println("Domain name is " + driver.getTitle());
	}

	public static void launchheadless() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "/Users/nbommu/Documents/jarfiles/chromedriver");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
       // driver.get("http://phantomjs.org");
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        WebElement element=driver.findElement(By.name("q"));
        element.sendKeys("edureka");
        
        element.submit();
       
        
        
        String title=driver.getTitle();
        Assert.assertEquals("edureka!", title);
        TakesScreenshot screenshot=(TakesScreenshot)driver;
		File src=screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File (System.getProperty("user.dir") +"/screenshot.png"));
        
        driver.quit();
	
	}
}
