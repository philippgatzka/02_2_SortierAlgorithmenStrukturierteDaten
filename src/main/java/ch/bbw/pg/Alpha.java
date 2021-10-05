package ch.bbw.pg;

import java.util.Comparator;

/**
 * @author P. Gatzka
 * @version 05.10.2021
 * Project: 02_2_SortierAlgorithmenStrukturierteDaten
 */
public class Alpha {
    public static Comparator<Alpha> comparator;
    private final String first;
    private final String second;
    private final String third;

    static {
        comparator = Comparator.comparing((Alpha o) -> o.first).thenComparing(o -> o.second).thenComparing(o -> o.third);
    }


    public Alpha(String first, String second, String third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    @Override
    public String toString() {
        return first + " " + second + " " + third;
    }

    public String getFirst() {
        return first;
    }

    public String getSecond() {
        return second;
    }

    public String getThird() {
        return third;
    }
}
