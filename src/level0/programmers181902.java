package level0;

import java.util.Arrays;

public class programmers181902 {
    public static void main(String[] args) {
        String s = "Programmers";
        System.out.println(Arrays.toString(solution(s)));
        System.out.println(Arrays.toString(solution2(s)));
    }
    // 비효율적 코드
    public static int[] solution(String my_string) {
        int[] answer = new int[52];

        for (char c : my_string.toCharArray()) {
            for (int i = 0; i <= 26; i++) {
                char word = Character.isUpperCase(c) ? (char) (i + 'A') : (char) (i + 'a');
                int idx = Character.isUpperCase(c) ? i : i + 26;

                if (c == word) {
                    answer[idx] += 1;
                }
            }
        }

        return answer;
    }

    // 효율적 코드
    public static int[] solution2(String my_string) {
        int[] answer = new int[52];

        for (char ch : my_string.toCharArray()) {
            int idx = Character.isUpperCase(ch) ? (ch - 'A') : (ch - 'a' + 26);
            answer[idx]++;
        }


        return answer;
    }
}
