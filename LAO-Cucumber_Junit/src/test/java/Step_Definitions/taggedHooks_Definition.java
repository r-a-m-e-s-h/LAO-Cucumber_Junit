package Step_Definitions;

import io.cucumber.java.en.*;

public class taggedHooks_Definition {
	
	
	@Given("It is the First Step")
	public void it_is_the_first_step() {
	   System.out.println(" This is 1st Step ");
	}
	@When("It is the Second step")
	public void it_is_the_second_step() {
		  System.out.println(" This is 2nd Step ");
	}
	@And("It is the Third step")
	public void it_is_the_third_step() {
		  System.out.println(" This is 3rd Step ");
	}
	@Then("It is the Fourth Step")
	public void it_is_the_fourth_step() {
		  System.out.println(" This is 4th Step ");
	}
	

}
