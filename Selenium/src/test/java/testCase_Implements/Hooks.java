package testCase_Implements;


import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks extends Base_Config  {
	@Before
	public void launch_browser() {
		System.out.println("Function initiated");
		
		
	}
    
	
	@After
	public void close_Window()
	{
		close_Browser();
		System.out.println("Completed");
	}
}