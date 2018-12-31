package locatorspractice;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class iFramepractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/nbommu/Documents/jarfiles/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://toolsqa.wpengine.com/iframe-practice-page/");
		driver.manage().window().maximize();
		//Get total iFrame count using Javascript
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		Integer noofframes=Integer.parseInt(jse.executeScript("return window.length").toString());
		System.out.println("Tot no of frames is :" + noofframes);
		//by finding all tframeelementshe elements using iFrame tag
		List<WebElement> iFrameelements=driver.findElements(By.tagName("iframe"));
		
		System.out.println("IFrames SIze is : "+ iFrameelements.size());
        for(int i=0;i<iFrameelements.size();i++)
        {
        	System.out.println(iFrameelements.get(i).getTagName());
        	driver.switchTo().frame(i);
        	driver.switchTo().defaultContent();
        }
        driver.switchTo().defaultContent();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.switchTo().frame(0);
        WebElement firstName=driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]/div/form/fieldset/div[8]/input"));
        WebElement lastname=driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]/div/form/fieldset/div[11]/input"));
        firstName.sendKeys("suma");
        lastname.sendKeys("latha");
        
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        driver.switchTo().frame(0);//it gives no suchframe exception.
        
        WebElement imagElement=driver.findElement(By.xpath("//*[@id=\"site_navigation\"]/div/div[1]/a/img"));
        imagElement.click();
        System.out.println("switching successfull");
        
        driver.quit();
	}

}
