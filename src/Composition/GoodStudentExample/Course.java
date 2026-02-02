package Composition.GoodStudentExample;

/**
 * A class representing a Course that may be taken by a Student. Notice that 
 * if we were to happen to have another application, such as a high school, 
 * we could reuse this class as opposed to writing new code. Also, notice that, 
 * the code for accessing and mutating the fields of a course will only need to 
 * be written once, as opposed to the badStudentDesign where we would have needed 
 * to write them for each course.
 */
public class Course {
    private String name;
    private String department;
    private String location;
    private String time;
    private String instructor;

    /*
     * Constructors, accessors, and mutators have been intentially omitted 
     * for this example
     */
}