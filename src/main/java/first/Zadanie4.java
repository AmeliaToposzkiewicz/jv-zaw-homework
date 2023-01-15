package first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Zaimplementuj BubbleSort
 * Napisz ciało metody, która dla dowolnej tablicy int[] zwróci tablicę posortowaną za pomocą algorytmu bubble sort
 * Opis bubble sort masz np tu: https://www.youtube.com/watch?v=xli_FI7CuzA lub tu: https://www.geeksforgeeks.org/bubble-sort/
 */

public class Zadanie4 {
    static List<Integer> numbers2 = Arrays.asList(8, 3, 400, 900, 6543, 1, 65, 754, 21, 0);

    public static List<Integer> bubbleSort(List<Integer> numbers) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < numbers.size() - 1; i++) {
                if (numbers.get(i) > numbers.get(i + 1)) {
                    temp = numbers.get(i);
                    numbers.set(i, numbers.get(i + 1));
                    numbers.set(i + 1, temp);
                    sorted = false;
                }
            }
        }
        return numbers;
    }
}
