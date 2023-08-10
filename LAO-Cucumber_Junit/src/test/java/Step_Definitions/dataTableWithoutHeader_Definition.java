package Step_Definitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class dataTableWithoutHeader_Definition {

	WebDriver driver;

	@Given("You enter the loginPage URL")
	public void you_enter_the_login_page_url() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);

	}
	@Then("^You gives the below Creds$")
	public void you_gives_the_below_creds(DataTable dataTable) throws Throwable
	{

		//List<String> creds = dataTable.asList(String.class);
		/*
		 * String uname = creds.get(0); String pwd = creds.get(1);
		 */

		List<List<String>> creds = dataTable.asLists(String.class);

		for (List<String> list : creds) {

			String uname = list.get(0);
			String pwd = list.get(1);

			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname); 
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
			Thread.sleep(1000);
		}

	}
	@Then("You clicks sign-in btn")
	public void you_clicks_sign_in_btn()
	{
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

	}
	@Then("You enters the home page")
	public void you_enters_the_home_page() 
	{/*
	 * if(driver.findElement(By.xpath("//*[text()='Paul Collings']")).isDisplayed())
	 * { System.out.println("logged in user name is displayed "); }
	 * 
	 * else { System.out.println("Not displayed"); }
	 */
		System.out.println("The Page title is : "+driver.getTitle());

	}














}
