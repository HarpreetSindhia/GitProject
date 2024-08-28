package TestngDemo;

import org.testng.annotations.Test;

public class PS2 {
	
	int a;
	
	public PS2(int a) {
		
		this .a = a;
	}
	
	@Test
	public int increment() {
		
		a = a + 1;
		
		return a;
	}
}
