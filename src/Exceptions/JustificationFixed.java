package Exceptions;

import java.util.Scanner;

public class JustificationFixed {
    public static void main(String[] args) {
        int x, y;
        Scanner input = new Scanner(System.in);
        System.out.print("Please provide a numerator value: ");
        x = input.nextInt();
        System.out.print("Please provide a denominator value: ");
        y = input.nextInt();

        input.close();

        try {
            System.out.println("BEFORE");
            System.out.println("x/y = " + (x/y));
            System.out.println("AFTER");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Execution continues");
    }
}
