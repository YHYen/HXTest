package main.java.com.itYan.Utils;


/**
 * Generate test data
 * */
public class ArrayUtil {

    /**
     * create Integer array testing data
     * @param amount created array length
     * @return Integer[] return the created random array
     * */
    public static Integer[] createRandomArray(int amount) {
        Integer[] array = new Integer[amount];
        for (int i=0; i<array.length; i++) {
            array[i] = (int) (Math.random() * 100) + 1;
        }
        return array;
    }
}
