package RevisionSelenium.RevisionSeleniumTime;

public class ArrayListExample_1Sort {
	
	public static void main(String[] args) {
		
		int []arr = {96,76,84,92,74};
		
		//We will sort the array using Swap Logic
		
		int temp; //Empty variable 
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = i+1; j < arr.length; j++) {
				
				if(arr[i] > arr[j]) {
					
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		ArrayListExample_1Sort sort = new ArrayListExample_1Sort();
		sort.getRevisedData();
	}
	
	public void getRevisedData() {
		
		System.out.println("Sorting an array using Swap Logic");
	}

}
