package TestngDemo;

import org.testng.annotations.Test;

public class BumbleBee2 {

	int a;
	
	public BumbleBee2(int a) {
		
		
		this.a = a;
	}

	public BumbleBee2() {
		// TODO Auto-generated constructor stub
	}

	@Test
	public int getDataNew() {
		
		
		System.out.println("hELLO");
		a = a * 2;
		
		return a;
		
		
		
	}
}
