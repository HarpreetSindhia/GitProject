package RevisionSelenium.RevisionSeleniumTime;


public class ArrayListExample {
	

	public static void main(String[] args) {
		
		int [] arr = {85,75,95,45,65};
		
		int max = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] > max) {
				
				max = arr[i];
			}
		}
		
		System.out.println(max);
		
		ArrayListExample example = new ArrayListExample();
		example.getData();
		
		ArrayListExample_1Sort sort = new ArrayListExample_1Sort();
		sort.getRevisedData();
		
	}
	
	public void getData() {
		
		System.out.println("ArrayList are awesome");
	}

}
