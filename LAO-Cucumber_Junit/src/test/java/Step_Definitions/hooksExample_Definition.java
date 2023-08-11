package Step_Definitions;

import io.cucumber.java.en.*;

public class hooksExample_Definition {
	
	
	@Given("thanos has infinity stones")
	public void thanos_has_infinity_stones() {
		
		System.out.println(" Thanos has infinity stones ");
		  
	}
	@When("thanos snaps his finger")
	public void thanos_snaps_his_finger() {
		
		System.out.println(" Thanos snaps his finger ");
	   
	}
	@Then("half of living things dead")
	public void half_of_Living_things_dead() {
		
		System.out.println(" Thanos takes rest in garden ");
	    
	}

	

}
