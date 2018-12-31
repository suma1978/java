package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//WebDriver driver=new ChromeDriver();
WebDriver driver1=new FirefoxDriver();
driver1.get("Https://www.edureka.co/");
//driver.manage().window().maximize();
driver1.findElement(By.name("user_v1[query]")).sendKeys("Search for a course");
//driver1.findElement(By.className("ga-allcourses")).click();
//driver1.findElement(By.cssSelector("input[type=\"search\"][autocomplete=\"off\"]")).sendKeys("Using CSS Selector");
//driver1.findElement(By.xpath("/html/body/div[2]/header/section/nav/div/div[3]/ul/li[3]/a")).click();

	}

}
