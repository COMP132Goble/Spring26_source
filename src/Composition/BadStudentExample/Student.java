package Composition.BadStudentExample;

/**
 * This class demonstrates a bad design for a Student class. It contains far 
 * too many fields and groups of those fields actually represent other objects.
 * A much better design for this class will separate those objects into 
 * distinct classes and use Composition to create the Student class.  See the
 * GoodStudentDesign project for an example.
 * 
 * @author Grant Braught, revision by William Goble
 * 
 */
public class Student {
    //Student Information
    private String name;
    private int hubBox;
    private String studentID;

    // Student's home address information
    private int homeHouseNumber;
    private String homeStreetName;
    private String homeCity;
    private String homeState;
    private String homeZipCode;
    
    // Student's local address information.
    private int localHouseNumber;
    private String localStreetName;
    private String localCity;
    private String localState;
    private String localZipCode;    
    
    // Student's course information.
    private String course1Name;
    private String course1Department;
    private String course1Location;
    private String course1Time;
    private String course1Instructor;
    
    private String course2Name;
    private String course2Department;
    private String course2Location;
    private String course2Time;
    private String course2Instructor;
    
    private String course3Name;
    private String course3Department;
    private String course3Location;
    private String course3Time;
    private String course3Instructor;
    
    private String course4Name;
    private String course4Department;
    private String course4Location;
    private String course4Time;
    private String course4Instructor;

    /*
     * The constructors, accessors and mutators have been omitted
     * from this class. Hopefully, you can imagine the number
     * of accessor and mutator methods that would be required to 
     * make this design work.  One accessor for each field, separate
     * mutators for changing the address and each course.  There would
     * be a significant amount of code to write.  Further, to add an
     * additional course would require the addition of 5 new fields
     * as well as accessors and mutators for those fields.
     */
}
