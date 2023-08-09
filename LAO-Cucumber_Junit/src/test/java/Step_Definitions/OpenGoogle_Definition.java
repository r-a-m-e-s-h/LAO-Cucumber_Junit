package Step_Definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenGoogle_Definition {
	
	WebDriver driver;
	
	@Given("user entering google.co.in")
	public void user_entering_google_co_in() {
		
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   driver.get("http://www.google.co.in");
		
	}

	@When("user type search term {string}")
	public void user_type_search_term(String txt) {
		
		driver.findElement(By.name("q")).sendKeys("HelloWorld");   
	}

	@And("user clicks on enter key")
	public void user_clicks_on_enter_key() {
		
		driver.findElement(By.name("q")).sendKeys("HelloWorld"+Keys.ENTER);
		
	}

	@Then("check for the page Title")
	public void check_for_the_page_title() {
		
		String tt = driver.getTitle();
		System.out.println("The Page title is :"+ tt);
		driver.quit();
	   
	}




}
