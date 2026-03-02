package Arrays;

import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
        // example();
        copying();
    }

    public static void basics() {
        int[] list;
        char[] name;
        double[] nums;
        System.out.println("Give me a size");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        input.close();

        list = new int[30];
        name = new char[20];
        nums = new double[x];

        int[] list2 = new int[30];
        char[] name2 = new char[20];
        double[] nums2 = new double[x];
    }

    public static void example() {
        int[] list = new int[10];
        char[] name;
        name = new char[5];
        boolean[] flags = new boolean[10];

        System.out.println("Contents of integer array:");
        for(int i = 0; i < list.length; i++) {
            System.out.println(" list[" + i + "] = " + list[i]);
        }

        // when printing contents of char array, note that we cast
        //  the char value as an int, so as to print the ascii value
        System.out.println("Contents of character array:");
        for (int i = 0; i < name.length; i++)
	        System.out.println("  name[" + i + "] = " + (int)name[i]);

        System.out.println("Contents of boolean array:");
        for (int i = 0; i < flags.length; i++)
            System.out.println("  flags[" + i + "] = " + flags[i]);
    }

    public static void copying() {
        int[] list1 = new int[5];
        int[] list2 = {3, 5, 7, 9, 11};

        list1 = list2;

        printArr(list1);
        System.out.println("*******************************");
        printArr(list2);

        list2[0] = 13;
        list1[1] = 15;

        printArr(list1);
        System.out.println("*******************************");
        printArr(list2);

        for(int index = 0; index < list2.length; index++) {
            list1[index] = list2[index];
        }

        list2 = new int[10];
        for(int index = 0; index < list1.length; index++) {
            list2[index] = list1[index];
        }
        printArr(list1);
        System.out.println("*******************************");
        printArr(list2);
    }

    public static void printArr(int[] arr) {
        for(int index = 0; index < arr.length; index++)
            System.out.print(arr[index] + ", ");
        System.out.println();
    }
}
