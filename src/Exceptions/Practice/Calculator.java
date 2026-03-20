package Exceptions.Practice;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = input.nextInt();
        System.out.print("Enter operator [+, -, /, *]: ");
        String operator = input.next();
        System.out.print("Enter second number: ");
        int second = input.nextInt();

        int result = calculate(first, operator, second);
        System.out.println("Result: " + result);
    }

    public static int calculate(int first, String operator, int second) {
        return switch(operator) {
            case "+" -> first + second;
            case "-" -> first - second;
            case "*" -> first * second;
            case "/" -> first / second;
            // the exception being thrown is an unchecked expression
            default -> throw new IllegalArgumentException("Invalid operator");
        };
    }
}
