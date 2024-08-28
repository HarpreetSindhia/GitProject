package RevisionSelenium.RevisionSeleniumTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayListConcepts {
	
	public static void main(String[] args) {
		
		//With ArrayList, we can dynamically grow the size of an array 
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Harpreet");
		a.add("Automation");
		a.add("Engineer");
		
		for(int i = 0; i < a.size(); i++) {
			
			System.out.println(a.get(i));
		}
		
		System.out.println("ArrayList using Enhanced For Loop *****");
		
		for(String value : a) {
			
			System.out.println(value);
		}
		
		System.out.println(a.contains("Engineer"));
		
		
		String[] arr = {"Harpreet" , "Automation" , "Engineer"};
		
		//We can convert the array into ArrayList
		
		List<String> newValue = Arrays.asList(arr);
		
		System.out.println(newValue.contains("Harpreet"));
		
		//Converting the Integer Array into ArrayList
		
		int[] array = {78,89,45,56,47,91};
		
		List<Integer> intValue = IntStream.of(array).boxed().collect(Collectors.toList());
		
		System.out.println(intValue.contains(91));
		
		
		for(int i = 0; i < array.length; i++) {
			
			if(array[i] == 78) {
				
				System.out.println("Element is present");
				
				break;
			}
			
			else {
				
				System.out.println("Element is not present");
			}
		}
		
		
		
	}

}
