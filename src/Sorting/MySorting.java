package Sorting;

public class MySorting {
    public static void main(String[] args) {
        
        int[] micro = MyTools.getRandomIntArray(0, 10000, 10);
        int[] small = MyTools.getRandomIntArray(0, 10000, 100);
        int[] medium = MyTools.getRandomIntArray(0, 10000, 10000);
        int[] large = MyTools.getRandomIntArray(0, 10000, 50000);

        MyTools.printIntArray(small);
        // bubbleSort(arr, n); 
        insertionSort(small);
        System.out.println("===========================================================================================");
        MyTools.printIntArray(small);
    }

    static void bubbleSort(int[] arr, int size) {
        for(int i = 0; i < size-1; i++) {
            boolean swapped = false;
            for(int j = 0; j < size - i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp;

                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }

            if (swapped == false)
                break;
        }
    }

    static void insertionSort(int[] arr) {
        int size = arr.length;
        for(int i = 1; i < size; i++) {
            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = key;
        }
    } 

    static void selectionSort(int[] arr) {
        int size = arr.length;
        for(int i = 0; i < size - 1; i++) {
            int min_index = i;
            for(int j = i + 1; j < size; j++) {
                if(arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }
}
