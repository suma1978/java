package pages;


	
	import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
	

	public class LoginPage {
		WebDriver driver;
		By userName=By.name("uid");
		By password=By.name("password");
		By Titletext=By.className("barone");
		By Login=By.name("btnLogin");
	    By Reset=By.name("btnReset");
	    Alert alert;
	    
	    public LoginPage(WebDriver driver)
	    {
	    	
	    	this.driver=driver;
	    	
	}
	   //Set username in textbox
	    public void setUserName(String strusername)
	    {
	    	driver.findElement(userName).sendKeys(strusername);
	    }
	    //set password in password text box
	    public void setPassword(String strpwd)
	    {
	    	driver.findElement(password).sendKeys(strpwd);
	    	
	    }
	    //click on login button
	    public void ClickLogin()
	    {
	    	driver.findElement(Login).click();
	    	
	    }
	    
	    //get the title of the login page
	    public String returnTitle()
	    {
	    	return driver.findElement(Titletext).getText();
	    }
	    public void loginTogo(String strUserName,String strPassword)
	    {
	    	this.setUserName(strUserName);
	    	this.setPassword(strPassword);
	    	this.ClickLogin();
	    	try {
	    		this.handlealert();
	    	}
	    	catch(NoAlertPresentException e)
	    	{
	    		System.out.println("No alert present");
	    	}
	    }
	    public void handlealert()
	    {
	    	alert=driver.switchTo().alert();
	    	alert.accept();
	    }


}
