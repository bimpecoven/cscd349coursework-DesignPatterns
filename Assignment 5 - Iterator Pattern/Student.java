/*
 *  Blake Impecoven - CSCD349 - February, 2017.
 *  Iterator Assignment
 *  Student Class
**/

package course;

public class Student {

    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }//end constructor

    public String toString() {
        return "Name: " + this.name + " ID: " + this.id;
    }//end toString

}//end Student
