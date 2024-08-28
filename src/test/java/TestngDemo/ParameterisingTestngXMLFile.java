package TestngDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterisingTestngXMLFile {

	@Parameters({"UserName","Password"})
	@Test
	public void getDetails(String name , String password) {
		
		System.out.println(name);
		System.out.println(password);
	}
	
	@Parameters({"Password"})
	@Test
	public void getEncryptedData(String password) {
		
		System.out.println(password);
		
	}
	
	
	
}
