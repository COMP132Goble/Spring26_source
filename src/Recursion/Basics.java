package Recursion;

public class Basics {
    static void countDown(int n) {
        if (n == 0) {
            System.out.println("Blast off");
        } else {
            System.out.println(n + "...");
            countDown(n-1);
        }
    }

    static int factorial(int n) {
        if (n == 1) {
            return n;
        } else {
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args) {
        // countDown(10);
        int value = factorial(1000);
        System.out.println(value);
    }
}
