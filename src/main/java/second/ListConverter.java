package second;

import java.util.ArrayList;
import java.util.List;

public class ListConverter {

    public List<Integer> stringToInteger(List<String> listToConvert) {
        List<Integer> convertedList = new ArrayList<>();
        for (int i = 0; i < listToConvert.size(); i++) {
            convertedList.add(i, Integer.parseInt(listToConvert.get(i)));
        }
        return convertedList;
    }

    public static void main(String[] args) {
        List<String> firstList = new ArrayList<>();
        firstList.add("2");
        firstList.add("3");
        firstList.add("12");
        firstList.add("1");
        System.out.println(firstList);

        ListConverter listConverter = new ListConverter();
        List<Integer> secondList = listConverter.stringToInteger(firstList);
        System.out.println(secondList);
    }
}
