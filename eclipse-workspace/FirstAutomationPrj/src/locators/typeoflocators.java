package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class typeoflocators {
	
	public static void main(String[] args) throws Exception
	{
	//System.setProperty("webdriver.chrome.driver", "/Users/nbommu/Documents/jarfiles/chromedriver");
	WebDriver driver=new ChromeDriver();
	//System.setProperty("webdriver.gecko.driver", "/Users/nbommu/Documents/jarfiles/geckodriver");
	//WebDriver driver=new FirefoxDriver();	
		//=======working with name locator====//
		driver.get("https://www.facebook.com");
		//driver.findElement(By.name("firstname")).sendKeys("testUser");
		//driver.findElement(By.name("lastname")).sendKeys("lasttext");
		//====Working with ID=======//
		//driver.findElement(By.id("u_0_h")).sendKeys("test@test.com");
		//driver.findElement(By.id("u_0_k")).sendKeys("test@test.com");
		
		//======Working with linkText======//
		//driver.findElement(By.linkText("Forgot account?")).click();
		//======PartialLinkText======if 2 links with same test first one will be executed
		//driver.findElement(By.partialLinkText("Why do I need to")).click();
		//Working with CSS selectors
		//driver.findElement(By.cssSelector("input[type=\"password\"][aria-label=\"New password\"]")).sendKeys("1234567");;
		//Working with XPath
	//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Suma");
	//Working with Relative XPath
	driver.findElement(By.xpath("//input[@id='u_0_c']")).sendKeys("TestTest");	
	//driver.findElement(By.xpath("//div[@id-'u_0_b']/div/input")).sendKeys("TestTest");

	String pageTitle=driver.getTitle();
	System.out.println("PageTitle: " + pageTitle);
	String pageURL=driver.getCurrentUrl();
	System.out.println(pageURL);
	
	String browsersessionId=driver.getWindowHandle();
	System.out .println(browsersessionId);
	driver.findElement(By.linkText("Forgot account?")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	Thread.sleep(3000);
	driver.findElement(By.id("identify_email")).sendKeys("123456789");
	
		driver.quit();	
	

	
	}
	

}
