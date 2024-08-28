package RevisionSelenium.RevisionSeleniumTime;

class ParentA{
	
	public void audioSystem() {
		
		System.out.println("Sony Headphones");
	}
	
	public void premiumHeadphones() {
		
		System.out.println("Sony is the best");
	}
	
}

class ChildA extends ParentA{
	
	public void audioSystem() {
		
		System.out.println("JBL Headphones");
	}
}
public class FunctionOverloading {
	
	public static void main(String[] args) {
		
		ChildA child = new ChildA();
		child.audioSystem();
		
		ParentA parent = new ChildA();
		parent.audioSystem();
		parent.premiumHeadphones();
		
		ParentA parent1 = new ParentA();
		parent1.audioSystem();
	}

}
