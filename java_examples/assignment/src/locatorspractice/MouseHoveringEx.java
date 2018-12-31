package locatorspractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoveringEx {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/nbommu/Documents/jarfiles/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.xpath("//*[@id=\"nav-flyout-shopAll\"]/div[1]/div"));
		Actions action=new Actions(driver);
		//action.moveToElement(element).build().perform();
		action.moveToElement(element).perform();
		WebElement subelement=driver.findElement(By.xpath("//*[@id=\"nav-flyout-shopAll\"]/div[2]/span[6]/span"));
		action.moveToElement(subelement);
		action.click();
		action.perform();
		Thread.sleep(3000);
		driver.close();

	}

}
