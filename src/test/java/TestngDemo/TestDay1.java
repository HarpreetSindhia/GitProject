package TestngDemo;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestDay1 {

	@Test
	public void getTest() {
		
		System.out.println("Hello World");
	}
	
	
	@Test
	public void getData1() {
		
		System.out.println("Hello Again");
	}
	
	@BeforeMethod
	public void getData2() {
		
		System.out.println("Welcome To Eden");
	}
}
