package main.java.com.itYan.Method.Sort;

import java.util.Arrays;

public class BinaryInsertionSort {
    /**
     * insertion sort
     * @param array array needs to sort
     * */
    public static void sort(Integer[] array) {
        for(int i=1; i<array.length; i++) {
            // temp represents the value to be inserted
            int temp = array[i];
            // j represents the last position of the ordered area
            int j = i - 1;
            while(j >= 0) {
                if (temp < array[j]) {
                    array[j + 1] = array[j];
                } else {
                    // Insertion position as been found, jump out of the loop
                    break;
                }
                j--;
            }
            array[j+1] = temp;
            System.out.println(Arrays.toString(array));
        }
    }

    /**
     * binary insertion sort
     * @param array array needs to sort
     * */
    public static void binarySort(Integer[] array) {
        for(int i=1; i<array.length; i++) {
            // temp represents the value to be inserted
            int temp = array[i];
            // j represents the last position of the ordered area
            int j = i - 1;

            // user binary search to find the index to insert temp
            int insertIndex = binarySearch(array, temp, 0, j);

            while(j >= insertIndex) {
                array[j + 1] = array[j];
                j--;
            }
            array[j+1] = temp;
            System.out.println(Arrays.toString(array));
        }
    }

    /**
     * binary search
     * @param array array to search
     * @param target the target number need to find
     * @param low the finding array start
     * @param high the finding array end
     * @return the target number index or low index if not found
     * */
    private static int binarySearch(Integer[] array, int target, int low, int high) {

        if (high <= low)
            return target > array[low] ? (low+1) : low;

        int mid = low + ((high - low) / 2);

        if (target == array[mid])
            return mid + 1;

        if(target > array[mid])
            return binarySearch(array, target, mid + 1, high);

        return binarySearch(array, target, low, mid - 1);
    }
}
