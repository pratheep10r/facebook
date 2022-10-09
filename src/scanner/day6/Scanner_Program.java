package scanner.day6;

import java.util.Scanner;

public class Scanner_Program {
	
	public static void main(String[] args) {
		 
		Scanner pr = new Scanner(System.in);
		
		System.out.println("Enter your name");   
		String name = pr.nextLine();
		System.out.println(name);
		
	
		System.out.println("Enter your mobile number");
		int mobile = pr.nextInt();
		System.out.println(mobile);
		
		System.out.println("Enter your Id");
		float Id = pr.nextFloat();
		System.out.println(Id);
		
		System.out.println("Enter your city");
		String city = pr.next();
		System.out.println(city);
		
		
	}
}
