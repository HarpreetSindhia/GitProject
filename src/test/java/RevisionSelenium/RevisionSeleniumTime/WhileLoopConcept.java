package RevisionSelenium.RevisionSeleniumTime;

public class WhileLoopConcept {
	
	public static void main(String[] args) {
		
		//In While loop , first condition is checked then loop gets executed.
		
		//If Boolean expression evaluates into true, then control gets inside the loop .
		
		//Operation needs to be performed on the variable that has been initialized .
		
		int i = 0;
		while(i <= 5) {
			
			System.out.println(i);
			i++;
		}
		
		System.out.println("Printing numbers in reverse order using While loop *****");
		int i1 = 10;
		while(i1>=0) {
			
			System.out.println(i1);
			i1--;
		}
		
		// Do - While Loop - 1 loop of execution is guarantee in Do - While loop .
		
		System.out.println("Implementing Do - While loop ******");
		int m = 50;
		do {
			
			System.out.println(m);
			m++;
			
		}while(m>55);
			
		System.out.println("Do - While Loop *****");
		
		int n = 20;
		do {
			
			System.out.println(n);
			n--;
			
		}while(n>10);
			
		
	}

}
