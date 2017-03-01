/*
 *	Blake Impecoven
 * 	CSCD349 - Assignment 3: Decorator Pattern
 *	Description: Balsam Fir Tree class
**/
package treePackage;

public class BalsamFir extends Tree {
	
	public BalsamFir() {
		this.name = "Balsam Fir";
		this.cost = 25.0;
	}//end Constructor

	public String toString() {
		return this.name + " decorated with";
	}//end toString

	public double cost() {
		return this.cost;
	}//end cost
	
}//end class 