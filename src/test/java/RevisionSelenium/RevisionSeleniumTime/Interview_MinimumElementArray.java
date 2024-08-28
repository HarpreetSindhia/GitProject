package RevisionSelenium.RevisionSeleniumTime;

public class Interview_MinimumElementArray {
	
	public static void main(String[] args) {
		
		int [][] arr = {{2,4,5}, {3,4,7}, {1,2,9}};
		
		int min = arr[0][0];
		
		for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j < 3; j++) {
				
				if(arr[i][j] < min) {
					
					min = arr[i][j];
				}
				
				
			}
		}
		System.out.println(min);
	}

}
