package Step_Definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_TC {
	
	WebDriver driver;
	loginPage lp = new loginPage(driver);
	
	
	
	@Given("launch the browser")
	public void launch_the_browser() {
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	@When("^enter user name (.*)$")
	//@When("enter user name")
	public void enter_user_name(String username) throws InterruptedException {
		lp = new loginPage(driver);
//	   WebDriverManager.chromedriver().setup();
//	   driver= new ChromeDriver();
//	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	   Thread.sleep(1000);
	  // driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	   
	   lp.EnterUserName(username);
	   
	   System.out.println("User Name Entered");
	}

	@And("^enter pwd (.*)$")
	public void enter_pwd(String Pwd) throws InterruptedException {
	   	
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		lp.EnterPassWord(Pwd);
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
