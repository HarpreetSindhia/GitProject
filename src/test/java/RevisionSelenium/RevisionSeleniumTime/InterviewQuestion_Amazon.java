package RevisionSelenium.RevisionSeleniumTime;

import java.util.ArrayList;

public class InterviewQuestion_Amazon {
	
	public static void main(String[] args) {
		
		int [] arr = {5,7,7,7,5,4,3,4,3,5,1};
		
		//Find the number of times each element is getting repeated 
		//Find the unique number
		
		ArrayList<Integer> al = new ArrayList<>();
		
		
		
		for(int i = 0; i < arr.length; i++) {
			
			int k = 0;
			
			if(!al.contains(arr[i])) {
				
				al.add(arr[i]);
				k++;
				
			
			for(int j = i+1; j < arr.length; j++) {
				
				if(arr[i] == arr[j]) {
					
					k++;
				}
				
				
			}
			
		
			System.out.println(arr[i]);
			System.out.println(k);
			
			if(k == 1) {
				
				System.out.println("Unique number is " + arr[i]);
			}
		}
			
			
	}
	}
}