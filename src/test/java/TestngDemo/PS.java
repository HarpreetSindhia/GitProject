package TestngDemo;

import org.testng.annotations.Test;

public class PS {
	
	
	@Test
	public void getData1() {
		
		PS2 ps2 = new PS2(6);
		int a = 6;
		System.out.println(ps2.increment());
		
		
	}

}
