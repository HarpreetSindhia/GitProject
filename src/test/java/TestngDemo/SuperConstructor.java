package TestngDemo;

import org.testng.annotations.Test;

public class SuperConstructor {
	
	int a;
	
	public SuperConstructor(int a) {
		
	this.a = a;
		
	}
	
	@Test
	public int getData() {
		
		a = a * 2;
		
		return a;
	}

}


class SubClass {
	

	@Test
	public void getParentData() {
		
		int a = 7;
		
		SuperConstructor supe = new SuperConstructor(7);
		System.out.println(supe.getData());
		
	}
	
	
}