package RevisionSelenium.RevisionSeleniumTime;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		
		int[][] arr = {{2,4,9},
				       {5,8,2}};
		
		int[][] res= {{0,0,0},
				        {0,0,0}};
		
		int[][] arr1 = new int[2][3];
		
		
		for(int i = 0; i < 2; i++) {
			
			for(int j = 0; j < 3; j++) {
				
				res[i][j] = arr[i][j];
				
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println();
		}
		
		
		}
}

