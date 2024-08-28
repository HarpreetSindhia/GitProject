package RevisionSelenium.RevisionSeleniumTime;

abstract class AirCraftSpace{
	
	public void engine(){
		
		System.out.println("Please follow the engine guidelines");
	}
	
	public void safetyGuidelines() {
		
		System.out.println("Please follow the safety guidelines");
	}
	
	public abstract void aircraftColor();
}

class SpaceX extends AirCraftSpace{
	
	public void aircraftColor() {
		
		System.out.println("Ice Blue has been decided as the AircraftColor");
	}
	
	public void checkIn() {
		
		System.out.println("CheckIn rules must be followed in a rigorous way");
	}
}


public class AbstractClassConcepts {

	public static void main(String[] args) {
		
		
		AirCraftSpace space = new SpaceX(); // SpaceX object has been created to implement the methods of AirCraftSpace abstract class.
		space.aircraftColor();
		space.engine();
		space.safetyGuidelines();
		
		//Abstract classes cannot be instantiated but can be used as a reference as above example.
		
		
	}
}
