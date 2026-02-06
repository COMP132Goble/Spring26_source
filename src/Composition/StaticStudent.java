package Composition;

public class StaticStudent {
    private int testGrade;                          // instance variable (non-static)
    private static int numberStudents = 0;          // static variable (class variable)
    private final static double possiblePoints = 75;  // class constant variable

    public StaticStudent() {
        testGrade = 0;
    }

    public void setGrade(int points) {
        testGrade = points;
    }

    public double getGrade() {
        return (testGrade / possiblePoints) * 100;
    }

    public static void increaseNumStudents() {
        numberStudents++;
    }

    public static int getNumStudents() {
        return numberStudents;
    }

    public static void main(String[] args) {
        for(int i = 0; i < 20; i++) {
            StaticStudent.increaseNumStudents();
        }
        
        int number = StaticStudent.getNumStudents();
        System.out.println("There are " + number + " students in the class...");

        StaticStudent student1 = new StaticStudent();
        student1.setGrade(70);
        System.out.printf("I earned a %.2f on my last assignment...\n", student1.getGrade());
    }
}
