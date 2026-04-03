package Sorting;

public class MySorting {
    public static void main(String[] args) {
        
        int[] micro = MyTools.getRandomIntArray(0, 10000, 10);
        int[] small = MyTools.getRandomIntArray(0, 10000, 100);
        int[] medium = MyTools.getRandomIntArray(0, 10000, 1000);
        int[] large = MyTools.getRandomIntArray(0, 10000, 50000);
        
        MyTools.printIntArray(micro);
        long startTime = System.nanoTime();
        // bubbleSort(arr, n); 
        // insertionSort(small);
        // selectionSort(large);
        mergeSort(micro, 0, micro.length - 1);
        long endTime = System.nanoTime();
        long different = (endTime - startTime);
        System.out.println(different);

        // System.out.println("===========================================================================================");
        MyTools.printIntArray(micro);
    }

    /*
        bubbleSort, insertionSort, and selectionSort 
        are all O(n^2) sorting algorithms. 
    */
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

    /*
        mergeSort is an example of a sorting algorithm that is O(n lg n)
    */
    static void mergeSort(int[] my_arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            // first we sort the left side, then the right side
            mergeSort(my_arr, left, middle);
            mergeSort(my_arr, middle + 1, right);
            // then we combine everything back together
            merge(my_arr, left, middle, right);
        }
    }

    static void merge(int[] my_arr, int left, int middle, int right) {
        int length1 = middle - left + 1;
        int length2 = right - middle;

        int[] newLeft = new int[length1];
        int[] newRight = new int[length2];

        for(int i = 0; i < length1; i++) {
            newLeft[i] = my_arr[i];
        }

        int offset = middle + 1;
        for(int i = 0; i < length2; i++) {
            newRight[i] = my_arr[offset + i];
        }

        int left_index = 0;
        int right_index = 0;
        int index = left;

        while(left_index < length1 && right_index < length2) {
            if (newLeft[left_index] < newRight[right_index]) {
                my_arr[index] = newLeft[left_index];
                left_index++;
            } else {
                my_arr[index] = newRight[right_index];
                right_index++;
            }

            index++;
        }

        while(left_index < length1) {
            my_arr[index] = newLeft[left_index];
            index++;
            left_index++;
        }

        while(right_index < length2) {
            my_arr[index] = newRight[right_index];
            index++;
            right_index++;
        }
    }
}
