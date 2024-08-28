package RevisionSelenium.RevisionSeleniumTime;

public class Interview_MinMAX {
	
	public static void main(String[] args) {
		
		int [][] arr = {{7,9,8}, {4,3,5}, {6,1,4}};
		
		int min = arr[0][0];
		
		int minColumn = 0;
		
		for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j < 3; j++) {
				
				if(arr[i][j] < min) {
					
					min = arr[i][j];
					
					minColumn = j ;
				}
			}
		}
		
		int max = arr[0][minColumn];
		
		for(int i = 0; i < 3; i++) {
			
			if(arr[i][minColumn] > max ) {
				
				max = arr[i][minColumn];
			}
		}
		
		System.out.println(max);
	}

}
