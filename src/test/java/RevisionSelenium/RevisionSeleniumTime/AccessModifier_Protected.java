package RevisionSelenium.RevisionSeleniumTime;

public class AccessModifier_Protected {
	
	// Protected Access Modifier
	
	protected int i = 80;
	
	protected void getData() {
		
		System.out.println("Protected Access Modifier");
	}
	
	
	public static void main(String[] args) {
		
		AccessModifier_Protected modifier2 = new AccessModifier_Protected();
		
		System.out.println(modifier2.i);
		
		modifier2.getData();
		
		AccessModifier_Public publicModifier = new AccessModifier_Public();
		
		System.out.println(publicModifier.i);
		
		publicModifier.getSum();
		
	}

}
