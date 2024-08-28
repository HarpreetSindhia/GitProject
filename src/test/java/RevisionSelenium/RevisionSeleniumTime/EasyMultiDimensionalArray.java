package RevisionSelenium.RevisionSeleniumTime;

public class EasyMultiDimensionalArray {
	
	public static void main(String[] args) {
		
		int [] [] arr = {{2,4,5}, {3,4,7}, {9,8,2}}; // 3 Rows , 3 Columns 
		
		for(int i = 0; i < 3; i++) { // For Rows
			
			for(int j = 0; j < 3; j++) { // Columns
				
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println();
		}
		
		
	}

}
