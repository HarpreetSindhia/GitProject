package RevisionSelenium.RevisionSeleniumTime;

public class MethodOverloading {
	
	public void getData(int a) {
		
		System.out.println(a);
	}
	
	public void getData(int a , int b) {
		
		System.out.println(a +" "+b);
	}
	
	public void getData(String a) {
		
		System.out.println(a);
	}
	public static void main(String[] args) {
		
		MethodOverloading method = new MethodOverloading();
		method.getData(5);
		method.getData("Harpreet Sindhia");
		method.getData(22, 1994);
		
	}

}
