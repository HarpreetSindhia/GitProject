package RevisionSelenium.RevisionSeleniumTime;

public class StaticVariables {
	
	//Suppose we want to generate census report for the people of city Bangalore .
	
	String name;// Instance Variables
	String address;
	static String city; // Static Variables or Class Variables
	static int i;
	
	static { // Static Block to initialize the static variables .
		
		city = "Bangalore";
		i = 0;
	}
	
	public StaticVariables(String name , String address)// Local Variables  
	{
		this.name= name; // Here we are assigning our Local Variables to Instance Variables.
	    this.address= address;
	    i++;
	    System.out.println(i);
	
	}
	
	public void censusReport() {
		
		System.out.println(name + " " +address + " "+city);
	}
	
	public static void censusNewData() {
		
		System.out.println(city);
	}
	

	public static void main(String[] args) {
		
		StaticVariables staticVar = new StaticVariables("Harpreet-Sindhia" , "Amritsar");
		StaticVariables staticVar1 = new StaticVariables("Anaahadbir-Sindhia" , "Chandigarh");
		StaticVariables staticVar2 = new StaticVariables("Yuvaan-Sindhia" , "Chandigarh");
		
		staticVar.censusReport();
		staticVar1.censusReport();
		staticVar2.censusReport();
		
		StaticVariables.censusNewData();
		
		
		
	}
}
