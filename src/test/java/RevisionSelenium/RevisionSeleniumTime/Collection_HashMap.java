package RevisionSelenium.RevisionSeleniumTime;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Collection_HashMap {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<>();
		
		hm.put(0, "Blackberry");
		hm.put(1, "BlueBerry");
		hm.put(2, "Strawberry");
		hm.put(3, "PineApple");
		hm.put(4, "Apple");
		
		System.out.println(hm);
		
		Set entry = hm.entrySet();
		
		Iterator iterator = entry.iterator();
		
		while(iterator.hasNext()) {
			
			Map.Entry mp = (Map.Entry)iterator.next();
			
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
		
	}

}
