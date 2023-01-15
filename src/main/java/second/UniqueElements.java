package second;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueElements {

    public Set<Integer> onlyUniqueElements(List<Integer> integerList) {
        Set<Integer> resultSet = new HashSet<>();
        for (Integer i : integerList) {
            resultSet.add(i);
        }
        return resultSet;
    }

    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(10);
        values.add(11);
        values.add(10);
        values.add(11);
        values.add(12);
        values.add(11);
        UniqueElements uniqueElements = new UniqueElements();
        Set<Integer> result = uniqueElements.onlyUniqueElements(values);
        System.out.println(result);
    }
}
