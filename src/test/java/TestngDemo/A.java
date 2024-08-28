package TestngDemo;

import org.testng.annotations.Test;

public class A {

	@Test
	public void getData() {
		
		int a = 5;
		B bee = new B(5);
		
	
		System.out.println(bee.increment());
	}
}
