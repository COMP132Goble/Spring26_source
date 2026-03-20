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

        try {
            System.out.println("x/y = " + divide(x, y));
        } catch(IllegalArgumentException e) {
            System.out.println("bad maths");
        }
        
        System.out.println("We are now past the division!");
    }

    public static int divide(int a, int b) throws IllegalArgumentException{
        if (b == 0) {
            throw new IllegalArgumentException("second param cannot be zero");
        }
        return a / b;
    }
}
