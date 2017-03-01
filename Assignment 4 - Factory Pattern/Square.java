/*
 *  Blake Impecoven - CSCD349 - Factory Pattern
 *  Square concrete class - inherits from Shape.java
 *  contained within shapes package
 *
**/

package shapes;

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
        this.name = "Square";
        this.area = getArea();
    }//end DVC

    public double getArea() {
        return this.side * this.side;
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
