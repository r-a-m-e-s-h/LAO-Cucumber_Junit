package Step_Definitions;

import io.cucumber.java.en.*;

public class RegularExpression_Definition {

	

	/*
	 *  (\\d+) 
	 * 
	 *  # (\\d+\\.\\d+)
	 *  
	 *  # \"(.*?)\"
	 * 
	 */
	
	@Given("hi")
	public void hi()
	{
		System.out.println("Helllllllllllllllllo");
	}
	
	@Given("^ I have (\\d+) laptop $")
	public void I_have_1_laptop(int count)
	{
		System.out.println(" hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh ");
		System.out.println(" i have only  " + count + "laptop");
	}

	@Given("^ I have  (\\d+\\d+\\d+\\d+\\d+) 50000 rupees $")
	public void I_have_50000_rupees(double amt) 
	{
		System.out.println(" I have only " + amt + "rupees");
	}


	@Given("^ I have (\\d+\\.\\d+) rupees $") 
	public void I_have_rupees(float rupees) 
	{
		System.out.println(" The decimal amt is :" +rupees);		 

	}

	@Given("^ I have   (\\d+\\,\\d+\\d+\\,\\d+\\d+\\d+)    lakh rupees $")
	public void I_have_Lak_rupees(double amt)
	{
		System.out.println(" I have : "+amt+" lakh rupees");
	}

	@Given("^ I have 2 name \"(.*?)\" , \"(.*?)\"   $")
	public void I_have_2_names(String nam1, String nam2) {
		System.out.println("The names are :\n" + nam1 + nam2);
	}
	
	
	/*@Given("I have {int}laptop}")
	public void i_have_laptop(Integer amt1)
	{
		System.out.println(" i have only  " + amt1 + "laptop");
	}*/
	
	

}
