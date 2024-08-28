package RevisionSelenium.RevisionSeleniumTime;

public class NumberFormatException {

	public static void main(String[] args) {
		
		//Converting String to Integer throws NumberFormatException 
		
		String str = "Harpreet";
		try {
			
			System.out.println(Integer.parseInt(str));
		}
		
		catch(Exception e) {
			
			System.out.println(e);
		}
		
	}
}
