package locatorspractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertEx {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/nbommu/Documents/jarfiles/chromedriver");
		WebDriver driver1=new ChromeDriver();
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver1.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
		// TODO Auto-generated method stub
       JavascriptExecutor jse=(JavascriptExecutor)driver1;
       jse.executeScript("scroll(0,500)");
		driver1.findElement(By.id("timingAlert")).click();
		System.out.println("Timer Javascript Error is triggered but it is not yet opened");
		//Create New webdriver wait
		WebDriverWait wait=new WebDriverWait(driver1, 10);
		Alert myalert=wait.until(ExpectedConditions.alertIsPresent());
		System.out.println("Either pop up is displayed or System is timeout" );
		myalert.accept();
		System.out.println("Alert is accepted");
		//close the main window
		driver1.close();
		
		
				
		
		//String parentWindow=driver1.getWindowHandle();
		
	}

}
