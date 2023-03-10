package first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Lista imion może zawierać duplikaty, których chcemy uniknąć.
 * Napisz ciało metody removeDuplicates, która zwróci listę imion bez duplikatów
 */

public class Zadanie3 {


    private final List<String> imiona = Arrays.asList("Tomek", "Damian", "Damian", "Kamil", "Karol", "Janusz", "Karol");

    public List<String> removeDuplicates(List<String> names) {
        List<String> resultArray = new ArrayList<>();
        for (String s : names) {
            if (!(resultArray.contains(s))) {
                resultArray.add(s);
            }
        }
        return resultArray;
    }
}
