package main.java.com.itYan.Test.Sort;

import main.java.com.itYan.Method.Sort.BinaryInsertionSort;
import main.java.com.itYan.Method.Sort.BubbleSort;
import main.java.com.itYan.Utils.ArrayUtil;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryInsertionSortTest {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{34, 25, 18, 52, 30, 27, 89, 41, 71, 66};

        // Automatically generate an array of N numbers
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Please how many numbers your array have: ");
        //Integer[] array = ArrayUtil.createRandomArray(sc.nextInt());

        // show original array
        System.out.println("The original array");
        System.out.println(Arrays.toString(array));
        System.out.println("==========================");

        BinaryInsertionSort.binarySort(array);
        // show array after sort
        System.out.println("==========================");
        System.out.println("Array after sort");
        System.out.println(Arrays.toString(array));
    }
}
