/*
 *  Blake Impecoven - CSCD349 - Factory Pattern
 *  ShapeFactory - part of shapes package
 *
**/

package shapes;

public class ShapeFactory {
    public Shape createShape(String type, double... measurements) {
        Shape shape = null;

        if (type.equalsIgnoreCase("triangle")) {
            shape = new Triangle(measurements[0], measurements[1]);
        }
        else if (type.equalsIgnoreCase("rectangle")) {
            shape = new Rectangle(measurements[0], measurements[1]);
        }//end elseif
        else if (type.equalsIgnoreCase("square")) {
            shape = new Square(measurements[0]);
        }
        else if (type.equalsIgnoreCase("circle")) {
            shape = new Circle(measurements[0]);
        }//end elseif

        return shape;
    }//end createShape
}//end ShapeFactory class
