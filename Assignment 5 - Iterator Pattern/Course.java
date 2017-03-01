/*
 *  Blake Impecoven - CSCD349 - February, 2017.
 *  Iterator Assignment
 *  Course Class
**/

package course;

import java.util.*;

public class Course implements Iterable<Student> {

    public ArrayList<Student> students;

    private class CourseIterator implements Iterator<Student> {

        private int nextStudent;
        private ArrayList<Student> students;

        public CourseIterator(ArrayList<Student> students) {
            this.nextStudent = 0;
            this.students = students;
        }//end constructor

        @Override
        public boolean hasNext() {
            if(nextStudent <= students.size() - 1) {
                return true;
            }//end if
            else {
                return false;
            }
        }//end hasNext

        @Override
        public Student next() {
            if(hasNext()) {
                return students.get(nextStudent++);
            }//end if
            else {
                return null;
            }//end else
        }//end next

        @Override
        public void remove() {}

    }//end Class

    public Course() {
        this.students = new ArrayList<Student>();
    }//end constructor

    @Override
    public Iterator<Student> iterator() {
        return new CourseIterator(students);
    }//end constructor

    public void addStudent(Student s) {
        this.students.add(s);
    }//end addStudent

}//end Course
