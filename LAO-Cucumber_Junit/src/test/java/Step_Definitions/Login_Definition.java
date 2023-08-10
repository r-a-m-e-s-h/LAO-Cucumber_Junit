package Step_Definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.loginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Definition {
	
	
	WebDriver driver;
	loginPage lp = new loginPage(driver);
	
	@Given("^enter user name (.*)$")
	public void enter_user_name(String uname) throws InterruptedException {
	  
	   WebDriverManager.chromedriver().setup();
	   driver= new ChromeDriver();
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	   Thread.sleep(1000);
	  // driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	   lp.EnterUserName(uname);
	   
	   System.out.println("User Name Entered");
	}

	@When("^enter pwd (.*)$")
	public void enter_pwd(String pwd) throws InterruptedException {
	   	
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		lp.EnterPassWord(pwd);
		System.out.println("Password Entered");
	    
	}

	@Then("click loginBtn")
	public void click_login_btn() throws InterruptedException {
	   
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		lp.ClickLoginBtn();
		System.out.println("login btn clicked");
	   // driver.quit();
	}

}
