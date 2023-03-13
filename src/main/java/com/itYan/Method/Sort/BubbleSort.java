package main.java.com.itYan.Method.Sort;

import main.java.com.itYan.Utils.SortUtil;

import java.util.Arrays;

public class BubbleSort {

    /**
     * bubble sort
     * @param array array needs to sort
     * */
    public static void sort(Comparable[] array) {
        int swapTimes = array.length - 1;
        while (true) {
            int lastSwapIndex = 0;
            for (int i=0; i<swapTimes; i++) {
                if (SortUtil.compare(array[i], array[i+1])) {
                    SortUtil.swap(array, i, i+1);

                    // record the last swap index
                    // the number after this index is finish sort
                    lastSwapIndex = i;
                }
            }

            // update the number of swap required
            swapTimes = lastSwapIndex;

            // print the sort step
            System.out.println(Arrays.toString(array));

            // if the array has not been swapped, break the loop
            if (lastSwapIndex == 0) break;
        }
    }
}
