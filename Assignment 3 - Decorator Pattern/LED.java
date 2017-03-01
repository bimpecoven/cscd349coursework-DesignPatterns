/*
 *	Blake Impecoven
 * 	CSCD349 - Assignment 3: Decorator Pattern
 *	Description: LEDs Decoration class
**/
package treePackage;

public class LED extends Decorations {
	
	public LED(Tree tree) {
		this.tree = tree;
		this.name = "LEDs";
		this.cost = 10.0;
	}//end Constructor

	public double cost() {
		return this.cost + tree.cost();
	}//end cost

	public String toString() {
		return tree.toString() + ", " + this.name;
	}//end toString
	
}//end class 