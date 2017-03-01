/*
 *	Blake Impecoven
 * 	CSCD349 - Assignment 3: Decorator Pattern
 *	Description: Ruffles Decoration class
**/
package treePackage;

public class Ruffles extends Decorations {
	
	public Ruffles(Tree tree) {
		this.tree = tree;
		this.name = "Ruffles";
		this.cost = 1.0;
	}//end Constructor

	public double cost() {
		return this.cost + tree.cost();
	}//end cost

	public String toString() {
		return tree.toString() + ", " + this.name;
	}//end toString
	
}//end class 