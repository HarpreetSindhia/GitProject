package RevisionSelenium.RevisionSeleniumTime;

public class AccessModifier_Private {

	//Private Access Modifier
	
	private int i = 50;
	
	private void getData() {
		
		System.out.println("Private Access Modifier");
	}
	
	public static void main(String[] args) {
		
		AccessModifier_Private modifier = new AccessModifier_Private();
		
		System.out.println(modifier.i);
		
		modifier.getData();
		
		AccessModifier_Protected modifier5 = new AccessModifier_Protected();
		
		System.out.println(modifier5.i);
		
	}
}
