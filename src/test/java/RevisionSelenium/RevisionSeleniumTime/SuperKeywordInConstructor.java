package RevisionSelenium.RevisionSeleniumTime;

class SuperClass{
	
	public SuperClass(){
	
		System.out.println("I am SuperClass constructor");
		
	}
	
	public SuperClass(String name) {
		
		
		
		System.out.println(name);
	}
}

class SubClass extends SuperClass{
	
	public SubClass() {
		
		
		super("Anaahadbir Singh");
		System.out.println("I am ChildClass constructor");
	}
}
public class SuperKeywordInConstructor {
	
	public static void main(String[] args) {
		
		SubClass sub = new SubClass();
		
	}
}
