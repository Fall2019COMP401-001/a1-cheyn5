package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int itemcount = scan.nextInt();
		
		String[] itemName = new String[itemcount];
		double[] itemCost = new double[itemcount];
				
		for (int i = 0; i < itemcount; i++) {
			itemName[i] = scan.next();
			itemCost[i] = scan.nextDouble();
		}
				
		int customercount = scan.nextInt();
		
		String[] firstname = new String[customercount];
		String[] lastname = new String[customercount];
		double[] totalcost = new double[customercount];
		
		for (int i = 0; i < customercount; i++) {
			firstname[i] = scan.next();
			lastname[i] = scan.next();
			int numDiffItemsBought = scan.nextInt();
			
			int[] itemAmount = new int[numDiffItemsBought];
			String[] purchasedItems = new String[numDiffItemsBought];
			for (int j = 0; j<numDiffItemsBought; j++) {
				itemAmount[j] = scan.nextInt();
				purchasedItems[j] = scan.next();
			
			}
			
			for (int j = 0; j<numDiffItemsBought; j++) {
				for (int k = 0; k < itemcount; k++) {
					if (purchasedItems[j].equals(itemName[k])) {
						totalcost[i] += itemAmount[j] * itemCost[k];
					}
				}
			}
			
	}
		
		
		
	double max = Integer.MIN_VALUE;
	double min = Integer.MAX_VALUE;
	double sum = 0;
	String MaxName = "";
	String MinName = "";
		
	for (int i = 0; i < totalcost.length; i++ ) {
		if (totalcost[i] > max) {
			max = totalcost[i];
			MaxName = firstname[i] + " " + lastname[i] + " " + "(" + (String.format("%.2f", totalcost[i]))+ ")";
		}
		if (totalcost[i] < min) {
			min = totalcost[i];
			MinName = firstname[i] + " " + lastname[i] + " " + "(" + (String.format("%.2f", totalcost[i]))+ ")";
		}
		sum += totalcost[i];
		
	}
	System.out.println("Biggest:" + " " + MaxName);
	System.out.println("Smallest:" + " " + MinName);
	System.out.println("Average:" + " "+ String.format("%.2f", sum/itemcount));	
		}
	}

