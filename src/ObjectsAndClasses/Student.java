package ObjectsAndClasses;

/**
 * Here is a student class used to demonstrate the different elements of 
 * Java programming. 
 */

public class Student {
/*
Traditionally when we create a class we place the member data at the top 
of the file. This allows us to easily see what information the given class 
handles.
*/
    private String major;       // field of study
    private int year;           // 1 -> First year, 2 -> Second year, etc.

    /**
     * This is the default constructor for the class. It sets each field 
     * to a predetermined value. In this case all new students are first 
     * year students with no set major.
     */
    public Student() {
        major = "Undeclared";
        year = 1;
    }

    /**
     * This is a constructor with only one parameter, so a student can 
     * now become a first year student with their target major in mind.
     * @param major
     */
    public Student(String major) {
        this.major = major;
        this.year = 1;
    }

    /**
     * This is a constructor with two parameters. Now when we create a 
     * student we can set their major and what year they are. This could 
     * be useful if we have someone transfer in from a different school.
     * @param major
     * @param year
     */
    public Student(String major, int year) {
        this.major = major;
        this.year = year;
    }

/*
The following set of methods are referred to as Accessor methods. In 
class I will also refer to these methods as "getters" since they "get" 
the private member data for us.
*/
    public int getYear() {
        return year;
    }

    public String getMajor() {
        return major;
    }

/*
The following set of methods are referred to as Mutator methods. In 
class I will also refer to these methods as "setters" since they "set" 
the private memeber data for us.
*/
    public void setMajor(String newMajor) {
        major = newMajor;
    }

    public void increaseYear() {
        year = year + 1;
    }

    public void decreaseYear() {
        year -= 1;
    }

/*
Now let's just make a method so this program does something more fun
*/
public void showInfo() {
    System.out.println("The student is in year number " + 
                        year + " and studies " + major);
}

/*
Main method that allows us to run this class as an independent Java program.
*/
    public static void main(String[] args) {
        // Declairing a new student variable
        Student bob, alice;
        // Initializing our declared values
        bob = new Student();
        alice = new Student("Math");

        // or we can do this all in one line
        Student sam = new Student("Data", 3);
        System.out.println("Let's see our students");
        bob.showInfo();
        alice.showInfo();
        sam.showInfo();

        // Now let's change bob's major
        bob.setMajor("History");
        bob.increaseYear();
        System.out.print("Now bob's information is: ");
        bob.showInfo();
    }
}
