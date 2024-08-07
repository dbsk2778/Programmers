package brute_force.in_book.level_2;

import java.util.ArrayList;
import java.util.List;

public class programmers84512 {
    public static void main(String[] args) {
        solution("AAAA");
    }

    public static int solution(String word) {
        List<String> words = new ArrayList<>();
        generate("", words);
        return words.indexOf(word);
    }

    private static final char[] chars = "AEIOU".toCharArray();

    private static void generate(String word, List<String> words) {
        words.add(word);

        if (word.length() == 5) return;

        for (char c : chars)  {
            generate(word + c, words);
        }
    }
}
