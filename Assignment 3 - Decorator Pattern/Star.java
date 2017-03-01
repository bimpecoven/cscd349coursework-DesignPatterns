/*
 *	Blake Impecoven
 * 	CSCD349 - Assignment 3: Decorator Pattern
 *	Description: Star Decoration class
**/
package treePackage;

public class Star extends Decorations {
   
   	public static Tree addStar(Tree tree)
   	{  
   		if(!(tree.toString().contains("Star")))
         	tree = new Star(tree);
      	else
         	System.out.println("Tree already has a Star!");   
      	return tree;
   	}//end addStar
	
	private Star(Tree tree) {
		this.tree = tree;
		this.name = "Star";
		this.cost = 4.0;
	}//end Constructor

	public double cost() {
		return this.cost + tree.cost();
	}//end cost

	public String toString() {
		return tree.toString() + ", " + this.name;
	}//end toString
	
}//end class 