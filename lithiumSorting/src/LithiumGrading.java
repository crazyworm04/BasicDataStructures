import java.util.ArrayList;

/**
 * A class for assigning the lithium values into suitable grades
 * 
 * @author Jamie Knott(jk577)
 * @version 17/10/2019
 */

public class LithiumGrading {

	private ArrayList<Integer> lowGrade;
	private ArrayList<Integer> highGrade;
	
	/**
	 * Class constructor
	*/
	public LithiumGrading() {
		
		lowGrade = new ArrayList<>();
		highGrade = new ArrayList<>();
		
	}
	
	/**
	 * Accessor methods for the ArrayList fields
	*/
	public ArrayList<Integer> getLowGrade(){
		return lowGrade;
	}
	public ArrayList<Integer> getHighGrade(){
		return highGrade;
	}
	
	/**
	 * Method for sorting the Lithium values into high or low grade ArrayLists
	 * @param lithiumTray the initial 2D array needing to be filtered 
	*/
	public void generateGrades(int[][] lithiumTray) {
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++){
				if(lithiumTray[i][j] > 25) {
					highGrade.add(lithiumTray[i][j]);
				}
				else if(lithiumTray[i][j] < 26) {				
					lowGrade.add(lithiumTray[i][j]);
				}
			}
		}		
	}
	
	/**
	 * Method for sorting lithium values into ascending order with a bubble sort
	 * @param lithiumTray the initial ArrayList that is to be sorted
	*/
	public void sortingLithium(ArrayList<Integer> lithiumTray) {
		int temporary;
		for(int i = 0; i < lithiumTray.size() - 1; i++) {
			for(int j = 0; j < lithiumTray.size() - i - 1; j++) {
				if(lithiumTray.get(j) > lithiumTray.get(j + 1)) {
					temporary = lithiumTray.get(j);
					lithiumTray.set(j, lithiumTray.get(j + 1));
					lithiumTray.set(j + 1, temporary);
				}
			}
		}		
	}	
}