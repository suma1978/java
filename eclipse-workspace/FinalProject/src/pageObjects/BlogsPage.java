package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class BlogsPage extends BaseClass {
	public static WebElement element;
	public BlogsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	public static WebElement Blog_button() {
		element = null;
       	try{
       		
       		element= driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[3]/a"));
       		Log.info("Blog button is found");
       		return element;
       		
       	}catch (Exception e){
       		Log.error("Blog button is not found");
       		
       		throw(e);
       		}
       	
        }
	
	
	
	public static WebElement search_blog() {
		element = null;
       	try{
       		element= driver.findElement(By.xpath("//input[@placeholder=\"Search edureka blogs\"]"));
       		Log.info("Search button is found");
       	}catch (Exception e){
       		Log.error("Search button is not found");
       		
       		throw(e);
       		}
       	return element;
        }

}
