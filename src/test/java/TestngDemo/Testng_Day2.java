package TestngDemo;

import org.testng.annotations.Test;

public class Testng_Day2 {

	@Test(groups= {"SMOKE"})
	public void demo3() {
		
		System.out.println("Open Connection method to open the connection to specified URL");
		
	}
	
	@Test(groups= {"REGRESSION"})
	public void demo6() {
		
		System.out.println("Streams is a collection of strings");
	}
}
