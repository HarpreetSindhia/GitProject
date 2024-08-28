package RevisionSelenium.RevisionSeleniumTime;

import java.util.Scanner;

public class Exceptions {
	
	public static void main(String[] args) {
		
		int[] arr = {96,97,99,84,86};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an index number");
		
		int indexNumber = sc.nextInt();
		
		System.out.println("Enter the number to be divided by array index ");
		
		int arrayIndexNumber = sc.nextInt();
		
		try {
			
			System.out.println("The index number entered by the user is " +arr[indexNumber]);
			
			System.out.println("The number divided by arrayIndex value is " + arr[indexNumber]/arrayIndexNumber);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println(e);
		}
		catch(ArithmeticException e) {
			
			System.out.println(e);
		}
		
		finally
		{
			System.out.println("Exceptions are a important topic in Automation Testing");
		}
		
	}

}
