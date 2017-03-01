/*
 *	Blake Impecoven
 * 	CSCD349 - Assignment 3: Decorator Pattern
 *	Description: Fraser Fir Tree class
**/
package treePackage;

public class FraserFir extends Tree {
	
	public FraserFir() {
		this.name = "Fraser Fir";
		this.cost = 35.0;
	}//end Constructor

	public String toString() {
		return this.name + " decorated with";
	}//end toString

	public double cost() {
		return this.cost;
	}//end cost
	
}//end class 