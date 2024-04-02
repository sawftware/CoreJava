package Java__1_2;

import Java__1_2.Collections.Array;

import java.util.List;

public class __1__Array {

    public static void main(final String[] args) {
        final String[] stringArray = {"lime", "pineapple", "apple", "pear", "banana", "orange", "plum", "lemon"};
        Array.displayArray(stringArray);
        System.out.println("---");

        final String[] newStringArray = (String[]) Array.cloneArray(stringArray);
        Array.displayArray(newStringArray);
        Array.sortArray(newStringArray);
        Array.displayArray(newStringArray);
        System.out.println("---");

        final Integer[] intArray = new Integer[20];
        Array.displayArray(intArray);
        Array.fillArray(intArray, 1);
        Array.displayArray(intArray);
        System.out.println("---");

        final Integer[] integerArray = {0, 1, 7, 2, 5, 9, 3, 4, 6, 8, 90};
        Array.sortArray(integerArray);
        System.out.println(Array.binarySearch(integerArray, 90));
        System.out.println("---");

        int[] firstIntegerArray = {0, 1, 2, 3, 4, 5};
        int[] secondIntegerArray = {0, 1, 2, 3, 4, 5};
        System.out.println(Array.compare(firstIntegerArray, secondIntegerArray));

        firstIntegerArray = new int[]{5, 1, 2, 3, 4, 5};
        secondIntegerArray = new int[] {0, 1, 2, 3, 4, 5};
        System.out.println(Array.compare(firstIntegerArray, secondIntegerArray));

        firstIntegerArray = new int[]{0, 1, 2, 3, 4, 5};
        secondIntegerArray = new int[] {5, 1, 2, 3, 4, 5};
        System.out.println(Array.compare(firstIntegerArray, secondIntegerArray));
        System.out.println("---");

        final List<String> stringArrayList = Array.convertToList(stringArray);
        for(final String string: stringArrayList) {
            System.out.print(string + " ");
        }
        System.out.println("\n---");

    }

}
