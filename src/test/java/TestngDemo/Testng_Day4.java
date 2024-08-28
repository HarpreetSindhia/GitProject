package TestngDemo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testng_Day4 {
	
	@BeforeTest
	public void initializeDriver() {
		
		System.out.println("Initialize the driver before executing any test case");
	}
	
	@AfterTest(groups= {"REGRESSION"})
	public void closeDriver() {
		
		System.out.println("The scope of both @BeforeTest and @AfterTest is limited to test folder");
	}

	@Parameters({"UserName"})
	@Test
	public void RestAPIPrinciples(String name) {
		
		System.out.println("Rest API is purely based on Java");
		System.out.println(name);
	}
	
	@Test(groups= {"SMOKE"})
	public void RestAPIFundamentals() {
		
		System.out.println("Concepts are important to implement the logic learnt");
	}
	
	@Test
	public void RestAPILogic() {
		
		System.out.println("You should be thorough with your logics");
	}
}
