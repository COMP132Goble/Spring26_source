package Inheritance;

public class Student extends Person {
    private static int STU_ID = 0;
    private final int MAX_COURSES = 5;
    private String college;
    private String[] currentClasses;
    private int index = 0;

    public Student(String name, String address, String phone, String college) {
        super(name, address, phone);
        this.college = college;
        currentClasses = new String[MAX_COURSES];
        STU_ID++;
    }

    public void addClass(String course) {
        if (index < MAX_COURSES) {
            currentClasses[index] = course;
            index++;
        } else {
            System.out.println("Student is enrolled in too many courses...");
        }
    }

    public void getDetails() {
        System.out.print("Student ");
        super.getDetails();
        System.out.println(" is enrolled in " + index + " courses this semester.");
    }
}
