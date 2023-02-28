/**
 * Simple app to count case-insensitive uniq words and print top 10.
 * Word taking from app arguments.
 *
 * So simple, nothing to write here)))
 */


package course_works.second;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class WordsCount {
    public static void main(String[] args) {

        Map<String, Integer> items = new HashMap<>();
        for (String s : args) {
        items.merge(s.toLowerCase(Locale.ROOT), 1, Integer::sum);
        }

        items.entrySet().stream()
                .sorted((o1, o2) -> o2.getValue() - o1.getValue())
                .limit(10)
                .forEach(System.out::println);
    }
}
