package Java__1_0.Collections.Array;

import java.util.List;
import java.util.Arrays;

public class Array {

    public static void displayArray(final Object[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
    }

    public static Object[] cloneArray(final Object[] array) {
        return array.clone();
    }

    public static void sortArray(final Object[] array) {
        Arrays.sort(array);
    }

    public static void fillArray(final Object[] array, final Object filler) {
        Arrays.fill(array, filler);
    }

    public static List<String> convertToList(final String[] array) {
        return Arrays.asList(array);
    }

    public static int binarySearch(final Object[] array, final int key) {
        return Arrays.binarySearch(array, key);
    }

    public static int compare(final int[] first, final int[] second) {
        return Arrays.compare(first, second);
    }

}
