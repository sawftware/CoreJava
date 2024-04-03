package Java__1_2;

import Java__1_2.Collections.List.ArrayLists;

import java.util.ArrayList;
import java.util.Stack;

public class __1__ArrayLists {

    public static void main(final String[] args) {

        final ArrayList stringArrayList = new ArrayList();
        ArrayLists.append( stringArrayList, "lime");
        ArrayLists.add(stringArrayList, 1, "pineapple");
        ArrayLists.add(stringArrayList, 2, "apple");

        ArrayLists.displayArrayList(stringArrayList);
        System.out.println("----");

        final String lime = (String) ArrayLists.get(stringArrayList, 0);
        final String pineapple = (String) ArrayLists.get(stringArrayList, 1);
        final String apple = (String) ArrayLists.get(stringArrayList, 2);

        System.out.println("ArrayList Size: " + ArrayLists.size(stringArrayList));
        System.out.println(lime);
        System.out.println(pineapple);
        System.out.println(apple);
        System.out.println("----");

        final ArrayList arrayListExtension = new ArrayList();
        arrayListExtension.add("pear");
        arrayListExtension.add("banana");
        ArrayLists.appendAll(stringArrayList, arrayListExtension);

        System.out.println("ArrayList Size: " + ArrayLists.size(stringArrayList));
        ArrayLists.displayArrayList(stringArrayList);
        System.out.println("----");

        if(ArrayLists.indexOf(stringArrayList, lime) == 0) {
            ArrayLists.remove(stringArrayList, 0);
        }

        if(ArrayLists.contains(stringArrayList, apple)) {
            ArrayLists.remove(stringArrayList, apple);
        }

        System.out.println("ArrayList Size: " + ArrayLists.size(stringArrayList));
        ArrayLists.displayArrayList(stringArrayList);
        System.out.println("----");

        ArrayLists.clear(stringArrayList);

        System.out.println("ArrayList Size: " + ArrayLists.size(stringArrayList));
        ArrayLists.displayArrayList(stringArrayList);
        System.out.println("----");
    }
}
