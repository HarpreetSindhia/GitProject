package RevisionSelenium.RevisionSeleniumTime;

public class PalindromeString {
	
	public static void main(String[] args) {
		
		String name = "Yuvaan";
		
		String t = "";
		
		for(int i = name.length() - 1; i >= 0; i--) {
			
			t = t + name.charAt(i);
		}
		
		System.out.println(t);
		
		
		
		if(t.equals(name)) {
			
			System.out.println("String is a palindrome");
		}
		
		else {
			
			System.out.println("String is not a palindrome");
		}
		
		String a = "Harpreet";
		a.concat("Sindhia");
		System.out.println(a);// This shows Strings are immutable , they cannot be changed
		
		//To concat the String, you need a new String to store the new value
		
		String c = a.concat("Sindhia");
		System.out.println(c);
		
		
	}
}