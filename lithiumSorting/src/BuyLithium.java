import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * A class for filtering and printing lithium based on search criteria(parameters)
 * 
 * @author Jamie Knott(jk577)
 * @version 17/10/2019
 */

public class BuyLithium {

	private HashMap<Integer, Double> lithium;
	
	/**
	 *Class constructor 
	*/
	public BuyLithium(HashMap<Integer, Double> lithium) {
		this.lithium = lithium;
	}
	
	/**
	 * Method for filtering the lithium grades based upon the specified price
	 * @param price the price value input that extracts any lithium with price
	 * equal to or less than that value
	*/
	public void findBestPrice(double price){
		
		int count = 0;
		Set<Integer> keys = lithium.keySet();
		ArrayList<Integer> lithiumPrices =  new ArrayList<Integer>();
		
		for(Integer key : keys) {
			lithiumPrices.add(key.intValue());
		}
		
		for(int i = 0; i < lithiumPrices.size(); i++) {
			int lithiumPrice = lithiumPrices.get(i);
			
			if(lithium.get(lithiumPrice) <= price) {
				count++;
				if(lithiumPrices.get(i) < 10) {
					System.out.println(lithiumPrices.get(i) + "    £" + lithium.get(lithiumPrice));
				}
				else {
					System.out.println(lithiumPrices.get(i) + "   £" + lithium.get(lithiumPrice));
				}				
			}			
		}
		if(count == 1) {
			System.out.println("There is " + count + " choice available to you.");
		}
		else {
			System.out.println("There are " + count + " choices available to you.");
		}
	}
	
	/**
	 * Method for filtering the Lithium grades based upon the specified Lithium Grade
	 * @param lithiumGrade the grade of Lithium that extracts any Lithium that is
	 * equal to or greater than, that particular Lithium grade value
	*/
	public void findHighQuality(int lithiumGrade) {
		if(lithiumGrade > 50 || lithiumGrade < 0) {
			System.out.println("Please enter a valid lithium grade (1-50)");
			lithiumGrade = 51;
		}
		
		int count = 0;
		Set<Integer> keys = lithium.keySet();
		ArrayList<Integer> lithiumPrices =  new ArrayList<Integer>();
		
		for(Integer key : keys) {
			lithiumPrices.add(key.intValue());
		}
		
		for(int i = 0; i < lithiumPrices.size(); i++) {
			int lithiumPrice = lithiumPrices.get(i);
			
			if(lithiumPrice >= lithiumGrade) {
				count++;
				if(lithiumPrices.get(i) < 10) {
					System.out.println(lithiumPrices.get(i) + "    £" + lithium.get(lithiumPrice));
				}
				else {
					System.out.println(lithiumPrices.get(i) + "   £" + lithium.get(lithiumPrice));
				}				
			}			
		}
		if(count == 1) {
			System.out.println("There was " + count + " grade of lithium located.");
		}
		else {
			System.out.println("There were " + count + " grades of lithium located.");
		}		
	}	
}