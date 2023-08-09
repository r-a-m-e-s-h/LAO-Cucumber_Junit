package Step_Definitions;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class simpleDataTableExample {
	
	WebDriver driver;
	
	
	@Given("enter the url")
	public void enter_the_url() throws InterruptedException {
		
		 WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
		   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		   Thread.sleep(1000);
		   
	}
	@When("^enter the valid creds (.*) and (.*)$")
	public void enter_the_valid_creds_admin_and_admin123(String uname , String pwd) throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname); 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		Thread.sleep(1000);
	   
	}
	@Then("click btn")
	public void click_btn() {
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	   
	}
	
	
	

}
