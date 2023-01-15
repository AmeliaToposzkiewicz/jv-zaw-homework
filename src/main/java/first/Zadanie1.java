package first;

import java.util.ArrayList;
import java.util.List;

/**
 * Liczba doskonała to liczba, której suma dzielników bez niej samej równy jest tej liczbie
 * 6 jest liczbą doskonałą, bo jej dzielniki to: 1,2,3,6 a 1+2+3 = 6
 * 28 jest liczbą doskonałą, bo jej dzielniki to: 1,2,4,7,28 a 1+2+4+7 = 28
 * <p>
 * Zadanie: napisz ciało metody findNPerfectNumbers, która znajdzie n pierwszych liczb doskonałych i zwróci je w postaci tablicy int[]
 */

public class Zadanie1 {
    public List<Integer> findNPerfectNumbers(int n) {
        int sum = 0;
        int number = 6;
        int counter = 0;
        int i = 1;
        List<Integer> array = new ArrayList<>();
        while (n > counter) {
            while (i <= number / 2) {
                if (number % i == 0) {
                    sum += i;
                }
                i++;
                if (sum == number) {
                    array.add(number);
                    counter++;
                }
                number++;
            }
        }
        return array;
    }
}



