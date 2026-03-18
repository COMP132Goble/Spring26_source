package Exceptions;

public class ThrowingExceptions {
    public static void main(String[] args) {
        divide(10, 2);  // normal call
        divide(10, 0);  // throws ArithmeticException
    }

    public static void divide(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // this block only runs if an ArithmeticException is thrown
            System.out.println("Error: Cannot divide by zero!");
            System.out.println("Details: " + e.getMessage());
        } finally {
            // this block always runs
            System.out.println("divide() method finished");
        }
    }

    public static void readAndParse(String[] data, int index) {
        try {
            String value = data[index];             // might throw ArrayIndexOutOfBoundsException
            int number = Integer.parseInt(value);   // might throw NumberFormatException
            System.out.println("Parsed: " + number);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Bad index: " + e.getMessage());
        } catch(NumberFormatException e) {
            System.out.println("Not a number: " + e.getMessage());
        } catch(Exception e) {
            // Generic fallback -- catches anything else
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }

    public static void setAge(int age) throws IllegalArgumentException {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Age must be 0-150, but received " + age);
        }

        System.out.println("Age set to: " + age);
    }

    public static void handlingThrowables() {
        try {
            setAge(25);
            setAge(-5);
        } catch(IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
