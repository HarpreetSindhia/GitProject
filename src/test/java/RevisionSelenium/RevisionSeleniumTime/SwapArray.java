package RevisionSelenium.RevisionSeleniumTime;

public class SwapArray {
	
	public static void main(String[] args) {
		
		int [] array = {6,12,16,24,42,48,56};
		
		int temp;
		
		for(int i = 0; i < array.length; i++) {
			
			for(int j = i; j < array.length; j++) {
				
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		
		for(int i = 0; i < array.length; i++) {
			
			System.out.print(array[i] + " ");
		}
	}

}
