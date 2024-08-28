package TestngDemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng_Day1 {
	
	@BeforeClass(groups= {"REGRESSION"})
	public void executeMe() {
		
		System.out.println("The scope is limited to class only");
	}
	
	@BeforeMethod
	public void deleteCookies() {
		
		System.out.println("Delete the caches and cookies");
	}
	
	@BeforeTest
	public void initializeDriver() {
		
		System.out.println("Invoke the chrome Driver");
	}
	
	@Test
	public void demo1() {
		
		System.out.println("Building framework using Testng");
	}
	
	@Test
	public void demo2() {
		
		System.out.println("Learning Cucumber  for BDD framework");
	}
	
	@AfterMethod
		
		public void success() {
		
		System.out.println("Test cases got executed successfully");
	}

}
