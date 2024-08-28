package RevisionSelenium.RevisionSeleniumTime;

interface Milton{
	
	void stainlessSteel();
	void glassBottle();
}

interface NewInterfaceConcepts{
	
	void abstractMethods();
	void abstractClass();
	
}



class HomeWareBrand implements Milton, NewInterfaceConcepts{
	
	public void stainlessSteel() {
		
		System.out.println("Premium Build");
	}
	
	public void glassBottle() {
		
		System.out.println("Premium Finish");
		
	}
	
	public void stainlesssteelStraw() {
		
		System.out.println("We should promote using stainless steel straws");
	}
	

	public void abstractMethods() 
	{
		
		System.out.println("Methods without any implementation");
		
	}
	public void abstractClass()
	{
		
		System.out.println("These can have atleast one abstract method and rest non - abstract methods ");
		
	}
}
public class InterfaceConcepts_2 {

	public static void main(String[] args) {
		
		
		Milton home = new HomeWareBrand();
		
		home.stainlessSteel();
		home.glassBottle();
		
		NewInterfaceConcepts conp = new HomeWareBrand();
		conp.abstractClass();
		conp.abstractMethods();
		
		
	}
}
