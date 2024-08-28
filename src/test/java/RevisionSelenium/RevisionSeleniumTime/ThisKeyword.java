package RevisionSelenium.RevisionSeleniumTime;

public class ThisKeyword {
	
	// This keyword refers to the current object and object scope lies within the class level
	
	int a = 56; // Instance Variable 
	
	public void getData() {
		
		int a = 58; // Local Variable
		
		int b = a + this.a;
		
		System.out.println(a);
		
		System.out.println(this.a);
		
		System.out.println(b);
	}
	public static void main(String[] args) {
		
		ThisKeyword keyword = new ThisKeyword();
		
		keyword.getData();
	}

}
