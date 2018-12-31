package locatorspractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertsfullex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/nbommu/Documents/jarfiles/chromedriver");
	
	   WebDriver driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.get("http://toolsqa.wpengine.com/handling-alerts-using-selenium-webdriver/");
	   driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	   
	   driver.findElement(By.xpath("//*[@id=\"content\"]/p[4]/button")).click();
	   //Once alert is present try to click on any other element in the site
	  // driver.findElement(By.xpath("//*[@id=\"content\"]/p[8]/button")).click();
	   Alert alert=driver.switchTo().alert();
	   String alertText=alert.getText();
	   System.out.println("Alert text is:" + alert);
	   alert.accept();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.quit();
	   	
	}

}
