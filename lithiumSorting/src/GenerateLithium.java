import java.util.Random;

/**
 * A class for setting up the tray of lithium
 * 
 * @author Jamie Knott(jk577)
 * @version 17/10/2019
 */

public class GenerateLithium {

	private int tray [][] = new int [5][3];
	private int grading = 0;
	private Random randomGenerator;
	
	/**
	 * Constructor for objects of class GenerateLithium
	*/
	public GenerateLithium()  {
		randomGenerator = new Random();
	}
	/**
	 * Accessor method for Lithium tray
	*/
	public int[][] getTray(){
		return tray;
	}
	
	/**
	 * Method for generating a 2D array (5 x 3) of random values (the Lithium tray)
	*/ 
	public void generateSample() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++){
				grading = randomGenerator.nextInt((50 - 1) + 1) + 1;
				tray[i][j] = grading;	
			}
		}
				
	}
	/**
	 * Method for printing the 2D array of Lithium
	*/
	public void printTray() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++){
				System.out.println(tray[i][j]);
			}
		}
	}
}
