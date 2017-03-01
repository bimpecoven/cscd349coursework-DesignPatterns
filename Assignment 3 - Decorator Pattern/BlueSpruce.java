/*
 *	Blake Impecoven
 * 	CSCD349 - Assignment 3: Decorator Pattern
 *	Description: Blue Spruce Tree class
**/
package treePackage;

public class BlueSpruce extends Tree {
	
	public BlueSpruce() {
		this.name = "Colorado Blue Spruce";
		this.cost = 50.0;
	}//end Constructor

	public String toString() {
		return this.name + " decorated with";
	}//end toString

	public double cost() {
		return this.cost;
	}//end cost
	
}//end class 