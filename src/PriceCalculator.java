import java.util.Scanner;


public class PriceCalculator {
	
	
	/** Calculates the total cost of product based on whether it is 
	 * a luxury item or a necessary item.
	 * 
	 * @param:  User input - Cost price of the item in double
	 * 		    User input - Boolean value, true if the item is a luxury item
	 * @return: Double array with selling price in dollars and cents.
	 * 
	 */
	
	public static double[] computeTotalCost(double costPrice, boolean luxury) {
		
		double sellingPriceDollars;
		double sellingPriceCents;
		
		if(luxury) {
			sellingPriceDollars = costPrice + (costPrice * 0.09);
		}
		else {
			sellingPriceDollars = costPrice + (costPrice * 0.01);
		}
		
		sellingPriceCents = sellingPriceDollars * 100;
		return new double[] {sellingPriceDollars, sellingPriceCents };
		
	}
	
	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		boolean lux;
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter the  cost price of the item: ");
		double price = reader.nextDouble(); 
		System.out.println("Is the product a luxury item? Y/N");
		String ans = reader.next();
		
		if(ans.equals("Y")) {
			lux = true;
		}
		else {
			lux = false;
		}
		
		double[] res = computeTotalCost(price, lux);
		System.out.println("The selling price in dollars is $" + res[0] + "\n" + "The selling price in cents is ¢" + res[1] );
	}

}
