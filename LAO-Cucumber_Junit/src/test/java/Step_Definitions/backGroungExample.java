package Step_Definitions;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import io.cucumber.java.en.*;

public class backGroungExample {
	
	@Given("student completed high-school education")
	public void student_completed_high_school_education() {
	 System.out.println("student completed high-school education");  
	}

	@Given("student completed Higher secondary education")
	public void student_completed_higher_secondary_education() {
	   System.out.println("student completed Higher secondary education");
	    
	}

	@Given("student appliad for medical course")
	public void student_appliad_for_medical_course() {
	   System.out.println("student appliad for medical course");
	}

	@When("student cleared the enterance exam")
	public void student_cleared_the_enterance_exam() {
	    System.out.println("student cleared the enterance exam");
	}

	@Then("student is eligible for entering medical college")
	public void student_is_eligible_for_entering_medical_college() {
	   System.out.println("student is eligible for entering medical college");
	}

	@Given("student applied for engineering")
	public void student_applied_for_engineering() {
	   System.out.println("student applied for engineering");
	}

	@When("student has the  cutoff mark")
	public void student_has_the_cutoff_mark() {
	   System.out.println("student has the  cutoff mark");
	}

	@Then("student is eligible for entering engineering college")
	public void student_is_eligible_for_entering_engineering_college() {
	   System.out.println("student is eligible for entering engineering college");
	}

}
