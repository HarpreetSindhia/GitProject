package RevisionSelenium.RevisionSeleniumTime;

class Vehicle{
	
	String color = "red";
	
	public void gear() {
		
		System.out.println("Front and Back gear are installed properly");
	}
	
	public void brakes() {
		
		System.out.println("Brakes code is implemented");
	}
}

class EnhancedVehicle extends Vehicle{
	
	public void engine() {
		
		System.out.println("Engine has been updated for the enhanced vehicle");
	}
	
	public void color() {
		
		System.out.println(color); // Using properties of Parent class that we defined in Parent class.
	}
}
public class InheritanceConcepts {
	
	public static void main(String[] args) {
		
		Vehicle vehicle = new Vehicle();
		System.out.println(vehicle.color);
		vehicle.brakes();
		vehicle.gear();
		
		EnhancedVehicle enchanced = new EnhancedVehicle();
		
		System.out.println(enchanced.color);
		enchanced.brakes();
		enchanced.color();
		enchanced.engine();
		enchanced.gear();
		
		
		
	}

}
