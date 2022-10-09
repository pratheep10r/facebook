package pratheep.java.org;

public class Day4_DynamicBinding_ClassB extends Day4_Method_Overriding_classA {

	  @Override
		public void shops(String products, String price, float a) {
		
			super.shops(products, price, a);
		}
		  
		  @Override
		public void stockprice(int b, double c, float e, char f) {
		
			  super.stockprice(b, c, e, f);
		}

		  public static void main(String[] args) {
			System.out.println("DAY 4----> POLYMORPHISM_ OVERRIDING");
			System.out.println("          ");
			  
			  
			Day4_DynamicBinding_ClassB P =new Day4_DynamicBinding_ClassB();
			     P.shops("rices","200",300);
			     P.stockprice(100,400,500,'%');
			  
		}
	}


