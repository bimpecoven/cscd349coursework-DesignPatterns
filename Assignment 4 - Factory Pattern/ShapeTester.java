/*
 *  Blake Impecoven - CSCD349 - Factory Pattern
 *  Main tester - use package: shapes
 *
**/

import shapes.*;
import java.util.*;

public class ShapeTester {
    public static void main(String[]args) {
        ArrayList<Shape> shapeList = new ArrayList<Shape>();
        ShapeFactory shapeFactory = new ShapeFactory();

        // Build different shapes
        Shape triangle1 = shapeFactory.createShape("Triangle", 5, 10);
        Shape square1 = shapeFactory.createShape("Square", 5);
        Shape rectangle1 = shapeFactory.createShape("Rectangle", 5, 10);
        Shape circle1 = shapeFactory.createShape("Circle", 5);

        // Add shapes to list
        addShapesToList(shapeList, triangle1, square1, rectangle1, circle1);

        // Building and adding more shapes to test all sorting cases
        Shape circle2 = shapeFactory.createShape("Circle", 12);
        Shape circle3 = shapeFactory.createShape("Circle", 8);
        Shape square2 = shapeFactory.createShape("Square", 9);
        Shape rectangle2 = shapeFactory.createShape("Rectangle", 12, 2);
        Shape triangle2 = shapeFactory.createShape("Triangle", 15, 3);
        
        addShapesToList(shapeList, circle2, square2, triangle2, circle3, rectangle2);

        // Print list before sorting
        System.out.println("Shapes before sorting:\n" + shapeList);

        // Print list after sorting - testing output
        Collections.sort(shapeList);
        System.out.println("\nShapes after sorting:\n" + shapeList);
    }//end main

    public static void addShapesToList(ArrayList<Shape> shapeList, Shape... shapes) {
        for (int x = 0; x < shapes.length; x++) {
            shapeList.add(shapes[x]);
        }//end for
    }//end addShapes
}//end class
