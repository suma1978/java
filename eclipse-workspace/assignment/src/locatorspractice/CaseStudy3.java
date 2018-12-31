package locatorspractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CaseStudy3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/nbommu/Documents/jarfiles/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.goindigo.in/?linkNav=home_header");
		driver.manage().window().maximize();
		WebElement link=driver.findElement(By.linkText("One Way"));
		link.click();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//Thread.sleep(2000);
	//driver.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[3]/button")).click();
	
		//Add Explicit Wait to appear the Button Ok
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement btnele =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"globalModal\"]/div/div/div[3]/button")));
		btnele.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Alert is accepted");
		driver.findElement(By.xpath("//*[@id=\"oneWay\"]/form/div[1]/ul/li[1]/input[1]")).sendKeys("Bengaluru");
		
		driver.findElement(By.xpath("//*[@id=\"oneWay\"]/form/div[1]/ul/li[2]/input[1]")).sendKeys("Lucknow");
		driver.findElement(By.xpath("//*[@id=\"oneWay\"]/form/div[1]/ul/li[3]/input")).click();
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"oneWay\"]/form/div[1]/ul/li[3]/div/div[1]/label[2]/select"));
		Select oselect=new Select(ele);
		oselect.selectByVisibleText("3");
		WebElement ele1=driver.findElement(By.xpath("//*[@id=\"oneWay\"]/form/div[1]/ul/li[3]/div/div[2]/label[2]/select"));
		Select oselect1=new Select(ele1);
		oselect1.selectByIndex(2);
		//*[@id="oneWay"]/form/div[2]/button
		WebElement btnclk=driver.findElement(By.xpath("//*[@id=\"oneWay\"]/form/div[2]/button"));
		btnclk.click();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		//Thread.sleep(3000);
		
		List<WebElement> listFlightdet=driver.findElements(By.className("inddetails-wrapper-list"));
		WebElement btncontinue=driver.findElement(By.id("continue-button"));
		Wait wait1=new FluentWait(driver)	
    			.withTimeout(30,TimeUnit.SECONDS)
    			.pollingEvery(5,TimeUnit.SECONDS)
    	         .ignoring(NoSuchElementException.class);
		
		System.out.println("TOtal list Size is :" +listFlightdet.size());
		
		btncontinue.click();
		
		
		driver.close();
		
			

	}

}
