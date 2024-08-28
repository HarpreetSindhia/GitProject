package RevisionSelenium.RevisionSeleniumTime;

public class ParameterizedConstructor {
	
	
	public ParameterizedConstructor(int a){
		
		System.out.println(a);
		
	}
	
	public ParameterizedConstructor(String str){
		
		System.out.println(str);
	}
	
	public ParameterizedConstructor(int a , int b){
		
		System.out.println(a+" "+b);
	}

	public static void main(String[] args) {
		
		ParameterizedConstructor c = new ParameterizedConstructor(5, 9);
		
		ParameterizedConstructor c1 = new ParameterizedConstructor(1);
		
		ParameterizedConstructor c2 = new ParameterizedConstructor("Harpreet Sindhia");
		
		
	}
}
