package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailHomePage {

WebDriver driver;
//@FindBy(id=":ko")
@FindBy(xpath="//div[@class='T-I J-J5-Ji T-I-KE L3']")
WebElement btncompose;

@FindBy(xpath="//*[@id=\":17z\"]/h2/div[2]")
WebElement newheader;


@FindBy(name="to")
WebElement To;
@FindBy(name="subjectbox")
WebElement subjbox;

//@FindBy(xpath="/html[1]/body[1]/div[26]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[2]")
//WebElement sendbtn1;
@FindBy(xpath="//div[@class='T-I J-J5-Ji aoO T-I-atl L3']")
WebElement sendbtn;
@FindBy(xpath="//span[@class='gb_9a gbii']")
WebElement myacc;
@FindBy(linkText="Sign out")
WebElement signout;

public GmailHomePage(WebDriver driver)
{
this.driver=driver;
PageFactory.initElements(driver, this);

}
public void sendTo(String mailid)
{
	To.sendKeys(mailid);
}
public void subject(String sub)
{
	subjbox.sendKeys(sub);
}
public void sendmail()
{
	sendbtn.click();
	
}
public void myaccclk()
{
	myacc.click();
}
public void signout()
{
	signout.click();
}
public void clickcompose(String mailTo,String subject) throws Exception
{
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.elementToBeClickable(btncompose)).click();
   //String textVal= wait.until(ExpectedConditions.visibilityOf(newheader)).getText();
   //System.out.print(textVal);
	if(wait.until(ExpectedConditions.visibilityOf(To)).isDisplayed()==true)
	{
		sendTo(mailTo);
		subject(subject);
		sendmail();
		Thread.sleep(3000);
		myaccclk();
		signout();

	}
}

//Set user EmailId in text box

}
