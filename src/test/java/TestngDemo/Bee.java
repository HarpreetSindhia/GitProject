package TestngDemo;

import org.testng.annotations.Test;

public class Bee {
	
	@Test
	public void getDetails() {
		
		int a = 10;
		
		BumbleBee bee = new BumbleBee(10);
		
		System.out.println(bee.getBumbleBeeData());
		
		
	}

}
