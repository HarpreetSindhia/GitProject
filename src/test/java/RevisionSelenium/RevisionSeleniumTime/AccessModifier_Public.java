package RevisionSelenium.RevisionSeleniumTime;

public class AccessModifier_Public {
	
	public int i = 50;
	
	public void getSum() {
		
		System.out.println("The Sum is "+i);
	}
	
	public static void main(String[] args) {
		
		AccessModifier_Public access2 = new AccessModifier_Public();
		
		System.out.println(access2.i);
		
		access2.getSum();
		
	}

}
