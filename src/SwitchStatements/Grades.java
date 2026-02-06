package SwitchStatements;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your numerical grade as an int: ");
        char grade = 'Z';
        int score = input.nextInt();
        
        if (score >= 90) {
            System.out.println("You got an A!!");
        } else if (score >= 80) {
        // else if (score >= 80 && score <= 89) {
            System.out.println("You got an B!");
        } else if (score >= 70) {
            System.out.println("You got an C");
        } else if (score >= 60) {
            System.out.println("You got an D.");
        } else {
            System.out.println("You got an F...");
        } 
        
        switch (score / 10) {
            case 10: 
                break;
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
                break;
        }

        System.out.println(grade);

        input.close();
    }
}
