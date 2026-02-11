import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value;
        System.out.print("Please enter an integer: ");
        value = input.nextInt();

        long product = 1;
        int i;
        for(i = 0; i <= value; i++) {
            if(i % 5 == 0)
                product = product * i;
        }

        System.out.println("In the range 1 through " + value + ",\n\tthe product of the numbers that are divisible by 5 = " + product);
    }
}
