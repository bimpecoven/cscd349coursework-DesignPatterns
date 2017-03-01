/*
 *	Blake Impecoven
 * 	CSCD349 - Assignment 3: Decorator Pattern
 *	Description: abstract class for trees to inherit from
**/
package treePackage;

public abstract class Tree {
	
	protected double cost;
	protected String name;
   
  	public abstract String toString();
  	public abstract double cost();
}//end class 