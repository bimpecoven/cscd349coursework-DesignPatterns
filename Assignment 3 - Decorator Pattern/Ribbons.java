/*
 *	Blake Impecoven
 * 	CSCD349 - Assignment 3: Decorator Pattern
 *	Description: Ribbons Decoration class
**/
package treePackage;

public class Ribbons extends Decorations {
	
	public Ribbons(Tree tree) {
		this.tree = tree;
		this.name = "Ribbons";
		this.cost = 2.0;
	}//end Constructor

	public double cost() {
		return this.cost + tree.cost();
	}//end cost

	public String toString() {
		return tree.toString() + ", " + this.name;
	}//end toString
	
}//end class 