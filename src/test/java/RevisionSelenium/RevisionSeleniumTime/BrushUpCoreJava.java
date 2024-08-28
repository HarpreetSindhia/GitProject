package RevisionSelenium.RevisionSeleniumTime;

public class BrushUpCoreJava {
	
	public static void main(String[] args) {
		
		int[] array = {89,87,54,68,74,52,61};
		
		for(int i = 0; i < array.length; i++) {
			
			if(array[i] % 2 == 0) {
				
				System.out.println(array[i]);
			}
			
			else {
				
				System.out.println(array[i]+" is not a multiple of 2");
			}
		}
		
		System.out.println("Checking if array is a multiple of 2 ******");
		
		int[] arru = {56,78,41,93,27};
		
		for(int i = 0; i < arru.length; i++) {
			
			if(arru[i] % 2 == 0) {
				
				System.out.println(arru[i]);
				break;
			}
			
		}
		
		System.out.println("Printing the elements in Reverese order with For loop *****");
		
		int [] arr = {78, 88, 76, 89, 42};
		
		for(int i = arr.length - 1; i >= 0; i--) {
			
			System.out.println(arr[i]);
		}
	}

}
