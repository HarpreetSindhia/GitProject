package RevisionSelenium.RevisionSeleniumTime;

class Cello{
	
	String name = "Water Bottle";
	
}

class Milton1 extends Cello {
	
	String name = "Lunch Box";
	
	public void getBestBottle() {
		
		System.out.println(name);
		
		System.out.println(super.name);
	}
}

public class SuperKeyword 

{
	
	public static void main(String[] args) {
		
		Milton1 milton = new Milton1();
		
		milton.getBestBottle();
	}

}
