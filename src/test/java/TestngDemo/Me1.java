package TestngDemo;

class Mee1 {
	
	int a;
	
	public Mee1(int a) {
		
		this.a = a;
	}
	
	public int call() {
		
		a = a * 5;
		
		return a;
	}
	
}

class You extends Mee1{
	
	
	int a = 10;
	
	public You(int a) {
		
		super(a);
	}
		
	
	
}
public class Me1{
	
	public static void main(String[] args) {
		
		You you = new You(10);
		
		System.out.println(you.call());
	}

}
