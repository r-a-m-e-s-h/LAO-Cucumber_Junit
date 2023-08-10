package Step_Definitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class dataTableWithHeader {
	WebDriver driver;
	
	
	@Given("enter the link")
	public void enter_the_link() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
		   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  Thread.sleep(1000);
	    
	}
	@When("enter the inputs")
	public void enter_the_inputs(DataTable dataTable) throws InterruptedException {
		
	    List<Map<String,String>>   data = 	dataTable.asMaps(String.class, String.class);
	    
	    String uname  = data.get(0).get("UserName");
	    String pwd1 = data.get(0).get("Pwd");
		
		
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname); 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd1);
		Thread.sleep(1000);
	   
	}
	@When("click lg")
	public void click_lg() {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	}
	

}
