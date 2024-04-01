package Java__8.Lambdas;

import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Lambdas {

    public void sortArray() {

        final List<String> names =
                Arrays.asList("Barry", "Charlie", "Alan", "Alice", "Amanda");

        // Unsorted list
        System.out.println(names);
        // Sort alphabetically
        names.sort(String::compareTo);
        System.out.println(names);
        // Sort reverse alphabetically
        names.sort((String a, String b) -> b.compareTo(a));
        System.out.println(names);
        // Sort alphabetically
        names.sort(Comparator.naturalOrder());
        System.out.println(names);
        //Sort reverse alphabetically
        names.sort(Comparator.reverseOrder());
        System.out.println(names);

    }

}
