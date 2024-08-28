package TestngDemo;

import org.testng.annotations.Test;

public class BumbleBee {
	
	int a;
	
	public BumbleBee(int i) {
		
		this.a = i;
	}
	
	@Test
	public int getBumbleBeeData() {
		
		
		
		a = a - 1;
		
		return a;
		
	}

}
