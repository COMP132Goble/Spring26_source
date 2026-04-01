package Sorting.Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] sortedArray = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;

        int result = binarySearch(sortedArray, target);

        if (result != -1) {
            System.out.println("Found " + target + " at index " + result);
        } else {
            System.out.println(target + " not found in the array");
        }
    }

    public static int binarySearch(int[] array, int target) {
        return binarySearch(array, target, 0, array.length-1);
    }

    public static int binarySearch(int[] array, int target, int left, int right) {
        if (left > right) {
            return -1;
        }

        int middle = left + (right - left) / 2;

        if (array[middle] == target) {
            return middle;
        }

        if (target < array[middle]) {
            return binarySearch(array, target, left, middle - 1);
        }

        return binarySearch(array, target, middle + 1, right);
    }
}
