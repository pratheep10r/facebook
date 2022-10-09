package abstraction.day5;


public class Heavyvechicle_AC  extends Vehicles_AC{

	@Override
	public void bikenumber() {
		System.out.println(1039);		
	}

	public static void main(String[] args) {
		System.out.println("DAY 5--->ABSTACT CLASS PROGRAM ");
		System.out.println("      ");
		Heavyvechicle_AC H =new Heavyvechicle_AC();
		 H.bikeEngineNO();
		 H.bikename();
		 H.bikenumber();
		
}
}
