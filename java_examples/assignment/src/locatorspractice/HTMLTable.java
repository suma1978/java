package locatorspractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTMLTable {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "/Users/nbommu/Documents/jarfiles/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://toolsqa.com/automation-practice-table/");
		driver.manage().window().maximize();	
		String sRow="1";
		String sCol="2";
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr[" + sRow + "]/td[" + sCol + "]"));
		String sValue=ele.getText();
		System.out.println(sValue);
		String sRowvalue="Clock Tower Hotel";
		for(int i=1;i<=5;i++)
		{
		 String sRecrowval= driver.findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr[" + i + "]/th")).getText();
          if(sRecrowval.equalsIgnoreCase(sRowvalue))
          {
        	  for(int j=1;j<=6;j++)
        	  {
        		  String sColumnvalue=driver.findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr[" + i + "]/td[" + j + "]")).getText();
                  System.out.println("ColumnValue" + sColumnvalue);       	  
        	  }
        	  break;
          }
		}
		//WebElement link=driver.findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr[1]/td[6]/a"));
		//link.click();
			
	     driver.quit();
	
	}
	

}
