package TestngDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataPrividerandParameterisation {

	@Test(dataProvider="getData1")
	public void getData(String userName , String password) {
		
		System.out.println("Details for logging to the website are below:- ");
		
		System.out.println(userName);
		System.out.println(password);
	}
	
	
	@Test
	public void getDetails() {
		
		System.out.println("User must register or sigup as Guest user");
	}
	
	@Test
	public void siteURL() {
		
		System.out.println();
		
	}
	
	
	@DataProvider
	public Object[][] getData1() {
		
		Object[][] data = new Object[3][2];
		data[0][0] ="Harpreet Sindhia";
		data[0][1] ="Harry123";
		
		data[1][0] ="Harry Sindhia";
		data[1][1] ="Preet456";
		
		data[2][0] ="Happy Sindhia";
		data[2][1] ="Happy789";
		
		return data;
	}
}
