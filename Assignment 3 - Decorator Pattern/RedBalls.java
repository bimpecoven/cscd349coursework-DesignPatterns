/*
 *	Blake Impecoven
 * 	CSCD349 - Assignment 3: Decorator Pattern
 *	Description: Balls Red Decoration class
**/
package treePackage;

public class RedBalls extends Decorations {
	
	public RedBalls(Tree tree) {
		this.tree = tree;
		this.name = "Red Balls";
		this.cost = 1.0;
	}//end Constructor

	public double cost() {
		return this.cost + tree.cost();
	}//end cost

	public String toString() {
		return tree.toString() + ", " + this.name;
	}//end toString
	
}//end class 