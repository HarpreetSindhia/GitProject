package TestngDemo;

import org.testng.annotations.Test;

public class StartA {

	@Test
	public void showData() {
		
		int a = 10;
		
		StartB b = new StartB(10);
		
		System.out.println(b.showData2());
	}
}
