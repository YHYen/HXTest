package main.java.com.itYan.Test;

import main.java.com.itYan.Method.Sort.BinaryInsertionSort;

import java.util.Arrays;

public class BinaryInsertionSortTest {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{34, 25, 18, 52, 30, 27, 89, 41, 71, 66};

        BinaryInsertionSort.binarySort(array);
        System.out.println(Arrays.toString(array));
    }
}
