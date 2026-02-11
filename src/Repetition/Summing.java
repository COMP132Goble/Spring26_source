import java.util.Scanner;

public class Summing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int value;
        System.out.print("Please enter an integer: ");
        value = input.nextInt();

        int sum = 0;
        int i;
        for(i = 0; i <= value; i++) {
            if (i % 5 == 0) {
                sum = sum + 1;
            }
        }
        System.out.println("In the range 1 through " + value + ",\n\tthe sum of the numbers that are divisible by 5 = " + sum);
    }
}
