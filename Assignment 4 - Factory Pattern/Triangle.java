/*
 *  Blake Impecoven - CSCD349 - Factory Pattern
 *  Triangle concrete class - inherits from Shape.java
 *  contained within shapes package
 *
**/

package shapes;

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
        this.name = "Triangle";
        this.area = getArea();
    }//end DVC

    public double getArea() {
        return (this.base * this.height) / 2;
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
