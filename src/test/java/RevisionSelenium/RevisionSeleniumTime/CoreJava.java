package RevisionSelenium.RevisionSeleniumTime;

public class CoreJava {

	public static void main(String[] args) {
		
		int[] arr = {45,55,65,78,98,75};
		
		for(int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
		}
		
		System.out.println("Retrieving values of Integer Array and String Array *******");
		
		String[] name = {"Harpreet", "Yuvaan" , "Amandeep", "Navdeep" , "Anaahadbir"};
		
		for(int i = 0; i < name.length; i++) {
			
			System.out.println(name[i]);
		}
		
		System.out.println("Enhanced For Loop *******");
		
		for(String selectedNames : name) {
			
			System.out.println(selectedNames);
		}
	}
}
