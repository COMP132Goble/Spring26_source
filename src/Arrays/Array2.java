package Arrays;

import java.util.ArrayList;

public class Array2 {
    public static void main(String[] args) {
        // Create an arrayList of musicians
        // String[] artist = new String[5];
        String[] artist;
        artist = new String[5];
        artist[0] = "Frank Ocean";
        artist[1] = "One Direction";
        artist[2] = "Rihanna?";
        artist[3] = "Toby Fox";
        artist[4] = "The Weeknd";

        String[] color = {"Green", "Blue", "Teal", "Brown", "Black", "Green"};


        // Create the multiplication table
        int[][] table = new int[10][10];
        int row = 10;
        int column = 10;
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                table[i][j] = i * j;
            }
        }

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }

        // artist[1] = "Kendrick";
        // for(int i = 0; i < artist.length; i++) {
        //     System.out.println(artist[i]);
        // }

        // ArrayList<String> artist2 = new ArrayList<String>();
        // artist2.add("Kendrick");
    }
}
