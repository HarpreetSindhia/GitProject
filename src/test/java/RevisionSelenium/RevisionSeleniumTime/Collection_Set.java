package RevisionSelenium.RevisionSeleniumTime;

import java.util.HashSet;
import java.util.Iterator;

public class Collection_Set {
	
	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<>();
		hs.add("apple");
		hs.add("apple");
		hs.add("papaya");
		hs.add("mango");
		hs.add("blackberry");
		
		
		System.out.println(hs);
		
		Iterator<String> iterator = hs.iterator();
		
		while(iterator.hasNext()) {
			
			System.out.println(iterator.next());
		}
	}

}
