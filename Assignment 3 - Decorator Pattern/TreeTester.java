/*
 *	Blake Impecoven
 * 	CSCD349 - Assignment 3: Decorator Pattern
 *	Description: Tester file for the decorator pattern
**/

import treePackage.*;

public class TreeTester {
    
	public static void main(String[]args) {

        System.out.println("Time to decorate the tree!\nLets get a Blue Spruce!");
		Tree mytree = new BlueSpruce();
        printTree(mytree);

        System.out.println("Adding some ruffles, blue colored balls, and a star!");
        mytree = new Ruffles(mytree);
        mytree = new BlueBalls(mytree); 
        mytree = Star.addStar(mytree);
        printTree(mytree);

        System.out.println("I'm gonna try to add some ribbons, lights, and another star!");
        mytree = new Ribbons(mytree);
        mytree = new Lights(mytree);
        mytree = Star.addStar(mytree);
        printTree(mytree);

        System.out.println("Grr! I can only put one star on each tree...\nOh well, lets add some more ruffles");
        mytree = new Ruffles(mytree);
        printTree(mytree);

        System.out.println("I know! I'll put my extra star on a Douglas Fir!");
        Tree myOtherTree = new DouglasFir();
        myOtherTree = Star.addStar(myOtherTree);
        printTree(myOtherTree);

        System.out.println("I'm gonna add some LEDs, Silver colored balls, and red colored balls!");
        myOtherTree = new LED(myOtherTree);
        myOtherTree = new SilverBalls(myOtherTree);
        myOtherTree = new RedBalls(myOtherTree);
        printTree(myOtherTree);

	}//end main

    public static void printTree(Tree mytree) {
        System.out.printf("%s costs $%.2f\n", mytree, mytree.cost());
    }//end printTree
    
}//end class 
