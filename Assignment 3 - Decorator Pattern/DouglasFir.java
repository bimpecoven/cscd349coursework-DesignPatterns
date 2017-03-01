/*
 *	Blake Impecoven
 * 	CSCD349 - Assignment 3: Decorator Pattern
 *	Description: Douglas Fir Tree class
**/
package treePackage;

public class DouglasFir extends Tree {
	
	public DouglasFir() {
		this.name = "Douglas Fir";
		this.cost = 30.0;
	}//end Constructor

	public String toString() {
		return this.name + " decorated with";
	}//end toString
	
	public double cost() {
		return this.cost;
	}//end cost

}//end class 