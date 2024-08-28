package RevisionSelenium.RevisionSeleniumTime;

interface TrafficRules{
	
	void GreenGo();
	void RedStop();
	void YellowStop();
}

public class InterfaceConcepts implements TrafficRules {
	

	public void GreenGo() {
		
		System.out.println("You are all set to Go");
	}
	
	public void RedStop() {
		
		System.out.println("Kindly stop at Red Light");
	}
	
	
	public void YellowStop() {
		
		System.out.println("Wait for sometime for light to turn yellow");
		
	}
	


	public static void main(String[] args) {
		
		//We have created object of InterfaceConcepts class to implement the methods present in TrafficRules interface.
		TrafficRules concepts = new InterfaceConcepts(); 
		concepts.GreenGo();
		concepts.RedStop();
		concepts.YellowStop();
		
	}
}
