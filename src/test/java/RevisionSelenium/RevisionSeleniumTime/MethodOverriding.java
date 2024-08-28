package RevisionSelenium.RevisionSeleniumTime;

class A{
	
	public void getAudio() {
		
		System.out.println("Audio implemented");
	}
}

class B extends A{
	
	public void getAudio() {
		
		System.out.println("Audio code implementation");
	}
}
public class MethodOverriding {
	
	public static void main(String[] args) {
		
		A b = new B(); //Reference of Parent class A and object creation id done for ObjectB
		b.getAudio();
		
		B b1 = new B();
		b1.getAudio();
		
		A a = new A();
		a.getAudio();  
		
		//Whosoever class object is being created , that method will be implemented .
	}

}
