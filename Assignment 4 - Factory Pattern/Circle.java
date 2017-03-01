/*
 *  Blake Impecoven - CSCD349 - Factory Pattern
 *  Circle concrete class - inherits from Shape.java
 *  contained within shapes package
 *
**/

package shapes;

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        this.name = "Circle";
        this.area = getArea();
    }//end DVC

    public double getArea() {
        return (this.radius * this.radius) * Math.PI;
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
