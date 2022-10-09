package constructor;


public class Constuctor_School {
	public Constuctor_School(String name) {
		System.out.println(name);
		
	}
	public Constuctor_School(int a,int b,float c) {
		System.out.println(a+"  "+b+"  "+c);
		
	}
	public Constuctor_School() {
	System.out.println("IMMACULATE");
	}
	public Constuctor_School(double n) {
		System.out.println(n);
		
	}
	public static void main(String[] args) {
		System.out.println("DAY 5---> CONSTRUCTOR Program ");
		System.out.println("             ");
		
		Constuctor_School P  = new Constuctor_School();
		Constuctor_School P1 = new Constuctor_School(2000);
		Constuctor_School P2 = new Constuctor_School("PRATHEEP");
		Constuctor_School P3 = new Constuctor_School(10, 20, 30);
		
		
		
	}
	
}
