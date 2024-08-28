package RevisionSelenium.RevisionSeleniumTime;

public class StringConcepts {
	
	public static void main(String[] args) {
		
		String s1 = "Harpreet Kaur Sindhia";
		
		String[] splittedString = s1.split(" ");
		
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[2]);
		
		String[] splitString = s1.split("Kaur");
		
		System.out.println(splitString[0]);
		System.out.println(splitString[1].trim());
		
		String[] splitString1 = s1.split("Harpreet");
		
		
		System.out.println(splitString1[1].trim());
		
		System.out.println("Printing the characters of the string ******");
		
		for(int i = 0; i < s1.length(); i++) {
			
			System.out.println(s1.charAt(i));
		}
		
		System.out.println("Printing the characters of a string in reverse order ******");
		
		for(int i = s1.length()-1; i >=0; i--) {
			
			System.out.println(s1.charAt(i));
		}
		
	}

}
