package TestngDemo;

import org.testng.annotations.Test;

public class StartP {

	int a;
	
	public StartP(int a) {
		
		this.a = a;
	}
	
	@Test
	public int showData4() {
		
		a = a * 5;
		
		return a;
	}
}
