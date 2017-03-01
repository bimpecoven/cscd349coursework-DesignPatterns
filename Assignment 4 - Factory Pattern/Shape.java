/*
 *  Blake Impecoven - CSCD349 - Factory Pattern
 *  Shape abstract class - part of shapes package
 *
**/

package shapes;

public abstract class Shape implements Comparable<Shape> {
    String name;
    double area;

    public abstract double getArea();
    public abstract int compareTo(Shape passedIn);
    public abstract String toString();
}//end Shape class
