/*
 *	Blake Impecoven
 * 	CSCD349 - Assignment 3: Decorator Pattern
 *	Description: abstract class for decorations to inherit from
**/
package treePackage;

public abstract class Decorations extends Tree {
	
	Tree tree;

	public abstract String toString();
	
}//end class