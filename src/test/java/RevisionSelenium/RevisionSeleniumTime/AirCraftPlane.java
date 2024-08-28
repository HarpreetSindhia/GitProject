package RevisionSelenium.RevisionSeleniumTime;

abstract class AirCraftEngine{
	
public void engine() {
		
		System.out.println("Engine build is premium");
	}
	
	public void safetyGuidelines() {
		
		System.out.println("Safety Guidelines implementation");
	}
	
	public abstract void airCraftColor();
		
}

class SpaceEngine extends AirCraftEngine {
	
	
	public void airCraftColor() {
		
		System.out.println("Blue color is optimal for AirCraftPlane");
	}
	
	public void gesturePoint() {
		
		System.out.println("The chart for gesturePoint has been dispalyed at every seat");
	}

}	
public class AirCraftPlane {
	public static void main(String[] args) 
	
	{
		
		
		AirCraftEngine craft = new SpaceEngine();
		craft.airCraftColor();
		craft.engine();
		craft.safetyGuidelines();
		
		
		SpaceEngine engine = new SpaceEngine();
		engine.airCraftColor();
		engine.engine();
		engine.gesturePoint();
		engine.safetyGuidelines();
		
		
		
	}

}

