package locatorspractice;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.agent.builder.AgentBuilder.Listener.WithTransformationsOnly;

public class CaseStudy2 {
	public static WebDriver driver;

	public static WebDriver launchDriver(String browser)
	{
		
	  if(browser.equalsIgnoreCase("chrome"))
	  { 
		  
		 System.setProperty("webdriver.chrome.driver", "/Users/nbommu/Documents/jarfiles/chromedriver");
		  driver=new ChromeDriver();
	  }
	  else if(browser.equalsIgnoreCase("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver", "/Users/nbommu/Documents/jarfiles/geckodriver");
		   driver=new FirefoxDriver();
	  }
	  else
	  {
		  System.out.println("Invalid Browser name");
	  }
	  return driver;
		
	}
	public static void hello()
	{
		System.out.println("hello world");
	}
	
	public static <T> void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		
           launchDriver("chrome");
           driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
           driver.get("https://www.edureka.co");
           driver.manage().window().maximize();
           Thread.sleep(3000);
           driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
           
           
           
           driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
         ((JavascriptExecutor) driver).executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 500);");
         //((JavascriptExecutor) driver).executeAsyncScript("scroll(0,500)");
         // ((JavascriptExecutor) driver).executeScript("alert('hello world');");
         
         //Search bar
         driver.findElement(By.id("homeSearchBar")).sendKeys("Selenium");
         Thread.sleep(2000);
         driver.findElement(By.id("homeSearchBarIcon")).click();
         
         //Add Explicit wait
         WebDriverWait wait=new WebDriverWait(driver, 20);
         WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Selenium Certification Training")));
         driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
        String pageTitle= driver.getTitle();
        System.out.println("PageTitle is :"+pageTitle);
        if(pageTitle.equalsIgnoreCase("Selenium 3.0 WebDriver Online Training"))
        {
        	System.out.println("True");
        }
        else
        {
        	System.out.println("False");
        }
        
         driver.navigate().back();
         driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
         driver.findElement(By.xpath("//*[@id=\"dLabel\"]")).click();
        //Add Fluent wait script to load
         //Wait<WebDriver> Waitf=new FluentWait<WebDriver>(driver)	 
        	Wait wait1=new FluentWait(driver)	
        			.withTimeout(30,TimeUnit.SECONDS)
        			.pollingEvery(5,TimeUnit.SECONDS)
        	         .ignoring(NoSuchElementException.class);
         
         driver.quit();
	}

}
