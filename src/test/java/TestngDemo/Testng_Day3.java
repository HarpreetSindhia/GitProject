package TestngDemo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Testng_Day3 {

	@Test
	public void carLoan() {
		
		System.out.println("Collections frequency is a method to caclulate the occurances of a specified element in collection");
	}
	
	@Test(groups= {"REGRESSION"})
	public void loginAPI() {
		
		System.out.println("Learn Rest Assured for API Testing");
	}
	
	@Test(groups= {"SMOKE"})
	public void learnBDD() {
		
		System.out.println("Cucumber supports BDD");
	}
	
	@AfterTest
	public void closeDriver() {
		
		System.out.println("Quit the driver to close all associated windows");
	}
}
