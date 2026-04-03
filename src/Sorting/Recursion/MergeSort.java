package Sorting.Recursion;

import java.util.Arrays;
import Sorting.MyTools;

public class MergeSort {
    public static void main(String[] args) {
        int[] unsorted = {64, 34, 25, 12, 22, 11, 90};
        MyTools.printIntArray(unsorted);
        System.out.println();
        int[] sorted = mergeSort(unsorted);
        MyTools.printIntArray(sorted);
        System.out.println();
    }

    public static int[] mergeSort(int[] array) {
        if (array.length <= 1) {
            return array;
        }

        int middle = array.length / 2;
        // use a helper function to copy only part of the array
        int[] left = Arrays.copyOfRange(array, 0, middle);
        int[] right = Arrays.copyOfRange(array, middle, array.length);

        int[] sortedLeft = mergeSort(left);
        int[] sortedRight = mergeSort(right);

        return merge(sortedLeft, sortedRight);
    }

    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int leftIndex = 0;
        int rightIndex = 0;
        int resultIndex = 0;

        while(leftIndex < left.length && rightIndex < right.length) {
            if(left[leftIndex] <= right[rightIndex]) {
                result[resultIndex] = left[leftIndex];
                leftIndex++;
                resultIndex++;
            } else {
                result[resultIndex] = right[rightIndex];
                rightIndex++;
                resultIndex++;
            }
        }

        // Copy any remaining elements from the left array
        while(leftIndex < left.length) {
            result[resultIndex] = left[leftIndex];
            leftIndex++;
            resultIndex++;
        }

        // Copy any remaining elements from the right array
        while(rightIndex < right.length) {
            result[resultIndex] = right[rightIndex];
            rightIndex++;
            resultIndex++;
        }

        return result;
    }
}
