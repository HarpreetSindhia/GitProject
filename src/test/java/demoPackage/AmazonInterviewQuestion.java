package demoPackage;

import java.util.ArrayList;

public class AmazonInterviewQuestion {

	public static void main(String[] args) {
		
		int [] arr = {19, 18, 18, 20, 3, 3, 20, 3, 19, 19, 8};
		
		//Find the number of times each element is getting repeated 
		//Find the unique number
		
		/*Take an empty Arraylist and add the elements one by one 
		 * before that check if arraylist does not contain the element then 
		 * add it else skip it and and increment the k+
		 * Take a For loop to traverse through all the elements of array
		 */
		
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
					
					System.out.println("Unique number is " +arr[i]);
				}
			}
		}
		
	}
}
