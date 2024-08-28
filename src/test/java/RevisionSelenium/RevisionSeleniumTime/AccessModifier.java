package RevisionSelenium.RevisionSeleniumTime;

public class AccessModifier extends AccessModifier_Private {
	
	//Default Package
	
	int i = 40;
	
	void getData() {
		
		System.out.println("Access Modifier");
	}
	
	
	public static void main(String[] args) {
		
		AccessModifier modifier = new AccessModifier();
		
		System.out.println(modifier.i);
		modifier.getData();
		System.out.println(modifier.i);
		modifier.getData();
		
		AccessModifier_Private modifier1 = new AccessModifier_Private();
		//modifier1.
	}

}
