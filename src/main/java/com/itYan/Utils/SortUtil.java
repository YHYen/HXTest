package main.java.com.itYan.Utils;

public class SortUtil {
    public static boolean compare(Comparable front, Comparable behind) {
        return front.compareTo(behind) > 0;
    }

    public static void swap(Comparable[] array, int i, int j) {
        Comparable temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
