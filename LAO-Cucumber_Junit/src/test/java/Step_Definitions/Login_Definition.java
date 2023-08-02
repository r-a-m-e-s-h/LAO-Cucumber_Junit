package Step_Definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Definition {
	
	
	WebDriver driver;
	
	@Given("enter user name")
	public void enter_user_name() throws InterruptedException {
	  
	   WebDriverManager.chromedriver().setup();
	   driver= new ChromeDriver();
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");  
	   System.out.println("User Name Entered");
	}

	@When("enter pwd")
	public void enter_pwd() throws InterruptedException {
	   	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		System.out.println("Password Entered");
	    
	}

	@Then("click loginBtn")
	public void click_login_btn() throws InterruptedException {
	   
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		System.out.println("login btn clicked");
	    driver.quit();
	}

}
