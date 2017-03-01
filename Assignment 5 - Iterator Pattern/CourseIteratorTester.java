/*
 *  Blake Impecoven - CSCD349 - February, 2017.
 *  Iterator Assignment
 *  Tester File for Course.java and Student.java
**/

import course.*;

import java.util.*;

public class CourseIteratorTester {
    public static void main(String[]args) {

        Course course = new Course();

        Student student1 = new Student("James", 12345);
        Student student2 = new Student("Blake", 23456);
        Student student3 = new Student("Alex", 34567);
        Student student4 = new Student("Stanley", 45678);
        Student student5 = new Student("Cameron", 56789);

        course.addStudent(student1);
        course.addStudent(student2);
        course.addStudent(student3);
        course.addStudent(student4);
        course.addStudent(student5);

        System.out.println("Foreach loop:");

        for(Student s : course.students) {
            System.out.println(s);
        }//end foreach

        System.out.println("\nFor Loop:");

        for( Iterator<Student> i = course.iterator(); i.hasNext(); ) {
            Student s = i.next();
            System.out.println(s);
        }
    }//end main
}//end class
