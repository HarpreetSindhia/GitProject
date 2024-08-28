package TestngDemo;

import org.testng.annotations.Test;

public class B {

   int a;
	public B(int i) {
	// TODO Auto-generated constructor stub
		
		this.a = i;
}
	@Test
	public int increment() {
		
		a = a +1;
		
		System.out.println("Hello");
		
		return a;
	}
}
