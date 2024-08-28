package RevisionSelenium.RevisionSeleniumTime;

public class MethodsConcepts {
	
	public static void main(String[] args) {
		
		MethodsConcepts concepts = new MethodsConcepts();
		concepts.getData();
		String value = concepts.revisedData();
		System.out.println(value);
		finalData();
		MethodsConcepts2.concatenateData();
		
	}
	
	public void getData() {
		
		System.out.println("Monsoon Rainy Days");
	}
	
	public String revisedData() {
		
		System.out.println("Working on the Framework , will update you soon");
		return "Framework";
	}
	
	public static void finalData() {
		
		System.out.println("Final data been released");
	}

}
