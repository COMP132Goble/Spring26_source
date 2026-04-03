package Sorting;

public class OperationCount {
    static int arrayAverage(int[] arr) {
        int total = 0;
        for(int i = 0; i < arr.length; i++) {
            int val = arr[i];
            total = total + val;
        }

        int avg = total / arr.length;
        return avg;
    }

    static void arrayRotate(int[] arr) {
        int start = arr[0];
        for(int i = 1; i < (arr.length) / 2; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length - 1] = start;
    }

    public static void main(String[] args) {
        int[] temp = {1, 2, 3, 4, 5};
        MyTools.printIntArray(temp);
        arrayRotate(temp);
        System.out.println();
        MyTools.printIntArray(temp);
        System.out.println();
    }
}
