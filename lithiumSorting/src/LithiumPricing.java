import java.util.HashMap;
import java.util.Set;

/**
 * A class for assigning the lithium values with a price (into a HashMap)
 * 
 * @author Jamie Knott(jk577)
 * @version 17/10/2019
 */

public class LithiumPricing extends BuyLithium {
	
	private static HashMap<Integer, Double> lithiumPricing = new HashMap<Integer, Double>();
	
	/**
	 * Class constructor
	*/
	public LithiumPricing() {
		super(lithiumPricing);
	}
	
	/**
	 * Accessor method for lithiumPricing
	 * @return lithiumPricing the HashMap field for the lithium and their price
	*/
	public HashMap<Integer, Double> getLithiumPricing(){
		return lithiumPricing;
	}
		
	/**
	 * Method for assigning the appropriate price for each lithium value
	 * @param lithiumTray the 2D int array containing all the unpriced lithium values
	*/
	public void setPrice(int[][] lithiumTray) {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 3; j++) {
				
				if(lithiumTray[i][j] > 0 && lithiumTray[i][j] <= 9) {
					lithiumPricing.put(lithiumTray[i][j], 300.00d);
				}
				else if(lithiumTray[i][j] > 9 && lithiumTray[i][j] <= 19) {
					lithiumPricing.put(lithiumTray[i][j], 600.00d);
				}
				else if(lithiumTray[i][j] > 19 && lithiumTray[i][j] <= 29) {
					lithiumPricing.put(lithiumTray[i][j], 900.00d);
				}
				else if(lithiumTray[i][j] >= 30) {
					lithiumPricing.put(lithiumTray[i][j], 1250.00d);
				}				
			}
		}
	}
	
	/**
	 * Method for printing the keys and values (lithium values and prices) of the HashMap 
	*/
	public void printPrice() {
		
		Set<Integer> keys = lithiumPricing.keySet();
						
		for(Integer key : keys) {
			if(key.intValue() < 10) {
				System.out.println(key.intValue() + "    £" + lithiumPricing.get(key.intValue()) + "0");
			}
			else {
				System.out.println(key.intValue() + "   £" + lithiumPricing.get(key.intValue()) + "0");
			}
		}
	}
}