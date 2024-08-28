package RevisionSelenium.RevisionSeleniumTime;

import java.util.ArrayList;

public class ArrayList_Concept {
	
	
	
	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<>();
		a.add("apple");
		a.add("apple");
		a.add("banana");
		a.add("cherry");
		a.add("mango");
		
		System.out.println(a);
		
		a.remove(0);
		
		System.out.println(a);
		
		System.out.println(a.contains("Orange"));
		
		System.out.println("Orange is not found");
		
		System.out.println(a.size());
		
		for(int i = 0; i < a.size(); i++) {
			
			System.out.println(a.get(i));
		}
	
		
	}

}
