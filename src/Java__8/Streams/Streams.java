package Java__8.Streams;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Streams {

    public void filterArray() {
        final List<String> names = Arrays.asList("Alan", "Alice", "Amanda");

        final List<String> filteredNames = names
                .stream()
                .filter(name -> name.startsWith("Al"))
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        System.out.println(filteredNames);
    }
}
