package Arrays;

public class Example {
    public static void main(String[] args) {

        int[] myList = {2, 4, 6, 8, 10, 12, 14, 16};
        double[] grades = {96.5, 88.4, 90.3, 70.1};
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        
        int[][] raggedArray = new int[3][];
        raggedArray[0] = new int[2];
        raggedArray[1] = new int[3];
        raggedArray[2] = new int[4];

        int[] vals = new int[5];
        // what is the data type of vals[3]?
        // What is the data type of vals?

        // accessing elemts in an array
        vals[3] = 7;
        int y = vals.length;
        int x = vals[3] - 3;
        vals[x] = 2;
        // After base diagram, uncomment and see what happens
        // int a = vals[2];
        // System.out.println("variable a = " + a);
        vals[vals[4]] = 12;
        // a = vals[2];
        // System.out.println("variable a = " + a);
        for(int index = 0; index < vals.length; index++) {
            System.out.println(index + ": " + vals[index]);
        }
    }
}