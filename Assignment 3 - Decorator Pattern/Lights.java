/*
 *	Blake Impecoven
 * 	CSCD349 - Assignment 3: Decorator Pattern
 *	Description: Lights Decoration class
**/
package treePackage;

public class Lights extends Decorations {
	
	public Lights(Tree tree) {
		this.tree = tree;
		this.name = "Lights";
		this.cost = 5.0;
	}//end Constructor

	public double cost() {
		return this.cost + tree.cost();
	}//end cost

	public String toString() {
		return tree.toString() + ", " + this.name;
	}//end toString
	
}//end class 