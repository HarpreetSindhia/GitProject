package TestngDemo;

import org.testng.annotations.Test;

public class TestngHelperAttribute {
	
	@Test
	public void signUp() {
		
		System.out.println("Registration for new user");
	}
	
	@Test(dependsOnMethods= {"signUp","guestLogin"})
	public void login() {
		
		System.out.println("Login for user already existing");
	}
	
	@Test
	public void guestLogin() {
		
		System.out.println("Simply login as a guest user");
	}
	
	
	@Test(timeOut=4000)
	public void paymentDetails() {
		
		System.out.println("Enter the payment details for making a order");
	}
	
	@Test
	public void checkout() {
		
		System.out.println("Order successfully placed");
	}
	
	@Test(enabled=false)
	public void applyCoupon() {
		
		System.out.println("Apply coupon if products are eligible for the same");
	}

}
