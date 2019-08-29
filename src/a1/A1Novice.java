package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// Creating a count of the number of customers
		int count = scan.nextInt();
		
		// Then I am going to create an array to store the number of customers, their first initial, last name, and cost of items they purchased
		char[] firstInitial = new char[count];
		String[] lastName = new String[count];
		double[] cost = new double[count];
		
		for (int i = 0; i<count; i++) {
			String temp = scan.next();
			firstInitial[i] = temp.charAt(0);
			lastName[i] = scan.next();
			int items = scan.nextInt();
			
			double sum = 0;
			for (int j = 0; j<items; j++) {
				int quantity = scan.nextInt();
				String itemName = scan.next();
				double price = scan.nextDouble();
				sum = (price * quantity) + sum;
			}
			cost[i] = sum;
		}
		
		for (int i = 0; i<count; i++) {
			System.out.println(firstInitial[i] + ". " + lastName[i] + ": " + String.format("%.2f", cost[i]));
			
		}
		
		
		
		
		
		
	}
}
