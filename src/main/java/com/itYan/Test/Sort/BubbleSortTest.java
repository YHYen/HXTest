package main.java.com.itYan.Test.Sort;

import main.java.com.itYan.Method.Sort.BubbleSort;

import java.util.Arrays;

public class BubbleSortTest {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{34, 25, 18, 52, 30, 27, 89, 41, 71, 66};

        BubbleSort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
