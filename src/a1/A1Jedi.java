package a1;

import java.util.Scanner;

public class A1Jedi {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		

		// Your code follows here.
		int count = scan.nextInt();
		String[] itemName = new String[count];
		int[] numitem = new int[count];
		boolean[] itemSeen = new boolean[count];
		
		for (int i = 0; i < count; i++) {
			itemName[i] = scan.next();
			itemSeen[i] = false;
			scan.nextDouble();
		}
		
		int count2 = scan.nextInt();
		int[] NumCustomers = new int[count];
		int[] quantityItem = new int[count];
		
		
		for (int i = 0; i < count2; i++) {
			scan.next();
			scan.next();
			int numitemsPurchased = scan.nextInt();
			for (int y = 0; y< numitemsPurchased; y++) {
				int quantity = scan.nextInt();
				String foodname = scan.next();
				for (int a = 0; a < numitem.length; a++ ) {
					int temp = 0;
					if (foodname.equals(itemName[a])) {
						quantityItem[a] += quantity;
						
						if (itemSeen[a] == false) {
							NumCustomers[a]++;
							itemSeen[a] = true;
						}
					}else {
						/*itemName[temp] = foodname ;
						quantityItem[temp] = quantity;
						NumCustomers[temp]++;
						temp++;*/
					}	
				}
				
				for(int j = 0; j<count; j++) {
					itemSeen[j] = false;
				}
			}
		
			
		}
		for (int i = 0; i < NumCustomers.length ; i++) {
			String No = NumCustomers[i] + "";
			if (NumCustomers[i] == 0) {
				System.out.println("No" +  " " + "customers bought " + itemName[i]);
			} else {
				System.out.println(No +  " customers bought " + quantityItem[i] + " " + itemName[i]);
			}
		}
	}
				
}		//Need to create a for loop showing if it is the first item in the array
				
			
				

		
	

