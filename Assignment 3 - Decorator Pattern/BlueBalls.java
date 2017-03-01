/*
 *	Blake Impecoven
 * 	CSCD349 - Assignment 3: Decorator Pattern
 *	Description: Blue Balls Decoration class
**/
package treePackage;

public class BlueBalls extends Decorations {
	
	public BlueBalls(Tree tree) {
		this.tree = tree;
		this.name = "Blue Balls";
		this.cost = 2.0;
	}//end Constructor

	public double cost() {
		return this.cost + tree.cost();
	}//end cost

	public String toString() {
		return tree.toString() + ", " + this.name;
	}//end toString
	
}//end class 