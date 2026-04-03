package Sorting;

import java.util.Arrays;
import java.util.Comparator;

public class Student implements Comparable<Student>{
    private String firstName;
    private String lastName;
    private static int nextId = 1;
    private int id;
    private double gpa;

    public Student(String first, String last, double gpa) {
        this.firstName = first;
        this.lastName = last;
        this.gpa = gpa;
        this.id = nextId++;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getGpa() {
        return gpa;
    }

    public int getID() {
        return id;
    }

    // this allows us to establish what "natural ordering" means for the class
    @Override
    public int compareTo(Student other) {
        char myFirstLetter = Character.toLowerCase(this.getFirstName().charAt(0));
        char theirFirstLetter = Character.toLowerCase(other.getFirstName().charAt(0));

        // this comes before other alphabetically
        if (myFirstLetter < theirFirstLetter) {
            return -1;
        // other comes before this alphabetically
        } else if (myFirstLetter > theirFirstLetter) {
            return 1;
        // this and other start with the same letter
        } else {
            return 0;
        }
    }

    public static Comparator<Student> byGpa = new Comparator<>() {
        @Override
        public int compare(Student a, Student b) {
            Double myGpa = a.getGpa();
            Double theirGpa = b.getGpa();

            if(myGpa < theirGpa) {
                return 1;
            } else if (myGpa > theirGpa) {
                return -1;
            } else {
                return 0;
            }

            // this would do the same thing
            // return -1 * Double.compare(a.getGpa(), b.getGpa());
        }
    };

    public static void main(String[] args) {
        Student person1 = new Student("Bob", "Johnson", 4.00);
        Student person2 = new Student("Alice", "Johnson", 3.14);
        Student person3 = new Student("Carl", "Johnson", 2.14);

        String[] words = {"This", "is", "an", "example"};
        Arrays.sort(words);
        for(String word: words) {
            System.out.print(word + " ");
        }
        System.out.println();

        Student[] students = {person1, person2, person3};
        Arrays.sort(students, Student.byGpa);
        // Arrays.sort(students);

        for(int i = 0; i < students.length; i++) {
            System.out.println(students[i].getFirstName());
        }
    }
}
