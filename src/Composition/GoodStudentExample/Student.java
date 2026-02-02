package Composition.GoodStudentExample;

/**
 * A class representing a Student. This class improves on the design shown in 
 * badStudentDesign by using Composition to create the Student. Separate classes 
 * are used to represent the Address and Courses
 * 
 * @author Grant Braught, revisions by William Goble
 */
public class Student {
    private String name;
    private int hubBox;
    private String studentID;

    private Address homeAddress;
    private Address localAddress;

    private Course course1;
    private Course course2;
    private Course course3;
    private Course course4;

    /*
     * Constructors, accessors, and mutators have been intentially omitted 
     * for this example
     */
}
