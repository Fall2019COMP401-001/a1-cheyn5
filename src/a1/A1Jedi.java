package a1;

import java.util.Scanner;

public class A1Jedi {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		

		// Your code follows here.
		int count = scan.nextInt();
		String[] itemName = new String[count];
 		int[] numCustomers = new int[count];
		int[] numitem = new int[count];
				
		for (int i = 0; i < count; i++) {
			itemName[i] = scan.next();
			scan.nextDouble();
		}
		
		int temp = 0;
		int customerCount = scan.nextInt();
		for (int i = 0; i < customerCount; i++) {
			scan.next();
			scan.next();
			int numitemsPurchased = scan.nextInt();
			for (int y = 0; y< numitemsPurchased; y++) {
				int quantity = scan.nextInt();
				String foodname = scan.next();
				for (int a = 0; a < numitem.length; a++ ) {
					if (foodname == itemName[i]) {
						numitem[a] += quantity;
						numCustomers[a]++;
					}
					else {
						//itemName[temp] = foodname ;
						//numitem[temp] = quantity;
						//numCustomers[temp]++;
						//temp++;
					}	
				}
			}
		
			
		}
		for (int i = 0; i < numCustomers.length ; i++) {
			System.out.println(numCustomers[i] + " " + "customers bought" + " " + numitem[i] + " " + itemName[i]);
		}
	}
				
}		//Need to create a for loop showing if it is the first item in the array
				
			
				

		
	

