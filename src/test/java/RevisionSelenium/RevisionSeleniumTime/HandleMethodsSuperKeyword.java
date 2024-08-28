package RevisionSelenium.RevisionSeleniumTime;

class ParentClass{
	
	String name = "Harpreet Sindhia";
	
	public void getData() {
		
		System.out.println(name);
	}
}

class ChildClass extends ParentClass{
	
	String name = "Anaahadbir Singh";
	
	public void getData() {
		
		
		super.getData();
		System.out.println(name);
	}
}
public class HandleMethodsSuperKeyword {
	
	public static void main(String[] args) {
		
		ChildClass child = new ChildClass();
		child.getData();
		
		ParentClass parent = new ChildClass();
		parent.getData();


	}

}
