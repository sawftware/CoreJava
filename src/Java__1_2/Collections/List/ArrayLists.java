package Java__1_2.Collections.List;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayLists {

    public static void displayArrayList(final ArrayList arr) {
        for(final Object object: arr) {
            System.out.print(object + " ");
        }
        System.out.print("\n");
    }

    public static int size(final ArrayList arr) {
        return arr.size();
    }

    public static Object get(final ArrayList arr, final int index) {
        return arr.get(index);
    }

    public static void append(final ArrayList arr, final Object newItem) {
        arr.add(newItem);
    }

    public static void add(final ArrayList arr, final int index, final Object newItem) {
        arr.add(index, newItem);
    }

    public static void appendAll(final ArrayList arr, final Collection collection) {
        arr.addAll(collection);
    }

    public static Object remove(final ArrayList arr, final int index) {
        return arr.remove(index);
    }

    public static boolean remove(final ArrayList arr, final Object obj) {
        return arr.remove(obj);
    }

    public static boolean contains(final ArrayList arr, final Object obj) {
        return arr.contains(obj);
    }

    public static boolean isEmpty(final ArrayList arr) {
        return arr.isEmpty();
    }

    public static void clear(final ArrayList arr) {
        arr.clear();
    }

    public static int indexOf(final ArrayList arr, final Object obj) {
        return arr.indexOf(obj);
    }
}
