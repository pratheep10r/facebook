package abstraction.day5;


public class Product_FA implements Furnitures_FA {

	@Override
	public void sofa() {
		System.out.println("wooden sofa");		
	}

	@Override
	public void bed() {
		System.out.println("pillow");		
	}

	@Override
	public void table() {
		System.out.println("dressing table");		
	}

	@Override
	public void chair() {
		System.out.println("rolling chair");		
	}

	public static void main(String[] args) {
		System.out.println("DAY 5---> INTERFACE PROGRAM");
		System.out.println("           ");
		
		Product_FA F =new Product_FA();
		F.bed();
		F.chair();
		F.sofa();
		F.table();
		
	}
}
