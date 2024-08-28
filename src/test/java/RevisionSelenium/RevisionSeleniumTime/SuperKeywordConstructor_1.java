package RevisionSelenium.RevisionSeleniumTime;

class SuperClass1{
	
	public SuperClass1(){
		
		System.out.println("I am a parent class constructor");
	}
	
	public SuperClass1(String name) {
		
		System.out.println("My nephew name is " +name);
	}
}

class SubClass1 extends SuperClass1{
	
	public SubClass1() {
		
		super("Anaahadbir Singh");
		System.out.println("I am sub class constructor");
	}
	
	public SubClass1(String name) {
		
		super("Yuvaan Sindhia");
		System.out.println("My name is " + name);
	}
}
public class SuperKeywordConstructor_1 {

	public static void main(String[] args) {
		
		SubClass1 subClass = new SubClass1("Harpreet Sindhia");
	}
}
