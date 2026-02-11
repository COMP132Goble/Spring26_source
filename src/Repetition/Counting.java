import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int value;
        System.out.print("Please enter an integer: ");
        value = input.nextInt();

        int counter = 0;
        for(int i = 0; i <= value; i++) {
            if(i % 5 == 0) {
                counter++;
            }
        }

        System.out.println("There are " + counter + " numbers divisible by 5 in the range 1 through " + value);
    }
}