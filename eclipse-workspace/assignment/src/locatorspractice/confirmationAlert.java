package locatorspractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;


public class confirmationAlert {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/nbommu/Documents/jarfiles/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://toolsqa.wpengine.com/handling-alerts-using-selenium-webdriver/");
		driver.manage().window().maximize();
		//This stpe will result in an alert on screen
		WebElement element = driver.findElement(By.xpath("//*[@id='content']/p[8]/button"));
		((JavascriptExecutor)driver).executeScript("arguments[0].click()", element);
		Alert confirmationalert=driver.switchTo().alert();
		String alertText=confirmationalert.getText();
		System.out.println("Alert text is:" + alertText);
		Thread.sleep(3000);
		confirmationalert.dismiss();
		WebElement element1 = driver.findElement(By.xpath("//*[@id='content']/p[11]/button"));
		((JavascriptExecutor)driver).executeScript("arguments[0].click()", element1);
		Alert promptalert=driver.switchTo().alert();
		String promptText=promptalert.getText();
		System.out.println("Prompt Alert text is:" + promptText);
		promptalert.sendKeys("Hello");
		promptalert.sendKeys("hello");
		Thread.sleep(3000);
		promptalert.accept();
		
		Set<String> handle=driver.getWindowHandles();
		
		driver.quit();
		
		

	}

}
