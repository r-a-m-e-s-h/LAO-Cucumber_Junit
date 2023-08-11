package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class taggedHooksExample {
	
	
	@Before
	public void BeforeScenario()
	{
		System.out.println("This is 1st Before hook ");
	}
	
	@After
	public void AfterScenario()
	{
		System.out.println("This is last after hook ");
	}
	
	@Before("@First")
	public void BeforeFirst()
	{
		System.out.println("This is 2nd before hook ");
	}
	
	@Before("@Second")
	public void BeforeSecond()
	{
		System.out.println("This is 3rd before hook");
	}
	
	@Before("@Third")
	public void BeforeThird()
	{
		System.out.println("This is 4th before hook");
	}
	
	@After("@First")
	public void AfterFirst()
	{
		System.out.println("This is 2nd after hook");
	}
	
	@After("@Second")
	public void AfterSecond()
	{
		System.out.println("This is 3rd after hook");
	}
	
	@After("@Third")
	public void AfterThird()
	{
		System.out.println("This is 4th after hook");
	}
}
