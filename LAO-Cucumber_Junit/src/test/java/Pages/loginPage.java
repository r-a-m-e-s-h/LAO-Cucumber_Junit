package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	WebDriver driver;
	
	public loginPage(WebDriver rdriver) 
	{
		driver = rdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='username']")
	WebElement uname;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement pwd;
	
	@FindBy(xpath="//button[text()=' Login ']")
	WebElement loginBtn;
	
	public void EnterUserName(String name)
	{
		uname.sendKeys(name);
	}
	public void EnterPassWord(String password)
	{
		pwd.sendKeys(password);
	}
	public void ClickLoginBtn()
	{
		loginBtn.click();
	}
	

}
