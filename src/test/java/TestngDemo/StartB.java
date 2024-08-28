package TestngDemo;

import org.testng.annotations.Test;

public class StartB {
	
	int a ;
	
	public StartB(int a){
		
		this.a = a;
	}
	
	@Test
	public int showData2() {
		
		a = a * 4;
		
		return a;
	}

}
