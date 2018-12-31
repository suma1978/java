package PageFactory;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailLoginPage {
	
	
	WebDriver driver;
	/*
	 * All webelements are identified  by @FindBy annotation
	 */
	@FindBy(id="identifierId")
	WebElement userEmailID;

	@FindBy(name="password")
	WebElement password;

	@FindBy(xpath="//*[@id=\"identifierNext\"]/content/span")
	WebElement nextBtn;
	
	@FindBy(id="passwordNext")
	WebElement pwdnextBtn;
	
	
	
	public GmailLoginPage(WebDriver driver)
	{
		this.driver=driver;
		//This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
		
	}
	public void setUsername(String username)
	{
		userEmailID.sendKeys(username);
	}

	//set password in text box
	public void password(String pwd)
	{
		password.sendKeys(pwd);
		
	}

	//click Next Button
	public void btnClick()
	{
		nextBtn.click();
	}
	public void pwdBtnClk()
	{
		pwdnextBtn.click();
	}
	public void logintoAccount(String userID,String pwd)
	{
		this.setUsername(userID);
		this.btnClick();
		WebDriverWait wait=new WebDriverWait(driver, 10) ;
		if(wait.until(ExpectedConditions.visibilityOf(password)).isDisplayed()==true)
		{
			this.password(pwd);
			pwdBtnClk();
		}
		
		
	}

}
