package Arrays;

public class Array1 {
    public static void main(String[] args) {
        int[] list = new int[10];

        char[] name;
        name = new char[5];

        boolean[] flags;
        flags = new boolean[10];

        // print contents
        System.out.println("Contents of integer array:");
        for (int i = 0; i < list.length; i++)
	        System.out.println("  list[" + i + "] = " + list[i]);

        // when printing contents of char array, note that we cast
        //  the char value as an int, so as to print the ascii value
        System.out.println("Contents of character array:");
        for (int i = 0; i < name.length; i++)
	        System.out.println("  name[" + i + "] = " + (int)name[i]);

        System.out.println("Contents of boolean array:");
        for (int i = 0; i < flags.length; i++)
	        System.out.println("  flags[" + i + "] = " + flags[i]);

        //    Out of bounds index.  Uncomment and see what happens
        //    System.out.println("list[15] = " + list[15]);
    }
}
