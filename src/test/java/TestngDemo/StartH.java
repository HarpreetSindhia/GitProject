package TestngDemo;

import org.testng.annotations.Test;

public class StartH extends StartP {

	public StartH(int a) {

		super(a);

	}

	@Test
	public void showData() {

		int a = 10;

		StartH hee = new StartH(10);

		System.out.println(hee.showData4());
	}

}
