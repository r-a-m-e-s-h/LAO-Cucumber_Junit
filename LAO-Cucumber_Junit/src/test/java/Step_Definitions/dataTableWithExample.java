package Step_Definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class dataTableWithExample {
	
	WebDriver driver;
	
	
	
	@Given("hit the url")
	public void hit_the_url() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
	  
	}
	@When("^give the cred (.*) and (.*)$")
	public void give_the_cred_admin_and_admin123(String username, String password) throws InterruptedException {
		
		
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username); 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		Thread.sleep(1000);
	   
	}
	@Then("hit the lg-bt")
	public void hit_the_lg_bt() {
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	   
	}


}
