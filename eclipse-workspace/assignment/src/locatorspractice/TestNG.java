package locatorspractice;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class TestNG {
	public WebDriver driver;
  @Test
  public void main() {
	 driver.findElement(By.linkText("Sign Up")).click();
	 WebDriverWait wait=new WebDriverWait(driver, 20);
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signupname"))).sendKeys("suma");
	 driver.findElement(By.id("signupemail")).sendKeys("sumalathathota@gmail.com");
	 driver.findElement(By.id("signuptel")).sendKeys("1234567898");
	  
	 driver.findElement(By.id("pwd3")).sendKeys("123456787");
	 driver.findElement(By.xpath("//*[@id=\"signupForm\"]/div[6]/button")).click();
	 wait.until(ExpectedConditions.textToBePresentInElement(By.id("signup_error_message"), "Email address already exists. Please Sign In."));
	 
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "/Users/nbommu/Documents/jarfiles/chromedriver");
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://www.edureka.co");
	  
	  
	  
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
	  driver.quit();
  }

}
