package TestngDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterising {

	@Parameters({"URL"})
	@Test
	public void getData(String url) {
		
		System.out.println(url);
		
	}
}
