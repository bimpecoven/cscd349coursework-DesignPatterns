/*
 *	Blake Impecoven
 * 	CSCD349 - Assignment 3: Decorator Pattern
 *	Description: Silver Balls Decoration class
**/
package treePackage;

public class SilverBalls extends Decorations {
	
	public SilverBalls(Tree tree) {
		this.tree = tree;
		this.name = "Silver Balls";
		this.cost = 3.0;
	}//end Constructor

	public double cost() {
		return this.cost + tree.cost();
	}//end cost

	public String toString() {
		return tree.toString() + ", " + this.name;
	}//end toString
	
}//end class 