package locatorspractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragDropDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/nbommu/Documents/jarfiles/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get("http://www.seleniumeasy.com/test/drag-and-drop-demo.html");
		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		driver.manage().window().maximize();
		//WebElement from=driver.findElement(By.xpath("//*[@id=\"todrag\"]/span[1]"));
		//WebElement to=driver.findElement(By.xpath("//*[@id=\"mydropzone\"]"));
		WebElement from=driver.findElement(By.xpath("//*[@id=\"treebox1\"]/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[4]/td[2]/table/tbody/tr/td[4]/span"));
		WebElement to=driver.findElement(By.xpath("//*[@id=\"treebox2\"]/div/table/tbody/tr[2]/td[2]/table/tbody/tr[6]/td[2]/table/tbody/tr[1]/td[4]/span"));
				
		Actions builder=new Actions(driver);
		Action DragandDrop=builder.clickAndHold(from)
				
				.moveToElement(to)
				.release(to)
				.build();
		Thread.sleep(4000);
		DragandDrop.perform();
				
		Thread.sleep(4000);
		driver.close();

	}

}
