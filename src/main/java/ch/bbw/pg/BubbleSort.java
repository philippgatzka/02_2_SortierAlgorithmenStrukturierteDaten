package ch.bbw.pg;

/**
 * @author P. Gatzka
 * @version 28.09.2021
 * Project: 02_2_SortierAlgorithmenStrukturierteDaten
 */
public class BubbleSort {

    public static void sort(Person[] people) {
        boolean sorted = false;
        while (!sorted) {
            for (int i = 0; i < people.length - 1; i++) {
                sorted = true;
                Person first = people[i];
                Person second = people[i + 1];
                boolean change = first.compareTo(second) > 0;
                if (change) {
                    people[i] = second;
                    people[i + 1] = first;
                    sorted = false;
                    break;
                }
            }
        }
    }


}
