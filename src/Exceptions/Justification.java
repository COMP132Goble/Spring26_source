package Exceptions;

import java.util.Scanner;

public class Justification {
    public static void main(String[] args) {
        int x, y;
        Scanner input = new Scanner(System.in);
        System.out.print("Please provide a numerator value: ");
        x = input.nextInt();
        System.out.print("Please provide a denominator value: ");
        y = input.nextInt();

        input.close();

        System.out.println("x/y = " + (x/y));
        System.out.println("We are now past the division!");
    }
}
