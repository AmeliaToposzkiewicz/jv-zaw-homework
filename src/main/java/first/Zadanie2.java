package first;

/**
 * Zasada komplentarności w genetyce dotyczy łączenia się zasad azotowych, które występują w kwasach nukleinowych (np. DNA)
 * Zgodnie z zasadą zasady azotowe DNA łączą się ze sobą zgodnie ze schematem:
 * cytozyna (C) ←→ guanina (G)
 * tymina (T) ←→ adenina (A)
 * <p>
 * Napisz ciało metody findComplementaryChain, która dla dowolnego łańcucha DNA zwróci łańcuch komplementarny
 * <p>
 * np: GAGAAACGGGA ma zamienić się na CTCTTTCCCT
 */

public class Zadanie2 {

    public String findComplementaryChain(String chain) {
        int stringLength = chain.length();
        String newChain = "";
        char letter;
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < stringLength; i++) {
            letter = chain.charAt(i);
            if (letter == 'C') {
                stringBuilder.append('G');
            }
            if (letter == 'G') {
                stringBuilder.append('C');
            }
            if (letter == 'T') {
                stringBuilder.append('A');
            }
            if (letter == 'A') {
                stringBuilder.append('T');
            }
        }
        return stringBuilder.toString();
    }
}
