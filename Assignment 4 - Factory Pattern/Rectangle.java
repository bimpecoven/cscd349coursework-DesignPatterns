/*
 *  Blake Impecoven - CSCD349 - Factory Pattern
 *  Rectangle concrete class - inherits from Shape.java
 *  contained within shapes package
 *
**/

package shapes;

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        this.name = "Rectangle";
        this.area = getArea();
    }//end DVC

    public double getArea() {
        return this.length * this.width;
    }//end getArea

    public int compareTo(Shape passedIn) {
        // Shape passedIn = (Shape)shape;

        Double thisArea = this.area;
        Double piArea = passedIn.area;

        // Check if shapes are same type
        if (this.name.equalsIgnoreCase(passedIn.name)) {
            return thisArea.compareTo(piArea);
        }//end if
        else {
            return this.name.compareTo(passedIn.name);
        }//end if
    }//end compareTo

    public String toString() {
        return "Shape: " + this.name + ", Area: " + this.area;
    }//end toString
}//end class
