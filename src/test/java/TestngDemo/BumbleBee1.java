package TestngDemo;

import org.testng.annotations.Test;

public class BumbleBee1 extends BumbleBee2{
	
	//int a;
	
	public BumbleBee1(int a) {
		super(a);
		

		// TODO Auto-generated constructor stub
	}

	/*BumbleBee1(int a){
		
		super(a);
		
		this.a = a;
	}*/
	
	
	@Test
	public void getData1() {
		
		int a = 4;
		
		BumbleBee1 bee1 = new BumbleBee1(a);
		
		System.out.println(bee1.getDataNew());
	}

}
