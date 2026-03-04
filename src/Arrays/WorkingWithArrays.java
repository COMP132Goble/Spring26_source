package Arrays;

public class WorkingWithArrays {
    public static void doubleElements(int[] arr) {
        for(int index = 0; index < arr.length; index++) 
            arr[index] = arr[index] * 2;
    }

    public static void printArr(int[] arr) {
        for(int index = 0; index < arr.length; index++) 
            System.out.print(arr[index] + " ");
        System.out.println();
    }

    public static void resizeArr(int[] arr) {
        int[] temp = new int[arr.length];
        // Make a deep copy
        for(int index = 0; index < arr.length; index++) {
            temp[index] = arr[index];
        }
        arr = new int[temp.length * 2];
        for(int index = 0; index < temp.length; index++) {
            arr[index] = temp[index];
        }
    }

    public static void main(String[] args) {
        int[] example = {1, 2, 3, 4, 5, 6};
        printArr(example);
        doubleElements(example);
        printArr(example);
    }
}
