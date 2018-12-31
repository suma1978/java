package locatorspractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;



public class dropandmultiselsct {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub



		System.setProperty("webdriver.chrome.driver", "/Users/nbommu/Documents/jarfiles/chromedriver");

		
		WebDriver driver=new ChromeDriver();
	
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
driver.manage().window().maximize();
WebElement element=driver.findElement(By.id("continents"));
Select oselect=new Select(element);

oselect.selectByIndex(2);
Thread.sleep(2000);

oselect.selectByVisibleText("Europe");

Thread.sleep(2000);

List<WebElement> getoption=oselect.getOptions();
int size=getoption.size();
for(int i=0;i<size;i++)
{
	String sValue=getoption.get(i).getText();
	System.out.println("sValue is : " + sValue);
	if(sValue.equals("Africa"))
	{
		oselect.selectByVisibleText(sValue);
		//oselect.selectByIndex(i);
		break;
	}
}
Thread.sleep(2000);
Select oselect1=new Select (driver.findElement(By.name("selenium_commands")));
oselect1.selectByIndex(0);
Thread.sleep(2000);
oselect1.selectByVisibleText("Navigation Commands");

Thread.sleep(2000);
oselect1.deselectAll();
Thread.sleep(2000);

driver.quit();

	}

}
