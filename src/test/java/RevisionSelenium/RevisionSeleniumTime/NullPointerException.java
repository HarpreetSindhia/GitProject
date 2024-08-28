package RevisionSelenium.RevisionSeleniumTime;

public class NullPointerException {

	public static void main(String[] args) {
		
		//Null is any referenced data type literal
		
		//Null cannot be casted
		
		String str = null;
		
		try {
			
			System.out.println(str.toUpperCase());
		}
		
		catch(Exception e) {
			
			System.out.println("Null cannot be casted");
		}
		
	}
}
