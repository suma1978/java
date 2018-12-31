package locatorspractice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindowsPrctice {

	public static void main(String[] args) throws Exception {
		practice2();
		
		System.setProperty("webdriver.chrome.driver", "/Users/nbommu/Documents/jarfiles/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
		driver.manage().window().maximize();// TODO Auto-generated method stub
        String handle=driver.getWindowHandle();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"content\"]/p[3]/button")).click();
        Set handles=driver.getWindowHandles();
        System.out.println(handles);
        for(String handle1:driver.getWindowHandles())
        {
        	System.out.println(handle1);
        	driver.switchTo().window(handle1);
        	Thread.sleep(3000);
        	
        }
        driver.close();
        driver.quit();
        
	}
	public static void practice2()
	{
		
		System.setProperty("webdriver.chrome.driver", "/Users/nbommu/Documents/jarfiles/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
		driver.manage().window().maximize();// 
		driver.findElement(By.id("alert")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		driver.close();
	}

}
