package demoPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsPractice {
	
	public static void main(String[] args) {
		
		String[] name = {"Anaahadbir" , "Agam" , "Barun" , "Agastya", "Abir"};
		
		List<String> newNames = Arrays.asList(name);
		
	    newNames.stream().filter(n -> n.startsWith("A")).collect(Collectors.toList()).forEach(m -> System.out.println(m));
		
	    System.out.println("********");
	    
	    int [] arr = {78, 89,78, 56, 89, 26, 98 };
	    
	    List<Integer> list = IntStream.of(arr).boxed().collect(Collectors.toList());
	    
	    list.stream().sorted().filter(i -> i%2 == 0).collect(Collectors.toList()).forEach(w -> System.out.println(w));
	    
	    
	    System.out.println("******");
	    
	    
	    int [] array = {78, 89,78, 56, 89, 26, 98 };
	    
	    ArrayList<Integer> al = new ArrayList<>();
	    
	    for(int i = 0; i < array.length; i++) {
	    	
	    	int k = 0;
	    	
	    	if(!al.contains(array[i])) {
	    		
	    		al.add(array[i]);
	    		k++;
	    		
	    		for(int j = i +1 ; j < array.length; j++) {
	    			
	    			if(array[i] == array[j]) {
	    				
	    				k++;
	    			}
	    		}
	    		
	    		System.out.println(array[i]);
	    		System.out.println(k);
	    		
	    		if(k == 1) {
	    			
	    			System.out.println("Unique number is " + array[i]);
	    		}
	    	}
	    }
	    
	    int [] array2 = {78, 89,78, 56, 89, 26, 98 };
	    
	    //Find minimum element 
	    
	  List<Integer> element =   IntStream.of(array2).boxed().collect(Collectors.toList());
	  
	  Integer min = element.stream().min((x,y)->x.compareTo(y)).get();
	  
	  System.out.println("Minimum number is "+ min);
	  
	  
	  int [] arru = {85, 89,78, 56, 25, 26, 98 };
	  
	 List<Integer>  list1 = IntStream.of(arru).boxed().collect(Collectors.toList());
	 
	Integer max =  list1.stream().max((x,y)->x.compareTo(y)).get();
	
	System.out.println("Maximum element is "+ max);
	 
	 
	    
	    
	  
	}

}
