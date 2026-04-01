package Sorting.Recursion;

public class Factorial {
    public static long factorial(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int number = 5;
        long result = factorial(number);
        System.out.println(number + "! = " + result);
    }
}
