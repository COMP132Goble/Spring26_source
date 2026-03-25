package Sorting;

import java.util.Random;

public class MyTools {
    private static Random rand = new Random();

    public static int[] getRandomIntArray(int min, int max, int length) {
        int[] my_array = new int[length];

        for(int i = 0; i < length; i++) {
            my_array[i] = rand.nextInt(max - min) + min;
        }

        return my_array;
    }

    public static void printIntArray(int[] my_array) {
        int count = 0;
        for(int i = 0; i < my_array.length; i++) {
            System.out.printf("%1$9d", my_array[i]);
            count++;
            if (count % 10 == 0) {
                System.out.println();
            }
        }
    }
}
