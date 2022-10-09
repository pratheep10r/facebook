package pratheep.java.org;

public class Day4_Method_Overloading {

	
		
	   public void collegedetails( float a ) {
		 System.out.println(a);
		
	}
		
		 public void staffs(String names, String dept, char f) {
			 System.out.println(names+"  "+ dept+"  "+f);
			
		}
		 
		 public void staffsIds(int b, int c, float e) {
			 
			 System.out.println(b+"  "+c+" "+e);
			
		}
		public static void main(String[] args) {
			Day4_Method_Overloading P =new Day4_Method_Overloading();
			   
			System.out.println("DAY 4---> POLYMORPHISM_OVERLOADING");
			System.out.println("           ");
			
			P.staffs("prathee","EEE",'$');
			P.collegedetails(1039);
			P.staffsIds(100,200,300);
			   
			
		}

	}

