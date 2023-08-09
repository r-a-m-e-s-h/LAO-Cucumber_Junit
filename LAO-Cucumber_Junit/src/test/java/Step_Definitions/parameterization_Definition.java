package Step_Definitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class parameterization_Definition {
	
	WebDriver driver;
	
	
	
	
	@Given("User enters the login page")
	public void User_enters_the_login_page() throws InterruptedException {
		
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   Thread.sleep(1000);
	   
	}

	@When("^user enters the credentials (.*) and (.*)$")
	public void user_enters_the_credentials(String uname, String pwd) throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname); 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		Thread.sleep(1000);
	}

	@And("user clicks on the loginBtn")
	public void user_clicks_on_the_login_btn() {
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	}

	@Then("user redirects to login page")
	public void user_redirects_to_login_page() {
	 
		//String text = driver.findElement(By.xpath("//*[text()='Paul Collings']")).getText();
		
		//System.out.println("The text is  : "+text);
		
		
		
		//Assert.assertTrue(" User Name is Displayed ", true);
		driver.quit();
	}


}
